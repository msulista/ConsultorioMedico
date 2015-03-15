import java.util.ArrayList;
import java.util.InputMismatchException;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int option = -1;
        int buscaP = -1;

        int buscaM = -1;
        //ArrayList<Paciente> pacientes;
        String nome = "";
        String cpf = "";
        String sexo = "";
        String datNascimento = "";
        String fone = "";

        String cod;
        String nomeComercial;
        String concentracao;
        String tipo;

        RepositorioPaciente repositorioPaciente = new RepositorioPaciente();
        RepositorioMedicamento repositorioMedicamento = new RepositorioMedicamento();

        try {


            do {
                System.out.println("CADASTRO");

                System.out.println("1 - Paciente         \t\t - \t \t 4 - Medicamento");
                System.out.println("2 - Buscar Paciente   \t\t - \t\t 5 - Buscar Medicamento");
                System.out.println("3 - Listar Pacientes  \t\t - \t\t 6 - Listar Medicamentos");
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
                        System.out.println("\n");
                        Paciente paciente = new Paciente(nome, cpf, sexo,datNascimento, fone);
                        repositorioPaciente.adicionarPaciente(paciente);
                        System.out.println("\n Paciente cadastrado com sucesso.\n");

                        break;
                    }
                    case 2: {
                        do{
                            System.out.println("\t\tBusca Paciente");
                            System.out.println("1 - Busca por Nome");
                            System.out.println("2 - Busca por cpf");
                            System.out.println("3 - Busca por Telefone");
                            System.out.println("0 - Sair");
                            buscaP = Console.lerInt("Digite a opção desejada: ");
                            switch (buscaP){
                                case 1:{
                                    System.out.println("Busca por Nome:");
                                    nome = Console.lerString("Nome: ");
                                    System.out.println(repositorioPaciente.buscarPacienteNOME(nome));
                                    break;
                                }
                                case 2:{
                                    System.out.println("Busca por CPF:");
                                    cpf = Console.lerString("Nome: ");
                                    System.out.println(repositorioPaciente.buscarPacienteCPF(cpf));
                                    break;
                                }
                                case 3: {
                                    System.out.println("Busca por telefone:");
                                    fone = Console.lerString("Telefone: ");
                                    System.out.println(repositorioPaciente.buscarPacienteFONE(fone));
                                    break;
                                }
                            }
                        }while (buscaP != 0);

                        break;
                    }
                    case 3: {
                        System.out.println("\n\nLista de Pacientes");

                        repositorioPaciente.listarPaciente();
                        System.out.println("\n");
                        break;
                    }
                    case 4:{
                        System.out.println("\n\nCadastro de Medicamentos");

                        nomeComercial = Console.lerString("Nome: ");
                        cod = Console.lerString("Cod: ");
                        concentracao = Console.lerString("Concentração: ");
                        tipo = Console.lerString("Tipo: ");
                        System.out.println("\n");
                        Medicamento medicamento = new Medicamento(nomeComercial, cod, concentracao, tipo);
                        repositorioMedicamento.adicionarMedicamento(medicamento);
                        System.out.println("\n Medicamento cadastrado com sucesso.\n");

                        break;

                    }
                    case 5: {
                        do {
                            System.out.println("\t\tBusca Medicamentos");
                            System.out.println("1 - Busca por Código");
                            System.out.println("2 - Busca por Nome");
                            System.out.println("0 - Sair");
                            buscaM = Console.lerInt("Digite a opção desejada: ");
                            switch (buscaM) {
                                case 1: {
                                    System.out.println("Busca por Código:");
                                    cod = Console.lerString("Código: ");
                                    System.out.println(repositorioMedicamento.buscarMedicamentoCOD(cod));
                                    break;
                                }
                                case 2: {
                                    System.out.println("Busca por Nome:");
                                    nome = Console.lerString("Nome: ");
                                    System.out.println(repositorioMedicamento.buscarMedicamentoNOME(nome));
                                    break;
                                }
                            }
                        }
                            while (buscaP != 0) ;

                            break;
                    }
                    case 6: {
                        System.out.println("\n\nLista de Medicamentos");

                        repositorioMedicamento.listarMedicamento();
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
