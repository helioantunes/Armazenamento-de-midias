package model;

public class Midia {
    int codigo;
    double preco;
    String nome;
    Midia[] midias;

    public Midia(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
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

    public Midia[] getMidias() {
        return midias;
    }

    public void setMidias(Midia[] midias) {
        this.midias = midias;
    }
}
