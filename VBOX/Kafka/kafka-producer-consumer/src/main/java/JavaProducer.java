import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;

import java.util.Properties;

/**
 * Created by paras.mal on 26/7/17.
 */
public class JavaProducer implements Runnable{

    private Integer index;
    String hostlist;

    public JavaProducer(Integer index, String hostlist){
        this.index = index;
        this.hostlist = hostlist;
    }
    public void run(){

        Properties props = new Properties();
        props.put("bootstrap.servers", hostlist);   // bootstrap list of server to discover cluster
        props.put("acks", "all"); //  replication is bound to all
        props.put("retries", 0);
        props.put("batch.size", 16384);
        props.put("linger.ms", 1);
        props.put("buffer.memory", 33554432);
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("security.protocol", "PLAINTEXT");
        props.put("client.id","console-producer");
        Producer<String, String> producer = new KafkaProducer<String, String>(props);
        for(int i = 1; i < 10; i++){
            String message = "producer ID:" + index.toString() + " msg:" + Integer.toString(i);
            producer.send(new ProducerRecord<String, String>(JavaConsumer.TOPIC,message, message));
        }
        System.out.println("Message sent successfully");
        producer.close();
    }




}
