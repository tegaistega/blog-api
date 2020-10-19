# Blog - api
This is a blog app. It allows users signup, create posts, make comments, update images and more.

# Backend
<li>Spring Boot</li>
<li>Spring Security</li>
<li>Hibernate</li>

# Database
<li>MySQL</li>

# Build Tool
<li>Maven 3.3.9</li>

# Features
<li>Content: post, comment, category, album, tag, todo</li>
<li>User: roles, profile, avatar, email confirmation, address, geolocation</li>

# How It Works
<li>Database Setup</li>
<li>Before deployment, please make sure MySQL database is up and running:</li>

# Default schema name is blog-api
You can also edit database configuration in src/main/resources/application.properties on your own.

# Run with Maven:
git clone https://github.com/tegaistega/blog-api.git
cd blog-api
mvn spring-boot:run
Server can be accessed on http://localhost:8080.
