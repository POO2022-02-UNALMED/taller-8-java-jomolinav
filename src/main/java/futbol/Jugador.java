package futbol;


public class Jugador extends Futbolista{
	
	public short golesMarcados;
	public byte dorsal;
	

	
	public Jugador(String nombre, int edad, String posicion,
			short golesMarcados, byte dorsal){
				super(nombre, edad, posicion);
				dorsal = 7;
				golesMarcados = 289;
			
			}
	
	public static void main(String args[]) {
				System.out.println("El futbolista");	
			}			
}

