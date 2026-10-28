public class CotizadorEnvios {
    public double cotizarEnvios(Transportista transportista, double pesoKg, double distanciaKm){
        System.out.println("--------------------------------------------------");
        System.out.println("Cotizando con: " + transportista.getNombreEmpresa());


        double costoTotal = transportista.calcularCostoEnvio(pesoKg, distanciaKm);

        return costoTotal;
    }


}
