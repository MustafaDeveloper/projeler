package GameGuess;

import java.util.Scanner;

public class GuessGame {

    /*
        Create a method name is randomGenerator().

        This method will create random number from 0 to 100.

        This method will return that random number.

        Return type is int

     */
        int randomGenerator(){
        int rand=(int) (Math.random()*10+1);
        return rand;
    }


 /*


        randomGenerator ()  methodunu oluşturalım.

        Bu method 0 ile 100 arasında random bir sayı oluşturmalı.

        Bu method random sayıyı return etmelı.

        Return türü int olmalı

     */




  /*
        Create a method name is LetsGuess().

        This method take one int as a parameter.

        Return type is void.

        In this method you must continue to guess numbers until the you guess the correct number.

        When your number is less than random number then print "Your number is too low".

        When your number is more than random number then print "Your number is too high".

        When your guess number is equal to random number than print "You got it !!".

        And stop execution.

        Your maximum attempt to guess is 5.

        If your guess reach to 5 than print "You didn't get it dude!!!"

        Note:
         1) While guessing the numbers you must use the scanner class.
         2) Both of these methods are not a static methods

     */




/*

         LetsGuess ()  methodunu oluşturalım.

         Bu method parametre olarak bir int almalı.

        Return türü void olsun.

        Bu method da, doğru sayıyı tahmin edene kadar sayıları tahmin etmeye devam etmelisiniz.

        Numaranız random sayıdan küçükse "Your number is too low" yazdıralım.

        Numaranız random sayıdan büyükse "Your number is too high" yazdıralım.

        Tahmin numaranız  random sayıya eşit olduğunda "You got it !!" yazdıralım

        Ve execution durdurun.

        Tahmin girişiminiz maksimum 5'tir.

        Eğer tahmininiz  5'e ulaşırsa "Anlamadım dostum !!!"

        Not:
         1) Sayıları tahmin ederken Scanner Class kullanmanız gerekir.
         2) Bu methodların her ikisi de statik bir method değildir
 */
        void LetsGuess (int num){
            Scanner sc=new Scanner(System.in);
            System.out.println("Bir sayi tahmin ediniz : ");
            int tahmin=sc.nextInt();
           int count=1;
           do{
               if (tahmin < num && count<5) {
                       System.out.println("Your number is too low");
                   } else if (tahmin > num && count<5) {
                       System.out.println("Your number is too high");
                   } else if (tahmin == num && count<5) {
                       System.out.println("You got it !");
                       break;
                   }else {
                       if(tahmin == num && count==5){
                           System.out.println("You got it !");
                       }else {
                           System.out.println("Anlamadım dostum !!!");
                           break;
                       }
               }
               System.out.println("Yeniden bir sayi tahmin ediniz : ");
               tahmin=sc.nextInt();
                count++;
           }while(count<6);

        }





}
