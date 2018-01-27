package com.ZhuJie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by arvin on 2018/1/24.
 */
@RequestMapping("/v1/api/user")
@RestController
public class UserApi {
  @Autowired
    private UserService userService;
  @PostMapping
    public User addUser(@Validated UserInputDTO userInputDTO, BindingResult bindingResult){
      checkDTOParams(bindingResult);
      User user = new User();
      user.setUsername(userInputDTO.getUsername());
      user.setAge(userInputDTO.getAge());
      return userService.addUser(user);
  }
  public void checkDTOParams (BindingResult bindingResult){
      if (bindingResult.hasErrors()){
        throw new RuntimeException();
      }
  }
}
