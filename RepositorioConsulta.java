import java.util.ArrayList;
import java.util.Date;

/**
 * Created by marcus.rodrigues on 15/03/2015.
 */
public class RepositorioConsulta {

    ArrayList<Consulta> consultas;

    public RepositorioConsulta() {

        this.consultas = new ArrayList<Consulta>();
    }

    public void adicionarConsulta(Consulta consulta){

        consultas.add(consulta);
    }
    public ArrayList<Consulta> getConsultas(){
        return consultas;
    }

    public Consulta buscarConsultaDePacientePorNome(String nome){
        for(Consulta con: consultas){
            if(con.getPaciente().getNome().equalsIgnoreCase(nome)){
                return (con);
            }
        }
        return (null);
    }
    public boolean existeConsultaDePacienteComNome(String nome){

        if(this.buscarConsultaDePacientePorNome(nome) == null){
            return (false);
        }
        return (true);
    }
    public Consulta buscarConsultaDePacientePorCpf(String cpf){
        for(Consulta con: consultas){
            if(con.getPaciente().getCpf().equalsIgnoreCase(cpf)){
                return (con);
            }
        }
        return (null);
    }
    public boolean existeConsultaDePacienteComCpf(String cpf){
        if(this.buscarConsultaDePacientePorCpf(cpf) == null){
            return (false);
        }
        return (true);
    }
    /*
    public Consulta buscarConsultaDePacientePorData(Date data){
        for (Consulta con: consultas){
            if(con.getDate(data)){

            }
        }
    }
    */
}
