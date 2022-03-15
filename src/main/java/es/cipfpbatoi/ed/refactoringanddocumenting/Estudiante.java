package es.cipfpbatoi.ed.refactoringanddocumenting;

public class Estudiante implements compareTo{
	private static final int MAJORIA_DE_EDAD = 18;
	
	int edad;
	String nom;
	
	
	public Estudiante(int edad, String nom) {
		this.edad = edad;
		this.nom = nom;
	}

	@Override
	public int compararAmb( Estudiante estudiant) {
		
		if (this.edad == estudiant.edad){
			return 0;
		} else if (this.edad > estudiant.edad) {
			return 1;
		} else {
			return -1;
		}
	}
	
	public static boolean esMajorDeEdad(int edad)
	{
		return edad >= MAJORIA_DE_EDAD;
	}
}
