import java.lang.reflect.Field;

/**
 * Created by arvin on 2018/1/22.
 */
public class AnnotationParser {
    public static void main(String[] args){
        Field[] fields = Apple.class.getDeclaredFields();
        for (Field field:fields){
            if (field.isAnnotationPresent(FruitName.class)){
                FruitName fruitName = field.getAnnotation(FruitName.class);
                System.out.println("水果的名称：" + fruitName.value());
            }else if(field.isAnnotationPresent(FruitColor.class)){
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                System.out.println("水果的颜色："+fruitColor.fruitcolor());
            }else if (field.isAnnotationPresent(FruitProvider.class)){
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                System.out.println("水果供应商编号:" + fruitProvider.id()+"名称:"+fruitProvider.name()+"地址："+fruitProvider.address());
            }

        }
    }
}
