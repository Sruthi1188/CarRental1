This is a Car Rental Application built using Spring Boot. The application manages entities such as Car, Station, Rental, and Customer.
Introduction
The Car Rental Application is designed to manage car rentals efficiently. It includes functionalities for managing cars, rental stations, rentals, and customers.

Features
CRUD operations for Car, Station, Rental, and Customer entities.
Search and filter cars based on availability and location.
Manage rental transactions.
User authentication and authorization.

Technologies Used
Java
Spring Boot
Spring Data JPA
Hibernate
MySQL
Maven

Configure the MySQL database:
Create a database named car_rental_db.
Update the application.properties file with your MySQL credentials.


GET /cars - Retrieve all cars
GET /customers/{id} - Retrieve a car by ID
POST /rental - Create a new car
PUT /station/{id} - Update a car
