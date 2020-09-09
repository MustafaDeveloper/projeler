package Traning;

import java.util.Arrays;

public class soru5 {

/*     Bu metod parametre olarak int Array ve 2 adet int almalı.
    Metod kendisine gönderilen Array ın içindeki elemanlardan, yine kendisine gönderilen
    rakamlar arasında olanlarına -1 değerini atasın.oluşan yeni diziyi göndersin.main de yazdırınız.

    int array = 1,6,12,15,22,18,30,16

    int 1 = 10
    int 2 = 20

    sonuc  1,6,-1,-1,22,-1,30,-1  olmalı.*/
    public static int[] URange(int[] outArr, int lower,int upper){
        //int[] newArr=new int[];
        for(int i=0;i<outArr.length;i++){
            if(outArr[i]>lower && outArr[i]< upper){
                outArr[i]=-1;
            }
       }
        return outArr;
    }

    public static void main(String[] args) {
    int[] array = {1,6,12,15,22,18,30,16};
        System.out.println("sonuc  1,6,-1,-1,22,-1,30,-1  olmalı -> "+ Arrays.toString(URange(array,10,20)));
    }
}
