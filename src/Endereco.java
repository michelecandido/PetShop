public class Endereco {
    private String rua, cidade, estado, pais, cep, numero, complemento;

    public Endereco(String rua, String cidade, String estado, String pais, String cep, String numero, String complemento) {
        this.rua = rua;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade() {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String toString() {
        return "\n-- Endereço --"+
               "\nRua: "+rua+"\nCidade: "+cidade+"\nPaís: "+pais+
               "\nCEP: "+cep+"\nNúmero: "+numero+"\nComplemento: "+complemento;
    }
}