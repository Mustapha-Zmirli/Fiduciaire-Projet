package ma.zs.univ.integration.core.demande.demande;

import com.intuit.karate.junit4.Karate;
import org.junit.runner.RunWith;

public class DemandeIntegrationTest {

 @Karate.Test
    Karate saveHappyTest() {
        return Karate.run("DemandeHappyTest")
                .tags("save")
                .relativeTo(getClass());
    }


}
