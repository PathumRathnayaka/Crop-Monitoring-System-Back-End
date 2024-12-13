# Green Shadow Spring Boot Application

![Spring Boot](https://1.bp.blogspot.com/-TevOgPVC2dE/WnILAnucRVI/AAAAAAAAGU0/OlrnoLsf2fs9aKpm9_BGEqk5R54gUCZbgCLcBGAs/s1600/spring-boot.png)


This is a Spring Boot-based backend system. It provides RESTful APIs for managing crop, equipment, field, staff, user, vehicle, monitoring log, and transactions. The project uses Spring Boot, JPA, Hibernate, Spring Security, and MySQL for database connectivity.

this is UI https://github.com/PathumRathnayaka/Crop-Monitoring-System.git

## Features

- Equipment Management
- Field Management
- Staff Management
- User Management
- Vehicle Management
- Monitoring Log Management
- Role-Based Access Control
- Token Generation
- Token Validation
- Token Refresh
- Spring Security Integration
- Custom Authentication Provider
- Secure Password Storage
- Profile Management
- Login Attempt Auditing
- Activity Logging
- Protected Endpoints
- Transaction Processing
- Exception Handling and Validation using Hibernate Validator
- JSON Response formatting
- Logs with Logback

## Technologies

- **Java Version:** JDK 21
- **Backend Framework:** Spring Boot (v3.4.0)
- **Database:** MySQL
- **ORM:** JPA, Hibernate
- **Server:** Apache Tomcat
- **Validation:** Hibernate Validator
- **Logger:** Logback

## Architecture Overview

- **Entities:** Representations for Crop, Email, Equipment, Field, Staff, User, Vehicle, and Monitoring Log
- **Data Transfer Objects (DTOs):** Includes CropDTO, EmailDTO, EquipmentDTO, FieldDTO, StaffDTO, UserDTO, VehicleDTO, and MonitorLogDTO
- **Repositories:** Interfaces for database operations.
- **Services:** Business logic for management.
- **Controllers:** API endpoints for handling requests.
- **Utilities:** Helper classes for tasks.
- **Exceptions:** Custom error handling mechanisms for specific scenarios.
- **Configuration:** Application setup classes like `application.properties`, `application-dev.properties`.

## Validation

Data validation is enforced through Hibernate Validator annotations within the DTO classes, ensuring both data integrity and accuracy.

## Logging

Logging is set up with Logback, capturing logs both in the console and in a dedicated file.

## Custom Exceptions

Custom exceptions are designed to address specific error situations, delivering clear and informative error messages to the client.

## Setup and Configuration

### Prerequisites

- **JDK 21**
- **MySQL server**
- **Maven**

## Credits

**Pathum Rathnayaka**

## License

This project is licensed under the MIT License.
