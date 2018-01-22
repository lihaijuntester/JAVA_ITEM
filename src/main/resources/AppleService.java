/**
 * Created by arvin on 2018/1/21.
 */
public class AppleService {
    public void displayName(){
        System.out.println("水果的名字是：苹果");
    }
    /**
     * @deprecated 该方法已经过期，不推荐使用
     */
    @Deprecated
    public void showTaste(){
        System.out.println("水果的苹果的口感是：脆甜");
    }
    public void showTaste(int type){
        if (type == 1)
            System.out.println("水果的苹果的口感是：酸涩");
        if (type == 2 )
            System.out.println("水果的苹果的口感是：绵甜");
        else
            System.out.println("水果的苹果的口感是：脆甜");
    }

}
