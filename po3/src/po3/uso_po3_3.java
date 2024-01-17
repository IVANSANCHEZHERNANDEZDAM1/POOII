package po3;

public class uso_po3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
po3_3 jose = new po3_3();

jose.setnombre(jose.getnombre());
jose.setedad(jose.getedad());
jose.setcalificacion(jose.getcalificacion());

System.out.println("nombre: "+jose.getnombre());
System.out.println("edad: "+jose.getedad());
System.out.println("calificacion: "+jose.getcalificacion());
	}

}