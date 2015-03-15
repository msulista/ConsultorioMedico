import java.util.ArrayList;

/**
 * Created by Mateus on 15/03/2015.
 */
public class RepositorioMedicamento {

    ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();

    public void adicionarMedicamento(Medicamento medicamento){

        medicamentos.add(medicamento);

    }

    public ArrayList<Medicamento> getMedicamentos(){ return medicamentos;}

    public Medicamento buscarMedicamentoCOD(String cod){

        for (Medicamento medi: medicamentos) {
            if (medi.getCod().equals(cod)) {

                return (medi);
            }
        }
        return (null);

    }

    public Medicamento buscarMedicamentoNOME(String nome){

        for (Medicamento medi: medicamentos) {
            if(medi.getNomeComercial().equalsIgnoreCase(nome)){
                return (medi);
            }
        }
        return (null);

    }

    public void listarMedicamento(){

        for (Medicamento medi: medicamentos){

            System.out.println(medi.getCod() + " - " + medi.getNomeComercial() + " - " + medi.getTipo());

        }
    }
}