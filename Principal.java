public class Principal{

	private String nombre;
	private int edad;

	public String getNombre(){
	return nombre;
}
	public void setNombre(String n){
	nombre = n;
}
	public int getEdad(){
	return edad;
}
	public void setEdad(int e){
	edad = e;
}


public static void main(String[] args){
	Principal p1 = new Principal;
	System.out.println("Nombre: "+p1.getNombre());
	System.out.println("Edad: "+p1.getEdad());
}



}
