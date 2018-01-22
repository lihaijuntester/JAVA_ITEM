import java.lang.annotation.*;

/**
 * Created by arvin on 2018/1/22.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface FruitName {
    String value() default " ";
}


