package servicecomsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import servicecomsumer.pojo.User;

@RequestMapping("comsumer")
@Controller
public class UserController {
    @Autowired
    private RestTemplate restTemplate;

    @ResponseBody
    @RequestMapping("{id}")
    public User getUserById(@PathVariable("id") Long id){
        System.out.println("消费者消费id"+id);
        return this.restTemplate.getForObject("http://127.0.0.1:8088/user/"+id,User.class);
    }
}
