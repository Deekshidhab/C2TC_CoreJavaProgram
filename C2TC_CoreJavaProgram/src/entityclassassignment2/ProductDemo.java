package entityclassassignment2;


public class ProductDemo {
    public static void main(String[] args) {
    	
        Product p1 = new Product(200, "Amazon", "Chennai");
        Product p2 = new Product(201, "Flipkart", "Coimbatore");
        Product p3 = new Product(202, "Myntra", "Madurai");

        System.out.println("Product Details:");
        p1.display();
        p2.display();
        p3.display();
    }
}