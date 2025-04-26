
package servicios.base;

public class ConAromatizante extends ServicioAdicional {
    public ConAromatizante(ServicioLimpieza base) { super(base); }
    public double calcularPrecioFinal() { return servicioBase.calcularPrecioFinal() + 5.00; }
}
