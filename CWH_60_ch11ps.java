package com.company;

abstract class Pen{
     abstract void write();
    abstract void refills();
}

class FountainPen extends Pen{
     public void write(){
         System.out.println("writing a note using pen");
     }
    public void refills(){
        System.out.println("Refilling a pen");
    }
    public void changeNib(){
        System.out.println("Changing a Nibble of pen");
    }

}

class Monkey{
    void jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting....");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("I am human being!! yo yo...");
    }
    public void eat(){
        System.out.println("eating...");
    }
    public void sleep(){
        System.out.println("sleeping....");
    }
}

abstract class TelePhone{
    abstract void ring ();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends TelePhone{
    public void ring(){
        System.out.println("ringing....");
    }
    public void lift(){
        System.out.println("answering a call...");
    }
    public void disconnect(){
        System.out.println("Your call has been disconnected....");
    }
}
interface  TVRemote{
    void ON();
    void OFF();
}
interface SmartTVRemote extends TVRemote{
    void pause();
    void play();
    void moveBtn();
}
class TV implements SmartTVRemote{
    public void ON(){
        System.out.println("Switch ON...");
    }

    @Override
    public void OFF() {
        System.out.println("Switch OFF....");
    }

    public void pause(){
        System.out.println("Pausing a video...");
    }
    public void play(){
        System.out.println("Playing a video....");
    }
    public void moveBtn(){
        System.out.println("Moving btn....");
    }
}
public class CWH_60_ch11ps {
    public static void main(String[] args) {
        // 1. Create an abstract class pen with methods write() and refills() as abstract method
        // 2. use the pen class from Q1 to create a Concrete class FountainPen with additional method changeNib()
        FountainPen pen = new FountainPen();
        pen.write();
        pen.refills();
        pen.changeNib();

        // Creating a class Monkey with jump() and bite() methods. Create a class Human which inherits this Monkey
        // class and implements BasicAnimal interface with eat() and sleep methods
        Human sunny = new Human();
        sunny.eat();
        sunny.sleep();
        sunny.jump();
        sunny.bite();

        // Create a class Telephone with ring() , lift() and disconnect() methods as abstract methods
        // Create another class SmartTelephone and demonstrate polymorphism
        TelePhone  mi9A = new SmartTelephone();
        mi9A.disconnect();
        mi9A.lift();
        mi9A.ring();

        // 5. Demonstrate polymorphism using monkey class from Ques 3
        Monkey m1 = new Human();
        m1.bite();
        m1.jump();
        /* m1.speak(); -> cannot use speak method because the reference is monkey which does not have speak method */
        BasicAnimal simran = new Human();
        /* simran.speak(); -> cannot use speak method because the reference is BasicAnimal which does not have speak method */
        simran.sleep();
        simran.eat();

        // 6. Create an interface TVRemote and use it to inherit another interface SmartTVRemote
        // 7. Create a class TV which implement TVRemote interface from Ques 6
        TV mi = new TV();
        mi.ON();
        mi.OFF();
        mi.moveBtn();
        mi.pause();
        mi.play();
    }
}
