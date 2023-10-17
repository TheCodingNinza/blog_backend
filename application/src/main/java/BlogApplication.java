import com.saurabhsameer.configuration.ConfigurationModuleBase;
import com.saurabhsameer.dataaccess.DataAccessModuleBase;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = {ConfigurationModuleBase.class})
public class BlogApplication {

  public static void main(String[] args) {
    SpringApplication.run(BlogApplication.class);
  }

}
