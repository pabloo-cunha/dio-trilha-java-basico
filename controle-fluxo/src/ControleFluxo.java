public class ControleFluxo {
    public static void main(String[] args) {

        ifFlecha();
        ifSemFlecha();
        ifFerias();
        ifMenor();

        switchSemana();
        switchNumero();
        switchFerias();
    }

    private static void ifFlecha() {
        int mes = 9;
        if (mes == 1) {
            System.out.println("Janeiro");
        }else {
            if (mes == 2){
                System.out.println("Fevereiro");
            }else {
                if (mes == 3){
                    System.out.println("Março");
                }else {
                    if (mes == 4){
                        System.out.println("Abril");
                    }else {
                        if (mes == 5){
                            System.out.println("Maior");
                        }else {
                            if (mes == 6){
                                System.out.println("Junho");
                            }else{
                                if (mes ==7){
                                    System.out.println("Julho");
                                }else {
                                    if (mes == 8){
                                        System.out.println("Agosto");
                                    }else {
                                        if (mes == 9){
                                            System.out.println("Setembro");
                                        }else {
                                            if (mes == 10){
                                                System.out.println("Outubro");
                                            }else {
                                                if (mes == 11){
                                                    System.out.println("Novembro");
                                                }else {
                                                    if (mes == 12){
                                                        System.out.println("Dezembro");
                                                    }else {
                                                        System.out.println("Somente de 1 a 12");
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }

    }

    private static void ifSemFlecha(){

        int mes = 9;
        if (mes == 1){
            System.out.println("Janeiro");
        } else if (mes == 2){
            System.out.println("Fevereiro");
        } else if (mes == 3){
            System.out.println("Março");
        } else if (mes == 4){
            System.out.println("Abril");
        } else if (mes == 5){
            System.out.println("Maio");
        } else if (mes == 6){
            System.out.println("Junho");
        }else if (mes == 7){
            System.out.println("Julho");
        }else if (mes == 8){
            System.out.println("Agosto");
        }else if (mes == 9){
            System.out.println("Setembro");
        }else if (mes == 10){
            System.out.println("Outubro");
        }else if (mes == 11){
            System.out.println("Novembro");
        }else if (mes == 12){
            System.out.println("Dezembro");
        }else {
            System.out.println("Mês não existe!");
        }
    }

    private static void ifFerias(){

        String mes = "Julho";
        if (mes == "Julho" || mes == "dezembro" || mes == "Janeiro"){
            System.out.println("Ferias!");
        }else {
            System.out.println("Em serviço");
        }
    }

    private static void ifMenor(){

        double salarioMensal = 11893.58d;
        double mediaSalarial = 10500d;

        int quantidadeDependentes = 4;
        int mediaDependentes = 2;

        if ((salarioMensal < mediaSalarial) && (quantidadeDependentes >= mediaDependentes)){
            System.out.println("Funcionario deve receber o auxilio");
        }

        boolean salarioBaixo = salarioMensal < mediaSalarial;
        boolean muitosdependentes = quantidadeDependentes >= mediaDependentes;

        if ((salarioBaixo)&&(muitosdependentes)){
            System.out.println("Funcionario deve receber o auxilio");
        }

        boolean recebeAuxilio = (salarioBaixo)&&(muitosdependentes);
        if (recebeAuxilio){
            System.out.println("Funcionario deve receber auxilio");
        } else {
            System.out.println("Funcionario não deve receber auxilio");
        }
    }

    private static void switchSemana(){

        String dia = "Quinta";
        switch (dia){
            case "Segunda":
                System.out.println(2);
                break;
            case "Terça":
                System.out.println(3);
                break;
            case "Quarta":
                System.out.println(4);
                break;
            case "Quinta":
                System.out.println(5);
                break;
            case "Sexta":
                System.out.println(6);
                break;
            case "Sabado":
                System.out.println(7);
                break;
            case "Domingo":
                System.out.println(8);
                break;
            default:
                System.out.println("Dia Invalido");
                    break;
        }
    }

    private static void switchNumero(){

        int numero = 4;
        switch (numero){
            case 1:
            case 2:
            case 3:
            System.out.println("Certo");
            break;
            case 4:
                System.out.println("Errado");
                break;
            case 5:
                System.out.println("Talvez");
                break;
            default:
                System.out.println("Valor indefinido");
                break;
        }
    }

    private static void switchFerias(){

        String mes = "dezembro";
        switch (mes){
            case "dezembro":
            case "julho":
            case "janeiro":
                System.out.println("Férias!");
                break;
            default:
                System.out.println("Nada consta!");
                break;
        }
    }
}
