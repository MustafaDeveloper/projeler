package School;

import java.util.ArrayList;

public class SchoolLocation {

    private String price;
    private String location;
    private static ArrayList<String> locationList=new ArrayList<>();
         /*    3 private instance variables oluşturun
    String price and location
    Static String ArrayList locationList       */
    //-------------------------------------------------------------------------------------------------------
    public SchoolLocation(String location) {
            addLocation();
            setLocationList(location);
            setPrice();
    }
     /*       Parametresi string location olan constructor oluşturun  üç methodu çağırın

        addLocation
        setSchoolLocation
        setPrice        */
    //-------------------------------------------------------------------------------------------------------
        public void setPrice(){

            if (location.equalsIgnoreCase("USA")) price="$8000";
            else if (location.equalsIgnoreCase("England")) price="$6500";
            else if (location.equalsIgnoreCase("France")) price="$7200";
            else if (location.equalsIgnoreCase("Germany")) price="$7000";
            else if (location.equalsIgnoreCase("Canada")) price="$7500";
            else  throw new NullPointerException("This is not a valid location");
   }
      /*   setPrice Methodunu oluşturun
            Eğer location  USA ise   price  $8000 olmalı
            Eğer location  England ise  price  $6500 olmalı
           Eğer location  France ise  price  $7200 olmalı
            Eğer location  Germany ise     price  $7000 olmalı
           Eğer location  Canada ise   price  $7500 olmalı
            Eğer location bunlardan biri değil ise   exception fırlatın  -->
     */
    //-------------------------------------------------------------------------------------------------------

    public String getPrice() {
        return price;
    }
    /*   Create a get method for price
        price için get methodu oluşturun
     */

    //-------------------------------------------------------------------------------------------------------

    public static void addLocation(){

        locationList.add("USA");
        locationList.add("England");
        locationList.add("France");
        locationList.add("Germany");
        locationList.add("Canada");
             }


     /*
        return türü olmayan addLocation isminde  public static methodunu oluşturun

        ArrayList locationList'e   USA , England , France , Germany , Canada  ekle
     */


    //-------------------------------------------------------------------------------------------------------

    public static ArrayList<String> getLocationList() {
        return locationList;
    }

    /*
    Create a get method for the locationList
     */

    /*
     locationList için get methodunu oluşturun
     */

    //-------------------------------------------------------------------------------------------------------



    public void setLocationList (String SchoolLocation){
         ArrayList<String> listOfLocations=new ArrayList<>(getLocationList());
        if (locationList.contains(SchoolLocation))   this.location=SchoolLocation;
         else throw new RuntimeException ("Location should be one of the following"+listOfLocations );
     }



      /*

    parametresi  String SchoolLocation ve return türü olmayan locationList methodunu oluşturun

    Create an String ArrayList name is listOfLocations is equal to the get method of the locationList

     locationList'in get methoduna eşit olan listOfLocations adında bir String ArrayList oluşturun

    Eğer locationList  SchoolLocation içeriyorsa
    then instance variable location  SchoolLocation parametreye eşittir.

     Eğer locationList  SchoolLocation içermiyorsa
      RunTimeException fırlat ---> ("Location should be one of the following " +listOfLocations)
     */

    //-------------------------------------------------------------------------------------------------------

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }


    /*
    Create a get method for the location
     */

    /*
     location için get methodu oluşturun
     */

    @Override
    public String toString() {
        return " \nSchool Price= " + price  + "\nSchool Location='" + location;
    }
}
