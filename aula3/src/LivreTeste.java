public class LivreTeste {
    public static void main(String[] args) {

        Livro l1 = new Livro("Titulo 1", "Autor 1", 2026, "Editora1");
        System.out.println(
                "\nTítulo: " + l1.getTitulo() +
                "\nAutor: " + l1.getAutor() +
                "\nAno: " + l1.getAno() +
                "\nEditora: " + l1.getEditora()
        );

        System.out.println("\n--------------------------------");

        Livro l2 = new Livro("Título 2", "Autor 2");
        System.out.println(
                "\nTítulo: " + l2.getTitulo() +
                "\nAutor: " + l2.getAutor() +
                "\nAno: " + l2.getAno() +
                "\nEditora: " + l2.getEditora()
        );

        l2.setAno(2025);
        l2.setEditora("Saraiva");


        System.out.println("\n--------------------------------");
        System.out.println(
                "\nTítulo: " + l2.getTitulo() +
                        "\nAutor: " + l2.getAutor() +
                        "\nAno: " + l2.getAno() +
                        "\nEditora: " + l2.getEditora()
        );
    }
}
