package futbol;

public abstract class Futbolista implements Comparable<Futbolista>{
	private static  String nombre;
	private static  int edad;
	private static String posicion;
	
	public Futbolista(String nombre, int edad, String posicion) {

		nombre = "Maradona";
		posicion = "Delantero";
		edad = 30;
	}
	public boolean f(String a){
		 return true;
	}
	public  boolean jugarConLasManos() {
		return true ; 	
	}
	
	public static void main(String args[]) {

		System.out.println("El futbolista " + nombre + " tiene " + edad + ", y juega de "+ posicion);	
	}
	
	//getters 
	public String getNombre(){
		return nombre;
	}
	public String getPosicion() {
		return posicion;
	}
	public int getEdad() {
		return edad;
	}
	
	// setters
	
	
	//public void setNombre(String nombre) {
	//	this.nombre = nombre; 	
	//}
	//public void setPosicion(String posicion) {
	//	this.posicion = posicion;
	//}
	//public void setEdad(int edad) {
	//	this.edad = edad;
	//}
	

	

}
