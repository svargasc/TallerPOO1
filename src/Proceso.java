import javax.swing.JOptionPane;

//se crea la clase proceso
class Proceso{
// dentro de la clase se crearan las variables numer,i,neg,par de manera global,para asi poder ser utilizadas en los metodos
	int numer;
	int i,neg=0, par=0;

	// se crea el metodo 'entrada' que es el que llevara los demas metodos
	public void entrada() {
	//dentro del metodo se creara un ciclo con dos condicionales, el ciclo se encargara de repetir el proceso de pedir un numero 
	//y tambien los dos condicionales, este proceso se repitira 5 veces, los condicionales tendran como condicion el numero y verificaran
	//si este es par o es negativo, tambien cuentan con un contador, que ira incrementado a medida que se digite un numero par o negativo
	for (int i = 0; i < 5; i++) {
			numer = ingresarDatos("Digite 1 numero");
		if (numer%2==0) {
			par++;
		}		
		if (numer<0) {
			neg++;
		}
	}
	// el joptionpane se encagara de mostrar un mensaje, el cual indicara el numero de pares y negativos que se digitaron
	JOptionPane.showMessageDialog(null,"el nunmero de numeros pares es: "+ par + "\n"
			+" y el numero de numeros negativos es: "+neg);
	
	}
	//este metodo estara en caragado de pedir el numero, asi mismo de hacer su conversion de cadena de texto a numero entero
	// y finalmente retornara como valor el numero que se digito.
	public static int ingresarDatos(String mensaje) {
		String cadena;
		int valor;
		cadena = JOptionPane.showInputDialog(null,mensaje);
		valor = Integer.parseInt(cadena);
		return valor;
	}
}
