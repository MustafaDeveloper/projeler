package Settings;

public class UserSettings {

    public String username;
    public String password;
    public String Address1;
    public String City;
    public String ZipCode;
    public String ItemName;
    public String customText;
    public String color;

    public boolean wanaCustomText;
    public double  myPrice;

    @Override
    public String toString() {
        return "\nusername : " + username +
                "\npassword : " + password +
                "\nAddress1 : " + Address1+
                "\nCity : " + City +
                "\nZipCode : " + ZipCode +
                "\nItemName : " + ItemName +
                "\ncustomText : " + customText +
                "\ncolor : " + color +
                "\nwanaCustomText : " + wanaCustomText +
                "\nmyPrice : " + myPrice ;
    }



}
