public class OrderProcess {
    Product1 p1 = new Product1("Laptop",53000,1);
    Product1 p2 = new Product1("Mobile",17000,3);
    Product1 p3 = new Product1("Keypad",1200,10);

    int p1Price = p1.productPrice * p1.quantity;
    int p2Price = p2.productPrice * p2.quantity;
    int p3Price = p3.productPrice * p3.quantity;

    int totalPrice=p1Price+p2Price+p3Price;

    }




