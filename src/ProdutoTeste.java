public class ProdutoTeste {

    public static void main(String[] args) {

        Produto produto = new Produto();
        produto.setId(0);
        produto.setPreco(10000);
        produto.setNome("Iphone 17 Pro Max");

        System.out.println("O valor do seu ID é " + produto.getId());
        System.out.println("O nome é do produto é " + produto.getNome());
        System.out.println("O preço é " + produto.getPreco() + " mil reais");

    }

}
