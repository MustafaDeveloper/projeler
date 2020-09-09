package TestClass;

import Lessons.LessonClass;
import Lessons.Music;
import Student.StudentClass;

public class MainClass3 {

    public static void main(String[] args) {

        try{StudentClass studentClass = new StudentClass("Gerard", "Captain2005","France" );

        LessonClass lessonClass = new Music(studentClass);

        studentClass.setClassNameAndScore(lessonClass.getClassNameAndScore());

        System.out.println(studentClass);
    }catch(Exception e){
        System.out.println(e.getMessage());
    }


        /*
        Run the MainClass3
        Enter: Art

            Exception in thread "main" java.lang.RuntimeException: You class name is not a valid class name.
         */
    }
}




