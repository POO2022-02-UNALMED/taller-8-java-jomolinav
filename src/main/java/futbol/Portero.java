package futbol;


public class Portero extends Futbolista{
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, String posicion, short golesRecibidos, byte dorsal){
        super(nombre, edad, posicion );
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
        posicion = "Portero";
    }
    // Print
    public static void main(String args[]) {
		System.out.println("El futbolistaaa " );	
	}

    public short getGolesRecibidos() {
        return golesRecibidos;
    }


    @Override
    public int compareTo(Futbolista arg0) {
        // TODO Auto-generated method stub
        return this.getGolesRecibidos();
    }
}
