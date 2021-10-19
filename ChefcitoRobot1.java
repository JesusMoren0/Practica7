
public class ChefcitoRobot1 extends ChefRobot implements Funciones {
	public boolean acco = false;
	public boolean acci;
	public ChefcitoRobot1() {
		super();
	}
	public String Cortarcarne() {
		acco = true;
		return ("Apoyo uno >>"+ nombre +" << Trabajando en una de mis funciones 8) >>");
	}
	public String Picarverdura() {
		acco = true;
		return ("Apoyo uno >> "+ nombre +" << Trabajando en una de mis funciones 8) >>");
	}
	public String cocinar() {
		acco = true;
		return (" Apoyo uno >> "+ nombre +" << No puedo trabajar en eso, no es de mis funciones 8( >>");
	}
	public String Servir() {
		acco = true;
		return ("Apoyo uno >> "+ nombre +" << No puedo trabajar en eso, no es de mis funciones 8(  >>");
	}
	public String Calentar() {
		acco = true;
		return ("Apoyo uno >> "+ nombre +" << No puedo trabajar en eso, no es demis funciones 8( >>");
	}
}
