package bankAccount;

public class AddRelative {

    /*
    Create an instance variable
        String fullName , age
     */
    //--------------------------------------------------------------------------------------------------
    String fullName ;
    String age;



    //--------------------------------------------------------------------------------------------------
    /*
        Create a constructor AddRelative
            parameters String fullName and age

        instance variable fullName equal to parameter fullName

        If the age is more then or equal to 18 then instance variable age equal to parameter age (use relativeAgeChecker method)
        If the age is less then 18 then instance variable age equal to "0"

     */
    public AddRelative(String fullName, String age){

    this.fullName=fullName;
    if(relativeAgeChecker(age)) this.age=age;
    else this.age="0";
}

    //--------------------------------------------------------------------------------------------------

    /*
        Create a method name is relativeAgeChecker
        parameter String(relativeAge)
        return type is boolean

        if the relativeAge more or equal to 18 then return true
        else false

        Note: use a Users class checkAge method.
     */

  public static boolean relativeAgeChecker(String relativeAge){
      String str=Users.checkAge(relativeAge);
      if (str.toLowerCase().contains("you can") ) return true;
        else return false;
    }
    //--------------------------------------------------------------------------------------------------






}
