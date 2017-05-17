import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by chason on 2017/5/17.
 */
public class Client {
    @Test
    public void print(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath:mybatisContext-config.xml");

    }
}
