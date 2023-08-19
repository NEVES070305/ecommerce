import java.util.ArrayList;

public class Order {
    public int idOrder;
    public ArrayList<Product>products;

    public Order(int idOrder) {
        this.idOrder = idOrder;
    }
    public void addProduct(Product product){
        this.products.add(product);
    }
}
