import java.text.SimpleDateFormat;
import java.util.ArrayList;
abstract class Evento implements IConsultable {
    private static int id = 1;
    private int identificador;
    private boolean benefico;
    private String nombre;
    private double costo;
    private ArrayList<Funcion> funciones;
    private ArrayList<Artista> artistas;
    public Evento(String nombre, double costo, boolean benefico) {
        this.nombre = nombre;
        this.costo = costo;
        this.benefico = benefico;
        this.identificador = id;
        id++;
    }

    public String getNombre() {
        return this.nombre;
    }

    public boolean getBenefico() {
        return this.benefico;
    }
    public void setFunciones(ArrayList<Funcion> funciones) {
        this.funciones = funciones;
    }

    public ArrayList<Funcion> getFunciones() {
        return this.funciones;
    }

    public void setArtistas(ArrayList<Artista>artistas) {
        this.artistas = artistas;
    }

    public ArrayList<Artista> getArtistas() {
        return this.artistas;
    }
    public String consultarDatosArtistasyFuncionesEvento() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        String cadena = "ARTISTAS: " + "\n";
        for (Artista artista : this.artistas) {
            cadena += "- " + artista.consultarDatos();
        }
        cadena += "FUNCIONES: " + "\n";
        for (Funcion funcion : funciones) {
            cadena += "- Fecha: " + sdf.format(funcion.getFecha()) + " - Hora Inicio:" +
                    funcion.getHoraInicio() + " en " + funcion.getLocal().getNombre() + "\n";
        }
        return cadena;
    }
}
