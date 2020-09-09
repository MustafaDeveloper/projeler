package Settings;

import java.util.ArrayList;

public class UserNameAndPassword {

    /*
        DO NOT CHANGE THE addUserToList METHOD

        addUserToList is adding default email address to the UserNameLists

     */

    /*
         addUserToList METHODUNU değiştirmeyin

        addUserToList UserNameLists a   default email address ekliyor

     */


    public void addUserToList() {

    }

    /*

     Parametresi String Username ve String Password olan  bu constructor SetUsername ve setPassword methodlarını çağıran bu constructordır.

    */

    public UserNameAndPassword(String Username, String Password) {
        setUsername(Username);
        setPassword(Password);
    }

    /*
        Given default constructor.  Boş constructor verilmiştir
     */
    public UserNameAndPassword() {

    }

    /*
         private String userName;
         private String password;

     Adı UserNameLists , türü Strıng ve static olan bir  Arraylist oluşturun.

    */
        private String userName;
        private String password;
        static ArrayList<String> UserNameLists=new ArrayList<>();

    /*
        Create a method name is setUsername
        return type is String
        parameter is String(myUsername)

        if the myUsername length is less then 6
        return Username length should be more then 6

        if the myUsername contains space(" ")
        return  Username should not contain space

        if the myUsername does NOT contains @
        return Username should contain @ symbol

        if the UserNameLists has myusername
        return Username should be unique

        if all these are false
        private userName = myUsername

        and return the username
    */

    public String  setUsername (String myUsername){
        if (myUsername.length()<6){
            return ("Username length should be more then 6");
        }
        else if (myUsername.contains(" ")){
            return ("Username should not contain space");
        }
        else if (!myUsername.contains("@")){
            return ("Username should contain @ symbol");
        }
        else if (UserNameLists.contains(myUsername)){
            return ("Username should be unique");
        }
        else{
            userName=myUsername;
            return userName;
        }
    }

    public String setPassword(String myPassword){
        if (myPassword.length()<=5){
            return " Password length more then 5 character";
        }
        else {
             password=myPassword;
        }
        return password;
    }

 /*
    Return türü String ve parametresi String(myPassword) olan setPassword methodunu oluşturun



    Eğer myPassword length  5 ten küçük veya eşit ise
     Password length more then 5 character  return edin

    Eğer ilk condition false ise
    private password variable  myPassword a eşittir

    ve   myPassword return et

     */


}
