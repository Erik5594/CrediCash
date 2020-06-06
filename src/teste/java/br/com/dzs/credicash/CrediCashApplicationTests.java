package java.br.com.dzs.credicash;

import br.com.dzs.credicash.CrediCashApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * DZS
 *
 * @author erik_
 * Data Criacao: 05/06/2020 - 22:31
 */

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = CrediCashApplication.class)
@WebAppConfiguration
public class CrediCashApplicationTests {
    @Test
    public void contextLoads() {
    }
}
