## Web_Automation_Project_with_Page_Object_Model_(PMO)_Selenium_&_TestNG
Automate web interactions with boibazar.com using Java and the Page Object Model (POM). This project demonstrates the automation of various features of the popular online book retailer, including scrolling, mouse hover actions, menu selection, text filtering, book overviews, shopping cart interactions, and more
<p align="center">
  <img src="https://www.boibazar.com/asset/images/logo_bn.png" alt="Your Project Logo">
</p>


## Table of Contents

- [🚀 Introduction](#-introduction)
- [✨ Features](#-features)
- [📁 Project Structure](#-project-structure)
- [🏁 Getting Started](#-getting-started)
  - [Technology used](#Technology-used)
  - [Pre Requisites](#Pre-Requisites)
  - [Setup Java Development Environment](#setup-java-development-environment)
  - [Install Selenium WebDriver](#install-selenium-webdriver)
  - [Configure Driver Settings](#configure-driver-settings)
- [💡 Usage](#-usage)
  - [Run Scrolling Feature](#run-scrolling-feature)
  

## 🚀 Introduction

Welcome to the Web Automation project for [boibazar.com](https://www.boibazar.com/). This project showcases web automation using Java and the Page Object Model (POM) for the popular online book retailer, boibazar.com.

## ✨ Features

- ✅ Scroll to visit the whole website.
- ✅ Perform mouse hover actions and select a writer.
- ✅ Hover over menus and select options for writer's written books.
- ✅ Filter text and check selected books.
- ✅ View book overviews and add them to the cart.
- ✅ Navigate to the shopping cart, provide a phone number, and proceed to checkout.
- ✅ Create an account with shipping details.
- ✅ Complete the order process.

## 📁 Project Structure

The project is organized into the following main components:

- 📂 `BaseDriver`: Contains driver and page settings.
- 📂 `Pages`: Includes classes for various this website features.
- 📂 `Tests`: Test cases that use the Page Object Model.

## 🏁 Getting Started

To get started with this project, follow these steps:

### Technology used

- Test tool: Selenium
- Language: Java
- Architecture: POM
- Framework: TestNG.
### Pre Requisites
- Open/install Java JDK 14 version on your PC
- Install Maven on your PC
- Install TestNG on your IDE
- Install Eclipse/STS or any other IDE
- Setup Java, Maven environment on your PC
- Chrome driver match with your browser

### Setup Java Development Environment

2. Set up a Java development environment.

### Install Selenium WebDriver

### **[Requirements:](url)**
These steps are executed:

- Open the Chrome browser
- Maximize the browser window
- Go to  Selenium Web Site
- Click About Menu Section
- Click sub about menu
- Get "Selenium is a suite of tools for automating web browsers" text and validate it.
- Take Screenshot
- Close the browser
3. Ensure you have Selenium WebDriver installed.

### Configure Driver Settings

4. Update the web driver path and any necessary configurations in `DriverSetting.java`.

## 💡 Usage

To run the test cases, use the Test classes in the `Tests` package. Each class corresponds to a different feature.

### Run Scrolling Feature

For example, to run the scrolling feature:

```java
Class1_Scrolling scrolling = new Class1_Scrolling(driver);
scrolling.Scroll();
