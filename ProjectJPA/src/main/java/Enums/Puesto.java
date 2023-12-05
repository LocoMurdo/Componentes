package Enums;

public enum Puesto {
    GERENTE("Gerente"),
    ANALISTA("Analista"),
    DESARROLLADOR("Desarrollador"),
    TESTER("Tester");

    private final String descripcion;

    Puesto(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }
}