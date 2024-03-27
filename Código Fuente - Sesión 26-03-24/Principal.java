import java.util.ArrayList;
class Operacion{
	public static int correlativo = 0;
	public static int numero;
	public int codigo;
	public Operacion(){
	}
	public static void metodoEstatico(){
		System.out.println("Impresion de metodo estatico");
	}
	
}
interface IConsultable{
	void metodoImpresion(String cadena);
	int comportamientoComun();
}
abstract class Figura {
	private int alto;
	private int largo;
	public Figura(){System.out.println("Mensaje Figura");}
	public Figura(int alto, int largo){
		this.alto = alto;
		this.largo = largo;
	}
	public int getAlto(){return alto;}
	public void setAlto(int alto){ this.alto = alto; }
	public int getLargo(){return largo;}
	public abstract void calcularArea();
	public void metodoSobrecargado(){
		System.out.println("Se esta ejecutando el que no recibe parametros");
	}
	public void metodoSobrecargado(int a, int b){
		System.out.println("Se esta ejecutando el que recibe dos enteros");
	}
	public void metodoSobrecargado(String cadena){
		System.out.println("Se esta ejecutando el que recibe una cadena");
	}
}
class Cuadrado extends Figura {
	public Cuadrado(int alto, int largo){
		super(alto,largo);
		System.out.println("Mensaje Cuadrado");
	}
	
	@Override
	public void calcularArea(){
		System.out.println("Se esta calculando el area del Cuadrado");
		System.out.println(getAlto() * getLargo());
	}
}
class Triangulo extends Figura{
	public Triangulo(int alto, int largo){
		super(alto,largo);
	}
	@Override
	public void calcularArea(){
		System.out.println("Se esta calculando el area del Triangulo");
		System.out.println((getAlto() * getLargo())/2);
	}
}
class Persona implements IConsultable{
	public void metodoImpresion(String cadena){
		System.out.println(cadena);
	}
	public int comportamientoComun(){
		return 10;
	}
	public void caminar(){
		System.out.println("La persona esta caminando...");
	}
}
class Principal{
	public static void main(String[] args){
		Figura figura1 = new Cuadrado(10,30);
		Figura figura2 = new Triangulo(20,40);
		ArrayList<Figura> figuras = new ArrayList<>();
		figuras.add(figura1);
		figuras.add(figura2);
		for(int i=0;i<figuras.size();i++){
			figuras.get(i).calcularArea();
		}
		figura1.metodoSobrecargado();
		IConsultable p1 = new Persona();
		p1.metodoImpresion("Ejemplo de cadena");
		if(p1 instanceof Persona)
			((Persona)p1).caminar();
		
		Operacion.numero = 10;
		System.out.println(Operacion.numero);
		Operacion.metodoEstatico();
		
		Operacion op1 = new Operacion();
		op1.correlativo = 1;
		Operacion op2 = new Operacion();
		
		op1.numero = 20;
		op2.numero = 21;
		
		System.out.println(Operacion.numero);
		System.out.println(op1.correlativo);
		System.out.println(op2.correlativo);
		System.out.println(Operacion.correlativo);
	}
}