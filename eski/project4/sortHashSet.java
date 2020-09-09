import java.util.*;

public class sortHashSet {

    /*
        Given allNumbers Integer Hashset

        Sort the allNumbers hashset

        Change the result to ArrayList

        Return the ArrayList

        NOTE : DO NOT USE COLLECTION CLASS WHILE SOLVING THE QUESTION USE FOR LOOP OR DIFFERENT SET TYPES

     */


    /*
         allNumbers Integer Hashset  verildiğinde

         allNumbers hashset'i sort et

        Sonucu ArrayList olarak değiştir

        Return  ArrayList

        NOT : SORUYU ÇÖZERKEN COLLECTİON CLASS KULLANMA , FOR LOOP VEYA FARKLI SET TİPLERINI KULLANIN


     */
    public static ArrayList<Integer> sort(HashSet<Integer> allNumbers){

        Set tree=new TreeSet<Integer>();
        for (int i:allNumbers) {
            tree.add(i);
        }
        ArrayList<Integer> result = new ArrayList<>();

        for (Object i:tree) {
            result.add((Integer) i);
        }
        return result;
    }

   public static void main(String[] args) {
        HashSet<Integer> HS=new HashSet<Integer>();
        HS.add(1);
        HS.add(111);
        HS.add(222);
        HS.add(333);
        ArrayList arr=new ArrayList();
         arr=sort(HS);
       System.out.println("arr = " + arr);
        
    }

}
