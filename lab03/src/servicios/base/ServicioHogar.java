
package servicios.base;


public class ServicioHogar extends ServicioBase {
    private boolean esApartamento;

    public ServicioHogar(String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente, boolean esApartamento) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.esApartamento = esApartamento;
    }

    @Override
    public double calcularPrecioFinal() {
        double precio = calcularPrecioBase();
        if (esApartamento) precio *= 0.9;
        return precio;
    }
}



