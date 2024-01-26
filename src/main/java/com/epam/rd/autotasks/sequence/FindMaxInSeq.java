package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
    	int max = 0;
    	int input = 0;
    	Scanner scanner = new Scanner(System.in);
    	input = scanner.nextInt();
    	max = input;
    	while(input != 0){
    		input = scanner.nextInt();
    		if(input > max && input != 0) {
    			max = input;
    		}
    	}
        return max;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
