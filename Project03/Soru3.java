package Traning;

public class Soru3 {
    public static int getSumOfSquares(int num){
     int sum=0;
     while(num>0){
         sum+=num;
         num--;
     }
        return sum*sum;
  }

    public static int substSquare(int numSq1,int numSq2){

        int sumSq=getSumOfSquares(numSq1)+getSumOfSquares(numSq2);
        return sumSq;

    }


    public static void main(String[] args) {
        System.out.println(substSquare(10,5));

    }

}
