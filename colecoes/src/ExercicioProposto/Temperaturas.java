package ExercicioProposto;

import java.util.Arrays;
import java.util.List;

public class Temperaturas{

    public int grausCelcius;
    public List<String> mes =Arrays.asList("Janeiro","Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro");

    public int calcularMediaSemestral(){

        return grausCelcius/6;
    }



}
