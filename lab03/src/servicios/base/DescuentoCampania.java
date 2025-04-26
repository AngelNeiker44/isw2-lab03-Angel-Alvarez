
package servicios.base;


public class DescuentoCampania implements Descuento {
    public double aplicarDescuento(double monto) {
        return monto * 0.85;
    }
}
