public class EnvioExpressAereo extends Transportista{
    public EnvioExpressAereo(double tarifaBase, String nombreEmpresa){
        super(tarifaBase);
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public double calcularCostoEnvio(double pesoKg, double distanciaKm) {
        double costo = tarifaBase + (pesoKg * 6.5) + (distanciaKm * 1.80);
        System.out.println("Aplicando tarifa postal estandar");
        return costo;
    }
}
