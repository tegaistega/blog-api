# social media - api
This is a social media app. It allows users signup and post statuses, comments images and more.

# Backend
<li>Spring Boot</li>
<li>Spring Security</li>
Hibernate

# Database
MySQL

Build Tool
Maven 3.3.9

Features
Content: post, comment, category, album, tag, todo
User: roles, profile, avatar, email confirmation, address, geolocation

# How It Works
Database Setup
Before deployment, please make sure MySQL database is up and running:

# Default schema name is blog-api
You can also edit database configuration in src/main/resources/application.properties on your own.

# Run with Maven:
git clone https://github.com/tegaistega/blog-api.git
cd blog-api
mvn spring-boot:run
Server can be accessed on http://localhost:8080.
