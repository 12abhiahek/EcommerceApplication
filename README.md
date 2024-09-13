# TravtronicsTech E-Commerce Application

## Overview
This is a Java Spring Boot application designed to manage an e-commerce system. It includes functionalities for handling products, inventory, carts, and orders with full CRUD capabilities. The application uses an in-memory H2 database for development and includes concurrency management for critical operations.

## Features
- **Product Management**: Create, read, update, and delete products.
- **Inventory Management**: Track inventory levels and manage stock.
- **Paginated Product Search**: Search and filter products with pagination support.
- **Cart Management**: Add, update, and remove items in a user's cart.
- **Order Placement**: Place orders based on the items in the cart.
- **Concurrency Management**: Ensures safe and accurate processing of critical operations like inventory updates.

## Technologies Used
- **Java**: Version 17 or above
- **Spring Boot**: Version 3.x
- **Spring Data JPA**: For data access and persistence
- **Spring Security**: For authentication and authorization
- **H2 Database**: In-memory database for development
- **Maven**: For project build and dependency management
- **JWT**: For secure authentication
- **CI/CD**: Set up via GitHub Actions

## Getting Started

### Prerequisites
- Java 17 or higher installed
- Maven installed

### Setup and Running Locally

1. **Clone the repository:**
   ```bash
   git clone <repository-url>
   cd <repository-directory>


### Access the application:

- API documentation is available at: http://localhost:8080/swagger-ui.html
- H2 Console can be accessed at: http://localhost:8080/h2-console
### Configuration
The application uses an in-memory H2 database with default settings. Adjust application.properties for different environments or to use a persistent database like MySQL or PostgreSQL.
JWT settings and secret keys are configured in application.properties.
## API Endpoints
#### Products

- GET /api/products - List all products with pagination
- POST /api/products - Add a new product
- PUT /api/products/{id} - Update a product
- DELETE /api/products/{id} - Delete a product
### Inventory

- GET /api/inventory - View inventory details
- POST /api/inventory - Add inventory data
- PUT /api/inventory/{id} - Update inventory details
- DELETE /api/inventory/{id} - Delete inventory record
### Cart

- GET /api/carts - View cart items
- POST /api/carts - Add items to the cart
- PUT /api/carts/{id} - Update cart items
- DELETE /api/carts/{id} - Remove items from the cart
### Orders

- POST /api/orders - Place an order from cart items
### Concurrency Management
The application ensures thread-safe operations on inventory and order placement processes using synchronization and locking mechanisms provided by Spring Data JPA.

#### Continuous Integration / Continuous Deployment
- The application is set up with GitHub Actions for CI/CD to automate testing, building, and deploying the application.
 
 ### Contact
- Contact: 9696481593.
- LinkedIn: linkedin.com/in/abhishek-singh-38b2bb1b9
