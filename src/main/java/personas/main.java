package personas;

import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class main {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		persona miPersona=new persona();
		String nombre;
		String apellido;
		int edad;
		Gson gson =new GsonBuilder().setPrettyPrinting().create();
		System.out.println("Introduce el nombre profavor");
		nombre=sc.nextLine();
		miPersona.setNombre(nombre);
		System.out.println("Introduce el apellido profavor");
		apellido=sc.nextLine();
		miPersona.setApellido(apellido);
		System.out.println("Introduce la edad porfavor");
		edad=sc.nextInt();
		miPersona.setEdad(edad);
		String json =gson.toJson(miPersona);
		System.out.println(json);
	}

}
