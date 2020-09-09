import java.util.Scanner;

public class countE {

    /*
    Girilen bir string de kaç tane b harfi olduğunu yazdırınız.
    */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // kodu burdan başlatın ve bu satırdan önceki kodlari değiştirmeyin
        System.out.print("bir string yaziniz : ");
        String text = input.nextLine();
        text=text.toLowerCase();
        text=text.replaceAll("[^b]","");

        System.out.println("b_number = " + text.length());

    }
}
