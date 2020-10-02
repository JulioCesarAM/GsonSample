package personas;

public class persona {
	private String nombre;
	private String apellidos;
	private int edad;
	
	persona(){}
	persona(String _nombre, String _apellidos, int _edad){
		super();
		nombre=_nombre;
		apellidos=_apellidos;
		edad=_edad;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellidos;
	}
	public int getEdad() {
		return edad;
	}
	public void setNombre(String _nombre) {
		comprobacionFormatoStrings(_nombre);
		this.nombre=_nombre;
	}
	public void setApellido(String _apellido) {
		comprobacionFormatoStrings(_apellido);
		this.apellidos=_apellido;
	}
	public void setEdad(int _edad) {
		comprobacionFormatoInt(_edad);
		this.edad=_edad;
	}
	public String toString() {
		return nombre+" "+apellidos+" "+edad;
	}
	/**
	 * estos dos metodos los puse para la comprobacion del formado de entrado, pero no tiene mucho sentido
	 * ya que al pasarle los argumentos a los metodos de la clase persona
	 * automatica tirara error si no son del tipo indicado
	 * @param _strings
	 */
	private void comprobacionFormatoStrings(String _strings) {
		if (!String.class.isInstance(_strings)) {
			throw new IllegalArgumentException("formato de texto incorrecto :" +_strings+ "| introduce un Strings");
		}
		
	}
	private void comprobacionFormatoInt(int _edad) {
		 if (!Integer.class.isInstance(_edad)) {
			throw new IllegalArgumentException("formato de edad incorrecot :" +_edad+ "| introduce un valor entero"); 
		 }
		
	}

}
