package bankAccount;


import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Users {



    /*
        Create public String variable name password dateOfBirth marriageStatus  relativeName relativeAge isTransferedSuceesfully
        Create int  accountNumber amountAccount1 accountNumber2 amountAccount2

        all public
     */
    public String name, password, dateOfBirth, marriageStatus,  relativeName, relativeAge, isTransferedSuceesfully;
    public int accountNumber, amountAccount1 , accountNumber2 , amountAccount2;
    //--------------------------------------------------------------------------------------------------
    /*
    Create a constructor
    Parameters are String name , passwod , dateOfBirth , marriageStatus
    Int amountAccount1 , amountAccount2

    variable name equal to parameter name
    same for password
    same for amountAccount1
    same for amountAccount2

    Following also in the constructor

    variable accountNumber get the the number from the  randomNumberCreader method
    variable accountNumber2 get the the number from the  randomNumberCreader method
    variable marriageStatus equal to CheckMariageStatus method return
    variable dateOfBirth equal to checkAge return

     */
    public Users(String name , String password , String dateOfBirth , String marriageStatus, int amountAccount1 , int amountAccount2){
        this.name=name;
        this.password=password;
        this.amountAccount1=amountAccount1;
        this.amountAccount2=amountAccount2;

        this.accountNumber=Random();
        accountNumber2=Random();

        this.dateOfBirth=checkAge(dateOfBirth);
        this.marriageStatus=CheckMariageStatus(marriageStatus);


}

     //--------------------------------------------------------------------------------------------------
    /*
        Create method name is  CheckMariageStatus parameter is String(marriageStatus) return type is String
        if String marriageStatus is married

        Ask to user (use scanner class)    Do you want to add add your relative?

        if the user say Yes   Ask to user
        What is your relative name?   Ask to user
        Date of birth relative?

        Then Add the relative(Use AddRelative class )
        relativeName variable equal to AddRelative class fullName
        relativeAge variable equal to AddRelative class age

            if relativeAge equal to "0"
                then change the relativeName to "Relative should be more then 18 years old";
                then change the relativeAge to "Relative should be more then 18 years old";
                return the "Relative should be more then 18 years old";
            if the relativeAge is not equal to "0"
               return Transaction done successfully

        If the user say No
        then no need to add anything.
     */
    public String CheckMariageStatus(String marriageStatus){
        String ret="";

        if (marriageStatus.equals("married")) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Do you want to add your relative?: ");
            String answer = sc.nextLine();

            if (answer.toLowerCase().equals("yes")) {
                Scanner sc1 = new Scanner(System.in);
                System.out.print("What is your relative name?");
                String relativName = sc1.nextLine();
                Scanner sc2 = new Scanner(System.in);
                System.out.print("Date of birth relative?");
                String relativBirtday = sc2.nextLine();
                AddRelative relativ = new AddRelative(relativName, relativBirtday);
                relativeName = relativ.fullName;
                relativeAge=relativ.age;

                if (relativeAge.equals("0")) {
                    relativeName = "Relative should be more then 18 years old";
                    relativeAge = "Relative should be more then 18 years old";
                    ret= "Relative should be more then 18 years old";
                } else if (!relativeAge.equals("0")) {
                    ret="Transaction done successfully";

                }
            }else if(answer.toLowerCase().equals("no")) {
                ret= "";
            }
        }
        return ret;
     }

    /*

       -- Parametresi String(marriageStatus) ve return  tipi String olan CheckMariageStatus methodunu oluşturun
       if String marriageStatus is married

       -- Eğer String marriageStatus  married ise

       Kullanıcıya sor ( scanner class kullan)
       Do you want to add add your relative?

       --Eğer kullanıcı Yes derse
       Kullanıcıya sor
       What is your relative name?
       Kullanıcıya sor
       Date of birth relative?

       Sonra  relative(Use AddRelative class ) ekle
       relativeName variable  AddRelative class fullName eşittir
       relativeAge variable  AddRelative class age  eşittir

           --Eğer relativeAge  "0"  a eşit ise
                relativeName i  "Relative should be more then 18 years old";  e değiştir
                relativeAge i  "Relative should be more then 18 years old";   e değiştir
               return   "Relative should be more then 18 years old";   olmalı
           -- Eğer the relativeAge  "0" a eşit değilse
               return Transaction done successfully

      -- Eğer kullanıcı No derse
       hiçbirşey eklemeye gerek yok.
    */
    //--------------------------------------------------------------------------------------------------





    //--------------------------------------------------------------------------------------------------

       public static String checkAge (String myDOB){
           String ret="";
           LocalDate today=LocalDate.now();

           DateTimeFormatter format1=DateTimeFormatter.ofPattern("dd/MM/yyyy");

           LocalDate myDOB1=LocalDate.parse(myDOB,format1);
           String Today=today.format(format1);

           Period fark = Period.between(myDOB1,today);
           if( fark.getYears() >= 18 && fark.getMonths() >=0 && fark.getDays()>=0){
               ret="You can get a credit card";
           }else{
               ret= "You should be at least 18 years old to get a credit card.";
           }
           return ret;
      }

   /*-- Parametresi String(myDOB) ve return  tipi String olan checkAge static methodunu oluşturun

        -- taday date i myDOB ile karşılaştır

        -- Eğer compare to today date 18 ise "You can get a credit card" et

        -- Eğer compare to today date 18 den küçük ise "You should be at least 18 years old to get a credit card."
        return et.
        Örnek today date  10/05/2020 ise

        Eğer myDOB  09/05/2002 ise

        return   "You can get a credit card"  olmalı

        Eğer   myDOB  11/05/2002  ise

        return  "You should be at least 18 years old to get a credit card."  olmalı

     */
    //--------------------------------------------------------------------------------------------------

  public int Random() {
      return (int)(Math.random()*(99999999-10000000))+10000000;
  }

    //--------------------------------------------------------------------------------------------------
    /*
        Create a Random number which is returning 8 digit number

            it should be between 10000000 - 99999999

     */


    /*

       8 basamak sayı döndüren Random sayı oluştur

           Bu sayı  10000000 - 99999999 arasında olamalı

    */




        public void transfer(Users object1,Users object2){

        System.out.print("Do you want to transfer between your accounts or different user: ");
         Scanner sc1=new Scanner(System.in);
         String answer=sc1.nextLine();

            if (answer.toLowerCase().equals("own")){
                System.out.print("Enter amount of money you want to enter: ");
                Scanner sc2=new Scanner(System.in);
                int transferAmount = sc2.nextInt();

                isTransferedSuceesfully = Account.transferToOwnAccount(object1 , transferAmount);

            }else {

                System.out.println("Enter amount of money you want to enter");
                Scanner sc2=new Scanner(System.in);
                int transferAmount = sc2.nextInt();

                isTransferedSuceesfully = Account.transferOtherUser(object1 , object2 , transferAmount);
            }
        }




    /*

        -- Parametreleri iki tane Users object olan return tipi void olan transfer adında method oluştur.


        -- Bu method içinden
           Önce kullanıcıya sor  "Do you want to transfer between your accounts or different user" ( scanner class kullan)

      - Eğer cevap own ise
            Account class içinde transferToOwnAccount methodunu çağır

      - Eğer cevap farklı ise
           Account class içinde transferOtherUser methodunu çağır


     */
//--------------------------------------------------------------------------------------------------






//--------------------------------------------------------------------------------------------------
    /*
        Print the object using toString method

        like
         return "\nname: " + name +
                "\npassword: " + password+
                "\ndateOfBirth: " + dateOfBirth+
                ......

     */

    @Override
    public String toString() {
        return  "\n"  +
                "*****************************************************************"  + "\n" +
                "Name...................: " + name + "\n" +
                "Password...............: " + password + "\n" +
                "Date of Birth..........: " + dateOfBirth + "\n" +
                "Marriage Status........: " + marriageStatus + "\n" +
                "AccountNumber..........: " + accountNumber + "\n" +
                "Amount in Account1.....: " + amountAccount1 + "\n" +
                "AccountNumber2.........: " + accountNumber2 + "\n" +
                "Amount in Account2.....: " + amountAccount2 + "\n" +
                "RelativeName...........: " + relativeName + "\n" +
                "RelativeAge............: " + relativeAge + "\n" +
                "*****************************************************************"  ;
    }

/*
        name: Steven
        password: Gerard
        dateOfBirth: You can get a credit card
        marriageStatus: Relative should be more then 18 years old
        accountNumber: 77650360
        amount in account 1 : 901
        accountNumber2: 95990730
        amount in account 2 : 2099
        relativeName: Relative should be more then 18 years old
        relativeAge: Relative should be more then 18 years old
       toString methodunu kullanarak objecti print et


        return "\nname: " + name +
               "\npassword: " + password+
               "\ndateOfBirth: " + dateOfBirth+
               ......


               gibi

    */
    //--------------------------------------------------------------------------------------------------



}
