package Laptop;

import java.util.ArrayList;

public class PriceForOneLaptop {

    /*
        Given one method name is getPrice

        Parameter is int

        Return type is int

        This method is calling the AllData method from Data class. Laptop ID is a parameter laptopID

        This method need to call all other methods in Calculation class and get the price and return that total Amount.
     */


    /*


         Parametresi int ve return tipi int olan GetPrice methodu veriliyor.

         Bu method, Data class dan AllData methodunu çağırıyor. LaptopID parametredir

        Bu yöntemin Calculation class taki tüm methodları çağırması ve price  alması ve totalAmount return etmesi gerekir.
     */

        Data dat=new Data();
        Calculation calc=new Calculation();

    public int getPrice(int laptopID){

        ArrayList<String> st=dat.AllData(laptopID);

        int totalAmount=calc.getRam(st)+calc.getColor(st)+calc.getCPU(st)+calc.getSize(st);


        return totalAmount;
    }

    /*
        Given getDiscount

        Parameter is two int (amount , discount)

        Return type is int

        Make the discount from the amount

        And Return the discounted price

        Example

        Amount 100
        discount 20

        After a 20% discount

        Result should be 80
     */


     /*


        Parameter iki tane int (amount , discount) ve return tipi int olan getDiscount methodu veriliyor.

        Miktardan(amount)  indirim(discount) yapın

        indirilmiş fiyatı return edin


        Örnek

        Amount 100
        discount 20

        20% indirimden sonra

       Sonuç 80 olmalı
     */

    public int getDiscount(int num , int discount){
          return (num-num*discount/100);
    }






}
