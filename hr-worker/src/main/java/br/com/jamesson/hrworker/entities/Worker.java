package br.com.jamesson.hrworker.entities;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_worker")
public class Worker implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String name;
  private Double dailyIncome;

  public Worker(){
  }

  public Worker(Long id, String name, Double dailyIncome) {
    this.id = id;
    this.name = name;
    this.dailyIncome = dailyIncome;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getDailyIncome() {
    return dailyIncome;
  }

  public void setDailyIncome(Double dailyIncome) {
    this.dailyIncome = dailyIncome;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Worker worker = (Worker) o;

    if (!Objects.equals(id, worker.id)) {
      return false;
    }
    if (!Objects.equals(name, worker.name)) {
      return false;
    }
    return Objects.equals(dailyIncome, worker.dailyIncome);
  }

  @Override
  public int hashCode() {
    int result = id != null ? id.hashCode() : 0;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + (dailyIncome != null ? dailyIncome.hashCode() : 0);
    return result;
  }
}
