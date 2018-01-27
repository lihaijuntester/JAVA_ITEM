package com.ZhuJie;
/**
 * Created by arvin on 2018/1/22.
 */
public class Apple {
    /***********注解使用***************/
    @FruitName("Apple")
    private String appleName;
    @FruitColor(fruitcolor = FruitColor.Color.RED)
    private String fruitcolor;
    @FruitProvider(id = 1,name = "陕西红富士集团",address = "陕西红富士大厦")
    private String applePrvoder;

    public String getAppleName() {
        return appleName;
    }

    public void setAppleName(String appleName) {
        this.appleName = appleName;
    }

    public String getFruitcolor() {
        return fruitcolor;
    }

    public void setFruitcolor(String fruitcolor) {
        this.fruitcolor = fruitcolor;
    }

    public String getApplePrvoder() {
        return applePrvoder;
    }

    public void setApplePrvoder(String applePrvoder) {
        this.applePrvoder = applePrvoder;
    }
    public void displayName(){
        System.out.println(getAppleName());
    }
}
