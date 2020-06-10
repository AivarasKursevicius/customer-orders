package customerorder.backend.controller;

import customerorder.backend.dao.CustomerRepository;
import customerorder.backend.dao.OrderedServiceRepository;
import customerorder.backend.dto.OrderRequest;
import customerorder.backend.dto.OrderResponse;
import customerorder.backend.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@RestController
public class OrderController {
  @Autowired private CustomerRepository customerRepository;
  @Autowired private OrderedServiceRepository orderedServiceRepository;

  @PostMapping("/order/new")
  public Customer placeOrder(@RequestBody OrderRequest request) {
    return customerRepository.save(request.getCustomer());
  }

  @DeleteMapping("/order/delete/{id}")
  public String deleteOrder(@PathVariable long id) {
    orderedServiceRepository.deleteById(id);
    return "Order with id :" + id + " has been deleted...";
  }

  @GetMapping("/customer/all")
  public List<Customer> getAllCustomers() {
    return customerRepository.findAll();
  }

  @GetMapping("/customer/{id}")
  public Customer getSingleCustomer(@PathVariable long id) {
    return customerRepository.findById(id);
  }

  @GetMapping("/order/all/{id}")
  public Set<OrderResponse> getOrderById(@PathVariable long id) {
    List<OrderResponse> allOrders = getJoinInformation();
    return allOrders.stream().filter(order -> order.getOrderId() == id).collect(Collectors.toSet());
  }

  @GetMapping("/order/all")
  public List<OrderResponse> getJoinInformation() {
    return customerRepository.getJoinInformation();
  }
}
