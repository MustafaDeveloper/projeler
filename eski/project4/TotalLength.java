import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class TotalLength {

    /*

       Parameter is one Set String

       Get the total length of each String in the Set
       return the total

       Example:
       Set String is "repl" "is" "homework"

       result should be 14

       NOTE : IF RESULT IS EQUAL TO 0 THEN CHANGE IT TO -1

     */


    /*

       Parametresi  Set String olan ve Set içindeki Stringlerin uzunluklarının
       toplamını döndüren getTotalLength methodunu yazın.

       retur total



       Örnek:

       Set String "repl" "is" "homework"

       result  14 olmalı

       NOT : EĞER SONUÇ 0'A EŞİT OLURSA -1 İLE DEĞİŞTİR

     */
    public static void main(String[] args) {
        System.out.print("Bir String giriniz : ");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Set hs=new HashSet<>();
        for (String s :str.split(" ")) {
            hs.add(s);
        }
        int total=getTotalLength((HashSet<String>) hs);
        System.out.println("total = " + total);
    }
    public static int getTotalLength(HashSet<String> mySet){
        int sum=0;
        for (String str:mySet) {
            sum+=str.length();
        }
        if (sum!=0){
            return sum;
        } else{
            return -1;
        }

    }

}

