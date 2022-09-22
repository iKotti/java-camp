public class Main {
    public static void main(String[] args) {

        Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescription("Huawei Laptop");
        product.setPrice(17000);
        product.setStockAmount(10);

        Product product2 = new Product(2, "Telefon", "Apple telefon", 40000, 250);

        ProductManager productManager = new ProductManager();
        productManager.add(product);
        productManager.add(product2);
    }
}