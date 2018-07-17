package front;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2  //开启接口配置
public class DatamonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatamonitorApplication.class, args);
	}
}
