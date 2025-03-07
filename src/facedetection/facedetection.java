/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facedetection;

/**
 *
 * @author venne
 */
import org.opencv.core.Core;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.opencv.core.Mat;
import org.opencv.core.MatOfByte;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.videoio.VideoCapture;
import utility.BDutility;

public class facedetection extends JFrame {

    private JLabel camerascreen;
    private JButton btncapture;
    private VideoCapture capture;
    private Mat image;
    private boolean clicked = false;
    private String userEmail;  // Store the email passed from UserRegistration

    // Constructor to accept email from UserRegistration
    public facedetection(String email) {
        this.userEmail = email;  // Set the email received from UserRegistration
        
        setLayout(null);
        camerascreen = new JLabel();
        camerascreen.setBounds(0, 0, 640, 480);
        add(camerascreen);

        btncapture = new JButton("Capture");
        btncapture.setBounds(300, 480, 80, 40);
        add(btncapture);

        btncapture.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                clicked = true;
            }
        });

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                releaseResources();
            }
        });

        setSize(new Dimension(640, 560));
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setVisible(true);
    }

    public void startCamera() {
        capture = new VideoCapture(0);
        image = new Mat();
        byte[] imagedata;
        ImageIcon icon;

        while (true) {
            capture.read(image);
            final MatOfByte buf = new MatOfByte();
            Imgcodecs.imencode(".jpg", image, buf);
            imagedata = buf.toArray();

            icon = new ImageIcon(imagedata);
            camerascreen.setIcon(icon);

            if (clicked) {
                // Use the email provided from the registration process to save the image
                String savePath = BDutility.getPath("images\\");
                String filename = userEmail + ".jpg";  // Use email as filename
                Imgcodecs.imwrite(savePath + filename, image);
                clicked = false;
                break; // Exit the loop after capturing
            }
        }
        releaseResources();
    }

    private void releaseResources() {
        if (capture != null && capture.isOpened()) {
            capture.release();
        }
        if (image != null) {
            image.release();
        }
        dispose();
    }

    public static void main(String[] args) {
        System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                facedetection face = new facedetection("");
                new Thread(new Runnable() {
                    public void run() {
                        face.startCamera();
                    }
                }).start();
            }
        });
    }
    }

