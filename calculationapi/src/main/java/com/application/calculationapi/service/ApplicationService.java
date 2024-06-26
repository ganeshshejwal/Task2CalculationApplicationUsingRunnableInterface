package com.application.calculationapi.service;

import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
public class ApplicationService{


    public int number;
    Scanner sc = new Scanner(System.in);
    public ApplicationService() {
        System.out.print("Enter a number (0 to 9999): ");
        this.number = sc.nextInt();
    }

    public Runnable GetSquareTask=()->{
        int square=number*number;
        System.out.println("Square of "+number+"= "+square);
    };

    public Runnable GetCubeTask=()->{
        int cube=number*number*number;
        System.out.println("Cube of "+number+"= "+cube);
    };

    public Runnable CheckEvenOrOddTask=()->{
        boolean isEven=(number%2==0);
        if(isEven) System.out.println(number+" is Even");
        else System.out.println(number+" is Odd");
    };

    public Runnable CheckPrimeOrNotTask=()->{
        boolean isPrime=true;
        if(number<=1){
            isPrime=false;
        } else{
            for(int i=2; i<=Math.sqrt(number);i++) {
                if (number%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if(isPrime) System.out.println(number+" is Prime");
        else System.out.println(number+" is Not Prime");
    };

    public Runnable CheckArmstrongNumberTask=()->{
        int original=number;
        int sum=0;
        int digits=String.valueOf(number).length();
        int temp=number;
        while (temp>0) {
            int digit=temp % 10;
            sum+=Math.pow(digit, digits);
            temp/=10;
        }
        boolean isArmstrong=(original==sum);
        if(isArmstrong)System.out.println(number+" is Armstrong Number");
        else System.out.println(number+" is Not Armstrong Number");
    };

    
    public Runnable CheckPalindromeTask=()->{
        int original=number;
        int reverse=0;
        int temp=number;
        while(temp>0) {
            int digit=temp%10;
            reverse=reverse*10+digit;
            temp/=10;
        }
        boolean isPalindrome=(original==reverse);
        if(isPalindrome) System.out.println(number+" is palindrome Number");
        else System.out.println(number+" is Not palindrome Number");
    };

    public Runnable GetFactorialTask=()->{
        int fact=1;
        for (int i=1;i<=number;i++) {
            fact*=i;
        }
        System.out.println("Factorial of "+number+"= "+fact);
    };

    
    public Runnable GetReverseTask=()->{
        int rev=0;
        int temp=number;
        while (temp>0) {
            rev=rev*10+temp%10;
            temp/=10;
        }
        System.out.println("Reverse of "+number+"= "+rev);
    };
}
