
package servicios.base;


public class ConDesinfeccion extends ServicioAdicional {
    public ConDesinfeccion(ServicioLimpieza base) { super(base); }
    public double calcularPrecioFinal() { return servicioBase.calcularPrecioFinal() + 15.00; }
}
