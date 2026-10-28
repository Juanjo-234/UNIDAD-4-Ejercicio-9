public class TransporteMaritimo extends Transportista{
    public TransporteMaritimo(double tarifaBase, String nombreEmpresa){
        super(tarifaBase);
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public double calcularCostoEnvio(double pesoKg, double distanciaKm) {
        double costo = tarifaBase + (pesoKg * 0.8) + (distanciaKm * 0.10);
        System.out.println("Aplicando tarifa postal estandar");
        return costo;
    }
}
