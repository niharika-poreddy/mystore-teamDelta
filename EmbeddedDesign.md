# Introduction

The My Store Application is an e-commerce platform that allows users to browse and purchase products online. This design document outlines the architecture, components, and functionality of the application. The project will be hosted on GitHub for collaborative development and version control.

### ER diagarams are in below path:

https://github.com/WSUCEG-7140/mystore-teamDelta/blob/main/ER%20diagaram.txt

## Table of Contents

1.	Project Overview
2.	Architecture
3.	User Interface
4.	API Endpoints
5.	Database Schema

### 1. Project Overview
The My Store Application aims to provide an intuitive and enjoyable shopping experience for users. It will offer a wide range of products, secure user authentication, shopping cart functionality, and order processing. Additionally, an admin interface will be available to manage products, users, and orders.

### 2. Architecture
The application will follow a three-tier architecture:

MVC Design for MyStore Application
#### 1. Model

The Model component in MyStore is responsible for managing the application's data and business logic. It interacts with the database to fetch and store information about products, users, orders, and other relevant entities.

Key Responsibilities:

1.	Define data structures for products, users, and orders.
2.	Implement data validation and business logic to ensure data integrity.
3.	Perform CRUD operations (Create, Read, Update, Delete) on the database.
4.	Handle stock management to track product availability.

#### 2. View

The View component is responsible for presenting the user interface to customers and store administrators. It displays the product catalog, shopping cart, order history, login/register forms, and other necessary screens.

Key Responsibilities:

1.	Render HTML templates and user interfaces using HTML, CSS, and JavaScript.
2.	Display product information, prices, and images in an appealing manner.
3.	Enable user interaction with forms and buttons for actions like adding to cart and placing orders.
4.	Provide a responsive design to ensure compatibility with different devices.

#### 3. Controller

The Controller component acts as an intermediary between the Model and View components. It processes user input from the View, updates the Model accordingly, and updates the View with the latest data.

Key Responsibilities:

1.	Handle incoming HTTP requests from the View and invoke the appropriate Model methods.
2.	Manage user sessions and authentication to restrict access to certain functionalities.
3.	Validate user input before passing it to the Model for processing.
4.	Update the View with the latest data from the Model after each action.

### 3. User Interface
The user interface will be designed with a clean and modern look, featuring an intuitive navigation system. Users will be able to access products, add items to their cart, and complete purchases with ease.

### 4. API Endpoints
The backend will expose the following API endpoints:

/api/auth/signup - User registration

/api/auth/login - User login and authentication

/api/products - Retrieve all products

/api/products/{id} - Retrieve a specific product by ID

/api/cart - Retrieve the shopping cart for the authenticated user

/api/cart/add - Add an item to the shopping cart

/api/cart/remove - Remove an item from the shopping cart

/api/orders - Retrieve order history for the authenticated user

/api/orders/{id} - Retrieve a specific order by ID

/api/orders/place - Place a new order

### 5. Database Schema
The MySQL database will consist of the following tables:

1.	users: stores user information (id, username, email, password, etc.)
2.	products: stores product details (id, name, price, description, etc.)
3.	cart_items: stores items added to the user's shopping cart (id, user_id, product_id, quantity, etc.)
4.	orders: stores order details (id, user_id, total_amount, order_date, etc.)
5.	order_items: stores individual items within an order (id, order_id, product_id, quantity, etc.)


This design document outlines the roadmap for developing the My Store Application on GitHub. It provides an overview of the architecture, technologies used, features, and deployment strategy. By following this document, the development team can collaborate efficiently and build an exceptional e-commerce platform for users to enjoy.
