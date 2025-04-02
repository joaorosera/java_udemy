package entities; // Define o pacote ao qual esta classe pertence

public class Product {
    
    // Atributos privados da classe Product
    private String name;
    private double price;
    
    // Construtor que inicializa o objeto Product com nome e preço
    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }
    
    // Método getter para obter o nome do produto
    public String getName() {
        return name;
    }
    
    // Método setter para modificar o nome do produto
    public void setName(String name) {
        this.name = name;
    }
    
    // Método getter para obter o preço do produto
    public double getPrice() {
        return price;
    }
    
    // Método setter para modificar o preço do produto
    public void setPrice(double price) {
        this.price = price;
    }
}