package curso_programacao;

public class Main2 {

    public static void main(String[] args) {
        
        // Declaração de duas variáveis inteiras x e y
        int x, y;

        // Atribuição de valores às variáveis
        x = 5;
        y = 2 * x; // y recebe o dobro de x (2 * 5 = 10)

        // Exibe os valores de x e y no console
        System.out.println(x); // Saída: 5
        System.out.println(y); // Saída: 10

        // Declaração de uma variável inteira c e uma variável double v
        int c;
        double v;

        // Atribuição de valores
        c = 5;
        v = 2 * x; // v recebe o dobro de x (igual ao valor de y)

        // Exibe os valores de c e v
        System.out.println(c); // Saída: 5
        System.out.println(v); // Saída: 10.0 (double)

        // Declaração de variáveis para cálculo da área de um trapézio
        double b, B, h, area;

        // Atribuição de valores às bases e à altura
        b = 6.0; // Base menor
        B = 8.0; // Base maior
        h = 5.0; // Altura

        // Cálculo da área do trapézio: (b + B) / 2 * h
        area = (b + B) / 2.0 * h;

        // Exibe a área do trapézio
        System.out.println(area); // Saída esperada: 35.0

        // Declaração de variáveis para divisão de inteiros resultando em double
        int u, i;
        double resultado;

        u = 5;
        i = 2;

        // Conversão explícita (casting) para garantir resultado decimal na divisão
        resultado = (double) u / i; 

        // Exibe o resultado da divisão
        System.out.println(resultado); // Saída esperada: 2.5
        
        // Declaração de variáveis para exemplo de cast
        double l;
        int n;

        l = 5.0; // l é um valor decimal
        n = (int) l; // Converte l para inteiro (cast), o valor 5.0 será truncado para 5

        // Exibe o valor de n após o cast
        System.out.println(n); // Saída esperada: 5
    }
}
