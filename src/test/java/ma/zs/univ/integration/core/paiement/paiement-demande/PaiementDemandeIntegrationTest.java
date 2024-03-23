package ma.zs.univ.integration.core.paiement.paiement-demande;

import com.intuit.karate.junit4.Karate;
import org.junit.runner.RunWith;

public class PaiementDemandeIntegrationTest {

 @Karate.Test
    Karate saveHappyTest() {
        return Karate.run("PaiementDemandeHappyTest")
                .tags("save")
                .relativeTo(getClass());
    }


}
