package udemy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class listas {

    public static void main(String[] args) {

        // Tamanho da lista
        // list.size(); -> retorna a quantidade de elementos

        // Acessar elemento por posição
        // list.get(posicao); -> retorna o elemento naquela posição

        // Inserir elementos
        // list.add(obj); -> adiciona no final
        // list.add(posicao, obj); -> insere na posição indicada

        // Remover elementos
        // list.remove(obj); -> remove o primeiro que for igual ao obj
        // list.remove(posicao); -> remove pelo índice
        // list.removeIf(predicado); -> remove se a condição for verdadeira

        // Encontrar posição de um elemento
        // list.indexOf(obj); -> retorna a primeira ocorrência
        // list.lastIndexOf(obj); -> retorna a última ocorrência

        // Filtrar elementos com base em condição
        // List<Integer> result = list.stream().filter(x -> x > 4).collect(Collectors.toList());

        // Encontrar o primeiro elemento que satisfaça uma condição
        // Integer result = list.stream().filter(x -> x > 4).findFirst().orElse(null);

        // Lista para texto (String, não aceita primitivos, somente Wrapper class String)
        // Precisa instanciar a lista (ArrayList)
        List<String> list = new ArrayList<>();

        // Adicionando elementos na lista
        list.add("Java");
        list.add("PHP");
        list.add("C++");
        list.add("C#");
        list.add("Ruby");

        // Inserindo um elemento na posição 2
        list.add(2, "C");

        // Para ver o tamanho da lista
        System.out.println((list.size()));

        // Para rodar a lista
        for (String x : list) {
            System.out.println(x);
        }

        // Remover elementos que atendam um predicado
        // Exemplo removendo todos os elementos que começam com a letra "J"
        System.out.println("-------------");
        list.removeIf(x -> x.charAt(0) == 'J');

        for (String x : list) {
            System.out.println(x);
        }

        System.out.println("-------------");

        // Encontrar a posição de um elemento
        System.out.println("Index of Java: " + list.indexOf("Java"));
        System.out.println("Index of Javascript: " + list.indexOf("Javascript"));

        System.out.println("-------------");

        // Deixar na lista quem começa com a letra 'C'
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());

        for (String x : result) {
            System.out.println(x);
        }

        // Corrigido: Encontrar quem começa com 'R', sem considerar maiúsculas ou minúsculas
        System.out.println("-------------");
        List<String> resultR = list.stream()
            .filter(x -> x.toUpperCase().charAt(0) == 'R') // Comparação sem diferenciar maiúsculas/minúsculas
            .collect(Collectors.toList());

        for (String x : resultR) {
            System.out.println(x);
        }

    }
}
