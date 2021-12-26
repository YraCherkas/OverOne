package by.ycherkas.oop;

public class Main {
    public static void main(String[] args) {

        Person vasya = new Person();
        vasya.printToConsole();
//        Person ivan = new Person("Ivan");
//        ivan.printToConsole();
//        Person ruslan = new Person("Ruslan", 25);
//        ruslan.printToConsole();

        vasya.setName("Vasya");
        System.out.println("Name: " + vasya.getName());
        vasya.setAge(62);
        System.out.println("Age: " + vasya.getAge());
    }
}