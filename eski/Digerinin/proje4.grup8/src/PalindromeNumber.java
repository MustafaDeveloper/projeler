import java.util.Arrays;

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


    public int returnNum(int number) {


        return 0;
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
        528+825=1353
        1353+3531=4884
        319+913=1232
        1232+2321=3553
     */
     public static void main(String[] args) {
int a=319;
int dongu=palindromeNum(a);
         System.out.println(dongu);

     }
    public static int palindromeNum(int num) {
    int sayac=0;
    boolean b=false;

    while ( b==false){
        int gelensayi=num;
        int tersi = 0;
        while (num != 0) {
            int basamak = num % 10;
            tersi = tersi * 10 + basamak;
            num /= 10;
        }
        int num1=gelensayi+tersi;
        sayac++;
        num=num1;
        if (palindrommudur(num1,b)) break;}


            return sayac;

    }
    public static boolean palindrommudur(int num,boolean b)
        {
        boolean palindrom=false;
        int r,sum=0,temp;

        temp=num;
        while(num>0){
            r=num%10;  //getting remainder
            sum=(sum*10)+r;
            num=num/10;
        }
        if(temp==sum) palindrom=true;
        b=palindrom;
        return palindrom;
    }



}
