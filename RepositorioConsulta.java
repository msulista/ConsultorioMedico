import java.util.ArrayList;

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

    public Consulta buscarConsultaPorNomePaciente(String nome){

        for(Consulta con: consultas){

            if(con.getPaciente().getNome().equalsIgnoreCase(nome)){
                return (con);
            }
        }
        return (null);
    }
    public boolean existeConsultaDePacienteComNome(String nome){

        if(this.buscarConsultaPorNomePaciente(nome) == null){
            return (false);
        }
        return (true);
    }
}
