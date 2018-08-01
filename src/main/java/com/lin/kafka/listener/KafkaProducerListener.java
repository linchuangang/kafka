package com.lin.kafka.listener;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.springframework.kafka.support.ProducerListener;

public class KafkaProducerListener implements ProducerListener<String,String>{
	private static Log LOG = LogFactory.getLog(KafkaProducerListener.class);

	@Override
	public boolean isInterestedInSuccess() {
		LOG.info("///kafkaProducer监听器启动///");
		return false;
	}

	@Override
	public void onError(String topic, Integer partition, String key,
            String value, Exception exception) {

		LOG.info("==========kafka发送数据错误（日志开始）==========");
		LOG.info("----------topic:"+topic);
		LOG.info("----------partition:"+partition);
		LOG.info("----------key:"+key);
		LOG.info("----------value:"+value);
		LOG.info("~~~~~~~~~~kafka发送数据错误（日志结束）~~~~~~~~~~");
	}

	@Override
	public void onSuccess(String topic, Integer partition, String key,
            String value, RecordMetadata recordMetadata) {
		LOG.info("==========kafka发送数据成功（日志开始）==========");
		LOG.info("----------topic:"+topic);
		LOG.info("----------partition:"+partition);
		LOG.info("----------key:"+key);
		LOG.info("----------value:"+value);
		LOG.info("----------RecordMetadata:"+recordMetadata);
	}

}
