# 📌 Attendance System Using Java

A **Java-based Attendance Management System** using **Swing**, **QR Code scanning**, and **MySQL** for database management. Designed for use in schools, colleges, or organizations.

---

## 🚀 Features

### 🧑‍💼 User Registration
- Register users with name, gender, email, contact, address, state, and country.
- Generates a **unique registration ID**.
- Upload and store user **profile pictures**.

### 📸 QR Code Generation
- Generates a unique **QR code** for each user.
- Stores QR data with user credentials.

### 🕒 Attendance Marking
- Scan QR code to mark **check-in/check-out**.
- Stores time, date, duration, and status.

### 📊 Attendance Viewing
- View user-wise or date-wise **attendance records**.
- Displays present/absent stats.

### 🧭 Admin Dashboard
- Manage users (CRUD operations).
- Generate/view QR codes.
- Mark/view attendance.

---

## 🗂️ Project Structure

```
Attendance-System-using-java/
├── attendacemanagement/       # Core application logic
├── dao/                       # Database connectivity & table handling
│   ├── connectionprovider.class
│   └── tables.class
├── facedetection/             # Face detection logic (optional)
├── lib/                       # External libraries (JARs like OpenCV, Gson)
├── logs/                      # Application log files
├── nbproject/                 # NetBeans configuration files
├── src/                       # Java source files
│   ├── forms/                 # GUI forms (Swing-based)
│   │   ├── Dashboard.java
│   │   ├── ViewAttendance.java
│   │   ├── MarkingAttendance.java
│   │   ├── GenerateQr.java
│   │   ├── testregistration.java
│   │   └── viewuser.java
│   └── dao/                   # DAO interfaces or classes
├── test/                      # Unit test cases
├── utility/                   # Helper utilities (e.g., DateUtils, QRUtils)
├── build.xml                  # Ant build file
├── manifest.mf                # Manifest for JAR packaging
└── README.md                  # Project documentation
```

---

## 🛠️ Tech Stack

- **Java** (Core + Swing)
- **MySQL** (Database)
- **ZXing** (QR Code Generation & Scanning)
- **Gson** (JSON parsing)
- **OpenCV** *(Optional - Face Detection)*

---

## ⚙️ Setup Instructions

### 1️⃣ Prerequisites
- JDK 8 or later
- MySQL server
- NetBeans IDE (recommended)

### 2️⃣ Clone the Repository
```bash
git clone https://github.com/your-username/Attendance-System-using-java.git
cd Attendance-System-using-java
```

### 3️⃣ Set Up Database
Run the following SQL in MySQL Workbench or CLI:

```sql
CREATE DATABASE attendance_system;

USE attendance_system;

CREATE TABLE userdetails (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    gender VARCHAR(50),
    email VARCHAR(255),
    contact VARCHAR(20),
    address VARCHAR(500),
    state VARCHAR(100),
    country VARCHAR(100),
    uniqueregid VARCHAR(100),
    imagename VARCHAR(100)
);

CREATE TABLE userattendance (
    userid INT NOT NULL,
    date DATE NOT NULL,
    checkin DATETIME,
    checkout DATETIME,
    workduration VARCHAR(100),
    attendance_status VARCHAR(20) DEFAULT 'PENDING'
);
```

### 4️⃣ Configure Database in Code

In `dao/connectionprovider.java`, update with your DB credentials:

```java
public class connectionprovider {
    public static Connection getcon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/attendance_system", "root", "yourpassword");
        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }
}
```

### 5️⃣ Run the Application
- Open in NetBeans
- Build & run `Dashboard.java`

---

## 📋 Usage Guide

- **Register** users using the form.
- **Generate** QR code from unique ID.
- **Mark** attendance via QR scanner.
- **View** all attendance logs.

---

## 🔮 Future Enhancements

- Role-based user access (admin/user)
- Email/SMS notifications for attendance
- Web version using Spring Boot & React
- Face recognition support

---

## 📄 License

This project is licensed under the **MIT License**.

---

## 🙏 Acknowledgments

- **ZXing** – QR Code generator
- **OpenCV** – Image processing
- **NetBeans IDE** – Project development
