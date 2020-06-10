package customerorder.backend.dao;

import customerorder.backend.model.OrderedService;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderedServiceRepository extends JpaRepository<OrderedService, Long> {}
