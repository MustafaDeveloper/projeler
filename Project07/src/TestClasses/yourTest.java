package TestClasses;

import bankAccount.Users;
import org.junit.Assert;
import org.junit.Test;

public class yourTest {

    /*
        Create a Test for method in the Users randomNumberCreader

        Check all possible options
     */
    @Test
    public void test1(){
    Users user=new Users("aa","bb","11/11/2002","single",0,0);
    int result=user.Random()/100000000;
    int expected=0;
    Assert.assertTrue("sonuc \"0\" olmali, fakat sizin sonuc: "+result,result==expected);
    }

    /*
         Users içindeki randomNumberCreader methodu için Test oluştur

        Tüm olası seçenekleri kontrol edin
     */






    /*
          Users içindeki checkAge için Test oluştur

        Tüm olası seçenekleri kontrol edin


     */
    @Test
    public void test2(){
        String result=Users.checkAge("11/11/2000");
        String expect="You can get a credit card";
        Assert.assertTrue("sizin sonuc: "+"You should be at least 18 years old to get a credit card.",result==expect);
    }
    @Test
    public void test3(){
        String result=Users.checkAge("25/07/2002");
        String expect="You can get a credit card";
        Assert.assertTrue("sizin sonuc: "+"You should be at least 18 years old to get a credit card.",result==expect);
    }
    @Test
    public void test4(){
        String result=Users.checkAge("25/07/2003");
        String expect="You should be at least 18 years old to get a credit card.";
        Assert.assertTrue("sizin sonuc: "+"You can get a credit card",result==expect);
    }
}
