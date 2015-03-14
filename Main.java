import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int option = -1;
        //ArrayList<Paciente> pacientes;
        String nome = "";
        String cpf = "";
        String sexo = "";
        String datNascimento = "";
        String fone = "";

        RepositorioPaciente repositorioPaciente = new RepositorioPaciente();

        try {


            do {
                System.out.println("CADASTRO");

                System.out.println("1 - Paciente");
                System.out.println("2 - Medicamento");
                System.out.println("3 - Listar Paciente");
                System.out.println("0 - Sair");
                option = Console.lerInt("Digite sua opção: ");

                switch (option) {

                    case 1: {
                        System.out.println("\t\tCadastro de Paciente:");
                        nome = Console.lerString("Nome: ");
                        cpf = Console.lerString("CPF: ");
                        fone = Console.lerString("Telefone: ");
                        sexo = Console.lerString("Sexo: ");
                        datNascimento = Console.lerString("Data de Nascimento: ");

                        break;
                    }
                    case 2: {

                        break;
                    }
                    case 3: {
                        // listarPacientes();
                        System.out.println("\n");
                        break;
                    }
                    case 0: {
                        System.out.println("Saindo...");
                        break;
                    }
                    default:
                        System.out.println("Opção Invalida!!");
                }
            } while (option != 0);
        }catch (InputMismatchException exception){
            System.out.println("Escolha uma opção válida!");
        }

    }
}
