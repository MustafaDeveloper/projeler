package Student;


import Data.StudentData;
import School.SchoolLocation;

import java.util.LinkedHashMap;

public class StudentClass extends SchoolLocation {

    private String username;
    private String password;
    private LinkedHashMap<String,Integer> classNameAndScore=new LinkedHashMap<>();


    public StudentClass(String username, String password , String studentSchoolLocation) {
        super(studentSchoolLocation);
        setUsernamePassword(username, password);
    }

   /*  Bu sınıf   SchoolLocation sınıfının child sınıfıdır

     3 private instance variables oluşturun :    String username and password, Linked hash map , key  String ve  value Integer ,  ismi  classNameAndScore
     */
    //-------------------------------------------------------------------------------------------------------

    //-------------------------------------------------------------------------------------------------------
    /*  create a set method for the classNameAndScore   */
    //-------------------------------------------------------------------------------------------------------

    /*    create a get method for the classNameAndScore   */


    //-------------------------------------------------------------------------------------------------------
    public void setUsernamePassword(String username, String  password) {
        StudentData student = new StudentData();
        LinkedHashMap<String, String> studentData = new LinkedHashMap<String, String>();
        studentData=student.AddUserNameAndPassword();
        if (studentData.containsKey(username) && studentData.containsValue(password)) {
            this.username = username;
            this.password = password;

        } else {
            throw new RuntimeException("Not able to find a username and password. Please sign up to website");
        }
    }

    /*  Kontrol etmek için AddUserNameAndPassword methodunu kullanacaksınız (yeni bir LinkedHashMap oluşturun ve StudentData sınıfından AddUserNameAndPassword ile eşit yapın)
    çift varsa, instance variable username ile  parameter username eşitle,  ve instance variable password ile parameter password eşitle
   Eğer çift yoksa   "Not able to find a username and password. Please sign up to website" olan RunTimeException fırlat
     */

    //-------------------------------------------------------------------------------------------------------
       /*    Create a toString method
    print username
          password
          Price
          schoolLocation
          ClassNameAndScore
     */


    //-------------------------------------------------------------------------------------------------------
    public LinkedHashMap<String, Integer> getClassNameAndScore() {

        return classNameAndScore;
    }

    public void setClassNameAndScore(LinkedHashMap<String, Integer> classNameAndScore) {
        this.classNameAndScore = classNameAndScore;
    }

    @Override
    public String toString() {
        return  "username= " + username + "\npassword= " + password +super.toString()+ "\nclassNameAndScore= " + classNameAndScore;
    }
}