package java;

public class Direccion {
    
        private String calle;
        private String colonia;
        private String ciudad;
        private String cp; //código postal
    
        public Direccion(String calle, String colonia, String ciudad, String cp, String nombre, String curp, String rfc) {
            this.calle = calle;
            this.colonia = colonia;
            this.ciudad = ciudad;
            this.cp = cp;
        }
    
        public Direccion() {
        }
    
        public Direccion(String calle, String colonia, String ciudad, String cp) {
            this.calle = calle;
            this.colonia = colonia;
            this.ciudad = ciudad;
            this.cp = cp;
        }
    
        public String getCalle() {
            return calle;
        }
    
        public void setCalle(String calle) {
            this.calle = calle;
        }
    
        public String getColonia() {
            return colonia;
        }
    
        public void setColonia(String colonia) {
            this.colonia = colonia;
        }
    
        public String getCiudad() {
            return ciudad;
        }
    
        public void setCiudad(String ciudad) {
            this.ciudad = ciudad;
        }
    
        public String getCp() {
            return cp;
        }
    
        public void setCp(String cp) {
            this.cp = cp;
        }
    
}