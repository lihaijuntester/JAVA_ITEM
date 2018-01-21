/**
 * Created by arvin on 2018/1/20.
 */
import java.lang.reflect.Method;
public class RunMyTests {
    public static void main(String[] args) throws Exception{
        int passed = 0 ;
        int failed = 0 ;
        if (args.length<1){
            System.out.println("please give test class");
            System.exit(1);
        }
        for (Method method : Class.forName(args[0]).getMethods()){
            if (method.isAnnotationPresent(MyTest.class)){
                try{
                    method.invoke(null);
                    passed++;
                }catch (Throwable ex){
                    System.out.printf("Test %s failed; %s %n",method,ex.getCause());
                    failed++;
                }
            }
        }
        System.out.printf("Passed:%d,Fail %d%n",passed,failed);
    }
}
