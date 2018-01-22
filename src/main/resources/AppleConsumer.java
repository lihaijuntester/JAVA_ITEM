/**
 * Created by arvin on 2018/1/21.
 */
public class AppleConsumer {
    public static void main(String[] args){
        @SuppressWarnings({"deprecation"})
        AppleService appleService = new AppleService();
        appleService.showTaste(2);
        appleService.showTaste();
    }
}
