
public class ChefcitoRobot2 extends ChefRobot implements Funciones{
	public boolean acci = false;
	public boolean acco;
	public ChefcitoRobot2() {
		super();
	}
	public String Cortarcarne() {
		acci = true;
		return ("Apoyo 2 >> "+ nombre +" No puedo trabajar en eso, no es de mis funciones 8( ");
	}
	public String Picarverdura() {
		acci = true;
		return ("Apoyo 2 >> "+ nombre +" << No puedo trabajar en eso, no es de mis funciones 8( >>");
	}
	public String cocinar() {
		acci = true;
		return ("Apoyo 2 >> "+ nombre +" << Trabajando en una  de mis funciones 8) >>");
	}
	public String Servir() {
		acci = true;
		return (" Apoyo 2 >> "+ nombre +" << No puedo trabajar en eso, no es de mis funciones 8( >>");
	}
	public String Calentar() {
		acci = true;
		return ("Apoyo 2 >> "+ nombre +" << Trabajando en una  de mis funciones 8) >>");
	}
}
