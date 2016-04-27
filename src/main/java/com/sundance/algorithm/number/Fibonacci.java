package com.sundance.algorithm.number;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

	public static List<Long> fibonacciNumbers;
	
	public static long fib(int n) {
        if (n <= 1) {
           	return n;
        } else { 
        	return fib(n-1) + fib(n-2);
        }
    }

    public static void main(String[] args) {
    	
        int MAX_NUM = 50;
        
        fibonacciNumbers = new ArrayList<Long>();
        
        for(int i = 0; i < MAX_NUM; i++) {
        	
        	long number;
        	
        	if(i < 2) {
        		number = 1;
        	} else {
        		number = fibonacciNumbers.get(i - 2) + fibonacciNumbers.get(i - 1);
        	}
        	
        	fibonacciNumbers.add(number);
        }
        
        long start = System.currentTimeMillis();
        System.out.println("Calculate fibonacci numbers with array ...");
        for(int i = 0; i < MAX_NUM; i++) {
        	System.out.println((i + 1) + ":\t" + fibonacciNumbers.get(i));
        }
        long end = System.currentTimeMillis();
        System.out.println("Duration:\t" + (end - start));
        System.out.println();
        
        start = System.currentTimeMillis();
        System.out.println("Calculate fibonacci numbers with recursion ...");
        for(int i = 1; i < MAX_NUM + 1; i++) {
        	System.out.println(i + ":\t" + fib(i));
        }
        end = System.currentTimeMillis();
        System.out.println("Duration:\t" + (end - start));
        
    }
}
