package ExercicioProposto;

import java.util.Arrays;
import java.util.List;

public class Temperaturas extends Program{
    Program pg = new Program();


//    @Override
//    public String toString() {
//        return "Temperaturas{" +
//                "grausCelcius=" + grausCelcius +
//                ", mes='" +  + '\'' +
//                ", mediaSemestral=" + mediaSemestral +
//                '}';
//    }

    public Integer grausCelcius;
    public List<String> mesesDoAno = Arrays.asList("Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho","Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro");
    public Integer mediaSemestral;

    public Integer calcularTemperaturaMediaSemestral(Integer grausCelcius){

        this.grausCelcius += grausCelcius;
        return grausCelcius;
    }

    public void conferirMes(int temperaturas){
        mesesDoAno.get(temperaturas);
    }
}
