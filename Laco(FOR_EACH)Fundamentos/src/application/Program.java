package application;

public class Program {

	public static void main(String[] args) {

		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for(int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]);
		}
		
		System.out.println("...............");
		// for each seria como; para cada obj contido no vect faça:
		
		for(String obj : vect) { // vai percorrer todo vetor chamando pelo apelido obj..
			System.out.println(obj); // o mesmo efeito de vect[i].
		}

	}

}
