import java.util.ArrayList;

/**
 * Created by marcus.rodrigues on 14/03/2015.
 */
public class RepositorioPaciente {

    ArrayList<Paciente> pacientes = new ArrayList<Paciente>();

 /*   public RepositorioPaciente(ArrayList<Paciente> pacientes) {
        this.pacientes = new ArrayList<Paciente>();
    }
*/
    public void adicionarPaciente(Paciente paciente){

        pacientes.add(paciente);
    }

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }

    public Paciente buscarPacienteCPF(String cpf){

        for (Paciente paci: pacientes){
            if(paci.getCpf().equals(cpf)){

                return(paci);
            }
        }
        return (null);
    }
    public boolean existePacienteComCpf(String cpf){
        if(this.buscarPacienteCPF(cpf) == null){
            return (false);
        }
        return (true);

    }

    public Paciente buscarPacienteNOME(String nome){

        for (Paciente paci: pacientes) {
            if(paci.getNome().equalsIgnoreCase(nome)){

                return (paci);
            }
        }
        return (null);
    }
    public boolean buscaPacienteComNome(String nome){
        if(this.buscarPacienteNOME(nome) == null){
            return (false);
        }
        return (true);
    }

    public  Paciente buscarPacienteFONE(String telefone){

        for (Paciente paci: pacientes) {
            if(paci.getTelefone().equals(telefone)){
                return (paci);
            }
        }
        return (null);
    }
    public boolean existePacienteComFone(String fone){
        if(this.buscarPacienteNOME(fone) == null){
            return (false);
        }
        return (true);
    }

    public void listarPaciente(){
        for (Paciente paci: pacientes) {

            System.out.println(paci.getCpf() + " - " + paci.getNome() + " - " + paci.getTelefone());
        }
    }
}

