package day08_Practice;

public class day09_30_2020 {
    public static void main(String[] args) {
              // program 1:

             int gallon = 100;
             double liter = (3.785 * gallon );

            System.out.println(gallon+" gallons equal to "+(int)liter+" liters");  //first way
            System.out.println("==========================================");
/*
write a program that converts the given number of gallons to liters.
                Note: MUST return integer result
                Ex:
                    gallons: 100
                    output:
                        100 gallons equal to 378 liters
                Hint: 1 gallon = 3.785 liter
 */

            //program 2:
        int kg = 100 ;
        int pound = (int) (kg * 2.20462);
        System.out.println(kg+" kg equal to "+pound+" pounds");
        System.out.println("==========================================");
/*
write a program that can convert the given number of kg to pounds
            Note: MUST return integer result
            Ex:
                kg = 100;
                output:
                    10 kg equal to 220 pounds
            Hint: 1 kg  = 2.20462 * pound
 */
       //program 3:
             int a =100 ;  //b=101
             int b = -a++ + ++a - a-- * a-- % 2;
             //    b=   -100 + 102 - 102 * 101 % 2
             //    b=   -100 + 102 - 10302 % 2
        System.out.println(a);
        System.out.println(b);
/*
manually calculate the following code fragements:
                1. int a = 100;
                   int b = -a++ + ++a - a-- * a-- % 2

 */
        System.out.println("==============================================");

        // program 4:

       int number = 0;
       boolean positiveNumber = number > 0 ;
       boolean negativeNumber = number < 0 ;
       boolean zero = number == 0;
        System.out.println(number+" is positive number: "+positiveNumber);
        System.out.println(number+" is negative number : "+negativeNumber);
        System.out.println(number+" is zero : "+zero);

        System.out.println("==============================================");



        /*
number = 100
output:
    100 is positive number: true
    100 is negative number: false
    100 is zero  : false
 */

    }
}
