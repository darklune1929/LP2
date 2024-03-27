/* 	Fecha: 19-03-2024
	Nombre: Freddy Paz
*/
import java.text.SimpleDateFormat;
class Principal{
	public static void main(String[] args) throws Exception{
		System.out.println("Hola mundo...");
		//Establecemos un formato para fechas
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		//Utilizamos constructos
		Persona p1 = new Persona("Juan",sdf.parse("18-01-1994"));
		Persona p2 = new Persona();
		//Asignamos valores a la Persona 2
		p2.setNombre("Fatima");
		p2.setFechaNacimiento(sdf.parse("31-01-1987"));
		//Realiamos impresiones
		System.out.println(p1.getNombre() + " " + sdf.format(p1.getFechaNacimiento()));
		System.out.println(p2.getNombre() + " " + sdf.format(p2.getFechaNacimiento()));
	}
}