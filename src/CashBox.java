/**
 * Created with IntelliJ IDEA.
 * User: Rahmah Hadji Abdulmadid
 * Date: 1/23/14
 */
public class CashBox {  // Tracks the amount of credit.
    private int credit;

    public CashBox(){
        credit = 0;
    }

    public void deposit(int amount){    // Deposit money
        credit = credit + amount;
        System.out.println("CashBox: Depositing " +amount +" cents.");
        System.out.println("You have now " +credit +" cents credit.");
    }

    public void returnCoins(){  // Return coins
        System.out.println("CashBox: Returning " +credit +" cents.");
        credit = 0;
    }

    public boolean haveYou(int amount){ // Check if the credit is greater than the amount of the selected coffee.
        if(credit >= amount){
            return true;
        }else{
            return false;
        }
    }

    public void deduct(int amount){ // Deduct coins
        credit = credit - amount;
        returnCoins();
    }

    // End of the CashBox class.
}

