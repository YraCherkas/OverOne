package homeWorkOOP1;

public class Main {
    public static void main(String[] args) {

        System.out.println("Our car park: ");
        Parametrs car = new Car(4570, "Mitsubisi Lanser evolution X",
                15500, 1285 );
        Parametrs truk = new Truck(8000 , "Kenworth w900",
                188000 , 9000);
        Parametrs bike = new Bike(1323, "Honda ADV 150",
                11350 , 133);
        Parametrs bus = new Bus( 13700 ,"VAN HOOL t916 Astron"  ,
                34100 ,16070 );

        Parametrs [] mas = {car,truk,bike,bus};
        for (Parametrs object:mas ){
            object.printInfo();
        }
    }
}
