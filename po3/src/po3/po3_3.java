package po3;

public class po3_3 {


	private String nombre;
	private int edad;
	private double calificacion;

	 public po3_3(){
		 nombre = "jose";
		 edad = 17;
		 calificacion = 7.32;
	 }
	public void setnombre(String nombre) {
		this.nombre=nombre;
	}
	public void setedad(int edad) {
		this.edad=edad;
	}
	public void setcalificacion(double calificacion) {
		this.calificacion=calificacion;
	}
	public String getnombre() {
		return nombre;
	}
	public int getedad() {
		return edad;
	}
	public double getcalificacion(){
		return calificacion;
	}
}