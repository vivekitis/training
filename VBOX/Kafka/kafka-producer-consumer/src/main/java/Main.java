/**
 * Created by paras.mal on 26/7/17.
 */
public class Main {


    public static void main(String s[]) throws Exception{
        int producers = 2;
        int consumers = 2;
        for(int i = 0;i<consumers;i++){
            new Thread(new JavaConsumer(i,"localhost:2181")).start();
        }

        for(int i = 0;i<producers;i++){
            new Thread(new JavaProducer(i, "localhost:9092")).start();
        }

        Thread.sleep(100000);
    }
}
