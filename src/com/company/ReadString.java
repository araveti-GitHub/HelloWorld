package com.company;
import java.util.Scanner;

public class ReadString {
    public static void main(String[] args){
        String myString = "10 Tea 20 Coffee 30 Biscuits";
        Scanner Snacks = new Scanner(myString);
        Snacks.useDelimiter("\\s");
        int TeaNo, CoffeeNo, BiscuitsNo;
        String S1, S2, S3;
        TeaNo = Snacks.nextInt();
        S1 = Snacks.next();
        CoffeeNo = Snacks.nextInt();
        S2= Snacks.next();
        BiscuitsNo = Snacks.nextInt();
        S3 = Snacks.next();
        Snacks.close();
        System.out.print(TeaNo);
        System.out.println(S1);
        System.out.print(CoffeeNo);
        System.out.println(S2);
        System.out.print(BiscuitsNo);
        System.out.println(S3);
    }

}
