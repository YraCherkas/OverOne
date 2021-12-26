package by.ycherkas.exam2;

public class Work {
    public static int task1(int a, int b) {
        a = 1;
        b = 5;
        int sum = 0;
        for (int i = a; i <= b; i++) {
            sum = sum + i;
        }
        System.out.println("Sum= " + sum);
        return a+b;
    }

    public static int task2(int c, int d) {
        c = 1;
        d = 9;
        int summ = 0;
        int count = 0;
        int result = 0;
        for (int i = c; i <= d; i++) {
            summ = summ + i;
            count++;
        }
        result = summ / count;
        System.out.println("Result= " + result);
        return result;
    }

    public static int task3(int x, int y){
        int distance = y-x;
        System.out.println("Distance = " + distance);
        return y-x;
    }
    public static double task4(int e, int f){
        double nod = 0;
        int max = 0;
        if(e > f ){
            max = e;
        }else{
            max = f;
        }
        for (int i = 1; i <= max; i++) {
            if (e % i == 0) {
                if (f % i == 0) {
                    nod = i;
                }
            }
        }
        System.out.println("NOD = " + nod);
        return nod;
    }
}
