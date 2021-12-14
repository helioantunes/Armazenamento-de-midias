package Controller;

import model.CD;

public class ControllerCD {
    CD[] cds = new CD[200];

    private int quantidadeCDsInseridos = 0;

    public int getQuantidadeCDsInseridos() {
        return quantidadeCDsInseridos;
    }

    public CD[] getCds() {
        return cds;
    }

    public void setCds(CD[] cds) {
        this.cds = cds;
    }

    public void adicionarCD(CD cd) {
        if (quantidadeCDsInseridos < cds.length) {
            cds[quantidadeCDsInseridos] = cd;
            this.quantidadeCDsInseridos++;
        }
    }

    public void removerCD(String nome) {
        for (int i = 0; i < this.quantidadeCDsInseridos; i++) {
            CD c = this.getCds()[i];

            if (c.getNome().equals(nome)) {
                for (int j = i; j < this.quantidadeCDsInseridos; j++) {
                    if (j + 1 < this.getCds().length) {
                        this.getCds()[j] = this.getCds()[j + 1];
                    }
                    this.quantidadeCDsInseridos--;
                    return;
                }
            }
        }
    }

    public CD getCDsPorNome (String nome) {
        for (int i = 0; i < this.quantidadeCDsInseridos; i++) {
            CD cd = this.getCds()[i];

            if (cd.getNome().equals(nome)) {
                return cd;
            }
        }
        return null;
    }
}
