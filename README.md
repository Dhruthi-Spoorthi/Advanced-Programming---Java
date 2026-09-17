# Jewellery Store API

## About the Project

This project is a Jewellery Store API developed using Java and Spring Boot. The application connects to MongoDB and provides REST API endpoints for managing jewellery categories and products.

The main purpose of this project is to implement and test basic CRUD operations using a REST API and MongoDB.

CRUD stands for:

* **Create** – Add new data
* **Read** – View existing data
* **Update** – Modify existing data
* **Delete** – Remove data

## Technologies Used

* Java
* Spring Boot
* Maven
* MongoDB
* MongoDB Atlas
* REST API
* IntelliJ IDEA
* Git and GitHub
* cURL for API testing

## Project Structure

```text
Advanced-Programming---Java/
├── src/
│   ├── main/
│   │   ├── java/
│   │   └── resources/
│   │       └── application.properties
│   └── test/
├── pom.xml
└── README.md
```

## Main Features

The application currently provides functionality for managing **categories** and **products**.

### Category Management

The Category API allows users to:

* Create a category
* View all categories
* View a category by its ID
* Update a category
* Delete a category

### Product Management

The Product API allows users to:

* Create a product
* View all products
* View a product by its ID
* Update a product
* Delete a product

## API Endpoints

### Category Endpoints

| Method | Endpoint               | Purpose               |
| ------ | ---------------------- | --------------------- |
| POST   | `/api/categories`      | Create a new category |
| GET    | `/api/categories`      | Get all categories    |
| GET    | `/api/categories/{id}` | Get a category by ID  |
| PUT    | `/api/categories/{id}` | Update a category     |
| DELETE | `/api/categories/{id}` | Delete a category     |

### Product Endpoints

| Method | Endpoint             | Purpose              |
| ------ | -------------------- | -------------------- |
| POST   | `/api/products`      | Create a new product |
| GET    | `/api/products`      | Get all products     |
| GET    | `/api/products/{id}` | Get a product by ID  |
| PUT    | `/api/products/{id}` | Update a product     |
| DELETE | `/api/products/{id}` | Delete a product     |

## Database

MongoDB is used to store the jewellery store data.

The application uses an environment variable for the MongoDB connection instead of storing the database password directly in the project.

The `application.properties` file contains:

```properties
spring.application.name=jewellery-store
spring.mongodb.uri=${MONGODB_URI}
spring.mongodb.database=jewellery_store
```

The actual MongoDB connection string should be provided through the `MONGODB_URI` environment variable.

## Running the Project

### 1. Clone the repository

```bash
git clone https://github.com/Dhruthi-Spoorthi/Advanced-Programming---Java.git
```

### 2. Open the project

Open the project in IntelliJ IDEA.

### 3. Configure MongoDB

Make sure the `MONGODB_URI` environment variable is configured with the MongoDB connection string.

The database password should not be added directly to the source code or uploaded to GitHub.

### 4. Run the application

Run the Spring Boot application from IntelliJ IDEA.

The application runs on:

```text
http://localhost:8080
```

## API Testing

I tested the REST API using cURL commands from the Terminal.

### Category CRUD Testing

The following operations were tested successfully:

* **POST** – Category was created successfully.
* **GET** – Category details were retrieved successfully.
* **PUT** – Category details were updated successfully.
* **DELETE** – Category was deleted successfully.

The API returned the expected HTTP status codes during testing.

### Product CRUD Testing

The following operations were tested successfully:

* **POST** – Product was created successfully.
* **GET** – Product details were retrieved successfully.
* **GET all** – All products were retrieved successfully.
* **PUT** – Product details were updated successfully.
* **DELETE** – Product was deleted successfully.

Temporary test data was removed after testing so that the database was left with the original product data.

## Example Category

```json
{
  "name": "Gold Rings",
  "description": "Elegant gold rings for everyday wear and special occasions."
}
```

## Example Product

```json
{
  "name": "Classic Gold Ring",
  "description": "A timeless gold ring designed with a simple and elegant finish.",
  "price": 24999.0,
  "category": "Gold Rings",
  "material": "18K Gold",
  "image": "",
  "stock": 10,
  "featured": true
}
```

## HTTP Status Codes Used During Testing

Some of the main status codes observed while testing the API were:

* **200 OK** – Request was successful.
* **201 Created** – A new product or category was successfully created.
* **204 No Content** – A product or category was successfully deleted.
* **404 Not Found** – The requested resource did not exist.

For example, after deleting a test product, the DELETE request returned `204 No Content`, confirming that the product was successfully removed.

## Security

Database credentials should not be stored directly in the project files.

The project uses:

```properties
spring.mongodb.uri=${MONGODB_URI}
```

This keeps the actual MongoDB connection string outside the source code.

## GitHub Repository

The project is available on GitHub:

https://github.com/Dhruthi-Spoorthi/Advanced-Programming---Java

## Conclusion

This project helped me implement a basic Jewellery Store REST API using Java, Spring Boot, and MongoDB.

I implemented CRUD operations for categories and products and tested the API using cURL commands. The tests confirmed that the main create, read, update, and delete operations are working correctly.
