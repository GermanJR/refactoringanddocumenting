package es.cipfpbatoi.ed.refactoringanddocumenting;

/**
 * Hello world!
 *
 */
public class App 
{
	public static boolean esMajorDeEdad(int edad)
	{
		return edad >= 18;
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Bienvenido al Programa" );
        
        Estudiante es = new Estudiante(10,"pepe");
        
        if ( esMajorDeEdad (es.e) ) {
        	System.out.println("El estudiante " + es.n + " es mayor de edad");
        } else {
        	System.out.println("El estudiante " + es.n + " es menor de edad");
        }
        
    }
}
