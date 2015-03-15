/**
 * Created by marcus.rodrigues on 15/03/2015.
 */
public class Receituario {

    private Medicamento medicamento;
    private String posologia;

    public Receituario(Medicamento medicamento, String posologia) {
        this.medicamento = medicamento;
        this.posologia = posologia;
    }

    public Medicamento getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamento medicamento) {
        this.medicamento = medicamento;
    }

    public String getPosologia() {
        return posologia;
    }

    public void setPosologia(String posologia) {
        this.posologia = posologia;
    }
}
