public class Main {

    public static void main(String[] args) {

        //Calculadora
        Calculadora calc = new Calculadora();
        System.out.println("exercicio calculadora: ");

        System.out.println("Resultado da soma: " + calc.soma(3,5));
        System.out.prntln("Resultado da subtração: " + calc.subtracao(6,3));
        System.out.println("Resultado da multiplicacao: " + calc.multiplicacao(3,5));
        System.out.println("Resultado da divisao: " + calc.divisao(3,2.5));

        //Mensagem
        Mensagem.obterMensagem(5);
        Mensagem.obterMensagem(13);
        Mensagem.obterMensagem(21);

        //Emprestimo

        Emprestimo.calcular(1000, 2);
        Emprestimo.calcular(1000, 3);
        Emprestimo.calcular(1000, 5);
    }
}
