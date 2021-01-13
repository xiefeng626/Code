package servicecomsumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import servicecomsumer.pojo.User;

@FeignClient(value = "service-providers",fallback = UserClientFallBack.class)
public interface UserClient {

    @RequestMapping("user/{id}")
    public User userQuery(@PathVariable("id") Long id);
}
