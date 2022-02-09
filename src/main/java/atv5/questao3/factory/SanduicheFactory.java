package atv5.questao3.factory;

import atv5.questao3.product.Sanduiche;

public abstract class SanduicheFactory {
    public Sanduiche montaSanduiche(){
        Sanduiche sanduiche = null;

        sanduiche = recebeSanduiche();

        sanduiche.adicionaPao();
        sanduiche.adicionaQueijo();
        sanduiche.adicionaPresunto();
        sanduiche.adicionaSalada();

        return sanduiche;
    }

    protected abstract Sanduiche recebeSanduiche();
}
