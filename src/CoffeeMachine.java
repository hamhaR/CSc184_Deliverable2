/**
 * Created with IntelliJ IDEA.
 * User: Rahmah Hadji Abdulmadid
 * Date: 1/23/14
 */
import java.util.Scanner;


public class CoffeeMachine {

    private CashBox pCashBox;
    private Mixer pMixer;
    private Selector pSelector;

    public CoffeeMachine(){
        pCashBox = new CashBox();
        pMixer = new Mixer();
        pSelector = new Selector(pCashBox, pMixer);
    }

    Scanner scanner = new Scanner(System.in);

    public boolean doOneAction(){
        String userInput;
        userInput = scanner.next();
        if(userInput.equals("insert")){
            int value;
            value = scanner.nextInt();
            pCashBox.deposit(value);
        }else if(userInput.equals("select")){
            String choice;
            choice = scanner.next();
            pSelector.select(Selection.valueOf(choice.toUpperCase()));
        } else if(userInput.equals("quit")){
            return false;
        } else{
            System.out.print("Wrong input\n");
        }
        return true;
    }


    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        while(coffeeMachine.doOneAction());
    }

}

