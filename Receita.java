/**
 * Created by marcus.rodrigues on 12/03/2015.
 */
public class Receita {

    private Medicamento medicamento;
    private String modoUso;

    public Receita(Medicamento medicamento, String frequenciaUso) {
        this.medicamento = medicamento;
        this.modoUso = frequenciaUso;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public String getModoUso() {
        return modoUso;
    }

    public void setModoUso(String modoUso) {
        this.modoUso = modoUso;
    }
}
