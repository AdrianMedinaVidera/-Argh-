package Producto;

public class Producto {
	
	private String nombre;
	private int precio;
    private int cantidad;

    public Producto(String nombre, int cantidad, int precio) {
    	this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + ", precio=" + precio + ", cantidad=" + cantidad + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
