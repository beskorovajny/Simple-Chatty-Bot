package bot;

import java.util.Scanner;

public class SimpleBot {
    public static void main(String[] args) {
        // write your code here
        System.out.println("Hello! My name is Jarvis.");
        System.out.println("I was created in 2019.");
        System.out.println("Please, remind me your name.");
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.println("What a great name you have, "+ name + " !");
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();
        int age = ((a1 % 3) * 70 + (a2 % 5 ) * 21 + ( a3 % 7 ) * 15) % 105;
        System.out.println("Your age is "+ age + "; that's a good time to start programming!");
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int number = sc.nextInt();
        for(int i = 0;i <= number;i++){
            System.out.println(i + "!");
        }
        System.out.println("Let`s test your programming knowledge");
        System.out.println("Why do we use methods?");
        int answer = 0;
        System.out.println("1. To repeat a statement multiple items.");
        System.out.println("2. To decompose a program into several small subroutines.");
        System.out.println("3. To determine the execution time of program.");
        System.out.println("4. To interrupt the execution of a program.");
        do{
            answer = sc.nextInt();
        }while(answer != 2);
        System.out.println("Congratulations, have a nice day!");

    }
}
