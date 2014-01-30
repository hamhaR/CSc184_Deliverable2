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
        System.out.printf("CashBox: Depositing %d cents.\n" ,amount);
        System.out.printf("You have now %d cents credit.\n" ,credit);
    }

    public void returnCoins(){  // Return coins
        System.out.printf("CashBox: Returning %d cents \n" ,credit);
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

