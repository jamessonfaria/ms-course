package br.com.jamesson.hrpayrool.services;

import br.com.jamesson.hrpayrool.entities.Payment;
import br.com.jamesson.hrpayrool.entities.Worker;
import br.com.jamesson.hrpayrool.feignClients.WorkerFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

  @Autowired
  private WorkerFeignClient workerFeignClient;

  public Payment getPayment(long workerId, int days) {
    Worker worker = workerFeignClient.findById(workerId);
    return new Payment(worker.getName(), worker.getDailyIncome(), days);
  }

}
