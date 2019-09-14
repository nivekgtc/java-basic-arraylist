package models;

public class Patrocinadores {

    private String marca, representante;

    public Patrocinadores(String marca, String representante) {
        this.marca = marca;
        this.representante = representante;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }
}
