import java.util.ArrayList;

class Agrupacion extends Artista{
    private int anioConformacion;
    private ArrayList<Persona> miembros;
    public Agrupacion(String nombre,OrigenArtista origen,
            int anioConformacion) {
        super(nombre, origen);
        this.anioConformacion = anioConformacion;
    }

    public void setMiembros(ArrayList<Persona> miembros) {
        this.miembros = miembros;
    }

    public ArrayList<Persona> getMiembros() {
        return this.miembros;
    }
    @Override
    public String consultarDatos() {
        String cadena = "";
        cadena+="AGRUPACION: "+this.getNombre()+" - "+this.getOrigenArtista()+" - "+
        this.anioConformacion+"\n";
        return cadena;
    }
}
