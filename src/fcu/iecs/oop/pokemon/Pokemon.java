package fcu.iecs.oop.pokemon;

public class Pokemon {
	
	private final String name;
	private int cp;
	
	public Pokemon(String name, int cp){
		this.name = name;
		this.cp = cp;
	}
	
	public String getNAME(){
		return name;
	}
	
	public int getCP(){
		return cp;
	}
	
	public void setCP(int cp){
		this.cp = cp;
	}
}
