package es.cipfpbatoi.ed.refactoringanddocumenting;

/**
 * Hello world!
 *
 */
public class App 
{
	private static final int MAJORIA_DE_EDAD = 18;

	public static boolean esMajorDeEdad(int edad)
	{
		return edad >= MAJORIA_DE_EDAD;
	}
	
    public static void main( String[] args )
    {
        System.out.println( "Bienvenido al Programa" );
        
        Estudiante estudiante = new Estudiante(10,"pepe");
        
        if ( esMajorDeEdad (estudiante.edad) ) {
        	System.out.println("El estudiante " + estudiante.nom + " es mayor de edad");
        } else {
        	System.out.println("El estudiante " + estudiante.nom + " es menor de edad");
        }
        
    }
}
