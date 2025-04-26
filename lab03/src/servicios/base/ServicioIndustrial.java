
package servicios.base;


public class ServicioIndustrial extends ServicioBase {
    private double multiplicadorRiesgo;

    public ServicioIndustrial(String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente, double multiplicadorRiesgo) {
        super(direccionCliente, duracionHoras, tarifaHora, incluyeMateriales, nombreCliente);
        this.multiplicadorRiesgo = multiplicadorRiesgo;
    }

    @Override
    public double calcularPrecioFinal() {
        if (!incluyeMateriales) {
            throw new IllegalArgumentException("El servicio industrial requiere incluir materiales.");
        }
        return calcularPrecioBase() * multiplicadorRiesgo;
    }
}
