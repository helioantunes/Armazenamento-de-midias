package model;

public class CD {
    int codigo;
    int numeroFaixas;
    double preco;
    String nome;
    String Detalhes;
    String Tipo;

    public CD(int codigo, int numeroFaixas, double preco, String nome) {
        this.codigo = codigo;
        this.numeroFaixas = numeroFaixas;
        this.preco = preco;
        this.nome = nome;
    }

    public String getDetalhes(){
        return String.format("Nome: %s "
                        + "\nPreço: %.2f "
                        + "\nCodigo: %d"
                        + "\nNumero de faixas: %d",
                this.getNome(), this.getPreco(), this.getCodigo(), this.getNumeroFaixas());
    }
    public String getTipo(){
        return String.format("Tipo de midia: CD");
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumeroFaixas() {
        return numeroFaixas;
    }

    public void setNumeroFaixas(int numeroFaixas) {
        this.numeroFaixas = numeroFaixas;
    }

}
