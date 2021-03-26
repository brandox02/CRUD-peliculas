package ejercicio_5;

import java.util.ArrayList;

class Libros
{
	private String nombre;
	private boolean original;
	private boolean prestable;
	 
	
	private static ArrayList<Libros> coleccionLibros = new ArrayList<Libros>();
	
	public Libros(String nombre,boolean original,boolean prestable)
	{
		this.nombre = nombre;
		this.original = original;
		this.prestable = prestable;
		coleccionLibros.add(this);
	}
	
	public String getNombre() { return this.nombre; }
	
	public  ArrayList<Libros> getOriginal() 
	{ 
		ArrayList<Libros> coleccionLibrosOriginales = new ArrayList<Libros>();
		
		for(Libros es: coleccionLibros)
		{
			if(es.isOriginal())
			{
				coleccionLibrosOriginales.add(es);
			}
		}
		return coleccionLibrosOriginales;
	}
	
	public ArrayList<Libros> getPrestable() 
	{ 
		ArrayList<Libros> coleccionLibrosPrestables = new ArrayList<Libros>();
		
		for(Libros es: coleccionLibros)
		{
			if(es.isPrestable())
			{
				coleccionLibrosPrestables.add(es);
			}
		}
		
		
		return coleccionLibrosPrestables; 
	}
	
	public  ArrayList<Libros> getLibros() { return coleccionLibros; }
	
	public boolean isPrestable() {return this.prestable;}
	
	public boolean isOriginal() { return this.original; } 
	
	public void setNombre(String nombre ) {this.nombre = nombre;}
	
	public void setOriginal(boolean original) {this.original = original; }
	
	public void setPrestable(boolean prestable) {this.prestable = prestable;}
	
	
	
}
