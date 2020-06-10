package customerorder.backend.dao;

import customerorder.backend.dto.OrderResponse;
import customerorder.backend.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

  Customer findById(long id);

  @Query(
      "SELECT new customerorder.backend.dto.OrderResponse(o.id , c.name, o.name , o.description, o.type, o.activeFrom, o.activeTo) FROM Customer c JOIN c.orderedServices o")
  public List<OrderResponse> getJoinInformation();
}
