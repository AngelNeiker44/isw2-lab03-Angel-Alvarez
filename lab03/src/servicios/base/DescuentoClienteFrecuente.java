
package servicios.base;


public class DescuentoClienteFrecuente implements Descuento {
    public double aplicarDescuento(double monto) {
        return monto * 0.90;
    }
}