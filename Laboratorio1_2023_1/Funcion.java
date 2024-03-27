import java.time.LocalTime;
import java.util.Date;
class Funcion {
    private Date fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;
    private Local local;

    public Funcion(Date fecha,LocalTime horaInicio,
            LocalTime horaFin, Local local) {
        this.fecha = fecha;
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.local = local;
    }

    public Date getFecha() {
        return this.fecha;
    }

    public LocalTime getHoraInicio() {
        return this.horaInicio;
    }

    public Local getLocal() {
        return this.local;
    }
}
