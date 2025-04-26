
package laboratorio;

import servicios.base.*;

public class Lab03 {
    public static void main(String[] args) {
        System.out.println("--- Ejercicio 01 ---");
        ServicioLimpieza hogar = new ServicioHogar("Calle 1", 2, 50, true, "Ana", true);
        ServicioLimpieza oficina = new ServicioOficina("Av. 2", 3, 60, true, "Empresa", 10);
        ServicioLimpieza industrial = new ServicioIndustrial("Planta", 5, 80, true, "Industrias", 1.5);

        System.out.println("Hogar: S/" + hogar.calcularPrecioFinal());
        System.out.println("Oficina: S/" + oficina.calcularPrecioFinal());
        System.out.println("Industrial: S/" + industrial.calcularPrecioFinal());

        System.out.println("\n--- Ejercicio 02 ---");
        Descuento d1 = new DescuentoClienteFrecuente();
        Descuento d2 = new DescuentoCampania();
        System.out.println("Hogar con descuento cliente: S/" + d1.aplicarDescuento(hogar.calcularPrecioFinal()));
        System.out.println("Oficina con descuento campaña: S/" + d2.aplicarDescuento(oficina.calcularPrecioFinal()));

        System.out.println("\n--- Ejercicio 03 ---");
        ServicioLimpieza decorado = new ConDesinfeccion(new ConAromatizante(hogar));
        System.out.println("Hogar decorado: S/" + decorado.calcularPrecioFinal());

        System.out.println("\n--- Ejercicio 04 ---");
        ServicioLimpieza creado = ServicioFactory.crearServicio("hogar", "Jirón 3", 2, 45, true, "Carlos", true);
        System.out.println("Servicio creado: " + creado.getNombreCliente() + ", Precio: S/" + creado.calcularPrecioFinal());
    }
}

