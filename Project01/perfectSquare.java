import java.util.Scanner;

public class perfectSquare {
    /*
       Girilen pozitif bir sayının tam kare olup olmadığını bulunuz,
       tamkare ise true  değilse false yazdırınız.

        Not: sqrt gibi fonksiyonları  kullanmayın.

        Example 1:
        Input: 16
        Output: true
        Not: bu sayı tamkare çünkü 4*4 = 16

        Example 2:
        Input: 25
        Output: true
        Note: bu sayı tamkare çünkü 5*5=25


        Example 3:
        Input: 14
        Output: false

     */
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);



        // kodu burdan başlatın ve bu satırdan önceki kodları değiştirmeyin
        int sayac=0;
        int input = scanner.nextInt();
        do{
            ++sayac;
            if (input==(sayac*sayac)){
                System.out.println("true");
                break;
            }
           }while (sayac<input);

        if (input!=(sayac*sayac)){
            System.out.println("false");
          }

    }
}
