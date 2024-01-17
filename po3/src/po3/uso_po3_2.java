package po3;

public class uso_po3_2 {
	public static void main(String[] args) {
			// TODO Auto-generated method stub
	po3_2 cuenta = new po3_2();

	cuenta.setsaldo(20000.00);
	cuenta.settitular("samuel beltre");

	System.out.println("titular de la cuenta: "+ cuenta.gettitular());
	System.out.println("saldo de la cuenta: "+ cuenta.getsaldo());

		}

	}