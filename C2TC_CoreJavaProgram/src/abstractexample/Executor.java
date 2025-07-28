package abstractexample;

public class Executor {

	public static void main(String[] args) {
		Coder  c1;
		//studentt
		c1 = new Studentt();
		c1.rules();
		
		//trainer
		c1 = new Trainer();
		c1.rules();
	}
}
