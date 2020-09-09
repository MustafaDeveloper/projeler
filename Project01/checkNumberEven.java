import java.util.Scanner;

public class checkNumberEven {

     /*
        Girilen bir sayı çift ise "true" , tek ise "false" yazdırınız
     */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("bir sayi giriniz : ");
        int number = scanner.nextInt();

        // Kodu burdan baslatin ve bu satırdan önceki kodlari değiştirmeyin
        if(number%2==0){
            System.out.print("true");
        }else {
            System.out.print("false");
        }
    }

}
