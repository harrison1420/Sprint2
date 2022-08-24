package Sprint2;

public class Empleado extends Empresa {

    private String nombreEmpleado;
    private String correo;
    private String EmpresaEmpleado;
    private String RolEmpleado;

    public Empleado(String nombre, String direccion, double telefono, int nit,
                    String nombreEmpleado, String correo, String empresaEmpleado,
                    String rolEmpleado) {
        super(nombre, direccion, telefono, nit);
        this.nombreEmpleado = nombreEmpleado;
        this.correo = correo;
        EmpresaEmpleado = empresaEmpleado;
        RolEmpleado = rolEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEmpresaEmpleado() {
        return EmpresaEmpleado;
    }

    public void setEmpresaEmpleado(String empresaEmpleado) {
        EmpresaEmpleado = empresaEmpleado;
    }

    public String getRolEmpleado() {
        return RolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        RolEmpleado = rolEmpleado;
    }
}
