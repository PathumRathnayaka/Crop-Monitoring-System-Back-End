<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Green Shadow Spring Boot Application</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 0;
            padding: 20px;
            background-color: #f4f4f4;
            color: #333;
        }
        h1 {
            color: #4CAF50;
        }
        h2 {
            color: #333;
        }
        h3 {
            color: #555;
        }
        ul {
            list-style-type: square;
            margin-left: 20px;
        }
        code {
            background-color: #e7e7e7;
            padding: 2px 4px;
            border-radius: 4px;
        }
        .footer {
            margin-top: 40px;
            font-size: 0.9em;
            color: #777;
        }
        .license {
            margin-top: 20px;
            padding: 10px;
            background-color: #e7f3fe;
            border-left: 6px solid #2196F3;
        }
    </style>
</head>
<body>

    <h1>Green Shadow Spring Boot Application</h1>
    <p>This is a Spring Boot-based backend system. It provides RESTful APIs for managing crop, equipment, field, staff, user, vehicle, monitoring log, and transactions. The project uses Spring Boot, JPA, Hibernate, Spring Security, and MySQL for database connectivity.</p>

    <h2>Features</h2>
    <ul>
        <li>Equipment Management</li>
        <li>Field Management</li>
        <li>Staff Management</li>
        <li>User Management</li>
        <li>Vehicle Management</li>
        <li>Monitoring Log Management</li>
        <li>Role-Based Access Control</li>
        <li>Token Generation</li>
        <li>Token Validation</li>
        <li>Token Refresh</li>
        <li>Spring Security Integration</li>
        <li>Custom Authentication Provider</li>
        <li>Secure Password Storage</li>
        <li>Profile Management</li>
        <li>Login Attempt Auditing</li>
        <li>Activity Logging</li>
        <li>Protected Endpoints</li>
        <li>Transaction Processing</li>
        <li>Exception Handling and Validation using Hibernate Validator</li>
        <li>JSON Response formatting</li>
        <li>Logs with Logback</li>
    </ul>

    <h2>Technologies</h2>
    <ul>
        <li><strong>Java Version:</strong> JDK 21</li>
        <li><strong>Backend Framework:</strong> Spring Boot (v3.4.0)</li>
        <li><strong>Database:</strong> MySQL</li>
        <li><strong>ORM:</strong> JPA, Hibernate</li>
        <li><strong>Server:</strong> Apache Tomcat</li>
        <li><strong>Validation:</strong> Hibernate Validator</li>
        <li><strong>Logger:</strong> Logback</li>
    </ul>

    <h2>Architecture Overview</h2>
    <ul>
        <li><strong>Entities:</strong> Representations for Crop, Email, Equipment, Field, Staff, User, Vehicle, and Monitoring Log</li>
        <li><strong>Data Transfer Objects (DTOs):</strong> Includes CropDTO, EmailDTO, EquipmentDTO, FieldDTO, StaffDTO, UserDTO, VehicleDTO, and MonitorLogDTO</li>
        <li><strong>Repositories:</strong> Interfaces for database operations.</li>
        <li><strong>Services:</strong> Business logic for management.</li>
        <li><strong>Controllers:</strong> API endpoints for handling requests.</li>
        <li><strong>Utilities:</strong> Helper classes for tasks.</li>
        <li><strong>Exceptions:</strong> Custom error handling mechanisms for specific scenarios.</li>
        <li><strong>Configuration:</strong> Application setup classes like application.properties, application-dev.properties.</li>
    </ul>

    <h2>Validation</h2>
    <p>Data validation is enforced through Hibernate Validator annotations within the DTO classes, ensuring both data integrity and accuracy.</p>

    <h2>Logging</h2>
    <p>Logging is set up with Logback, capturing logs both in the console and in a dedicated file.</p>

    <h2>Custom Exceptions</h2>
    <p>Custom exceptions are designed to address specific error situations, delivering clear and informative error messages to the client.</p>

    <h2>Setup and Configuration</h2>
    <h3>Prerequisites</h3>
    <ul>
        <li><strong>JDK 21</strong></li>
        <li><strong>MySQL server</strong></li>
        <li><strong>Maven</strong></li>
    </ul>

    <div class="footer">
        <p>Credits: <strong>Pathum Rathnayaka</strong></p>
        <div class="license">
            <p>This project is licensed under the MIT License.</p>
        </div>
    </div>
</body>
</html>
