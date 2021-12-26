package homeWorkItnterf;

public class Stone implements Fly,Move, PrintInfo{
     String name;
     int age;
     public Stone (String name, int age){
         this.name = name;
         this.age = age;
     }

     @Override
     public void fly() {
          System.out.println("Я не умею летать");
     }

     @Override
     public void breathing() {
          System.out.println("Я не дышу");
     }

     @Override
     public void move() {
          System.out.println("Я не умею двигаться");
     }

     @Override
     public void speed(){
     }

     @Override
     public String toString() {
          return '\n' + "Я " + name + ", мне " + age +
                  " лет";
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
