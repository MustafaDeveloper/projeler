package bankAccount;

public class Account {

    /*
        Create a static method name is deposit
        parameters are two int(int accountAmount , int amountToAdd)
        return type is int

        add amountToAdd to accountAmount
     */
    //------------------------------------------------------------------------------------------------
public static int deposit(int accountAmount , int amountToAdd){
    accountAmount+=amountToAdd;
    return accountAmount;
}
   //--------------------------------------------------------------------------------------------------
    /*
         Create a static method name is withDraw
         parameters are two int(int accountAmount , int withdrawAmount)
         return type is int
         remove withdrawAmount to accountAmount
      */
    //--------------------------------------------------------------------------------------------------

public static int withDraw(int accountAmount , int withdrawAmount){
    accountAmount-=withdrawAmount;
    return accountAmount;
}
    //--------------------------------------------------------------------------------------------------
    /*
        Create a method name is transferOtherUser
        Parameters are 2 Users(sendingUser , receivingUser) and one int (transferAmount)

        if the transferAmount is bigger then sendingUser amountAccount1 variable
        Then return Sender is poor lol :)

       if the transferAmount is smaller then sendingUser amountAccount1 variable
            Remove 2 percent from the transferAmount
            remove the transferAmount from the sendingUser amountAccount1
            add the transferAmount from the receivingUser  amountAccount1
        Then return Transaction is completed successfully

        For example:
        SendingUser amountAccount1 has 1000 dollar
        receiving user amountAccount1 has 200 dollar

        transferAmount 100
        After the transaction SendingUser amountAccount1 should have 902 dollor
        After the transaction receivingUser amountAccount1 should have 298 dollor
     */
    //--------------------------------------------------------------------------------------------------
public static String transferOtherUser(Users sendingUser , Users receivingUser, int transferAmount){
    String ret=" ";
    if(transferAmount > sendingUser.amountAccount1){
        ret= "Sender is poor lol :)";
    }else if(transferAmount < sendingUser.amountAccount1){
        transferAmount-=(transferAmount*2/100);
        sendingUser.amountAccount1-=transferAmount;
        receivingUser.amountAccount1+=transferAmount;
        ret="Transaction is completed successfully";
    }
    return ret;
 }
    //--------------------------------------------------------------------------------------------------
    /*
       Create a static method name is transferToOwnAccount
       parameter is One Users object , one int transferAmount
       return type is String

       if the transferAmount is bigger then Users amountAccount1
        return You need more money dude

       if the transferAmount is smaller then Users amountAccount1
          remove the transferAmount from user amountAccount1
          add transferAmount to user amountAccount2

        return Transaction is completed successfully

     */
    public static String transferToOwnAccount(Users object , int transferAmount) {
        String ret="";
        if(transferAmount > object.amountAccount1){
            ret="You need more money dude";
        }else if(transferAmount < object.amountAccount1){
            transferAmount-=(transferAmount*2/100);
            object.amountAccount1-=transferAmount;
            object.amountAccount2+=transferAmount;
            ret= "Transaction is completed successfully";
        }
        return ret;
    }

}












