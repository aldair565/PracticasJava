package password;
import java.util.Scanner;

public class Password {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.println("Ingresa tu usuario");
		String user = console.nextLine();
		
		System.out.println("Ingresa tu contrase�a");
		String pass = console.nextLine();
		
		System.out.println("Confirma tu contrase�a");
		String passConfirm = console.nextLine();
		
		//int validation = pass.compareTo(passConfirm);
		
		if (pass.equals(passConfirm)) {
			System.out.println("Contrase�a verificada. Bienvenido "+ user);
			
			System.out.println("Ingresa tu calificacion");
			double grade = console.nextDouble();
			int newGrade = (int)grade;
			
			System.out.println("Tu calificacion final es: "+ newGrade);
			
		} else {
			System.out.println("Error");
		}
	}

}
