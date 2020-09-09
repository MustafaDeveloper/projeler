package Traning;
/*CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin ilk karakterlerini
        büyük harfe çevirip geri döndüren metodun yazınız.

        Örnek:  bugün hava çok güzel    Result : Bugün Hava Çok Güzel*/

import java.util.Arrays;
import java.util.Scanner;

public class Soru1 {
    public static String upperCase(String str) {
        String[] strArr=str.split(" ");

        for (int i=0;i< strArr.length;i++) {
            strArr[i] = strArr[i].substring(0, 1).toUpperCase().concat(strArr[i].substring(1));
        }
        String returnArr=Arrays.toString(strArr);
        return returnArr;
    }

    public static void main(String[] args) {
        System.out.print("cumle girin ilk Harf Buyuk olsun = ");
        Scanner sc=new Scanner(System.in);
        String cumle=sc.nextLine();
        System.out.print("ilk Harfler Buyuk olsun = "+upperCase(cumle));
    }
}
