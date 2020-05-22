package classes;

public enum SexoDoPaciente {
    MASCULINO(2,"masculino"),FEMININO(1,"feminino");

    private int tipo;

    private String nome;

    SexoDoPaciente (int tipo , String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
}
