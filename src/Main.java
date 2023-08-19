import javax.print.attribute.standard.OrientationRequested;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product>products = new ArrayList<Product>();
        ArrayList<User> users = new ArrayList<User>();

        Manager manager = new Manager();
        manager.register("Cainã", "caina@gmail.com",
                "1234");
        users.add(manager);

        products.add(manager.registerProduct(products.size(),
                "cerveja",5.65));

        Client client = new Client();
        client.register("Bruno","bruno.11rcoisa","124");


        client.createOrder();
        ArrayList<Order>ordens = client.getOrders();

        ordens.get(0).addProduct(products.get(0));

        for (User user : users){
            System.out.println(client.getOrders().get().getProducts.get(0));
        }
    }

}