package Traning;

import java.util.Arrays;

/*        threeEvenOrOdd  isminde int Array paramaetre alan bir metod yazınız. Bu metod kendisine
        gönderilen Array de 3 tane çift veya 3 tane tek var ise true geri döndürsün. Yok ise
        false göndersin.
        intArray([2, 1, 3, 5]) sonuc  true olmalı
        intArray([2, 1, 2, 5]) sonuc   false olmalı
        intArray([2, 4, 2, 5]) sonuc   true olmalı*/
public class Soru4 {

    public static boolean threeEvenOrOdd(int[] arr){
        int countEven=0;
        int countOdd=0;
        for (int i=0;i<arr.length;i++) {
            if(arr[i]%2==0){
                countEven++;
            }else{
                countOdd++;
            }
        }
        if(countEven>=3 || countOdd>=3){
            return true;
        }else{
            return false;
        }
    }


    public static void main(String[] args) {
        int[] intArray1={2, 1, 3, 5}; // true
        int[] intArray2={2, 1, 2, 5}; // false
        int[] intArray3={2, 4, 2, 5}; // true
        System.out.println("[2, 1, 3, 5] = "+threeEvenOrOdd(intArray1));
        System.out.println("[2, 1, 2, 5] = "+threeEvenOrOdd(intArray2));
        System.out.println("[2, 4, 2, 5] = "+threeEvenOrOdd(intArray3));
    }
}
