package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	Class class1 = new Class(5,"Hello",new int[]  {7,8,9,10});
    System.out.println(class1.getNumber()+" "+class1.getWord()+" "+ Arrays.toString(class1.getMassiv()));

    }
}
