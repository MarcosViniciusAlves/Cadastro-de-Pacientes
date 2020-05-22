package main;
import classes.*;
public class JavaMain {
    public static void main(String[] args) {
        Paciente pc1 = new Paciente("Robervaldo",20);
        pc1.setAlaDoPaciente(AlaDoPaciente.ALA_GRAVE);
        pc1.setGravidadeDoPaciente(GravidadeDoPaciente.GRAVE);
        pc1.setSexoDoPaciente(SexoDoPaciente.MASCULINO);
        pc1.setTipoDeSangue(TipoDeSangue.TIPO_ON);

        pc1.relatorioDoPaciente();
    }
}
