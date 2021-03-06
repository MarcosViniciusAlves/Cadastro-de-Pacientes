package classes;

public class Paciente {
    private String nome;
    private int idade;
    private SexoDoPaciente sexoDoPaciente;
    private TipoDeSangue tipoDeSangue;
    private AlaDoPaciente alaDoPaciente;
    private GravidadeDoPaciente gravidadeDoPaciente;

    public Paciente () {}

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void relatorioDoPaciente(){
        System.out.println("Nome do paciente: "+this.nome);
        System.out.println("Idade do paciente: "+this.idade);
        System.out.println("Sexo do paciente: "+this.sexoDoPaciente.getNome());
        System.out.println("Tipo Sanguineo: "+this.tipoDeSangue.getSangue()+" | Id do Sangue "+this.tipoDeSangue.getId());
        System.out.println("Ala em que o paciente se encontra: "+this.alaDoPaciente.getAla()+" | Id da Ala "+this.alaDoPaciente.getId());
        System.out.println("Gravidade do paciente: "+this.gravidadeDoPaciente.getNome());
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
