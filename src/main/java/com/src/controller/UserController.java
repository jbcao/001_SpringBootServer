package com.src.controller;

import com.src.service.UserIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.src.entity.User;
import com.src.service.impl.UserServiceImpl;
@RequestMapping("/UserController")
@RestController
public class UserController {

    @Autowired
    private UserIService userService;

    @GetMapping("/say")
     public String say(){  
    	 String a ="sssss";
         return a;
     }

    @GetMapping("/addNewUser")
     public void addNewUser(){  
    	int i;
		for(i=1;i<10000000;i++) {
    		 User user = new User();
    		 user.setUsername("user"+i);
    		 user.setPassword("password");
    		 user.setAge(i);
    		 userService.insert(user); 
    	 }
     }  
     
    @RequestMapping("/find")
    public String find(){
        User user =  userService.find(18);
       // ModelAndView mav = new ModelAndView();
        //mav.addObject("user","sadf");
        return "HelloWord"+"fasdf--"+user.getUsername()+"--"+user.getPassword();
    }


    @GetMapping("/ajax")
    public String find1(){
        return "[''message':'123dfx']";
    }
    
//    public static void main(String[] args){
//        SpringApplication.run(UserController.class,args);
//    }
   
    
}