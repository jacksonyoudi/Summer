package youdi.demo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import youdi.com.pojo.Hello;


public class HelloTests {

    @Test
    public void testHello() {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

        Hello hello = (Hello) context.getBean("hello");

        hello.show();

    }
}
