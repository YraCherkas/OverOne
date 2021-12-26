package homeWorkOOP1;

public abstract class Parametrs {


     String name;
     int length;
     double cost;
     int weight;

    public Parametrs(String name, int length, double cost, int weight) {
        this.name = name;
        this.length = length;
        this.cost = cost;
        this.weight = weight;
    }

    public abstract void printInfo();




}
