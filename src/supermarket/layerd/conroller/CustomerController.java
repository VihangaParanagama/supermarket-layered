 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layerd.conroller;

import java.util.ArrayList;
import supermarket.layerd.dto.CustomerDto;
import supermarket.layerd.service.ServiceFactory;
import supermarket.layerd.service.custom.CustomerService;
import supermarket.layerd.service.custom.impl.CustomerServiceImpl;

/**
 *
 * @author Vihanga
 */
public class CustomerController {

    CustomerService customerService = (CustomerService) ServiceFactory.getInstance().getService(ServiceFactory.SeviceType.CUSTOMER);
    
    public String addCustomer(CustomerDto customerDto) throws Exception {
      return customerService.addCustomer(customerDto);
        
    }

    public ArrayList<CustomerDto> getAllCustomer() throws Exception {
      return customerService.getAllCustomer();
    }

    public String updateCustomer(CustomerDto customerDto) throws Exception {
       return customerService.updateCustomer(customerDto);
    }

    public String deleteCustomer(String id) throws Exception {
        return customerService.deleteCustomer(id);
    }

    public CustomerDto getCustomer(String custId) throws Exception {
       return customerService.getCustomer(custId);
    }
    
     
}
