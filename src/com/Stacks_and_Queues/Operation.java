package com.Stacks_and_Queues;

public class Operation {

	public static Stacks_and_Queues addElement() {
		Stacks_and_Queues stacklist =new Stacks_and_Queues();
		stacklist.push(70);
        stacklist.push(30);
        stacklist.push(56);

        stacklist.display();
        return stacklist;
    }

    public static void peek(){
    	Stacks_and_Queues stacklist =new Stacks_and_Queues();
        stacklist.push(70);
        stacklist.push(30);
        stacklist.push(56);
        stacklist.peek();
    }

    public static void pop(){
        System.out.println(" Before Pop:");
        Stacks_and_Queues stacklist =addElement();
        stacklist.poptillend();
        System.out.println(" After Pop:");
        stacklist.display();
    }

    public static void queueElement() {
    	Stacks_and_Queues stacklist =new Stacks_and_Queues();
        stacklist.queue(56);
        stacklist.queue(30);
        stacklist.queue(70);


        stacklist.display();
        stacklist.peek();
    }
    public static void dequeueElement(){
        Operation.queueElement();
        Operation.pop();
    }
}