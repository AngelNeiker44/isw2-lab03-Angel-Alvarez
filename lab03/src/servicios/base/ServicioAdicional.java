
package servicios.base;


public abstract class ServicioAdicional implements ServicioLimpieza {
    protected ServicioLimpieza servicioBase;

    public ServicioAdicional(ServicioLimpieza servicioBase) {
        this.servicioBase = servicioBase;
    }

    public String getNombreCliente() { return servicioBase.getNombreCliente(); }
    public String getDireccionCliente() { return servicioBase.getDireccionCliente(); }
}
