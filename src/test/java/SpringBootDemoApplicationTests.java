import com.fhw.practice.MainApplication;
import com.fhw.practice.app.FactoryBeanTest;
import com.fhw.practice.entiy.Student;
import com.fhw.practice.model.Person;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * @author fhw
 * @version 1.0
 * @date 2022-03-09 21:26
 */
@ExtendWith(SpringExtension.class)
@SpringBootTest(classes = {FactoryBeanTest.class, MainApplication.class})
@WebAppConfiguration
public class SpringBootDemoApplicationTests {
    @Autowired
    private Person person;
    @Value("#{11*2}")
    private Integer age;
    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test() {
        FactoryBeanTest factoryBeanTest = applicationContext.getBean(FactoryBeanTest.class);
        try {
            Student student = factoryBeanTest.getObject();
            System.out.println(student==student);
            System.out.println(student);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    @DisplayName("yaml配置转换")
    public void test01(){
        person.getStudent().setAge(age);
        System.out.println(person);
    }

}
