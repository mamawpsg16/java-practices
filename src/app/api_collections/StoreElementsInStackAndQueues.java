package app.api_collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class StoreElementsInStackAndQueues {
    public static void pushPopAndPeeking(){
        // Queue (FIFO)
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10); // Add elements
        queue.offer(20);
        System.out.println("Queue Peek: " + queue.peek()); // Peek first element
        System.out.println("Queue Poll: " + queue.poll()); // Remove first element
        for (Integer element: queue) {
            System.out.println("QUEUE ELEMENTS = "+ element);
        }

        // Stack (LIFO)
        Deque<Integer> stack = new ArrayDeque<>();
        stack.push(10); // Push elements
        stack.push(20);
        System.out.println("Stack Peek: " + stack.peek()); // Peek top element
        System.out.println("Stack Pop: " + stack.pop()); // Remove top element
        for (Integer element: stack) {
            System.out.println("STACK ELEMENTS = "+ element);
        }
    }

    public static void queueExample(){
        Queue<String> queue = new LinkedList<>();
            queue.offer("Alice");
            queue.offer("Bob");
            queue.offer("Charlie");

            while (!queue.isEmpty()) {
                System.out.println(queue.poll()); // Removes in FIFO order
            }
            System.out.println(queue);
    }
}
