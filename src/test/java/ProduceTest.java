import com.lin.kafka.server.ProduceServer;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Map;

/**
 * Created by Administrator on 2018/7/11.
 */
public class ProduceTest extends AbstractTest {
    private static final Logger logger = LoggerFactory.getLogger(ProduceTest.class);
    @Autowired
    ProduceServer produceServer;

    @Test
    public void testProduce() {
        String topic = "orderTopic";
        String value = "test";
        String ifPartition = "0";
        Integer partitionNum = 1;
        String role = "test";//用来生成key
        for (int i = 0; i <5; i++) {
            Map<String, Object> res = produceServer.sendMesForTemplate(topic,value+i, ifPartition, partitionNum, role);
            logger.info("测试结果如下：===============");
            String message = (String) res.get("message");
            String code = (String) res.get("code");
            logger.info("code:" + code);
            logger.info("message:" + message);
        }
    }

    @Test
    public void testOther() {
        String topic = "otherTopic";
        String value = "test";
        String ifPartition = "1";
        Integer partitionNum = 1;
        String role = "test";//用来生成key
        for (int i = 0; i <10; i++) {
            Map<String, Object> res = produceServer.sendMesForTemplate(topic,value+i, ifPartition, partitionNum, role);
            logger.info("测试结果如下：===============");
            String message = (String) res.get("message");
            String code = (String) res.get("code");
            logger.info("code:" + code);
            logger.info("message:" + message);
        }
    }
}
