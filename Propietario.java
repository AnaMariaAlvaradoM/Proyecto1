package java;

public class Propietario {
    public String nombre;
    private String curp;
    private String rfc;
    private String fec_nac;
    public  Auto aut;
    public Direccion dir;
       
    public void mostrar(){
        System.out.println("El Propietario "+ nombre + " cuenta con un auto marca: " + aut.getMarca()+ " Modelo: " + aut.getModelo());
        System.out.println("Dirección: "+ dir.getCalle() + " " + dir.getColonia() + " " + "CP "+ dir.getCp() + " Ciudad " + dir.getCiudad());
    }

    public Propietario(String nombre, String curp, String rfc) {
        this.nombre = nombre;
        this.curp = curp;
        this.rfc = rfc;
    }

    public Propietario() {
    }
       
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCurp() {
        return curp;
    }
    
    public void setCurp(String curp) {
        this.curp = curp;
    }

    public String getRfc() {
        return rfc;
    }
    
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getFec_nac() {
        return fec_nac;
    }

    public void setFec_nac(String fec_nac) {
        this.fec_nac = fec_nac;
    }
    
}