# 🎓 Student Management System

## 🛠 Technologies Used
- Java Swing & AWT (GUI)
- JDBC (Database Connectivity)
- MySQL (Database)

## 📖 Project Overview
Developed a Student Management System with separate portals for administrators and students, enabling efficient course enrollment and management.

## 🚀 Key Features
- 🎨 **User-Friendly GUI**: Built using Java Swing and AWT for smooth user interaction.
- 🗄️ **Database Integration**:  
  - MySQL database to manage and store course information, user details, and fee structures.
- 🔗 **Seamless Java-Database Connectivity**:  
  - JDBC used for reliable and secure communication between the Java application and MySQL database.
- 📚 **Functionalities**:  
  - Course Enrollment  
  - View Fee Structures  
  - Manage Courses and Users (Admin)

## 📂 Project Structure
```plaintext
/student-management-system
├── src/                 # Java source files
├── lib/                 # MySQL JDBC Connector .jar
├── database/            # SQL scripts to create and populate the database
├── README.md            # Project documentation
└── resources/           # Images or additional resources
```

## ⚙️ How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/student-management-system.git
   ```
2. Set up the MySQL database:
   - Import the provided `.sql` script from the `database/` folder.
   - Configure your database credentials (URL, username, password) in the Java code.
3. Compile and run the project:
   - Make sure to add the MySQL Connector `.jar` file to your project's classpath.
   - Run the main file to start the application.

## 📢 Important Notes
- Ensure the MySQL server is running when using the application.
- Update database credentials properly before running.

---
