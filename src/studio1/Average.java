package studio1;

import support.cse131.ArgsProcessor;

public class Average {

    public static void main(String[] args) {

        ArgsProcessor ap = new ArgsProcessor(args);
        int n1 = ap.nextInt("What's the first number?");
        int n2 = ap.nextInt("What's the second number?");
        int avg =  (n1+n2)/2;
        System.out.println((double)avg);

    }
}