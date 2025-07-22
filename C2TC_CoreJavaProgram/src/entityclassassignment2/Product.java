package entityclassassignment2;

public class Product {
    public int id;
    public String company;
    public String city;

    public Product(int id, String company, String city) {
        this.id = id;
        this.company = company;
        this.city = city;
    }

    public void display() {
        System.out.println("ID: " + id + ", Company: " + company + ", City: " + city);
    }
}
