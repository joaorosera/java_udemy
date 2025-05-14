package udemy;

public class Program2 {

	public static void main(String[] args) {
		
		int x = 20;
		
		// Boxing: convertendo o tipo primitivo 'int' para o tipo 'Object'
		Object obj = x;
		
		System.out.println(obj);
		
		// Unboxing: convertendo o tipo 'Object' de volta para o tipo primitivo 'int'
		// É necessário fazer o casting manualmente
		int y = (int) obj;
		
		System.out.println(y);
		
		// -----------------------------------------
		// Wrapper classes são classes que encapsulam tipos primitivos,
		// permitindo que sejam tratados como objetos
		int z = 10;
		
		// Boxing com Wrapper class: convertendo 'int' para 'Integer' (classe wrapper do tipo int)
		Integer obj2 = z;

		System.out.println(z);
		
		// Unboxing automático: o valor de 'obj2' é usado como um 'int' sem necessidade de casting
		int c = obj2 * 3;
		
		System.out.println(obj2);
	}
}
