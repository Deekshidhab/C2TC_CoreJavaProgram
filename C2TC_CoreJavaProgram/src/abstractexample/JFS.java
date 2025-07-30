package abstractexample;

public class JFS extends PLTraining{
	import java.util.Scanner;
	import java.text.DecimalFormat;

	// Interface
	interface Airfare {
	    double calculateAmount();
	    void display();
	}

	// AirIndia class
	class AirIndia implements Airfare {
	    private int hours;
	    private double costPerHour;

	    public AirIndia() {}

	    public AirIndia(int hours, double costPerHour) {
	        this.hours = hours;
	        this.costPerHour = costPerHour;
	    }

	    public int getHours() {
	        return hours;
	    }

	    public void setHours(int hours) {
	        this.hours = hours;
	    }

	    public double getCostPerHour() {
	        return costPerHour;
	    }

	    public void setCostPerHour(double costPerHour) {
	        this.costPerHour = costPerHour;
	    }

	    public double calculateAmount() {
	        return hours * costPerHour;
	    }

	    public void display() {
	        System.out.printf("%.2f\n", calculateAmount());
	    }
	}

	// KingFisher class
	class KingFisher implements Airfare {
	    private int hours;
	    private double costPerHour;

	    public KingFisher() {}

	    public KingFisher(int hours, double costPerHour) {
	        this.hours = hours;
	        this.costPerHour = costPerHour;
	    }

	    public int getHours() {
	        return hours;
	    }

	    public void setHours(int hours) {
	        this.hours = hours;
	    }

	    public double getCostPerHour() {
	        return costPerHour;
	    }

	    public void setCostPerHour(double costPerHour) {
	        this.costPerHour = costPerHour;
	    }

	    public double calculateAmount() {
	        return hours * costPerHour * 4;
	    }

	    public void display() {
	        System.out.printf("%.2f\n", calculateAmount());
	    }
	}

	// Indigo class
	class Indigo implements Airfare {
	    private int hours;
	    private double costPerHour;

	    public Indigo() {}

	    public Indigo(int hours, double costPerHour) {
	        this.hours = hours;
	        this.costPerHour = costPerHour;
	    }

	    public int getHours() {
	        return hours;
	    }

	    public void setHours(int hours) {
	        this.hours = hours;
	    }

	    public double getCostPerHour() {
	        return costPerHour;
	    }

	    public void setCostPerHour(double costPerHour) {
	        this.costPerHour = costPerHour;
	    }

	    public double calculateAmount() {
	        return hours * costPerHour * 8;
	    }

	    public void display() {
	        System.out.printf("%.2f\n", calculateAmount());
	    }
	}

	// Main driver class
	public class Main {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int choice = Integer.parseInt(sc.nextLine().trim());
	        int hours = Integer.parseInt(sc.nextLine().trim());
	        double costPerHour = Double.parseDouble(sc.nextLine().trim());

	        Airfare fare = null;

	        switch (choice) {
	            case 1:
	                fare = new AirIndia(hours, costPerHour);
	                break;
	            case 2:
	                fare = new KingFisher(hours, costPerHour);
	                break;
	            case 3:
	                fare = new Indigo(hours, costPerHour);
	                break;
	            default:
	                System.out.println("Invalid choice");
	                sc.close();
	                return;
	        }

	        fare.display();
	        sc.close();
	    }
	}

