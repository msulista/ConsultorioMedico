/**
 * Classe responsavel por gerar o cadastro de pacientes
 * possui um metodo cadastraPaciente
 *
 *
 */
public class CadPaciente {

    private String nome;
    private String cpf;
    private String sexo;
    private String dataNascimento;

    /**
     * Metodo contrutor da classe CadPaciente
     *
     * @param nome Nome do paciente
     * @param cpf Cpf do paciente
     * @param sexo Sexo do paciente
     * @param dataNascimento Data de nascimento do paciente
     */
    public CadPaciente(String nome, String cpf, String sexo, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    /**
     * Metodo resonsavel por criar um novo paciente e efetuar o cadastro
     *
     * @return paciente
     */
    public Paciente cadastraPaciente(){


        Paciente paciente = new Paciente(nome, cpf, sexo, dataNascimento);

        System.out.println("### PACIENTE ###");
        System.out.println("");
        paciente.setNome(Console.lerString("Nome: "));
        paciente.setCpf(Console.lerString("CPF: "));
        paciente.setSexo(Console.lerString("Sexo: "));
        paciente.setDataNascimento(Console.lerString("Data Nascimento: "));

        return paciente;
    }

}
