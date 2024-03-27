class Local {
    private String nombre;
    private String direccion;
    private int aforo;

    public Local(String nombre,String direccion,
            int aforo) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.aforo = aforo;
    }

    public String getNombre() {
        return this.nombre;
    }
}