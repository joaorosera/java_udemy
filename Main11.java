package curso_programacao;

public class Main11 {

	public static void main(String[] args) {

	// Uma variável em java tem que ser 
	// obrigatoriamente inicializada!
		
	// Uma estrutura de controle tem seu própio escopo
	// E toda variável quer ser declarado dentro da estrutura
	// A mesma só vai existir durante a execução da estrutura
		
		double price = 400.00;
		
		double discount = 0;
		
		if (price < 200.00) {
			discount = price * 0.1;
		}
		else {
			discount = 0;
		}
		
			
	System.out.println(discount);
 
	}

}
