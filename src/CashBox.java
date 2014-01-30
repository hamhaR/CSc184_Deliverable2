/**
 * Created with IntelliJ IDEA.
 * User: Rahmah Hadji Abdulmadid
 * Date: 1/23/14
 */
public class CashBox {
    private int credit;

    public CashBox(){
        credit = 0;
    }

    public void deposit(int amount){
        credit = credit + amount;
        System.out.printf("CashBox: Depositing %d cents.\n" ,amount);
        System.out.printf("You have now %d cents credit.\n" ,credit);
    }

    public void returnCoins(){
        System.out.printf("CashBox: Returning %d cents \n" ,credit);
        credit = 0;
    }

    public boolean haveYou(int amount){
        if(credit >= amount){
            return true;
        }else{
            return false;
        }
    }

    public void deduct(int amount){
        credit = credit - amount;
        returnCoins();
    }
}

