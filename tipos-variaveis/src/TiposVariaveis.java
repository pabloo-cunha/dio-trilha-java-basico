public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        String nome = "Pablo";

        float media = 5.6f; //necessario colocar o f
        double media2 = 8.7;

        long estrelasUniverso = 37485930830482L; //necessario colocar o L
        short numeroCurto = 1;

        int numeroNormal = numeroCurto;

        short numeroCurto2 = (short) numeroNormal;//necessario fazer um cast para mudar de int para short

        int numero = 5;
        
        numero = 10;

        final double VALOR_DE_PI = 3.14; //proibe alteração e precisa ser 
        //declarado em CAIXA ALTA
    }
}
