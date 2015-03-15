import java.util.Calendar;
import java.util.Date;

/**
 * Created by marcus.rodrigues on 12/03/2015.
 */
public class Consulta {

    Paciente paciente;
    Date date;
    Calendar calendario;
    Receituario receituario;

    public Consulta(Paciente paciente, Date date, Calendar calendario, Receituario receituario) {
        this.paciente = paciente;
        this.date = new Date();
        this.calendario = Calendar.getInstance();
        this.receituario = receituario;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Calendar getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendar calendario) {
        this.calendario = calendario;
    }

    public Receituario getReceituario() {
        return receituario;
    }

    public void setReceituario(Receituario receituario) {
        this.receituario = receituario;
    }
}
