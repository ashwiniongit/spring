package programs;

public class MultiplyUsingFunctionalInterf {

	public static void main(String[] args) {
		
		FuncionalInterfMultiply f = (x,y) -> x*y;
		
		System.out.println(f.multiply(4, 5));
	}

}
