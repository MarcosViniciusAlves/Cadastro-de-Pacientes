package classes;

public enum TipoDeSangue {
    TIPO_A("A","S.A"),TIPO_AN("-A","S.A-"),TIPO_B("B","S.B"),TIPO_BN("-B","S.B-"),TIPO_O("O","S.O"),TIPO_ON("-O","S.O-"),TIPO_AB("AB","S.AB"),TIPO_ABN("-AB","S.AB-");

    private String sangue;
    private String id;

    TipoDeSangue ( String sangue , String id) {
        this.sangue = sangue;
        this.id = id;
    }

    public String getSangue() {
        return sangue;
    }

    public String getId() {
        return id;
    }
}
