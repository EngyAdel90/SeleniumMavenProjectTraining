import Framework.Engine.PropertiesReader;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestProperties {
    @BeforeClass
    public static void beforeClass(){
        PropertiesReader.loadProperties();
    }

    @Test
    public void test(){

        System.out.println(System.getProperty("browserType"));
    }
}
