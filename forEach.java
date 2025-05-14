package udemy;

public class forEach {

	public static void main(String[] args) {
		// For-each - forma simples de percorrer arrays (sem usar índice)

		String[] vect = new String[] {"Josh", "Bob", "Alex"};
		
		// FOR NORMAL (com índice)
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i]); // acessa elemento pela posição (i)
		}
		
		// FOR-EACH (sem índice)
		// Para cada elemento do tipo String dentro do array vect:
		System.out.println("-----------------");
		for (String nome : vect) { // "nome" é um apelido temporário para cada item
			System.out.println(nome); // imprime o valor do item (sem precisar de índice)
		}
	}
}
