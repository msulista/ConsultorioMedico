
/**
 * Created by marcus.rodrigues on 12/03/2015.
 */
public class Consulta {

    Paciente paciente;
    String dataHora;
    Receituario receituario;

    public Consulta(Paciente paciente, String dataHora, Receituario receituario) {
        this.paciente = paciente;
        this.dataHora = dataHora;
        this.receituario = receituario;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getDataHora() {
        return dataHora;
    }

    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }

    public Receituario getReceituario() {
        return receituario;
    }

    public void setReceituario(Receituario receituario) {
        this.receituario = receituario;
    }
}
