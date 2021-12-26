package homeWorkOOP1;

public class Car extends Parametrs {

    public Car( int length,String name, double cost, int weight) {
        super(name, length, cost, weight);
    }


    @Override
    public void printInfo() {
        System.out.println("Name of Transport: " + name + '\n'
                + "Length: " + length + " mm" + '\n' + "Weight: " + weight +
                " kg" + '\n'+ "Cost: " + cost + " $ " + '\n');
    }
}
