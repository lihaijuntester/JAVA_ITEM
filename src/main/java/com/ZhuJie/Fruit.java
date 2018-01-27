package com.ZhuJie;
/**
 * Created by arvin on 2018/1/21.
 */
public class Fruit {
    public void displayName(){
        System.out.println("水果的名字是：*****");
    }

}
class Orange extends Fruit{
    @Override
    public void displayName(){
        System.out.println("水果的名字是：*****");
    }
}
class Peach extends Fruit{
    @Override
    public void displayName(){
        System.out.println();
    }
}
