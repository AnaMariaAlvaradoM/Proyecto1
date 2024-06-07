package java;
public class Auto {

private String modelo;
    private String color;
    private String anio; //Año
    private String marca;
    private String chasis;
    private String propietario;
    private int vel_lmax;
    private int vel_act;
    private int num_p; //Número de puertas
    private String techo_solar;// ¿Tienes un techo solar?
    private int num_marcha; // Número de Marchas
    private String trans_aut; // Transmisión automática
    private double vol_comb;// volumen de combustible

    
    public Auto() {
    }

    public Auto(String modelo, String color, String anio, String marca, String chasis, String propietario, int vel_lmax, int vel_act, int num_p, String techo_solar, int num_marcha, String trans_aut, double vol_comb, String nombre, String curp, String rfc) {
        this.modelo = modelo;
        this.color = color;
        this.anio = anio;
        this.marca = marca;
        this.chasis = chasis;
        this.propietario = propietario;
        this.vel_lmax = vel_lmax;
        this.vel_act = vel_act;
        this.num_p = num_p;
        this.techo_solar = techo_solar;
        this.num_marcha = num_marcha;
        this.trans_aut = trans_aut;
        this.vol_comb = vol_comb;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public int getVel_lmax() {
        return vel_lmax;
    }

    public void setVel_lmax(int vel_lmax) {
        this.vel_lmax = vel_lmax;
    }

    public int getVel_act() {
        return vel_act;
    }

    public void setVel_act(int vel_act) {
        this.vel_act = vel_act;
    }

    public int getNum_p() {
        return num_p;
    }

    public void setNum_p(int num_p) {
        this.num_p = num_p;
    }

    public String getTecho_solar() {
        return techo_solar;
    }

    public void setTecho_solar(String techo_solar) {
        this.techo_solar = techo_solar;
    }

    public int getNum_marcha() {
        return num_marcha;
    }

    public void setNum_marcha(int num_marcha) {
        this.num_marcha = num_marcha;
    }

    public String getTrans_aut() {
        return trans_aut;
    }

    public void setTrans_aut(String trans_aut) {
        this.trans_aut = trans_aut;
    }

    public double getVol_comb() {
        return vol_comb;
    }

    public void setVol_comb(double vol_comb) {
        this.vol_comb = vol_comb;
    }
    
    public int aceleración(){
         vel_act= vel_lmax+1;
        return vel_act;
    }
    
    public int frenado(){
        vel_lmax=0;
        vel_act=vel_lmax;
        return 0;
    }
    
    public int cambioMarcha(){
        num_marcha=num_marcha+1;
        return num_marcha;
    }
    
    public int rMarcha(){
        if (vel_act>0){
            System.out.println("Error de marcha");
        }else
        num_marcha=num_marcha-1;
            return num_marcha;
    }
    
    public double autonomía(){
        return (vol_comb*100)/vel_act;
    }
    public void vol_combustible (){
        System.out.println("volimen de Combiustible: "+getVol_comb());
    }

}