# Automation Test Framework (Web UI + API)

This project is an automation testing framework built using Java.
It combines Web UI Testing and API Testing using Cucumber BDD approach in a single repository.

---

## 📌 Project Overview

This framework is designed to demonstrate:
- Web UI Automation using Selenium
- API Automation using Rest Assured
- BDD approach using Cucumber + Gherkin
- Page Object Model (POM) design pattern
- Separate execution for Web and API tests using Gradle task
- CI/CD integration using GitHub Actions

---

## 🛠️ Tech Stack

- Java
- Selenium WebDriver
- Rest Assured
- Cucumber
- TestNG
- Gradle 8.10
- GitHub Actions

---

## 📁 Project Structure

src/test/java
├── api
│   ├── runners
│   │   └── ApiRunner.java
│   ├── stepdefinitions
│   │   ├── CreateUserSteps.java
│   │   ├── DeleteUserSteps.java
│   │   ├── GetUserSteps.java
│   │   └── UpdateUserSteps.java
│
├── web
│   ├── hooks
│   │   └── Hooks.java
│   ├── pages
│   │   ├── LoginPage.java
│   │   ├── MenuPage.java
│   │   └── ProductsPage.java
│   ├── runners
│   │   └── WebRunner.java
│   ├── stepdefinitions
│   │   ├── CartSteps.java
│   │   ├── LoginSteps.java
│   │   └── LogoutSteps.java
│   └── utils
│       └── DriverFactory.java

---

src/test/resources
├── features
│   ├── api
│   │   ├── createUsers.feature
│   │   ├── deleteUsers.feature
│   │   ├── getUsers.feature
│   │   └── updateUsers.feature
│   └── web
│       ├── addToCart.feature
│       ├── login.feature
│       ├── logout.feature
│       └── removeProduct.feature

---

## 🌐 Test Coverage

### Web UI Testing
Target:
https://www.saucedemo.com/

Coverage:
- Login functionality
- UI validation
- Element interaction using POM

---

### API Testing
Target:
https://dummyapi.io/docs

Features:
- Get User by ID
- Create User
- Update User
- Delete User
- Get Tags

Authentication:
app-id: 63a804408eb0cb069b57e43a

---

## 🧪 How to Run Tests

Run all tests:
./gradlew test

Run Web tests:
./gradlew webTest

Run API tests:
./gradlew apiTest

---

## 🏷️ Cucumber Tags

@web → Web UI Tests  
@api → API Tests

Run specific tag:
./gradlew test -Dcucumber.filter.tags="@web"

---

## 📊 Reports

HTML:
- /target/cucumber-web.html
- /target/cucumber-api.html

JSON:
- /target/cucumber-web.json
- /target/cucumber-api.json

---

## ⚙️ CI/CD Pipeline

This project includes GitHub Actions:
- Manual trigger
- Run on Pull Request
- Execute Web + API tests

---

## 👨‍💻 Author

Automation Test Framework Project
