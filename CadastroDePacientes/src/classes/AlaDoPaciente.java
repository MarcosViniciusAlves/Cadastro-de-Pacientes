package classes;

public enum AlaDoPaciente {
    ALA_GRAVE(3,"ala grave","C"),ALA_MEDIA(2,"ala media","B"),ALA_LEVE(1,"ala leve","A");

    private int tipo;
    private String ala;
    private String id;

    AlaDoPaciente(int tipo , String ala , String id){
        this.ala = ala;
        this.id = id;
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }

    public String getAla() {
        return ala;
    }

    public String getId() {
        return id;
    }

}
