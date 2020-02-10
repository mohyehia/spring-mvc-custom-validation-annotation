# spring-mvc-custom-validation-annotation
Spring boot mvc application that uses custom validation annotation for field and class level.

### Technologies Used
* Spring Boot
* Spring MVC
* Thymeleaf
* Maven

### Prerequisites
Java 1.8 or greater, Spring boot 2.0 or greater, Maven, IntelliJ or Eclipse.

### Getting Started
These instructions will get you a copy of the project up and running on your local machine for development and testing purposes:
* import the project in IntelliJ or Eclipse.
* Or build the project using maven to get a jar file.
* After running the application open your browser and navigate to `localhost:9090` to test the application.

### Important Notes
* The first annotation is `PhoneNumber` for the `phoneNumber` field in the `User` object.
* The second annotation is `PasswordConfirmation` and it is a class level validation annotation for the fields `password` & `confirmPassword` in the `User` object.
* For rendering the class level error messages in thymeleaf we use `th:if="${#fields.hasErrors('global')}"` instead of `th:if="${#fields.hasErrors('fieldName')}"` as this is not a field error from spring `BindingResult`. 

### Acknowledgments
These are the articles that helped me complete this application:
* [Baeldung Blog](https://www.baeldung.com/spring-mvc-custom-validator) - Spring MVC Custom Validation