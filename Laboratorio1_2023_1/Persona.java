import java.util.Date;
class Persona extends Artista{
    private String nombrePersona;
    private String apellidoPersona;
    private Date fechaNacimiento;
    private char genero;
    public Persona(
    String nombre,OrigenArtista origen,
    String  nombrePersona,String apellidoPersona,
            Date fechaNacimiento, char genero) {
        super(nombre, origen);
        this.nombrePersona = nombrePersona;
        this.apellidoPersona = apellidoPersona;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }
    @Override
    public String consultarDatos() {
        String cadena = "";
        cadena+="PERSONA: "+this.nombrePersona+" "+this.apellidoPersona+" - "+
                this.getOrigenArtista()+"\n";
        return cadena;
    }
}
