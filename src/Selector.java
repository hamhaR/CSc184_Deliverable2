/**
 * Created with IntelliJ IDEA.
 * User: Rahmah Hadji Abdulmadid
 * Date: 1/23/14
 */

public class Selector { // Checks credit; Dispenses product.
    private CashBox pCashBox;
    private Mixer pMixer;

    public Selector(CashBox pC, Mixer pM){
        pCashBox = pC;
        pMixer = pM;
    }

    public void select(Selection s){
        int amount = s.priceOf();
        if(pCashBox.haveYou(amount)){
            pMixer.make(s);
            pCashBox.deduct(amount);
        }else{
            System.out.println("Selector: Insufficient funds");
        }
    }

}

