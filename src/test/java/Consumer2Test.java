import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/7/11.
 */
public class Consumer2Test {

    private static final Logger logger = LoggerFactory.getLogger(Consumer2Test.class);
    //不同group下消费
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("consumer2.xml");
//        System.out.println(System.getProperty("user.dir"));
      logger.info("----------");
    }
}
