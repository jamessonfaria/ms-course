package br.com.jamesson.hrpayrool.feignClients;

import br.com.jamesson.hrpayrool.entities.Worker;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(name = "hr-worker", url = "localhost:8001", path = "/workers")
public interface WorkerFeignClient {

  @GetMapping(value = "/{id}")
  Worker findById(@PathVariable Long id);

}
