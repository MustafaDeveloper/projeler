import java.util.Arrays;

public class sumTotal {

    /*
        Create String 2D array

        {{"$12" , "$22" , "5"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

        if the String has $ multiply by 3.2

        if the String has € multiply by 4.2

        return the double

     */


    /*
        String 2D array oluştur

       {{"$12" , "$22" , "5$"},{"€9" , "€40" , "$1" , "$2"}, {"€12"}}

       String de $ varsa 3.2 ile çarp

       String de € varsa 4.2 ile çarp

       double return et

    */
    public static void main(String[] args) {

//        Koda burdan başlayın

        /*
        String 2D array oluştur

       {{"$12" , "$22" , "0$"},   {"€9" , "€40" , "$1" },  {"€12", "$2","$0"}}

       String de $ varsa 3.2 ile çarp

       String de € varsa 4.2 ile çarp

       ve butun elemanlari topla

       double return et(toplam sonucu double veri tipi olmali)

         */
        double sum=0;
        String[][] stringArray={{"$12", "$22", "0$"},{"€9", "€40" ,"$1"},{"€12","$2","$0"}};
        double[][] dobArray=new double[stringArray.length][stringArray[0].length];
        for (int i=0;i<stringArray.length;i++){
            for (int j=0;j<stringArray[0].length;j++){
                if (stringArray[i][j].contains("$")){
                    stringArray[i][j]=stringArray[i][j].replace("$","");
                    dobArray[i][j]=(double)(3.2*Double.parseDouble(stringArray[i][j]));
                    sum+=(double) 3.2*Double.parseDouble(stringArray[i][j]);
                } else if (stringArray[i][j].contains("€")){
                    stringArray[i][j]=stringArray[i][j].replace("€","");
                    dobArray[i][j]=(double)(4.2*Double.parseDouble(stringArray[i][j]));
                    sum+=(double) 4.2*Double.parseDouble(stringArray[i][j]);
                }else{
                    dobArray[i][j]=(double)(Double.parseDouble(stringArray[i][j]));
                    sum+=(double) Double.parseDouble(stringArray[i][j]);
                }
            }
        }
        System.out.println("dobArray = " + Arrays.toString(dobArray));
        System.out.println(sum);
    }
}



