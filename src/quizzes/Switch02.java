package quizzes;

public class Switch02 {
    public static void main(String[] args) {


        int i = 10;
        switch (i) {
            case 10:
                System.out.println("Monday");

            case 11:
                System.out.println("Tuesday");
            default:
                System.out.println("Friday");
        }

//switch does not work with double , float,long ,boolean
        //if we put them instead of int does not work
    }
}