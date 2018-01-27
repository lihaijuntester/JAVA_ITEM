package com.ZhuJie;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by arvin on 2018/1/21.
 */
public class SuppressWarningTest {
    @SuppressWarnings("unchecked")
    public void addItems(String item){
        @SuppressWarnings("unused")
        List list = new List();
        ArrayList Items = new ArrayList();
        Items.add(item);
    }
    @SuppressWarnings({"unchecked","unused"})
    public void addItems1(String item){
       List list = new List();
       list.add(item);
    }
    @SuppressWarnings("all")
    public void addItms2(String item){
        List list = new List();
        list.add(item);
    }
}
