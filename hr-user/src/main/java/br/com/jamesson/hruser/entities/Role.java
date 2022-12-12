package br.com.jamesson.hruser.entities;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_role")
public class Role implements Serializable {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  private String roleName;

  public Role() {
  }

  public Role(Long id, String roleName) {
    this.id = id;
    this.roleName = roleName;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Role role = (Role) o;

    if (!id.equals(role.id)) {
      return false;
    }
    return roleName.equals(role.roleName);
  }

  @Override
  public int hashCode() {
    int result = id.hashCode();
    result = 31 * result + roleName.hashCode();
    return result;
  }
}
