class Concierto extends Evento {
    private boolean acustico;
    private boolean tecnologiaAsisistiva;

    public Concierto(String nombre, double costo, boolean benefico,
            boolean acustico, boolean tecnologiaAsistiva) {
        super(nombre, costo, benefico);
        this.acustico = acustico;
        this.tecnologiaAsisistiva = tecnologiaAsistiva;
    }
    @Override
    public String consultarDatos() {
        String cadena = "";
        cadena+="CONCIERTO: "+this.getNombre()+" - "+
        "ACUSTICO:"+this.acustico+" - TEC ASISTIVA:"+
                this.tecnologiaAsisistiva + "\n";
        return cadena;
    }
}
