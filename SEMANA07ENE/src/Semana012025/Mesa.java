package Semana012025;

import java.util.Objects;

public class Mesa {
	
	private int peso;
	private String color;
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Mesa(int peso, String color) {
		super();
		this.peso = peso;
		this.color = color;
	}
	@Override
	public String toString() {
		return "Mesa [peso=" + peso + ", color=" + color + "]";
	} //Override del metodo heredado de la superclase Object.
	
	
	@Override
	public int hashCode() {
		return Objects.hash(color, peso);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Mesa other = (Mesa) obj;
		return Objects.equals(color, other.color) && peso == other.peso;
	}
	
	

}
