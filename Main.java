import sun.security.jca.GetInstance;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
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
        RepositorioConsulta repositorioConsulta = new RepositorioConsulta();

        try {
            do {
                System.out.println("MENU PRINCIPAL");

                System.out.println("1 - Cadastro");
                System.out.println("2 - Consulta");
                System.out.println("3 - ");
                System.out.println("0 - Sair");
                option = Console.lerInt("Digite sua opção: ");
                switch (option) {
                    case 1: {
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
                                    Paciente paciente = new Paciente(nome, cpf, sexo, datNascimento, fone);
                                    repositorioPaciente.adicionarPaciente(paciente);
                                    System.out.println("\n Paciente cadastrado com sucesso.\n");

                                    break;
                                }
                                case 2: {
                                    do {
                                        System.out.println("\t\tBusca Paciente");
                                        System.out.println("1 - Busca por Nome");
                                        System.out.println("2 - Busca por cpf");
                                        System.out.println("3 - Busca por Telefone");
                                        System.out.println("0 - Sair");
                                        option = Console.lerInt("Digite a opção desejada: ");
                                        switch (option) {
                                            case 1: {
                                                System.out.println("Busca por Nome:");
                                                nome = Console.lerString("Nome: ");
                                                if (!repositorioPaciente.existePacienteComNome(nome)) {
                                                    System.out.println("Nome não cadastrado.");
                                                } else {
                                                    Paciente paci = repositorioPaciente.buscarPacienteNOME(nome);
                                                    System.out.println("Resultado de sua consulta: ");
                                                    System.out.println(paci.getCpf() + " - " + paci.getNome() + " - " + paci.getTelefone());
                                                }
                                                break;
                                            }
                                            case 2: {
                                                System.out.println("Busca por CPF:");
                                                cpf = Console.lerString("CPF: ");
                                                if (repositorioPaciente.existePacienteComCpf(cpf)) {
                                                    System.out.println("CPF não cadastrado.");
                                                } else {
                                                    Paciente paci = repositorioPaciente.buscarPacienteCPF(cpf);
                                                    System.out.println("Resultado de sua consulta: ");
                                                    System.out.println(paci.getCpf() + " - " + paci.getNome() + " - " + paci.getTelefone());
                                                }
                                                break;
                                            }
                                            case 3: {
                                                System.out.println("Busca por telefone:");
                                                fone = Console.lerString("Telefone: ");
                                                if (repositorioPaciente.existePacienteComFone(fone)) {
                                                    System.out.println("Telefone não cadastrado.");
                                                } else {
                                                    Paciente paci = repositorioPaciente.buscarPacienteFONE(fone);
                                                    System.out.println("Resultado de sua consulta: ");
                                                    System.out.println(paci.getCpf() + " - " + paci.getNome() + " - " + paci.getTelefone());
                                                }
                                                break;
                                            }
                                            case 0: {
                                                System.out.println("Voltando ao menu anterior!");
                                            }
                                        }
                                    } while (buscaP != 0);

                                    break;
                                }
                                case 3: {
                                    System.out.println("\n\nLista de Pacientes");
                                    repositorioPaciente.listarPaciente();
                                    System.out.println("\n");
                                    break;
                                }
                                case 4: {
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
                                    while (buscaP != 0);

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
                        } while (option != 0);//Final laço cadastro
                    }
                    case 2:{
                        System.out.println("CONSULTA");
                        Date data = new Date();
                        SimpleDateFormat dataFormat = new SimpleDateFormat("Data: 'dd/MM/yyyy 'Hora:' HH:mm'");
                        String dataHora = dataFormat.format(data);

                        String nomePaci = Console.lerString("Nome Paciente: ");
                        if (!repositorioPaciente.existePacienteComNome(nomePaci)) {
                            System.out.println("Nome não cadastrado.");
                        }
                        Paciente paci = repositorioPaciente.buscarPacienteNOME(nomePaci);

                        String nomeMedi = Console.lerString("Nome Medicamento: ");
                        if(!repositorioMedicamento.existeMedicamentoComNome(nomeMedi)){
                            System.out.println("Nome não cadastrado.");
                        }
                        Medicamento medi = repositorioMedicamento.buscarMedicamentoNOME(nomeMedi);

                        String posologia = Console.lerString("Digite posologia: ");
                        Receituario receituario = new Receituario(medi, posologia);

                        Consulta consulta = new Consulta(paci, dataHora, receituario);
                        repositorioConsulta.adicionarConsulta(consulta);

                        System.out.println();
                    }
                    case 0:{
                        System.out.println("Fim do programa.");
                        System.out.println("\n");
                    }
                }
            }while(option != 0);//Final laço Menu Principal
        }catch (InputMismatchException exception){
            System.out.println("Escolha uma opção válida!");
        }

    }
}
