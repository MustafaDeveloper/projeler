package Item;

public class Items {

     /*
      Instance variables oluştur
      private double price
      private static double allUserPrice

     */

    /*
        void ItemName methodunu oluştur
        Return türü void
        Parameter  String(myItem)  olsun

        NOT:  SWITCH STATEMENT KULLAN

        Eğer myItem = Rose teddy bear ise
        price variable 30 ekle

        Eğer myItem = Iphone max   ise
         price variable 850.23 ekle

         Eğer myItem = laptop mouse   ise
         price variable 23.50 ekle

         Eğer myItem = Monitor  ise
         price variable 90.23 ekle

          Eğer myItem = charger ise
          price variable 43.20 ekle

         Eğer myItem = hdmi cable  ise
         price variable 5.90 ekle

         Eğer my item = mug  ise
         price variable 30 ekle

     */
    private double price;
    private static double allUserPrice;

    public void ItemName (String myItem){

        switch(myItem){

            case "Rose teddy bear":  price+=30; break;
            case "Iphone max": price+=850.23; break;
            case "laptop mouse": price+=23.50; break;
            case "Monitor": price+=90.23; break;
            case "charger": price+=43.20; break;
            case "hdmi cable": price+=5.90; break;
            case "mug": price+=15.79; break;
            }
        }





    public void colorPrice(String color){

        switch(color){

            case "Red":
            {
                price+=10;
                break;
            }
            case "Blue":
            {
                price+=6;
                break;
            }
            case "Black":
            {
                price+=4;
                break;
            }
            case "White":
            {
                price+=2;
                break;
            }

        }
    }


    /*
        colorPrice methodunu oluştur
        Return türü void
        Parameter  String(color) olmalı

        NOT : SWITCH STATEMENT KULLAN

           Eğer color = Red  ise
           price variable  10 ekle

          Eğer color = Blue   ise
          price variable 6 ekle

           Eğer color = Black   ise
           price variable  4 ekle

           Eğer color = White  ise
            price variable  2 ekle
     */

    public double customText(boolean bool, String str){
        if (bool==true && str.length() > 10){
             price+=5;
        }
        if (bool==true && str.length() <= 10){
             price+=3;
        }
       return price;
    }

    /*
   customText methodunu oluştur
   return türü double
   parametreler bir tane boolean ve bir tane  String olmalı

   Eğer boolean true ve  String length 10 dan büyük ise
   price variable 5 ekle

   Eğer boolean true ve String length 10 dan küçük veya 10 a eşit ise
        price variable 3 ekle

    */


        public void AddtoAllUserPrice(){
            allUserPrice+=price;
        }

    /*
       AddtoAllUserPrice methodunu oluşturun
       return türü  void
       parametresiz olmalı

       allUserPrice a price ekle

    */

        public static double getAllUserPrice(){
            return allUserPrice;
        }

    /*
       getAllUserPrice methodunu oluşturun
       return türü double
       parametresiz olmalı

       allUserPrice return edin
    */





}
