/**
 * Created by paras.mal on 26/7/17.
 */
public class InsertMessage {

    static String hosts = Readmessage.HOST +  ":9092";
    public static void main(String s[]){
        for(int i = 0;i<2;i++){
            new Thread(new JavaProducer(i, hosts)).start();
        }
    }
}
