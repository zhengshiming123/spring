package com.smart.web;

import com.smart.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.ModelMap;
import org.springframework.util.concurrent.ListenableFuture;
import org.springframework.util.concurrent.ListenableFutureCallback;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.client.AsyncRestTemplate;

/**
 * Created by h on 2017/11/16.
 */
@RestController
@SessionAttributes("user")
public class myTest01 {

    public static void main(String[] args) {

        AsyncRestTemplate template = new AsyncRestTemplate();

        //
        ListenableFuture<ResponseEntity<User>> forEntity = template.getForEntity("http://localhost:8080/chapter17/user/register.html", User.class);

        forEntity.addCallback(new ListenableFutureCallback<ResponseEntity<User>>() {
            @Override
            public void onFailure(Throwable throwable) {

                System.out.println("fail==="+throwable);
            }

            @Override
            public void onSuccess(ResponseEntity<User> userResponseEntity) {

                System.out.println("onSuccess==="+userResponseEntity.getBody());
            }
        });
    }

    public String handle71(@ModelAttribute("user") User user){

        user.setUserName("aa");
        return "redirect:/user/handle72.html";

    }

    public String handle72(ModelMap modelMap, SessionStatus sessionStatus){

        User user = (User) modelMap.get("user");
        if (user != null) {
            user.setUserName("je");
            sessionStatus.setComplete();

        }
        return null;

    }

}
