package homeWorkItnterf;

public class Bee implements Fly, Move, PrintInfo{
    String name;
    int age;
    double sped;


    public Bee(String name, int age, double sped) {
        this.name = name;
        this.age = age;
        this.sped = sped;
    }

    @Override
    public void fly() {
        System.out.println("Я умею летать");
    }

    @Override
    public void breathing() {
        System.out.println("Я дышу");
    }

    @Override
    public void move() {
        System.out.println("Я умею двигаться");
    }

    @Override
    public void speed() {
        System.out.println("Моя средняя скорость " + sped + " км/ч");
    }

    @Override
    public String toString() {
        return '\n' + "Я " + name + ", мне " + age +
                " год(лет)";
    }

    @Override
    public void printInfo() {
        System.out.println(toString());
        breathing();
        move();
        fly();
        speed();
    }
}
