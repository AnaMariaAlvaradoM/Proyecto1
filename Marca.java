package java;

public class Marca {

    private String nom_marca;
    private String modelo;
    private String anio_l;      
    private String cod_ident;  

    public Marca(String nom_marca, String modelo, String anio_l, String cod_ident) {
        this.nom_marca = nom_marca;
        this.modelo = modelo;
        this.anio_l = anio_l;
        this.cod_ident = cod_ident;
    }

    public Marca() {
    }

    public String getNom_marca() {
        return nom_marca;
    }

    public void setNom_marca(String nom_marca) {
        this.nom_marca = nom_marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAnio_l() {
        return anio_l;
    }

    public void setAnio_l(String anio_l) {
        this.anio_l = anio_l;
    }

    public String getCod_ident() {
        return cod_ident;
    }

    public void setCod_ident(String cod_ident) {
        this.cod_ident = cod_ident;
    }

}