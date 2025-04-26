
package servicios.base;

public class ServicioOficina extends ServicioBase {
    private int cantidadEmpleados;

    public ServicioOficina(String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente, int cantidadEmpleados) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.cantidadEmpleados = cantidadEmpleados;
    }

    @Override
    public double calcularPrecioFinal() {
        double duracionTotal = duracionHoras + (cantidadEmpleados * 0.1);
        return duracionTotal * tarifaHora * 1.18;
    }
}