package Lessons;


import Student.StudentClass;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.lang.Math;


public abstract class LessonClass {

   /* LessonClass class is abstract class
        Create 2 private variables
        static int totalCreditCount
        LinkedHashMap Key is String, value is Integer, name is classNameAndScore

        one private StudentClass object.
     */
        private static int totalCreditCount;
        private LinkedHashMap<String, Integer> classNameAndScore=new LinkedHashMap<>();

        private StudentClass studentClass;
    //-------------------------------------------------------------------------------------------------------
    /*        Create a method name is topics

        This method is a abstract method

        Return type is String ArrayList

     */
    public  abstract ArrayList<String> topics()  ;

     //-------------------------------------------------------------------------------------------------------
     /*
    Create a constructor for the LessonClass
    parameter is StudentClass object

    make StudentClass instance variable equal to StudentClass parameter

    call the setCreditCount method  which you are expected to create below
     */
        public LessonClass (StudentClass studentClass){
            this.studentClass= studentClass;
            setCreditCount();
            }
//-------------------------------------------------------------------------------------------------------
   /*    Create a method name setCreditCount
    No parameter and no return type
    Create an arraylist name is lessonsName

    Ask to user "Which class you would like to take your options are here : Math , Science , Biology , Chemistry , Music"
    After asking also  print the current totalCreditCount(this comes from the instance variable)


    If the user took the class (you wrote in the console with the scanner class) is already exits in the arraylist and the user would like to take it again

    Then print "You already took this class please choose other class"

    If the user didn't take that class before, then add it to the arraylist, and add the credit of the class(which comes from the lessonsName list) to the
    totalCreditCount(you need to use checkCredit method)

    NOTE: The user can add a class until totalCreditCount equals to 7 (it is better to use while loop)

     */
    public void setCreditCount() {
        ArrayList<String> lessonsName=new ArrayList();

     while(totalCreditCount <=7){
         System.out.println("totalCreditCount = " + totalCreditCount);    //(bu, instance variable'dan gelir)
         System.out.println("Which class you would like to take your options are here : Math , Science , Biology , Chemistry , Music");

         Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            if(lessonsName.contains(str)) System.out.println("You already took this class please choose other class");
            else {
                lessonsName.add(str);
                totalCreditCount+=checkCredit(str);

            }
     }
    }
//-------------------------------------------------------------------------------------------------------
    public int checkCredit(String lessonName) {
        int credit;
        if (lessonName.equalsIgnoreCase("Math")){ credit= 3;}
        else if (lessonName.equalsIgnoreCase("Science")) credit= 4;
        else if (lessonName.equalsIgnoreCase("Biology")) credit= 2;
        else if (lessonName.equalsIgnoreCase("Chemistry")) credit= 2;
        else if (lessonName.equalsIgnoreCase("Music")) credit= 2;
        else throw new RuntimeException("You class name is not a valid class name.");
       classNameAndScore.put(lessonName,RandomNum());
        return credit;
    }
      /*

    parametresi String lessonName ve return türü int olan checkCredit  isminde bir method oluşturun

    Eğer lessonName = Math
     credit  3 olmalı

     Eğer lessonName = Science
     credit  4 olmalı

      Eğer lessonName = Biology
     credit  2 olmalı

      Eğer lessonName = Chemistry
     credit  2 olmalı

      Eğer lessonName = Music
     credit  3 olmalı

     if the class is non of these options
     Class bu seçeneklerden değilse
         "You class name is not a valid class name."  diye exception fırlat.

     İf statementten  sonra
     lessonName'i classNameAndScore'a key olarak koyun
     value RandomNum olan sonraki methodundan almalıdır
     */
//-------------------------------------------------------------------------------------------------------

  public int RandomNum(){
      return ((int)(Math.random()*100)+1);

  }



     /*

    Parametresi olmayan ve return türü int olan RandomNum methodunu oluşturun

    0 ile 100 arasında bir int  oluştur
     */

//-------------------------------------------------------------------------------------------------------

    public LinkedHashMap<String, Integer> getClassNameAndScore() {


        return classNameAndScore;
    }


    /*
    Create a get method for the ClassNameAndScore
     */


     /*
   ClassNameAndScore için get methodu oluşturun
     */
}
