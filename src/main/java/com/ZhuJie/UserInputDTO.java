package com.ZhuJie;
import org.springframework.beans.BeanUtils;
import org.springframework.lang.NonNull;

import javax.jws.soap.SOAPBinding;

/**
 * Created by arvin on 2018/1/24.
 */
public class UserInputDTO {
    @NonNull
    private String username;
    @NonNull
    private int age;
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public User convertToUser(){
        UserInputDTOConvert userInputDTOConvert = new UserInputDTOConvert();
        User convert = userInputDTOConvert.convert(this);
        return convert;
    }
  /* public static class UserInputDTOConvert implements DTOConvert<UserInputDTO,User>{
        @Override
        public User convert(UserInputDTO userInputDTO){
            User user = new User();
            BeanUtils.copyProperties(UserInputDTO,user);
            return user;
        }
    }*/
}
