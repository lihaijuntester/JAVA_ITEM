package com.ZhuJie;
import org.springframework.beans.BeanUtils;

/**
 * Created by arvin on 2018/1/24.
 */
public class UserInputDTOConvert {
    //@Override
    public User convert(UserInputDTO userInputDTO){
        User user = new User();
        BeanUtils.copyProperties(userInputDTO,user);
        return user;
    }

    public Object convert(Object o) {
        return null;
    }
}
