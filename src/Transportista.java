public abstract class Transportista {
    protected double tarifaBase;
    protected String nombreEmpresa;
    public Transportista(double tarifaBase){
        this.tarifaBase = tarifaBase;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public abstract double calcularCostoEnvio(double pesoKg, double distanciaKm);
}
