/**
 * Created by arvin on 2018/1/22.
 */
@MyAnnotation(
        value = "info",
        name = "myname",
        age = 19,
        isStudent = false,
        alias = {"name","name2"},
        favoriteColor = MyAnnotation.Color.BLUE
)
public class MyClass {
    //使用MyAnnotation注解，该类生成的javadoc文档包含注解信息如下：
    /*
    @MyAnnotation(value = "info", name = "myname", age = 99, isStudent = false, alias = {"name1","name2"}, favoriteColor = Color.RED)
    public class MyClass
    extends Object
     */
}
