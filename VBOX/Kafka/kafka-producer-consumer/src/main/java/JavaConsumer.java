
import kafka.consumer.Consumer;
import kafka.consumer.ConsumerConfig;
import kafka.consumer.ConsumerIterator;
import kafka.consumer.KafkaStream;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by paras.mal on 26/7/17.
 */
public class JavaConsumer implements Runnable{

    public static final String TOPIC = "test-topic";
    public static final String CONSUMER_GROUP = "test-consumer-group";
    private int id = 0;
    private String zookeeper;
    public JavaConsumer(int id, String zookeeper){
        this.id = id;
        this.zookeeper = zookeeper;
    }
    public void run(){
        Map<String, Integer> topicCountMap = new HashMap<String, Integer>();
        topicCountMap.put(TOPIC, 1);
        Map<String, List<KafkaStream<byte[], byte[]>>> consumerMap = getConsumerConnector().createMessageStreams(topicCountMap);
        KafkaStream<byte[], byte[]> stream =  consumerMap.get(TOPIC).get(0);
        ConsumerIterator<byte[], byte[]> it = stream.iterator();
        while(it.hasNext()){
            System.out.println(id + " :: " + new String(it.next().message()));
        }
    }

    public kafka.javaapi.consumer.ConsumerConnector getConsumerConnector(){
        Properties properties = new Properties();
        properties.put("zookeeper.connect",zookeeper);
        properties.put("group.id", CONSUMER_GROUP);
        properties.put("auto.commit.interval.ms", "1000");
        ConsumerConfig consumerConfig = new ConsumerConfig(properties);
        return Consumer.createJavaConsumerConnector(consumerConfig);
    }


}
