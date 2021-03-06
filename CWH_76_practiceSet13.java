package com.company;

class ThrSol1 extends Thread{
    int i=0;
   public void run(){
       while(i<500){
       System.out.println("Good morning!");
       i++;
    }
    }
}
class ThrSol1b extends Thread{
    int j=0;
    public void run(){
        while(j<500){
            System.out.println("Welcome!");
            j++;
//            try {
//                Thread.sleep(200);
//            }catch (Exception e){
//                System.out.println(e);
//            }
        }
    }
}
public class CWH_76_practiceSet13 {
    public static void main(String[] args){
        // Write a program to print "good Morning" and "welcome" Continuously on the screen in java using Thread
        ThrSol1 t1 = new ThrSol1();
        ThrSol1b t2 = new ThrSol1b();
//        t1.start();
//        t2.start();
        // Add a sleep method in welcome thread of question1 to delay its execution for 200ms

        // Demonstrate getPriority() and setPriority() methods in java threads
//        t1.setPriority(7);
//        t2.setPriority(9);
//
//        System.out.println("the priority of t1 is " + t1.getPriority());
//        System.out.println("the priority of t2 is " + t2.getPriority());
//        t1.start();
//        t2.start();

        // how do you get state of a given thread in java
        t1.setPriority(7);
        t2.setPriority(9);

        System.out.println("the priority of t1 is " + t1.getPriority());
        System.out.println("the priority of t2 is " + t2.getPriority());

        System.out.println("the state of t1 before start() is " + t1.getState());
        System.out.println("the state of  t2 before start() is " + t2.getState());

        t1.start();
        t2.start();

        System.out.println("the state of t1 after start() is " + t1.getState());
        System.out.println("the state of t2 after start() is " + t2.getState());

        // how do you get reference to the current thread in java
        System.out.println("the current state of Thread is " + Thread.currentThread().getState());
    }
}
