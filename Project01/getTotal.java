import java.util.Scanner;

public class getTotal {

     /*
     içinde negatif de olabilen sayının ve para sembolünün olduğu aşağıdaki gibi 3 tane String okutunuz.
     okunan bu 3 string içindeki negaitf de olabilen sayıları toplatın.
     Toplam pozitif ise toplamı yazdırın, eğer toplam negatif ise sadece -1 yazdırın.

         Ornek:
        String num1 = "$15";
        String num2 = "$20";
        String num3 = "$30";
        output ----> 65; olmali

        String num1 = "$15";
        String num2 = "$-80";
        String num3 = "$30";
        output ----> -1; olmali
    */

    public static void main(String[] args) {
        System.out.print("uc adet string yaziniz : ");
        Scanner input=new Scanner(System.in);

        String str1 = input.nextLine();
        String str2 = input.nextLine();
        String str3 = input.nextLine();
        str1=str1.replaceAll("[$]","");
        str2=str2.replaceAll("[$]","");
        str3=str3.replaceAll("[$]","");

        int num1= Integer.parseInt(str1);
        int num2=Integer.parseInt(str2);
        int num3=Integer.parseInt(str3);
        int sum=num1+num2+num3;
        if (sum<0){
            System.out.print("-1 ");
        }else {
            System.out.print(sum);
        }
    }
}
