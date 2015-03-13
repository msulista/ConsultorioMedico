

public class Paciente {

    private String nome;
    private String cpf;
    private String sexo;
    private String dataNascimento;

    public Paciente(String nome, String cpf, String sexo, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.dataNascimento = dataNascimento;
    }

    public  String getNome() {
        return nome;
    }
    public  void setNome(String nome) {
        this.nome = nome;
    }
    public  String getCpf() {
        return cpf;
    }
    public  void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public  String getSexo() {
        return sexo;
    }
    public  void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public  String getDataNascimento() {
        return dataNascimento;
    }
    public  void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }



}
