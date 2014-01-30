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

    public boolean doOneAction(){   // Read commands and execute them
        String userInput;
        userInput = scanner.next();
        if(userInput.equals("insert") || userInput.equals("INSERT")){
            int value;
            value = scanner.nextInt();
            pCashBox.deposit(value);
        }else if(userInput.equals("select") || userInput.equals("SELECT")){
            String choice;
            choice = scanner.next();
            pSelector.select(Selection.valueOf(choice.toUpperCase()));  // Convert choice to enum.
        } else if(userInput.equals("quit") || userInput.equals("QUIT")){    // The system terminate.
            return false;
        } else{ // The user enters incorrect input.
            System.out.print("Wrong input\n");
        }
        return true;
    }

    public static void main(String[] args) {    // Test program.
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        while(coffeeMachine.doOneAction());
    }

}

