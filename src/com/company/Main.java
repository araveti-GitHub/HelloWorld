package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //This is the first program created by master Kousik. He will be learning Java after the 5th grade exams completed.
        //From 6th grade he will start writing the programs to solve his maths puzzles
        double Value1, Value2, Value3;
        Scanner reader = new Scanner(System.in);
        System.out.println("i am using java");

        System.out.println("Enter First Value:");
        Value1 = reader.nextInt();
        System.out.println("Enter Second Value:");
        Value2 = reader.nextInt();
        Value3 = Value1*Value2;

        System.out.println("Thank You java i veera sekher dont no tables ");
        System.out.println(Value3);
        reader.close();
    }
}
