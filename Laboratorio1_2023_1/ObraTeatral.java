class ObraTeatral extends Evento {
    private int cantidadActos;
    private boolean obraInmersiva;
    public ObraTeatral(String nombre, double costo, boolean benefico,
            int cantidadActos, boolean obraInmersiva) {
        super(nombre, costo, benefico);
        this.cantidadActos = cantidadActos;
        this.obraInmersiva = obraInmersiva;
    }
    
    public String consultarDatos() {
        String cadena = "";
        cadena += "OBRA TEATRAL: " + this.getNombre() + " - " +
                "BENEFICA:" + this.getBenefico() +
                " - INMERSIVA:" +
                this.obraInmersiva + "\n";
        return cadena;
    }
}