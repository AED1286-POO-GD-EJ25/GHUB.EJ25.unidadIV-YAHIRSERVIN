package Interfaces;
public class Dog implements Animal { 
    public void makeSound() {
        System.out.println("Woof");
    }
    public void move() {
        System.out.println("El perro se mueve");
    }
    public void play() {
        System.out.println("El perro juega");
    }
    public void eat() {
        System.out.println("El perro come");
    }
    public void sleep() {
        System.out.println("El perro duerme");
    }
}