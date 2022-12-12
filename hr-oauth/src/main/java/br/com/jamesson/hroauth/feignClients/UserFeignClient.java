package br.com.jamesson.hroauth.feignClients;

import br.com.jamesson.hroauth.entities.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "hr-user", path = "/users")
public interface UserFeignClient {

  @GetMapping(value = "/search")
  User findByEmail(@RequestParam String email);

}
