package homeWorkItnterf;

public class Tree implements Fly,Move,PrintInfo{
    String name;
    int age;

    public Tree (String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public void fly() {
        System.out.println("Я не умею летать, потому что корнями привязано к земле");
    }

    @Override
    public void breathing() {
        System.out.println("Я дышу и даю вам кислород:)");
    }

    @Override
    public void move() {
        System.out.println("Я не двигаюсь ");
    }

    @Override
    public void speed() {
    }

    @Override
    public String toString() {
        return '\n' + "Я " + name + ", мне " + age +
                " лет";
    }

    @Override
    public void printInfo() {
        System.out.println(toString());
        fly();
        move();
        breathing();
    }
}
