

public class Medicamento {

    private String cod;
    private String nomeComercial;
    private String concentracao;
    private String tipo;

    public Medicamento(String cod, String nomeComercial, String concentracao, String tipo) {
        this.cod = cod;
        this.nomeComercial = nomeComercial;
        this.concentracao = concentracao;
        this.tipo = tipo;
    }

    public String getCod() {
        return cod;
    }
    public void setCod(String cod) {
        this.cod = cod;
    }
    public String getNomeComercial() {
        return nomeComercial;
    }
    public void setNomeComercial(String nomeComercial) {
        this.nomeComercial = nomeComercial;
    }
    public String getConcentracao() {
        return concentracao;
    }
    public void setConcentracao(String concentracao) {
        this.concentracao = concentracao;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
