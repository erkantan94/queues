package com.erkan;

import java.util.ArrayList;

public class Queues {

    private ArrayList queue = new ArrayList();
    private int queueSize;

    public Queues(int size) {
        queueSize = size;
    }

    public void enqueue(Object obj){
        if (!isFull())
            queue.add(obj);
        else
            System.out.println("Queue is full!");
    }

    public Object dequeue (){
        if(!isEmpty()){
            Object obj = queue.get(0);
            queue.remove(0);
            return obj;
        }
        else
            System.out.println("Queue is empty!");
        return 0;
    }

    public void display(){
        for (Object o:queue){
            System.out.println(o);
        }
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public boolean isFull(){
        return queue.size() == queueSize;
    }
}
