package Week2;

import java.util.Random;
import java.util.Scanner;
public class Week2{
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        Random random = new Random();
        tenthTask(reader, random);
    }

    public static void firstTask(Scanner reader){
        System.out.print("Type the password: ");
        String input = reader.nextLine();
        String correctPassword = "carrot";
        while(!input.equals(correctPassword)){
            System.out.print("Wrong! \n");
            System.out.print("Type the password: ");
            input = reader.nextLine();
            if(input.equals(correctPassword)){
                break;
            }
        }
        System.out.println("Right!");
        System.out.println("\nThe secret is: jryy qbar!");
    }

    public static void secondTask(){
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        int read;


        System.out.print("Type the first number: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;
        System.out.print("Type the second number: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;
        System.out.print("Type the third number: ");
        read = Integer.parseInt(reader.nextLine());
        sum += read;

        System.out.println("Sum: " + sum);
    }

    public static void thirdTask(){
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        while (true){
            int read = Integer.parseInt(reader.nextLine());
            if(read == 0){
                break;
            }
            sum += read;
            System.out.println("Sum now: " + sum);
        }
        System.out.println("Sum in the end: " + sum);
    }

    public static void fourthTask(Scanner reader){
        System.out.print("First: ");
        int first = Integer.parseInt(reader.nextLine());
        System.out.print("Second: ");
        int second = Integer.parseInt(reader.nextLine());
        for(;first <= second; first++){
            System.out.println(first);
        }
    }

    public static void fifthTask(Scanner reader){
        System.out.print("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        int i = 0;
        int result = 0;
        while(i <= num){
            result += (int)Math.pow(2,i);
            i++;
        }
        System.out.println("The result is " + result);
    }

//   sixthTask
    public static void printText(Scanner reader){
        System.out.print("How many times: ");
        int times = Integer.parseInt(reader.nextLine());
        int i = 0;
        while(i < times){
            System.out.println("In the beginning there were the swap, the hoe and Java.");
            i++;
        }
    }

//    seventhTask
    public static void printStars(int num){
        for(int i  = 0; i < num; i++){
            System.out.print("*");
        }
        System.out.println();
    }

//    eighthTask
    public static void drawStarsPiramid(int num){
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void drawStarsPiramid2(int num){

        for(;num > 0; num--){
            for(int j = num; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

//    ninthTask
    public static void drawNumbersPiramid(int num){
    for(int i = 1; i <= num; i++){
        for(int j = 1; j <= i; j++){
            System.out.print(j + " ");
        }
        System.out.println();
    }
}

    public static void drawNumbersPiramid2(int num){
        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j + " ");
            }
            if(i < num){
                System.out.println();
                continue;
            }
            System.out.println(i +" " + i  +" " + i);
        }
    }

    public static void tenthTask(Scanner reader, Random random){
        int guess = random.nextInt(101);
        System.out.print("Guess a number: ");
        int input = Integer.parseInt(reader.nextLine());
        int made = 0;
        while(guess != input){
            made++;
            if(input < guess){
                System.out.println("The number is greater, guesses made: " + made);
                System.out.print("Guess a number: ");
                input = Integer.parseInt(reader.nextLine());
                continue;
            }
            System.out.println("The number is lesser, guesses made: " + made);
            System.out.print("Guess a number: ");
            input = Integer.parseInt(reader.nextLine());
        }
        System.out.println("Congratulations, your guess is correct!");
    }
}