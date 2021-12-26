package homeWorkItnterf;

public class Plane implements Fly, Move, PrintInfo{
    String name;
    int age;
    double sped;

    public Plane(String name, int age, double sped) {
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
        System.out.println("Я не дышу");
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
                " года(лет/год)";
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
