package quizzes;

public class IfStatements_10_09_2020 {
    public static void main(String[] args) {
        int num = 9;

        if (num++ == 10) {
            System.out.println("hello" + num);
        } else {
            System.out.println("hello word" + ++num);
        }

        System.out.println(num++);

        System.out.println("===================================");

        int score = 0;
        if (score == 0)
            score += 50;
        if (score != 0)
            score += 50;

        System.out.println(score);


        System.out.println("=======================================");
        int number = 10;
        if (--number > 10) {
            System.out.println("Mahdi " + number);

        } else if (number == 9) {
            System.out.println("Yousefi " + number);
        }
        System.out.println("=====================================");

        boolean x = true;
        boolean y = !x == false;
        boolean z = y;

        if (x) {
            System.out.println("one");
        }
        if (y) {
            System.out.println("Two");
        }
        if (z) {
            System.out.println("Three");
        }
        System.out.println("=====================================");

        int a = 10;
        int b = a++;      //a=11  //b=10

        System.out.println(b++ + " " + a++ + " " + b);


    }

}