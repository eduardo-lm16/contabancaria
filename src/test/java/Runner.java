import io.cucumber.junit.CucumberOptions;
        import org.junit.runner.RunWith;
        import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"}, features = "src/test/java/teste.feature", tags = "@tag"
        , glue = "contas")

public class Runner {
}


