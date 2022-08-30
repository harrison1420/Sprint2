package Sprint2;

public class MovinientoDeDinero extends Empresa{

    private double MontoDelMovimiento;
    private boolean CrearMontos;
    private String ConceptoDelMovimirnto;

    public MovinientoDeDinero(String nombre, String direccion, double telefono,
                              int nit, double montoDelMovimiento, boolean crearMontos,
                              String conceptoDelMovimirnto, String encargado) {
        super(nombre, direccion, telefono, nit);
        MontoDelMovimiento = montoDelMovimiento;
        CrearMontos = crearMontos;
        ConceptoDelMovimirnto = conceptoDelMovimirnto;
        Encargado = encargado;
    }

    public double getMontoDelMovimiento() {
        return MontoDelMovimiento;
    }

    public void setMontoDelMovimiento(double montoDelMovimiento) {
        MontoDelMovimiento = montoDelMovimiento;
    }

    public String getConceptoDelMovimirnto() {
        return ConceptoDelMovimirnto;
    }

    public void setConceptoDelMovimirnto(String conceptoDelMovimirnto) {
        ConceptoDelMovimirnto = conceptoDelMovimirnto;
    }
    public String Encargado(){

        return "Encargado";
    }

}
