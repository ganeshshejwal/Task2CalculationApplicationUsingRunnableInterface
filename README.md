# Mathematical Calculations Spring Boot Application

This Spring Boot application provides endpoints to perform various mathematical calculations asynchronously using the Runnable interface. It includes methods for calculating square, cube, factorial, Armstrong number, palindrome, even/odd, prime number, and reverse of a number.

### Prerequisites

- Java Development Kit (JDK) 21
- Gradle

## Project Structure

The project is structured into layers:

### Controller Layer

Receives HTTP requests and routes them to appropriate methods in the service layer.

#### Endpoints

- **GET /run**: Triggers the execution of all calculation tasks asynchronously.

### Service Layer

Contains business logic for performing mathematical calculations using Runnable interface and lambda expressions.

#### Methods

- **calculateMethod()**: Executes all calculation tasks asynchronously.

### Utility Methods

Provides reusable utility methods for mathematical operations.

#### Methods

- **square(int number)**: Computes the square of a number.
- **cube(int number)**: Computes the cube of a number.
- **factorial(int number)**: Computes the factorial of a number.
- **isArmstrong(int number)**: Checks if a number is an Armstrong number.
- **isPalindrome(int number)**: Checks if a number is a palindrome.
- **isEven(int number)**: Checks if a number is even.
- **isPrime(int number)**: Checks if a number is prime.
- **reverse(int number)**: Reverses a given number.

### Testing

Unit tests for utility methods are implemented using JUnit 5 and Mockito.

## Build Steps

Ensure you have ```Java Development Kit (JDK) version 21``` installed on your machine.

1. Clone the repository:
   ```bash
   git clone https://github.com/ganeshshejwal/TestManagement.git
   ```
   
2. Open the project in your preferred Integrated Development Environment (IDE) or navigate to the project directory using a terminal or command prompt.<br>

3. Ensure that you have the ```build.gradle``` file in the project root directory. This file should contain the project configuration and dependencies.<br>

4. Build the project using Gradle by running the following command in the project directory:
   <br>Copy code
   ```bash
   /gradlew build
   ```
This command will compile the source code, run unit tests, and package the application into a JAR file.

## Execution Steps

After successfully building the project, To start the Spring Boot application from the command line navigate to the `build/libs` directory:

```bash
cd build/libs
```
### Running the Application

Run application using following command:

```bash
java -jar CalculationapiApplication-0.0.1.jar
```
4. Once the application is running, you can access the API endpoints using a tool like ``` Postman or cURL ```.


