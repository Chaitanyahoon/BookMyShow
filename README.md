# Spring Boot REST Data JPA Project (BookMyShow)

## 📌 Project Overview
This project is a **Spring Boot Backend Application** designed to demonstrate building robust REST APIs using **Spring Data JPA**. It models a real-world scenario of managing Movies, Employees, and Departments, showcasing relationships like One-to-Many.

### Why is this code important?
*   **Layered Architecture**: Demonstrates industry-standard separation of concerns (Controller -> Service -> Repository -> Entity).
*   **JPA Relationships**: Implements complex database relationships (e.g., `Department` 1--* `Employee`) using annotations like `@OneToMany` and `@ManyToOne`.
*   **REST Standards**: Uses proper HTTP methods (GET, POST, PUT, DELETE) for resource management.
*   **Database Integration**: seamless integration with MySQL using Hibernate/JPA.

---

## 🚀 How to Run

### Prerequisities
*   Java 21 or higher
*   MySQL Server (Port 3306)

### Steps
1.  **Configure Database**:
    The application is configured to auto-create the database `bookmyshow` if it doesn't exist.
    *   Username: `root`
    *   Password: `root`
    *   *Check `src/main/resources/application.properties` to change these.*

2.  **Run the Application**:
    *   **Using Eclipse**: Import as Maven Project -> Run `SpringRestDataJpaProjectApplication.java`.
    *   **Using Command Line**:
        ```bash
        ./mvnw spring-boot:run
        ```

3.  **Access**:
    The application runs on **Port 9808**.
    *   Base URL: `http://localhost:9808`

---

## 🛠️ API Usage (CRUD Operations)

Use a tool like **Talend API Tester**, **Postman**, or **curl** to test these endpoints.

### 1. 🎬 Movies
| Method | Endpoint | Description | Payload (Body) |
| :--- | :--- | :--- | :--- |
| **GET** | `/movies` | Get all movies | - |
| **GET** | `/movies/{id}` | Get specific movie | - |
| **POST** | `/movies` | Create or Update | `{"title":"Inception", "genre":"Sci-Fi", "year":2010}` |
| **DELETE** | `/movies/{id}` | Delete a movie | - |

### 2. 👥 Employees
| Method | Endpoint | Description | Payload (Body) |
| :--- | :--- | :--- | :--- |
| **POST** | `/employees` | Create Employee | `{"name":"John Doe", "salary":50000}` |
| **PUT** | `/employees/{empId}/{deptId}` | **Link to Dept** | - |
| **DELETE** | `/employees/{id}` | Delete Employee | - |

> **Note**: To link an employee, use the PUT request with IDs in the URL. Example: `/employees/1/2` (Moves Employee 1 to Dept 2).

### 3. 🏢 Departments
| Method | Endpoint | Description | Payload (Body) |
| :--- | :--- | :--- | :--- |
| **GET** | `/departments` | Get all departments | - |
| **POST** | `/departments` | Create Department | `{"name":"IT"}` |
| **POST** | `/departments` | Create with Emps | `{"name":"HR", "employees": [{"name":"Alice", "salary":6000}]}` |
| **DELETE** | `/departments/{id}` | Delete Department | - |

---

## ⚠️ Important Notes
*   **Cascading**: Deleting a `Department` will **delete all its Employees** because of `CascadeType.ALL`.
*   **Upsert**: The `save()` method in JPA acts as an Upsert. If you provide an ID that exists, it updates; otherwise, it creates.