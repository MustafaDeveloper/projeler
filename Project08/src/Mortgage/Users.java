package Mortgage;

public class Users {

            private String username;
            private String WhichCondition;

            private String houseType;

            private int roomCount;
            private int downPayment;
            private int longTerm;

            private StatesTax statesTax;

    public Users(String username, String whichCondition, String houseType, int roomCount, int downPayment, int longTerm, StatesTax statesTax) {
        setUsername(username);
        setWhichCondition ( whichCondition);
       setHouseType(houseType);
        setRoomCount (roomCount);
        setDownPayment (downPayment);
        setLongTerm (longTerm);
        setStatesTax (statesTax);
    }

    public String getUsername() { return username; }

    public void setUsername(String username) {  this.username = username;  }

    public String getWhichCondition() { return WhichCondition; }

    public void setWhichCondition(String whichCondition) { WhichCondition = whichCondition; }

    public String getHouseType() { return houseType; }

    public void setHouseType(String houseType) { this.houseType = houseType;   }

    public int getRoomCount() {     return roomCount;  }

    public void setRoomCount(int roomCount) { this.roomCount = roomCount;    }

    public int getDownPayment() {   return downPayment;   }

    public void setDownPayment(int downPayment) { this.downPayment = downPayment;  }

    public int getLongTerm() { return longTerm;   }

    public void setLongTerm(int longTerm) { this.longTerm = longTerm;}

    public StatesTax getStatesTax() {  return statesTax;  }

    public void setStatesTax(StatesTax statesTax) { this.statesTax = statesTax;   }

    /*

            Aşağıdaki private variable'leri oluştur

            String username
            String WhichCondition

            String houseType

            int roomCount
            int downPayment
            int longTerm

            StatesTax statesTax;

        Create a constructor  using all the variables.
        Tüm variable'leri kullanarak constructor oluşturun

         */



/*
    Create the read-only method of the all variables
    Tüm variable'lerin read-only methodunu oluşturun

     */

  

}

