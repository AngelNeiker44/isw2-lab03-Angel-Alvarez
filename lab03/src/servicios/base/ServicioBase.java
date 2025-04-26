
package servicios.base;


public class ServicioBase implements ServicioLimpieza{
    protected String direccionCliente;
    protected double duracionHoras;
    protected double tarifaHora;
    protected boolean incluyeMateriales;
    protected String nombreCliente;

    public ServicioBase(String direccionCliente, double duracionHoras, double tarifaHora, boolean incluyeMateriales, String nombreCliente) {
        this.direccionCliente = direccionCliente;
        this.duracionHoras = duracionHoras;
        this.tarifaHora = tarifaHora;
        this.incluyeMateriales = incluyeMateriales;
        this.nombreCliente = nombreCliente;
    }

    public String getNombreCliente() { return nombreCliente; }
    public String getDireccionCliente() { return direccionCliente; }
    public double getDuracionHoras() { return duracionHoras; }
    public double getTarifaHora() { return tarifaHora; }
    public boolean isIncluyeMateriales() { return incluyeMateriales; }

    protected double calcularPrecioBase() {
        return duracionHoras * tarifaHora;
    }

    @Override
    public double calcularPrecioFinal() {
 
        return 0;
 
    }
    
}
