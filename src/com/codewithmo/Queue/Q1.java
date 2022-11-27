package com.codewithmo.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Q1 {
    public static void main(String[] args) {

        // *****************************************************

        // Queue = FIFO data structure. First-In First-Out
        //		   A collection designed for holding elements prior to processing
        //		   Linear data structure

        //         enqueue = offer()
        //         dequeue = poll()

        // Where are queues useful?

        // 1. Keyboard Buffer (letters should appear on the screen in the order they're pressed)
        // 2. Printer Queue (Print jobs should be completed in order)
        // 3. Used in LinkedLists, PriorityQueues, Breadth-first search

        // *****************************************************

        Queue<String> queue = new LinkedList<String>();

        queue.offer("M1");
        queue.offer("M2");
        queue.offer("M3");
        queue.offer("M4");

        //System.out.println(queue.isEmpty());
        //System.out.println(queue.size());
        System.out.println(queue.contains("M3"));

        //System.out.println(queue.peek());
        //queue.poll();
        //queue.poll();
        //queue.poll();
        //queue.poll();

        System.out.println(queue);

    }
}


