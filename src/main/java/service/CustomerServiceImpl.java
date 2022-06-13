package service;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService{
    private static List<Customer> customerList;
    static {
        customerList = new ArrayList<>();
        customerList.add(new Customer(1,"Cao","Cao@1","DongAnh1"));
        customerList.add(new Customer(2,"Van","Cao@12","DongAnh2"));
        customerList.add(new Customer(3,"Linh","Cao@123","DongAnh3"));
        customerList.add(new Customer(4,"Tu","Cao@1234","DongAnh4"));
    }
    @Override
    public List<Customer> findAll() {
        return new ArrayList<>(customerList);
    }

    @Override
    public void save(Customer customer) {
        customerList.add(customer.getId(), customer);
    }

    @Override
    public Customer findById(int id) {
        return customerList.get(id);
    }

    @Override
    public void update(int id, Customer customer) {
        customerList.add(id, customer);
    }

    @Override
    public void remove(int id) {
        customerList.remove(id);
    }

    @Override
    public List<Customer> findByName(String name) {
        for (Customer customer: customerList
        ) {
            if (customer.getName()==name)
                return (List<Customer>) customer;
        }
        return null;
    }
}
