package ma.zs.univ.integration.core.commun.comptable;

import com.intuit.karate.junit4.Karate;
import org.junit.runner.RunWith;

public class ComptableIntegrationTest {

 @Karate.Test
    Karate saveHappyTest() {
        return Karate.run("ComptableHappyTest")
                .tags("save")
                .relativeTo(getClass());
    }


}
