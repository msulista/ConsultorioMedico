import java.util.ArrayList;

/**
 * Classe responsavel por conter a lista de cadastros realizados de Cliente e Medicamento
 * a classe também contem a estrutura do formulario de cadastro
 *
 * @author Marcus Rodrigues
 *
 */
public class Cadastro {

    ArrayList<Paciente> pacientes = new ArrayList<Paciente>();
    ArrayList<Medicamento> medicamentos = new ArrayList<Medicamento>();

    CadPaciente cadPac;
    CadMedicamento cadMed;
    private int option = -1;
    private String nome;
    private String cpf;
    private String sexo;
    private String dataNascimento;


    public void menuDeCadastros() {

        do {
            System.out.println("CADASTRO");

            System.out.println("1 - Paciente");
            System.out.println("2 - Medicamento");
            System.out.println("3 - Listar Paciente");
            System.out.println("0 - Sair");
            option = Console.lerInt("Digite sua opção: ");

            switch(option){

                case 1:{
                    cadPac = new CadPaciente(nome, cpf, sexo, dataNascimento);
                    pacientes.add(cadPac.cadastraPaciente());
                    break;
                }
                case 2:{
                    cadMed = new CadMedicamento();
                    medicamentos.add(cadMed.cadastraMedicamento());
                    break;
                }
                case 3:{
                   // listarPacientes();
                    System.out.println("\n");
                    break;
                }
                case 0:{
                    System.out.println("Saindo...");
                    break;
                }
                default:
                    System.out.println("Opção Invalida!!");
            }
        } while (option != 0);

    }