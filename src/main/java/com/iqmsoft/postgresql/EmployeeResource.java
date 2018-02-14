package com.iqmsoft.postgresql;

import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import java.util.List;


@Path("/")
@Stateless
public class EmployeeResource {

  @PersistenceContext
  EntityManager em;

  @GET
  @Produces("application/json")
  public List<Employee> get() {
    return em.createNamedQuery("Employee.findAll", Employee.class).getResultList();
  }

}
