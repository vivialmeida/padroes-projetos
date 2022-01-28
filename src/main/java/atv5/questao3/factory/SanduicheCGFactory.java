package atv5.questao3.factory;

import atv5.questao3.product.Sanduiche;
import atv5.questao3.product.SanduicheCG;

public class SanduicheCGFactory extends SanduicheFactory{
    @Override
    public Sanduiche recebeSanduiche() {
        return new SanduicheCG();
    }
}
