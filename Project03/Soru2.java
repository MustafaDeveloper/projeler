package Traning;

import java.util.Scanner;

/*getPopulation: n de aşağıdaki isimlerle Array leri tanımlayınız.Verilen örnek değerleri kullanabilirsiniz.
        countryNames Ülke isimleri
        countryPopulations Ülke nüfusları

        populationOfCountry adında bir metod yaznız.
        Bu method 1 String array(countryNames) , 1 int array (countryPopulations) ve  1 String (ulkeAdi) alacak

        Eğer Ülke adı countryNames de var ise, aynı sıradaki ülke nüfusunu diğer Array den bulup geri
        göndersin.

        Ornegin;
*/
public class Soru2 {
    public static int populationOfCountry(String[] CountNm,int[] intPop, String countName ){
        int pop=0;
        for (int i=0;i<CountNm.length;i++) {
            if (CountNm[i].equalsIgnoreCase(countName)){
                pop=intPop[i];
                break;
            }else{
                if(i==CountNm.length-1) {
                    pop=-1;
                    break;
                }
            }

        }
        return pop;
    }
    public static void main(String[] args) {

        String[] countryNames = {"USA" ,"Mexico" ,"Canada"};
        int[] countryPopulations = {100000 , 120000 , 130000};

        Scanner sc=new Scanner(System.in);
        System.out.print("ulke adi girin = ");
        String country=sc.nextLine();
        System.out.print(" ulke nüfus  = "+populationOfCountry(countryNames,countryPopulations,country));

        //str = "Mexico"  return 120000 olmali NOT : eger str icin verilen ulke countryNames icinde yoksa return -1 olmali*/

    }
}
