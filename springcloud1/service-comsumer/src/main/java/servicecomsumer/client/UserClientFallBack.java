package servicecomsumer.client;

import org.springframework.stereotype.Component;
import servicecomsumer.pojo.User;

@Component
public class UserClientFallBack implements UserClient{
    @Override
    public User userQuery(Long id) {
        User user = new User();
        user.setUsername("访问错误 熔断！");
        return user;
    }
}
