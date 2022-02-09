package atv5.questao3.factory;

import atv5.questao3.product.Sanduiche;
import atv5.questao3.product.SanduicheRT;

public class SanduicheRTFactory extends SanduicheFactory{
    @Override
    public Sanduiche recebeSanduiche() {
        return new SanduicheRT();
    }
}
