package model;

public class DVD {
    int codigo;
    int quantidadeDVDsInseridos = 0;
    double preco;
    String nome;
    String sinopse;
    String tipo;
    DVD [] dvds;

    public DVD(int codigo, double preco, String nome, String sinopse) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
        this.sinopse = sinopse;
    }

    public String getDetalhes(){
        return String.format("Nome: %s "
                        + "\nPreço: %.2f "
                        + "\nCodigo: %d "
                        + "\nSinopse: %s ",
                    this.getNome(), this.getPreco(), this.getCodigo(), this.getSinopse());
    }

    public String getTipo(){
        return String.format("Tipo de midia: DVD");
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

    public int getQuantidadeDVDsInseridos() {
        return quantidadeDVDsInseridos;
    }

    public void setQuantidadeDVDsInseridos(int quantidadeDVDsInseridos) {
        this.quantidadeDVDsInseridos = quantidadeDVDsInseridos;
    }

    public DVD[] getDvds() {
        return dvds;
    }

    public void setDvds(DVD[] dvds) {
        this.dvds = dvds;
    }
    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

}
