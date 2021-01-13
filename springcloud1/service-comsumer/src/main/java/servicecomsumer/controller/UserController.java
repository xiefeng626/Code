package servicecomsumer.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import servicecomsumer.client.UserClient;
import servicecomsumer.pojo.User;

import java.util.List;

@RequestMapping("comsumer")
@Controller
@DefaultProperties(defaultFallback = "getError2")
public class UserController {
//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Qualifier("servicecomsumer.client.UserClient")
    @Autowired
    private UserClient userClient;


//    @ResponseBody
//    @RequestMapping("{id}")
//    @HystrixCommand
//    public String getUserById(@PathVariable("id") Long id){
//        System.out.println("消费者消费id: "+id);
//        try {
//            Thread.sleep(20000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
////        List<ServiceInstance> instances = discoveryClient.getInstances("service-providers");
////        ServiceInstance serviceInstance = instances.get(0);
////        String host = serviceInstance.getHost();
////        int port = serviceInstance.getPort();
////        return this.restTemplate.getForObject("http://"+host+":"+port+"/user/"+id,User.class);
////
//        //负载均衡通过服务名访问
//        return this.restTemplate.getForObject("http://service-providers/user/"+id,String.class);
//    }

    //第一种请求参数得保持一致
    public String getError(Long id){
        System.out.println("出错ID："+id);
        return "请求出错，请稍后再试试";
    }
    //在类上指定的熔断器不需要参数 在方法中指定的熔断器需要参数一致
    public User getError2(){
        System.out.println("feign 通用请求出错，请稍后再试试！！");
        return null;
    }

    @RequestMapping("{id}")
    @ResponseBody
    public User getUserById2(@PathVariable("id") Long id){
        return userClient.userQuery(id);
    }

}
