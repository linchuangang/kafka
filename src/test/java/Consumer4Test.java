import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2018/7/11.
 */
public class Consumer4Test {
    //测试同一个group下消费
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("consumer4.xml");
    }
}
