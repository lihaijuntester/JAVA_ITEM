package com.ZhuJie;
import com.sun.org.apache.xerces.internal.impl.dv.xs.ListDV;
import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;
import jdk.nashorn.internal.objects.AccessorPropertyDescriptor;
import lombok.RequiredArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.lang.NonNull;

import java.util.List;

/**
 * Created by arvin on 2018/1/27.
 */
@Accessors(chain = true)
@lombok.Getter
@lombok.Setter
@RequiredArgsConstructor(staticName = "ofName")
public class Student {
    @NonNull
    protected String name;
    @NonNull
    private int  age;

}
