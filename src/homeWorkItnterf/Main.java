package homeWorkItnterf;

public class Main {
    public static void main(String[] args) {

        PrintInfo human = new Human("Human", 22, 5);
       // human.printInfo();
        PrintInfo bee = new Bee("Bee" , 1, 0.5);
        PrintInfo stone = new Stone("Stone", 25000);
        PrintInfo plane = new Plane("Plane", 4, 920);
        PrintInfo tree = new Tree("Tree", 750);

        PrintInfo [] mas = {human, bee, stone, plane, tree};
        for (PrintInfo print : mas) {
            print.printInfo();
        }
    }
}
