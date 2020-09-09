package TestClass;

import Lessons.LessonClass;
import Lessons.Music;
import Student.StudentClass;


public class MainClas {

    public static void main(String[] args) {

 try{
     StudentClass studentClass = new StudentClass("Gerard", "Captain2005","Portugal" );

     LessonClass lessonClass = new Music(studentClass);

     studentClass.setClassNameAndScore(lessonClass.getClassNameAndScore());

     System.out.println(studentClass);
 }catch (Exception e){
     System.out.println(e.getMessage());
 }


        /*
        Run the MainClass

        Result should be Exception in thread "main" java.lang.AssertionError:
        Location should be one of the following [USA, England, France, Germany, Canada]


         */
    }
}
