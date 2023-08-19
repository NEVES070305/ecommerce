import java.util.ArrayList;

public class Client extends User{
    private ArrayList<Order>orders = new ArrayList<Order>();

    void createOrder(){
        orders.add(new Order(orders.size()));
    }

    public ArrayList<Order> getOrders() {

    }


}
