/**
 * Created by paras.mal on 26/7/17.
 */
public class Readmessage {
    public static String HOST = "localhost";
    public static String zookeeper = HOST + ":2181";
    public static void main(String s[]){
        for(int i = 0;i<10;i++){
            new Thread(new JavaConsumer(i, zookeeper)).start();
        }
    }
}
