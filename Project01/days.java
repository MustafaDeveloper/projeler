import java.util.Scanner;

public class days {

        /*
               Aşağıda verilen gün adlarına göre, Girilen bir gün numarasına karşılk gelen gün adını yazınız.

                Eger int 1 ise print monday
                Eger int 2 ise print tuesday
                Eger int 3 ise print wednesday
                Eger int 4 ise print thursday
                Eger int 5 ise print friday
                Eger int 6 ise print saturday
                Eger int 7 ise print sunday
                Eger int 8 den buyuk ise  print "this is not a valid day"

                NOT : BU PROBLEMI ÇÖZERKEN SWITCH STATEMENT KULLANIN
         */

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("gun numarasini giriniz : ");
        int day = scanner.nextInt();
        if(day==1) {
            System.out.println("monday");
        } else if(day==2){
            System.out.println("tuesday");
        }else if(day==3){
            System.out.println("wednesday");
        }else if(day==4){
            System.out.println("thursday");
        }else if(day==5){
            System.out.println("friday");
        }else if(day==6){
            System.out.println("saturday");
        }else if(day==7){
            System.out.println("sunday");
        }else{
            System.out.println("this is not a valid day");
        }
        switch(day) {
            case 1: System.out.print("monday");break;
            case 2: System.out.print("tuesday");break;
            case 3: System.out.print("wednesday");break;
            case 4: System.out.print("thursday");break;
            case 5: System.out.print("friday");break;
            case 6: System.out.print("saturday");break;
            case 7: System.out.print("sunday");break;
            default: System.out.print("this is not a valid day");
        }

    }
}



