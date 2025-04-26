
package servicios.base;

public class ServicioFactory {
    public static ServicioLimpieza crearServicio(String tipo, String direccion, double horas, double tarifa, boolean materiales, String cliente, Object extra) {
        switch(tipo.toLowerCase()) {
            case "hogar":
                return new ServicioHogar(direccion, horas, tarifa, materiales, cliente, (boolean) extra);
            case "oficina":
                return new ServicioOficina(direccion, horas, tarifa, materiales, cliente, (int) extra);
            case "industrial":
                return new ServicioIndustrial(direccion, horas, tarifa, materiales, cliente, (double) extra);
            default:
                throw new IllegalArgumentException("Tipo no válido");
        }
    }
}

