
package servicios.base;

public class ConLimpiezaVidrios extends ServicioAdicional {
    public ConLimpiezaVidrios(ServicioLimpieza base) { super(base); }
    public double calcularPrecioFinal() { return servicioBase.calcularPrecioFinal() + 10.00; }
}