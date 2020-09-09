import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class removeDuplicates {

    /*
        Given int array

        remove the duplicated values from the array

        print non-duplicated array length

        for example:

        Array is 1,2,2,2,3,3,3,4,4,4,5,5,5

//1 2 2 2 3 3 3 4 4 4 5 5 5
        result should be 5

        NOTE: while printing the result dont use for loop
        use System.out.println(Arrays.toString(your_array_name));
     */


    /*
       Verilen int array

       duplicated(tekrarlanan) öğeleri array den kaldır

        non-duplicated(tekrarlanmayan) öğeleri print et

       Örnek:

       Array is 1,2,2,2,3,3,3,4,4,4,5,5,5

       result  [1,2,3,4,5] olmalı

       NOT: resultu print ederken for loop kullanmayın
       System.out.println(Arrays.toString(your_array_name));  kullanın
    */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String myStr = scan.nextLine();

        String[] arr = myStr.split(" ");

        int[] useThisArray = new int[arr.length];

        for(int i = 0 ; i < useThisArray.length ; i++){

            int num = Integer.parseInt(arr[i]);

            useThisArray[i] = num;

        }

//        code start here
//        dont change anything before this line
//        your Array is useThisLine

      // Kodlamaya burdan başla.bu satırdan önceki satirlarda hicbirşeyi  degiştirme.
      //   useThisLine arrayini kullan

        int sayac=0;
        int[] newArr=new int[useThisArray.length];

        int end = useThisArray.length;

        for (int i = 0; i < end; i++) {
            for (int j = i + 1; j < end; j++) {
                if (useThisArray[i] == useThisArray[j]) {
                /*int shiftLeft = j;
                for (int k = j+1; k < end; k++, shiftLeft++) {
                    arr[shiftLeft] = arr[k];
                }*/
                    useThisArray[j] = useThisArray[end-1];
                    end--;
                    j--;
                }
            }
        }

        int[] whitelist = new int[end];
    /*for(int i = 0; i < end; i++){
        whitelist[i] = arr[i];
    }*/
        System.arraycopy(useThisArray, 0, whitelist, 0, end);
        Arrays.sort(whitelist);
        System.out.print(Arrays.toString(whitelist));
    }


}
