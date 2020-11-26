package day08_Practice;
import  java.util.*;
public class ForPassQuiz {
    public static void main(String[] args) {

    calculator(5,'+',6);


    }
    public static void calculator(int n1, char operator, int n2){

        boolean isValid = operator=='+' || operator=='-';

        if (isValid){
            System.out.println((operator=='+')? (n1+n2): (operator=='-')? (n1-n2));
            }else {
                System.out.println("invalid");
            }

        }
    }









