import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //1 float is decimal and int is a whole number
        //2 a scanner acanned the data from the keyboard
        //3 System.out.println() -print whatever inside the parantesis into the terminal/console
        //4
        int num = 5;
        int num1 = 20 + 12;
        float floatNum = 5.7f;
        System.out.println(num);
        System.out.println(num1);
        System.out.println(floatNum);

        //5
        int a = 2, b = 5;
        int sum = a + b;
        int multiply = a * b;
//
//        //6
        String color = "blue";
//        //7
        Scanner scan = new Scanner(System.in); // scanner created

        String name = scan.nextLine();
        System.out.println("Hello " + name + " Welcome to Java!");
        //8
        int year = 2020 ;
        year += 10;     // 2030
        year -= 30;      //2000
        System.out.println(year);

//        //9
        int oneNum = scan.nextInt();
        int twoNum = scan.nextInt();
        int threeNum = scan.nextInt();
        int sum = oneNum + twoNum + threeNum;
        System.out.println(sum / 3);
//        //10
        int speed = scan.nextInt();
        if (speed > 120) {
            System.out.println("too fast!");
        } else if (speed < 80) {
            System.out.println("too slow!");
        } else {
            System.out.println("good driver");
        }

//        //11
        int dannyAge = scan.nextInt();
        int tomerAge = scan.nextInt();
        if (dannyAge > tomerAge) {
            System.out.println("Danny is older");
        } else {
            System.out.println("Tomer is older");
        }
//        //12
        int x = scan.nextInt();
        int y = scan.nextInt();
        if (x > y) {
            System.out.println(y);
        }else if (x < y ) {
            System.out.println(x);
        } else {
            System.out.println("equal");
        }


        //13
            for (int i = 0; i <= 100; i++) {
                if (i % 3 == 0) {
                    System.out.println(i);
                }
            }
        //14
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();
        //checking if num1 is a middle number
        if ((num1 < num2 && num1 > num3) || (num1 < num3 && num1 > num2)) {
            System.out.println("num1 is our middle value: " + num1);
            //checking if num2 is a middle number
        } else if ((num2 < num1 && num2 > num3) || (num2 > num1 && num2 < num3)) {
            System.out.println("num2 is our middle value: " + num2);
            //checking if num3 is a middle number
        } else if ((num3 < num1 && num3 > num2) || (num3 > num1 && num3 < num2)) {
            System.out.println("num3 is our middle value: " + num3);
        } else {
            System.out.println("no middle value was found");
        }
//        //15
        int first = scan.nextInt();
        int second = scan.nextInt();
        if (first < second) {
            System.out.println(String.format("%d,%d", first, second));
        } else {
            System.out.println(String.format("%d,%d", second, first));
        }
//        //16
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
//        //17
        for (int i = 1; i <= 50; i += 2) {
            System.out.println(i);
        }
//        //18
        Random myRandom = new Random();
        int randNum;
        do {
//            randNum = myRandom.nextInt(21) + 10;
            randNum = myRandom.nextInt(30);
            System.out.println(randNum);
        } while (randNum != 15);
//        //19
        int number = scan.nextInt();
        switch (number) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("unknown number");
        }

        // 19 - different way to solve if/else
        if ( number == 1) {
            System.out.println("one");
        } else if (number == 2) {
            System.out.println("two");
        } else if (number == 3) {
            System.out.println("three");
        } else {
            System.out.println("unknown number");
        }

//        //20
        int sumNum;
        while (true) {
            int num = scan.nextInt();
            sumNum =+ num;

            if (num == 0) {
                break;
            }

        }
        System.out.println(sumNum);
        //21
        int k = scan.nextInt();
        while (k < 99 && k > 1000) {
            System.out.println("wrong! please enter number with 3 digits!");
            k = scan.nextInt();
        }
        System.out.println(k / 100); //int returns integer - if it was float then we could have used Math.floor

        //22
        int grade;
        int gradeSum;
        int gradeAmount = 0;
        do {
            grade = scan.nextInt();
            gradeSum =+ grade;
            gradeAmount++;
        } while (grade != -1);

        System.out.println(gradeSum / gradeAmount);

        //23
        int n = scan.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;

        }
        System.out.println("The factorial is: " + factorial );

        //24
        int input;
        int max_num = 0;

        do {
            input = scan.nextInt();

            if (max_num < input) {
                max_num = input;
            }
        } while (input > 0);

        System.out.println(max_num);

        //25
        int lineNum = scan.nextInt();
        for ( int i=1; i <= lineNum; i++) {
            System.out.print("-");
        }

        //26
        while (true) {
            float temp = scan.nextFloat();
            if (temp == 1) {
                break;
            }
            if (temp <= 37) {
                System.out.println("Welcome");
            } else if (temp > 37) {
                System.out.println("Sorry, you cannot enter");
            }
        }

        //27 bingoGame
        Scanner s = new Scanner(System.in);
        Random r = new Random();

        for (int i = 1; i <= 3; i++) {
            System.out.println(String.format("Game number %d", i));

            int lucky_number = r.nextInt(100) + 1;
            System.out.println(String.format("Lucky number %d", lucky_number));
            int guesses = 0;

            while(true) {
                if (guesses == 5) {
                    break;
                }


                guesses++;
                System.out.println("Guess the number:");
                int guess = s.nextInt();
                if (guess > lucky_number) {
                    System.out.println("Guess lower");
                } else if (guess < lucky_number) {
                    System.out.println("Guess higher");
                } else {
                    System.out.println("Bingo");
                    break;
                }
            }
            System.out.println(String.format("It took the %d guesses", guesses));
        }
        //28
        System.out.println("How much is your salary per hour?");
        double salaryPerHour = scan.nextFloat();
        System.out.println("How many hours do you work?");
        double hours = scan.nextFloat();
        double income = salaryPerHour * hours;
        System.out.println("Your total income is : " + income);
        double tax = 0;
        if (income < 1000) {
            tax = 0.02;
            System.out.println("Your income after tax is: " + (income - (income * tax)));
        } else if (1000 < income && income < 5000) {
            tax = 0.10;
            System.out.println("Your income after tax is: " + (income - (income * tax)));
        } else if (income > 5000) {
            tax = 0.20;
            System.out.println("Your income after tax is: " + (income - (income * tax)));
        }
        //29 challenge - rock paper scissors game
        //we can put it inside for loop - if we know how many games we want to play
        //or we can put it inside a while (true) loop that will contain an if satatment that will break the loop
        Random random = new Random();
        int computerMove= random.nextInt(3) + 1;
        int userMove = scan.nextInt();
        while (userMove != 1 && userMove != 2 && userMove != 3) {
            System.out.println("Please enter correct value");
            userMove = scan.nextInt();
        }
        if (userMove == computerMove) {
            System.out.println("teko");
        } else if ((userMove == 1 && computerMove == 3) || (userMove == 2 && computerMove == 1) || (userMove == 3 && computerMove == 2)) {
            System.out.println("user wins");
        } else {
            System.out.println("computer wins");
        }

    }
}