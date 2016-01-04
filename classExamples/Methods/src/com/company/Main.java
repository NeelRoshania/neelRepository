package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //INITIALISATIOn
        String display = "";
        Scanner input = new Scanner(System.in);

        //RECIEVE INPUT FROM USER
        System.out.println("Hi. What year were you born in?");
        int age = input.nextInt();

        //DETERMINE AGE BY CALLING AGE METHOD
        ageOfPerson(age);

        //RECIEVE 3 INTEGERS FROM USER
        System.out.println("Ok. Time for some multiplication!\n");
        System.out.println("Give me the first integer");
        int multInt1 = input.nextInt();

        System.out.println("Give me the second integer");
        int multInt2 = input.nextInt();

        System.out.println("Give me the third integer");
        int multInt3 = input.nextInt();

        //MUTLIPLY VALUES TOGETHER AND OUTPUT RESULT
        multiplyThreeNumbers(multInt1,multInt2,multInt3);

    }

    public static void ageOfPerson(int DOB) {

        //METHOD TO ACCEPT INTEGER, DETERMINE USERS AGE AND DISPLAY INTO COMMAND PROMPT

        //DECLARATION
        int age = 0;

        age = 2016 - DOB;
        String display = "You will be " + age + " years old this year. How sad.\n";
        System.out.println(display);

    }

    public static void multiplyThreeNumbers(int num1, int num2, int num3) {

        //METHOD TO ACCEPT 3 INTEGERS, MULTIPLY AND OUTPUT RESULT

        //DECLARATION
        int resultofMult = 0;

        resultofMult = num1*num2*num3;
        String display = "Result of multiplication is: " + resultofMult;
        System.out.println(display);

    }

}
