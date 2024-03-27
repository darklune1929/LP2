import java.util.Date;
class Persona{
	//Estado
	private String nombre;
	private Date fechaNacimiento;
	//Constructor
	public Persona(){}
	public Persona(String nombre, Date fechaNacimiento){
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	//Getters y Setters
	public Date getFechaNacimiento(){
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento){
		this.fechaNacimiento = fechaNacimiento;
	}
	public String getNombre(){
		return nombre;
	}
	public void setNombre(String nombre){
		this.nombre = nombre;
	}
}