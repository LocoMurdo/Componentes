package Enums;

public enum Rol {
	ADMINISTRADOR("Administrador"),
	USUARIO("USUARIO");
private final String Descripcion;

  Rol(String descripcion) {
	Descripcion = descripcion;
}

public String getDescripcion() {
	return Descripcion;
}

}
