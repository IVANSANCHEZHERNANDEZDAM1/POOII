package po3;

public class po3_4 {

	private String nombre;
	private double precio;
	private int stock;

	public po3_4(){
		nombre = "escritorio spaco";
		precio = 150.00;
		stock = 1100;
	}
	public void setnombre(String nombre) {
		this.nombre=nombre;
	}
	public void setprecio(double precio) {
		this.precio=precio;
	}
	public void setstock(int stock) {
		this.stock=stock;
	}
	public String getnombre() {
		return nombre;
	}
	public double getprecio() {
		return precio;
	}
	public int getstock() {
		return stock;
	}
	}