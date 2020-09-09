import java.util.ArrayList;
import java.util.Scanner;

public class DigitPowers {
    /*

          Given one method name is power4
          Parameter is one int()
          Return type is an int

          Get each digit from the parameter int number
          Take the each number to the power 4
          Sum powered numbers
          Return the result

          Example: parameter int is 1234

          1⁴ + 2⁴ + 3⁴ + 4⁴ = 1 + 16 + 81 + 256

          result should be 354

       */


    /*





         Parametresi int ve return tipi int olan power4 isminde method verilmiştir.


        power4 methodu girilen int parametresinin rakamlarının ayrı ayrı 4.kuvvetini alıp toplayın


         Örnek: parameter int is 1234

         1⁴ + 2⁴ + 3⁴ + 4⁴ = 1 + 16 + 81 + 256

         result  354 olmalı

      */
    public static void main(String[] args) {
        System.out.print("bir rakam giriniz : ");
        Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        int a=power4(N);
        System.out.println("pow4 Sum = " + a);


    }

        public static int power4(int num){

        int digit=1;
        int POW=0,sum=0;
            while(num/digit!=0) {
                POW=(num/digit)%10;
                digit*=10;
                sum+=Math.pow(POW,4);
            }

         return sum;
        }

}
