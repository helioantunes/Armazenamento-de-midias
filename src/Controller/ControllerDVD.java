package Controller;

import model.DVD;

public class ControllerDVD {
    DVD[] dvds = new DVD[200];

    private int quantidadeDVDsInseridos = 0;

    public int getQuantidadeDVDsInseridos() {
        return quantidadeDVDsInseridos;
    }

    public DVD[] getDvds() {
        return dvds;
    }

    public void setDvds(DVD[] dvds) {
        this.dvds = dvds;
    }

    public void adicionarDVD(DVD dvd) {
        if (quantidadeDVDsInseridos < dvds.length) {
            dvds[quantidadeDVDsInseridos] = dvd;
            this.quantidadeDVDsInseridos++;
        }
    }

    public void removerDVD(String nome) {
        for (int i = 0; i < this.quantidadeDVDsInseridos; i++) {
            DVD c = this.getDvds()[i];

            if (c.getNome().equals(nome)) {
                for (int j = i; j < this.quantidadeDVDsInseridos; j++) {
                    if (j + 1 < this.getDvds().length) {
                        this.getDvds()[j] = this.getDvds()[j + 1];
                    }
                    this.quantidadeDVDsInseridos--;
                    return;
                }
            }
        }
    }

    public DVD getDVDsPorNome (String nome) {
        for (int i = 0; i < this.quantidadeDVDsInseridos; i++) {
            DVD dvd = this.getDvds()[i];

            if (dvd.getNome().equals(nome)) {
                return dvd;
            }
        }
        return null;
    }
}
