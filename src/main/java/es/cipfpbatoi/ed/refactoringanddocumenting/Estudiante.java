package es.cipfpbatoi.ed.refactoringanddocumenting;

public class Estudiante{
	
	int edad;
	String nom;
	
	
	public Estudiante(int edad, String nom) {
		this.edad = edad;
		this.nom = nom;
	}

	public int compararAmb( Estudiante estudiant) {
		
		if (this.edad == estudiant.edad){
			return 0;
		} else if (this.edad > estudiant.edad) {
			return 1;
		} else {
			return -1;
		}
	}
	
}
