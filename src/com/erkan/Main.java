package com.erkan;

public class Main {

    public static void main(String[] args) {

        Queues myQueue = new Queues(3);

        myQueue.enqueue(5);
        myQueue.enqueue(6);
        myQueue.enqueue(7);

        //warning queu is full!
        myQueue.enqueue(8);

        myQueue.display();

        myQueue.dequeue();
        myQueue.dequeue();
        myQueue.dequeue();

        //warning queu is empty!
        myQueue.dequeue();
    }
}
