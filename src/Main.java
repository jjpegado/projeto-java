public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Matche");
        System.out.println("Filme: Top Gun: Maverick");

        int anoDeLancamento = 2022;

        System.out.println("Ano de lançamento: "  + anoDeLancamento);

        boolean incluidoNoPlano =  true;
        double notaDoFilme = 8.1;

        double media = (9.8 +6.3 + notaDoFilme) /3;
        System.out.println(media);

        String sinopes;
        sinopes = """
                Filme Top Gun
                Filme de aventura o galã dos anos 80
                Muio bom!
                Ano de lançamento
                """ + anoDeLancamento;
        System.out.println(sinopes);

        int clasificacao = (int) (media /2);
        System.out.println(clasificacao);

        }

}
