
# Personal Profile Web Application

## 1. Project Overview

The Personal Profile Web Application is a simple web-based system developed to collect and display student personal information.

This application allows users to submit their personal details through an HTML form. The submitted information is processed using Java Servlet and displayed on a JSP page.

## 2. Project Objectives

- To develop a simple Personal Profile Web Application.
- To collect student information using an HTML form.
- To process submitted data using Java Servlet.
- To display user information dynamically using JSP.
- To design a user-friendly interface using CSS.

## 3. Technologies Used

| Technology | Description |
|---|---|
| HTML | Creates the personal profile form |
| CSS | Designs the application interface |
| Java Servlet | Processes submitted user information |
| JSP | Displays submitted profile information |
| Apache Tomcat 9 | Web application server |
| NetBeans IDE 8.2 | Development environment |
| Java JDK 8 | Programming platform |

## 4. System Features

The application provides the following features:

- Full Name input
- Student ID input
- Program input
- Email Address input
- Multiple Hobbies selection
- Short Self-Introduction input
- Submit Profile function
- Student Profile result display
- Back to Profile Form navigation

## 5. System Workflow

1. User opens the Personal Profile Form.
2. User enters personal information.
3. User submits the form using HTTP POST.
4. ProfileServlet receives and processes the submitted data.
5. The Servlet forwards the information to result.jsp.
6. JSP displays the submitted student profile.

## 6. Project Structure

```text
PersonalProfileApp/
│
├── src/
│   └── com/azhan/personalprofileapp/
│       └── ProfileServlet.java
│
├── web/
│   ├── css/
│   │   └── style.css
│   ├── index.html
│   └── result.jsp
│
├── nbproject/
├── build.xml
└── README.md
```

## 7. How to Run the Application

1. Open NetBeans IDE 8.2.
2. Open the PersonalProfileApp project.
3. Configure Apache Tomcat 9 as the application server.
4. Right-click the project and select Run.
5. Open the application in a web browser:

```text
http://localhost:8080/PersonalProfileApp/
```

6. Fill in the personal profile form.
7. Click Submit Profile to view the submitted information.

## 8. Database

Database integration is not required for this project. User information is processed and displayed during the current request.

## 9. Developer

**Name:** Muhammad Azhan Bin Azaman Haris

**Project:** Personal Profile Web Application

**Development Environment:** NetBeans IDE 8.2
