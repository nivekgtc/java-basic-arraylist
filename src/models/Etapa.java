package models;

public class Etapa {

    private String pais, praia;

    public Etapa(String pais, String praia) {
        this.pais = pais;
        this.praia = praia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getPraia() {
        return praia;
    }

    public void setPraia(String praia) {
        this.praia = praia;
    }
}
