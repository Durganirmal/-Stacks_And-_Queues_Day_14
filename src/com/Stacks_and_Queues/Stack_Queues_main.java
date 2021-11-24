package com.Stacks_and_Queues;

import java.util.Scanner;
public class Stack_Queues_main {

	public static void main(String[] args) {
        System.out.println("Welcome to the data Structure in 'Stack and Queue' Program!!");
        Scanner sc = new Scanner(System.in);
        System.out.println("Press '1' to add element at the start");
        System.out.println("Press '2' to peek the element");
        System.out.println("Press '3' to pop the element");
        switch (sc.nextInt()) {
            case 1:
                Operation.addElement();
                break;
            case 2:
                Operation.peek();
                break;

            case 3:
                Operation.pop();
                break;
            default:
            {
                System.out.println("Press Valid Key");
            }
        }
    }
}