import java.util.Scanner;

public class twoString {

    public static void main(String[] args) {

        /*
        Scanner class kullanılarak verilen iki tane
        Stringi birbirlerine ekle.

        Eger ilk kelimenin son harfi, ikinci kelimenin
        ilk harfi ile aynı ise aynı olan harflerin birisini kaldırın

        Örnek:      "abc", "cat" --> "abcat"
                   "abc", "dog"  -->"abcdog"
         */
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();

        if(str1.charAt(str1.indexOf(" ")+1)==str1.charAt(str1.indexOf(" ")-1)){
            System.out.println(str1.substring(0,str1.indexOf(" "))+str1.substring(str1.indexOf(" ")+2));
        }else{
            System.out.println(str1.substring(0,str1.indexOf(" "))+str1.substring(str1.indexOf(" ")+1));;
        }
    }
}
