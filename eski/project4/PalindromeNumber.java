import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.lang.Math.*;

public class PalindromeNumber {

      /*
        Given a method name is returnNum
        Parameter is one int
        Return type is int

        Reverse the parameter int and return it

        Example:
        int  = 1234

        return should be 4321
     */


    public static int returnNum(int number) {
       List arr=new ArrayList<Integer>();
    int retNum=0;
        while(number!=0){
            int n=number%10;
            arr.add(n);
            number/=10;
            arr.add(n);
            retNum=retNum*10+n;
        }


        //nt retNum=0;
/*        for (int i = 0; i <arr.size() ; i++) {
          arr.set(i, arr.get(i) * (int)(Math.pow(10, arr.size() - 1 - i)));//(retNum * 10) + retNum =
        }*/

        return retNum;
    }



    /*
        Given palindromeNum method
        Parameter is one int (num1)
        Return type is one int

        Palindrome means a word or number reads the same backward as forward like "mom" , "refer" , "131" , "1221"

       Add num1 and reverse of num1, find the result.
       Check if the result is a palindrome or not.
       If the result is not a palindrome number, find the reverse of the result.
       And add the result and reverse of the result, find the new total.
       Check if the new total is a palindrome or not.
       Do the same steps until you reach a palindrome number in your result.
       After you reached the palindrome number, find the count that how many times you did the same operation to reach a palindrome number.
       Return the count

        Example:
            num1 = 349  --> 349  + 943 =1292     Note : since 1292 is not palindrome do the same step for this  // first operation
                            1292 + 2921 = 4213   Note : 4213 is not palindrome  do the same step for this // second opeartion
                            4213 + 3124 = 7337   Note : 7337 is palindrome      // third operation  you reached the palindrome so count is 3

        return should be 3
        HINT: You better use while loop for this question

     */


     /*

        Parametresi bir tane int (num1) ve return tipi int olan palindromeNum isminde method verilmiştir.

        Palindrome, bir kelime veya sayının, tıpkı ileri ile aynı şekilde geriye doğru okuduğu anlamına gelir.
        Örneğin --   "mom" , "refer" , "131" , "1221"


       num1'i ve num1'in tersini ekleyin, sonucu bulun.
       Sonucun palindrom olup olmadığını kontrol edin.
       Sonuç bir palindrom numarası değilse, sonucun tersini bulun.
       Ve sonucu ve sonucun tersine ekleyin, yeni toplamı bulun.
       Yeni toplamın bir palindrom olup olmadığını kontrol edin.
       Sonuçlarınızda bir palindrom numarasına ulaşana kadar aynı adımları uygulayın.
       Palindrom numarasına ulaştıktan sonra, bir palindrome numarasına ulaşmak için aynı işlemi kaç kez yaptığınızı bulun.
       Return  count olmali

        Örnek:
            num1 = 349  --> 349  + 943 =1292     Not : 1292 palindrom olmadığından bunun için aynı adımı uygulayın  // birinci işlem
                            1292 + 2921 = 4213   Not : 4213 palindrom değil bunun için aynı adımı yapın // ikinci işlem
                            4213 + 3124 = 7337   Not : 7337  palindrome      // üçüncü işlemde palindroma ulaştınız ve count 3 olur

        return  3 olmalı
        İPUCU:  Bu soru için while loop kullansanız iyi olur

     */

    public static int palindromeNum(int num) {
        int count=1;
        //int palind=0;
        do{
            num=num+returnNum(num);
            count++;
            //System.out.println("count = " + count);
        }while((num+returnNum(num))!=returnNum(num+returnNum(num)));

        //return num+returnNum(num);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(palindromeNum(528));
    }

}
