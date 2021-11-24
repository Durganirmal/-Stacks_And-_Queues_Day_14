package com.Stacks_and_Queues;

import java.util.Scanner;
public class Stack_Queues_main {

	 public static void main(String[] args) {
	        System.out.println("Welcome to the data Structure in 'Stack and Quuqe' Program!!");
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Press '1' to add element at the start  ");
	        switch (sc.nextInt()) {
	            case 1:
	                Operation.addElement();
	                break;
	            default:
	            {
	                System.out.println("Press Valid Key");
	            }
	        }
	    }
	}


