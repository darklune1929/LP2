abstract class Artista implements IConsultable {
    private String nombre;
    private OrigenArtista origen;

    public Artista(String nombre, OrigenArtista origen) {
        this.nombre = nombre;
        this.origen = origen;
    }

    public String getNombre() {
        return this.nombre;
    }
    public OrigenArtista getOrigenArtista() {
        return origen;
    }
}