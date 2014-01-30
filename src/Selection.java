/**
 * Created with IntelliJ IDEA.
 * User: Rahmah Hadji Abdulmadid
 * Date: 1/23/14
 */

public enum Selection {
    BLACK(35), WHITE(35), SWEET(35), BOTH(35), BOULLION(25);
    private int price;

    private Selection(int pPrice){
        price = pPrice;
    }

    public int price(){
        return price;
    }

}

