package day08_Practice;

public class day09_Boolean {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 80;
        boolean r1 = num1 > num2;
        boolean r2 = num2 > num1;
        boolean r3 = num1 <num2;
        boolean r4 = num2 < num1;

        System.out.println(num1+" is greater than "+num2+" = "+r1);
        System.out.println(num2+" is greater than "+num1+" = "+r2);
        System.out.println(num1+" is less than "+num2+" = "+r3);
        System.out.println(num2+" is less than "+num1+" = "+r4);

        System.out.println("====================================");

        int x = 56 ;
        boolean isEven =  x % 2 == 0 ;
        boolean isOdd  =  x % 2 != 0;
        System.out.println(x+" is Even number: "+isEven);
        System.out.println(x+" is Odd number: "+isOdd);

        System.out.println("=========================================");

        double salary = 100000;
               salary -= salary *0.20 ;
        System.out.println(salary);
        System.out.println("=========================================");
         double balance = 5000 ;
                balance +=800 ;  //800$ is deposit
        System.out.println(balance);
        System.out.println("=========================================");
        int num = 100 ;
        boolean isDivisible2 = num % 2 == 0  ;
        boolean isDivisible3 = num % 3 == 0  ;
        boolean isDivisible5 = num % 5 == 0 ;

        System.out.println(num+" is divisible by 2: "+isDivisible2);
        System.out.println(num+" is divisible by 3: "+isDivisible3);
        System.out.println(num+" is divisible by 5: "+isDivisible5);


    }
}
