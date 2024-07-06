# Registration Application

This project implements a registration form using Java Spring Boot for the backend, React for the frontend, MySQL for database management, and XAMPP as the local development environment.

![](https://github.com/DilshanaRanawake/RegistrationFormOOP/blob/main/Screenshots/register1.png)
![](https://github.com/DilshanaRanawake/RegistrationFormOOP/blob/main/Screenshots/register2.png)

## Technologies Used

- **Java Spring Boot**: Backend development framework providing dependency injection, MVC architecture, and embedded server configuration.
- **MySQL Database**: Stores and manages application data accessed via JDBC and Hibernate for ORM.
- **React**: Frontend framework for building dynamic user interfaces with a component-based architecture.
- **Node.js and npm**: Node.js runtime and package manager used for frontend development and dependency management.
- **XAMPP**: Local development environment providing Apache HTTP Server, MySQL database, PHP, and Perl interpreters, facilitating web server setup and testing locally.

## Setup Instructions

To run this project locally, follow these steps:
### 1. Start XAMPP

- Open XAMPP Control Panel.
- Start the Apache and MySQL modules.
### 2. Create Database

- Open phpMyAdmin by clicking the "Admin" button in the MySQL row in the XAMPP Control Panel.
- Create a new database. For example, `uok`.

### 3. Update Application Properties

- Navigate to `src/main/resources/application.properties`.
- Ensure the database connection properties are as follows:

properties
spring.application.name=FctOop
server.port=9000

spring.datasource.url=jdbc:mysql://127.0.0.1:3306/uok?createDatabaseIfNotExist=true&useLegacyDatetimeCode=false
spring.datasource.username=root
spring.datasource.password=
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.jpa.database-platform=org.hibernate.dialect.MySQL8Dialect

spring.jpa.hibernate.ddl-auto=update


### 4. Backend Setup 
   - Open your IDE (e.g., IntelliJ IDEA, Eclipse).
   - Open the backend project.
   - Locate the main class with the `@SpringBootApplication` annotation (e.g., `com.example.FctOopApplication`).
   - Right-click on the main class and select Run (or use the run button).

### 5. Frontend Setup
   - Open a new terminal.
   - Navigate to the frontend project directory.
   - Install the necessary npm packages:
     ```bash
     npm install
     ```
   - Start the frontend application:
     ```bash
     npm start
     ```

### 6. Access the Application
   - Once both the backend and frontend applications are running, open your browser.
   - Navigate to [http://localhost:3000](http://localhost:3000) for the frontend.
