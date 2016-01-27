import java.util.ArrayList;
// MVC 패턴

//controller
public class ArrayListExam2 {
    public static void main(String[] args) {

        ArrayList<Product> cart = new ArrayList<>();

        Product iMac = new Product("iMac 5k", 1, 1500000);
        cart.add(iMac);
        cart.add(new Product("아이패드",1,500000));

        Product book = cart.get(1);
        cart.set(0,book);
        cart.set(1,iMac);

        System.out.println(cart);

    }
//모델
    static class Product {
        String code;
        int quantity;
        int price;

        public Product(String code, int quantity, int price) {
            this.code = code;
            this.quantity = quantity;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "code='" + code + '\'' +
                    ", quantity=" + quantity +
                    ", price=" + price +
                    '}'+"\n";
        }
    }
}


