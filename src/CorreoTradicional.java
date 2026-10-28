public class CorreoTradicional extends Transportista{
    public CorreoTradicional(double tarifaBase, String nombreEmpresa){
        super(tarifaBase);
        this.nombreEmpresa = nombreEmpresa;
    }

    @Override
    public double calcularCostoEnvio(double pesoKg, double distanciaKm) {
       double costo = tarifaBase + (pesoKg * 1.5) + (distanciaKm * 0.25);
       System.out.println("Aplicando tarifa postal estandar");
       return costo;
    }
}
