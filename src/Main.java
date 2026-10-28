//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    double pesoPaquete = 12.5;
    double distanciaRecorrido = 1400.0;

    System.out.println("=== DATOS DEL PAQUETE A COTIZAR ===");
    System.out.println("Peso: " + pesoPaquete + " kg | Distancia: " + distanciaRecorrido + " km\n");

    Transportista correo = new CorreoTradicional(500, "Correo Argentino / Nacional");
    Transportista express = new EnvioExpressAereo(2500.0, "GlobalAir Express");
    Transportista maritimo = new TransporteMaritimo(1500.0, "TransOcean Cargos");

    List<Transportista> opcionesLogisticas = new ArrayList<>();
    opcionesLogisticas.add(correo);
    opcionesLogisticas.add(express);
    opcionesLogisticas.add(maritimo);

    CotizadorEnvios cotizador = new CotizadorEnvios();

    System.out.println("=== COMPARATIVA DE PRESUPUESTOS LOGÍSTICOS ===");

    for (Transportista t : opcionesLogisticas) {
        double presupuesto = cotizador.cotizarEnvios(t, pesoPaquete, distanciaRecorrido);
        System.out.printf(">> Presupuesto Final: $%,10.2f%n", presupuesto);
        System.out.println();
    }
}

