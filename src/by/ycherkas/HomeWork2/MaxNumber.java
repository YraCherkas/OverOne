package by.ycherkas.HomeWork2;

public class MaxNumber {
    int maxNum = 0;
    public int max(int a, int b){
        if (a > b){
            maxNum = a;
        }else{
            maxNum =b;
        }
   return maxNum;
    }
    public void print(){
        System.out.println(max(-4, -213));

    }
}
