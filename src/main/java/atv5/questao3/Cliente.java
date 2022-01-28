package atv5.questao3;

import atv5.questao3.factory.SanduicheCGFactory;
import atv5.questao3.factory.SanduicheJPFactory;
import atv5.questao3.factory.SanduicheRTFactory;
import atv5.questao3.product.Sanduiche;
import atv5.questao3.product.SanduicheJP;

public class Cliente {
    public static void main(String[] args) {
        System.out.println("Montando sanduíche CG:");
        Sanduiche cg = new SanduicheCGFactory().montaSanduiche();
        System.out.println(cg);

        System.out.println("Montando sanduíche JP:");
        Sanduiche jp = new SanduicheJPFactory().montaSanduiche();
        System.out.println(jp);

        System.out.println("Montando sanduíche RT:");
        Sanduiche rt = new SanduicheRTFactory().montaSanduiche();
        System.out.println(rt);
    }
}
