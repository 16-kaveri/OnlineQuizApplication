# OnlineQuizApplication
Online Quiz Application- A full-stack web app built with Angular, Spring Boot, and MySQL that lets users take timed quizzes, navigate through questions and view detailed results with their score.

# Project Description
The Online Quiz Application is a full-stack project that provides users with an engaging quiz experience. Users can start the quiz, answer multiple-choice questions one by one, move between questions, and view their final score with a detailed breakdown of correct and incorrect answers.
This application is developed using:
      1)Frontend: Angular
      2)Backend: Java Spring Boot
      3)Database: MySQL

# Key Features
  Start page to begin the quiz
  Displays one question at a time with options
  “Next” and “Previous” navigation buttons
  Timer to track quiz duration
  “Submit” button that sends answers to the backend for scoring
   Result page showing score and answer correctness

# How to set up and run project locally
1)Backend and MySQL
     Import the backend project folder (QuizApplication_Backend) as existing maven project in your IDE (Eclipse or IntelliJ).

2)Configure your MySQL database:
     Create a database named quizdb using below mysql command:
     
          CREATE DATABASE quizdb;
     or you can use the self-contained mysql file which i have attached in project folder.

3)Update your application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/quizdb
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update


4)Run the Spring Boot application:

   In your IDE -> Run QuizApplication.java

5)Frontend Set up
    Open the frontend folder (QuizAppication_Frontend).

   Install dependencies (you can skip this step if you already have node intsalled in your system.)

        npm install

    Start the Angular development server:

        ng serve -o


    Open your browser and go to:
       http://localhost:4200/start

  # How to run test case
    open the src/test/java/com.quiz
    run the QuizApplicationTests.java file in IDE (Eclipse or IntelliJ) 
         In your IDE -> Run QuizApplicationTests.java as Junit Test.
 

   
