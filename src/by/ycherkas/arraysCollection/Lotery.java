package by.ycherkas.arraysCollection;

import java.util.ArrayList;
import java.util.Collections;

public class Lotery {


    public static void addToList(){

        ArrayList<Integer> lotery = new ArrayList<>();
        for (int i = 1; i <= 100 ; i++) {
            lotery.add(i);
        }
        //System.out.println(lotery);
        Collections.shuffle(lotery);
        //System.out.println(lotery);

        for (int j = 0; j <= 10; j++) {
            double number = (int)(Math.random() * 99) + 1;
//            System.out.print("Number: " + number);
            for (int i = 0; i < lotery.size(); i++) {
                if(number == i){
                System.out.print(lotery.get(i) + " ");
                }
            }
        }
    }


}
