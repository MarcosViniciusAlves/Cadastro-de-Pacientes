package classes;

public class Paciente {
    private String nome;
    private int idade;
    private SexoDoPaciente sexoDoPaciente;
    private TipoDeSangue tipoDeSangue;
    private AlaDoPaciente alaDoPaciente;
    private GravidadeDoPaciente gravidadeDoPaciente;

    public Paciente () {}

    public Paciente(String nome, int idade, SexoDoPaciente sexoDoPaciente, TipoDeSangue tipoDeSangue, AlaDoPaciente alaDoPaciente, GravidadeDoPaciente gravidadeDoPaciente) {
        this.nome = nome;
        this.idade = idade;
        this.sexoDoPaciente = sexoDoPaciente;
        this.tipoDeSangue = tipoDeSangue;
        this.alaDoPaciente = alaDoPaciente;
        this.gravidadeDoPaciente = gravidadeDoPaciente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public SexoDoPaciente getSexoDoPaciente() {
        return sexoDoPaciente;
    }

    public void setSexoDoPaciente(SexoDoPaciente sexoDoPaciente) {
        this.sexoDoPaciente = sexoDoPaciente;
    }

    public TipoDeSangue getTipoDeSangue() {
        return tipoDeSangue;
    }

    public void setTipoDeSangue(TipoDeSangue tipoDeSangue) {
        this.tipoDeSangue = tipoDeSangue;
    }

    public AlaDoPaciente getAlaDoPaciente() {
        return alaDoPaciente;
    }

    public void setAlaDoPaciente(AlaDoPaciente alaDoPaciente) {
        this.alaDoPaciente = alaDoPaciente;
    }

    public GravidadeDoPaciente getGravidadeDoPaciente() {
        return gravidadeDoPaciente;
    }

    public void setGravidadeDoPaciente(GravidadeDoPaciente gravidadeDoPaciente) {
        this.gravidadeDoPaciente = gravidadeDoPaciente;
    }
}
