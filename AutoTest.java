package pruebajs;
public class AutoTest {
      public static void main(String[] args) {
        Propietario m=new Propietario();
      m.setNombre("Ana");
        m.setRfc("147541POYR");
        m.setCurp("XXXXXX11111)");
        
        Direccion dir1=new Direccion();
        dir1.setCalle("perez");
        dir1.setColonia("Chap");
        dir1.setCiudad("Bogotá");
        dir1.setCp("111111");
        
        
        Auto auto=new Auto();
        auto.setModelo("Spark");
        auto.setColor("Negro");
        auto.setAnio("2017");
        auto.setMarca("Ferrari");
        auto.setChasis("Asdscdc44");
        
        hombre.aut=auto;
        hombre.dir=dir1;
        hombre.mostrar();
    }
}