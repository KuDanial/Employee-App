# Employee Management System (MVC Pattern)

![Java](https://img.shields.io/badge/Java-17%2B-orange)
![NetBeans](https://img.shields.io/badge/IDE-NetBeans-blue)
![Tomcat](https://img.shields.io/badge/Server-Apache%20Tomcat-yellow)
![MySQL](https://img.shields.io/badge/Database-MySQL-blue)
![License](https://img.shields.io/badge/License-Educational-green)

This project is a Web Application developed as part of **Lab 11: MVC Framework** for the Enterprise Programming course. It demonstrates the **Model-View-Controller (MVC)** architecture using Java Servlets, JSP, JSTL, and MySQL.

## 🛠️ Technology Stack
* **IDE:** NetBeans (Java with Maven)
* **Server:** Apache Tomcat 10 / 11 (Jakarta EE)
* **Language:** Java (JDK 17+)
* **Database:** MySQL (using `mysql-connector-j` 8.3.0)
* **Dependencies:** JSTL 3.0 (Jakarta Standard Tag Library)

---

## 📂 Project Structure (MVC)
The project is organized strictly according to the MVC design pattern:

### 1. Model (Data Layer)
* **`person.bean.Staff`**: A JavaBean class that represents an Employee. It implements `Serializable` and contains fields for `id`, `name`, `salary`, and `designation`.

### 2. View (Presentation Layer)
* **`index.html`**: The landing page with navigation links.
* **`empForm.jsp`**: The HTML form for adding a new employee.
* **`editForm.jsp`**: The HTML form for editing existing employee details.
* **`viewEmp.jsp`**: Displays the list of all employees in a table (uses JSTL `<c:forEach>`).
* **`success.jsp` / `error.jsp`**: Feedback pages for operation status.

### 3. Controller (Logic Layer)
* **`EmpController.java`**: Handles `POST` requests to **Add** or **Edit** employee records in the database.
* **`ViewEmpController.java`**: Handles `GET` requests to **Fetch** data from the database and forward it to `viewEmp.jsp`.

---

## ⚙️ Database Setup
Before running the project, you must set up the database in **MySQL Workbench**:

```sql
CREATE DATABASE IF NOT EXISTS emp;
USE emp;

CREATE TABLE IF NOT EXISTS staff (
    ID INT AUTO_INCREMENT PRIMARY KEY,
    NAME VARCHAR(100),
    SALARY DOUBLE,
    DESIGNATION VARCHAR(100)
);

-- Optional: Insert dummy data
INSERT INTO staff (NAME, SALARY, DESIGNATION) VALUES ('Danny', 5000.00, 'Developer');
```

---

## 🚀 How to Run

1.  **Clone/Open Project:** Open the project folder in NetBeans.
2.  **Verify Database Config:**
    * Open `src/main/java/person/controller/EmpController.java`.
    * Open `src/main/java/person/controller/ViewEmpController.java`.
    * **Crucial Step:** Update the `dbPassword` string to match your local MySQL root password (e.g., `"root"`, `"admin"`, or `""`).
3.  **Clean and Build:** Right-click the project > **Clean and Build** to download Maven dependencies.
4.  **Run:** Right-click the project > **Run**.
5.  **Access:**
    * **Add Employee:** Click "Add Employee" on the home page.
    * **View List:** Click "View Employees" on the home page.

---

## 📝 License
Created for CSC584 Lab Activity.
