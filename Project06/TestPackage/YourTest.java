package TestPackage;

import Item.Items;
import Settings.Address;
import Settings.UserNameAndPassword;
import Settings.UserSettings;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class YourTest {

    /*
        Given before class

              Do not change the before class
    */

    /*
        before class verilmiştir

        before class değiştirmeyin
   */
    @Before
    public void beforeClass(){

        UserNameAndPassword userNameAndPassword = new UserNameAndPassword();

        userNameAndPassword.addUserToList();

    }

    /*

    YOUR CODE IS STARTING HERE

    Test the UserNameAndPassword class setUsername method

    Check all the possible options.

    NOTE :  For each possibility you need to create a different @Test method

     */


      /*

    KOD BURDAN BAŞLIYOR

     UserNameAndPassword class setUsername method TEST EDİN

    Bütün ihtimalleri check edin

    NOTE :  Her ihtimal için farklı @Test method oluşturmanız gerekiyor

     */
        // 1 - UserSettings sinifindan OBJECT olustur.
            // 1-A: UserSettings degiskenlerini SET et.
      // 2 - UserNameAndPassword sinifindan OBJECT olustur; object olusurken Constructer ile set et.
            // userSettings bilgilerini parametre olarak overlodding yapilan Constructer'da kullan.
      // 3 - Address sinifindan OBJECT olustur; Address degiskenleri PRIVATE.
            // userSettings bilgilerini parametre kullan ve PRIVATE degiskenleri SET et.
      // 4 - Items sinifindan OBJECT olustur; items degiskenlerinden Price, allUserPrice PRIVATE.
            // userSettings bilgilerini parametre kullan ve PRIVATE degiskenleri SET et ve hesaplama yap..
        @Test
    public void myTEST1(){
            UserSettings userSettings01=new UserSettings();

            userSettings01.username="denemeKisi_01";
            userSettings01.password="15555666";
            userSettings01.Address1="a sokak b cad. 3";
            userSettings01.City="Washington";
            userSettings01.ZipCode="11111";
            userSettings01.ItemName="Rose teddy bear";
            userSettings01.color="Red";
            userSettings01.wanaCustomText=true;
            userSettings01.customText="aaa";
            userSettings01.myPrice=0;

            UserNameAndPassword userNameAndPassword01=new UserNameAndPassword(userSettings01.username,userSettings01.password);

            Address address01=new Address();
            address01.Address1(userSettings01.Address1);
            address01.City(userSettings01.City);
            address01.ZipCode(userSettings01.ZipCode);

            Items items01=new Items();
            items01.ItemName(userSettings01.ItemName);
            items01.colorPrice(userSettings01.color);

            userSettings01.myPrice=items01.customText(userSettings01.wanaCustomText,userSettings01.customText);
            items01.AddtoAllUserPrice();
            System.out.println(Items.getAllUserPrice());

        }
@Test
            public void myTEST2(){
        UserSettings userSettings02=new UserSettings();

        userSettings02.username="denemeKisi_02";
        userSettings02.password="0000000000000000";
        userSettings02.Address1="yenimahalle asagi cad. 3";
        userSettings02.City="New York";
        userSettings02.ZipCode="99999";
        userSettings02.ItemName="Iphone max";
        userSettings02.color="Blue";
        userSettings02.wanaCustomText=true;
        userSettings02.customText="bbbbbbbbbbbb";
        userSettings02.myPrice=0;

        UserNameAndPassword userNameAndPassword02=new UserNameAndPassword(userSettings02.username,userSettings02.password);

        Address address02=new Address();
        address02.Address1(userSettings02.Address1);
        address02.City(userSettings02.City);
        address02.ZipCode(userSettings02.ZipCode);

        Items items02=new Items();
        items02.ItemName(userSettings02.ItemName);
        items02.colorPrice(userSettings02.color);

        userSettings02.myPrice=items02.customText(userSettings02.wanaCustomText,userSettings02.customText);
        items02.AddtoAllUserPrice();
        System.out.println(Items.getAllUserPrice());

    }
    @AfterClass
    public  static void AFTERCLASS(){
            Items item00=new Items();
            Assert.assertTrue(" Result 909.23,but your result is "+item00.getAllUserPrice(),904.23==item00.getAllUserPrice());

    }
   
}
