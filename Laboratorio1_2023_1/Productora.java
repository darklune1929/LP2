import java.util.ArrayList;
class Productora {
    private int identificador;
    private String nombre;
    private ArrayList<Evento> eventos;

    public Productora(int identificador, String nombre) {
        this.identificador = identificador;
        this.nombre = nombre;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }

    public ArrayList<Evento> getEventos() {
        return this.eventos;
    }
    public String consultarEventos() {
        String cadena = "";
        for (Evento evento : eventos) {
            if (evento instanceof Concierto) {
                cadena += ((Concierto)evento).consultarDatos();
            } else {
                cadena += ((ObraTeatral)evento).consultarDatos();
            }
            cadena += evento.consultarDatosArtistasyFuncionesEvento();
        }
        return cadena;
    }
}