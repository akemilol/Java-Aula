public class CriarLivros {
    public static void main(String[] args) {

        Livro favorito = new Livro();
        favorito.titulo = "Bleach";
        favorito.editora = "Shusheisha";
        favorito.resumo = "Um garoto ruivo, ganha poderes";
        favorito.tipoCapa = "Capa Dura";
        favorito.paginas = 300;
        favorito.colecao = true;
        System.out.println("Meu livro favorio" + favorito.titulo + " do autor " + favorito.autor +
                " . " + "Sua historia é sobre" + favorito.resumo + ".");
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Informações sobre o produto:" + "/n " + "Editora" + favorito.editora + "/n" +
        favorito.editora + "/n" + "Tipos de capa" + favorito.tipoCapa + "Coleção" + favorito.colecao + "/n" +
                "Número de paginas:" + favorito.paginas + "/n" + "Preços" + favorito.valor) ;
        System.out.println("---------------------------------------------------------------------------------");

    }
}
