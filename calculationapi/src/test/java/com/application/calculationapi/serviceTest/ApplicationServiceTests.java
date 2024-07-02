package com.application.calculationapi.serviceTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.context.SpringBootTest;

import com.application.calculationapi.service.ApplicationService;

@SpringBootTest
public class ApplicationServiceTests {

    @InjectMocks
    ApplicationService service;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetSquareTask() {
        int number = 5;
        service.number = number;
        service.GetSquareTask.run();
        assertEquals(25, number * number);
    }

    @Test
    public void testGetCubeTask() {
        int number = 3;
        service.number = number;
        service.GetCubeTask.run();
        assertEquals(27, number * number * number);
    }

    @Test
    public void testCheckEvenOrOddTask_Even() {
        int number = 4;
        service.number = number;
        service.CheckEvenOrOddTask.run();
        assertTrue(service.number % 2 == 0);
    }

    @Test
    public void testCheckEvenOrOddTask_Odd() {
        int number = 7;
        service.number = number;
        service.CheckEvenOrOddTask.run();
        assertFalse(service.number % 2 == 0);
    }

    @Test
    public void testCheckPrimeOrNotTask_Prime() {
        int number = 7;
        service.number = number;
        service.CheckPrimeOrNotTask.run();
        assertTrue(isPrime(service.number));
    }

    @Test
    public void testCheckPrimeOrNotTask_NotPrime() {
        int number = 6;
        service.number = number;
        service.CheckPrimeOrNotTask.run();
        assertFalse(isPrime(service.number));
    }

    @Test
    public void testCheckArmstrongNumberTask_Armstrong() {
        int number = 153;
        service.number = number;
        service.CheckArmstrongNumberTask.run();
        assertTrue(isArmstrong(service.number));
    }

    @Test
    public void testCheckArmstrongNumberTask_NotArmstrong() {
        int number = 123;
        service.number = number;
        service.CheckArmstrongNumberTask.run();
        assertFalse(isArmstrong(service.number));
    }

    @Test
    public void testCheckPalindromeTask_Palindrome() {
        int number = 121;
        service.number = number;
        service.CheckPalindromeTask.run();
        assertTrue(isPalindrome(service.number));
    }

    @Test
    public void testCheckPalindromeTask_NotPalindrome() {
        int number = 123;
        service.number = number;
        service.CheckPalindromeTask.run();
        assertFalse(isPalindrome(service.number));
    }

    @Test
    public void testGetFactorialTask() {
        int number = 5;
        service.number = number;
        service.GetFactorialTask.run();
        assertEquals(120, factorial(service.number));
    }

    @Test
    public void testGetReverseTask() {
        int number = 1234;
        service.number = number;
        service.GetReverseTask.run();
        assertEquals(4321, reverseNumber(service.number));
    }

    

    private boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private boolean isArmstrong(int number) {
        int original = number;
        int sum = 0;
        int digits = String.valueOf(number).length();
        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        return original == sum;
    }

    private boolean isPalindrome(int number) {
        int reversedNum = 0;
        int originalNum = number;
        while (number != 0) {
            int remainder = number % 10;
            reversedNum = reversedNum * 10 + remainder;
            number /= 10;
        }
        return originalNum == reversedNum;
    }

    private int factorial(int number) {
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        return fact;
    }

    private int reverseNumber(int number) {
        int reversedNum = 0;
        while (number != 0) {
            int remainder = number % 10;
            reversedNum = reversedNum * 10 + remainder;
            number /= 10;
        }
        return reversedNum;
    }
}
