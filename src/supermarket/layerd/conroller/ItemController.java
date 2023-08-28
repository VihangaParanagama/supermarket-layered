/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layerd.conroller;

import java.util.ArrayList;
import supermarket.layerd.dto.CustomerDto;
import supermarket.layerd.dto.ItemDto;
import supermarket.layerd.service.ServiceFactory;
import supermarket.layerd.service.custom.CustomerService;
import supermarket.layerd.service.custom.ItemService;

/**
 *
 * @author Vihanga
 */
public class ItemController {
     ItemService itemService = (ItemService) ServiceFactory.getInstance().getService(ServiceFactory.SeviceType.ITEM);
    
    public String addItem(ItemDto itemDto) throws Exception {
      return itemService.addItem(itemDto);
        
    }

    public ArrayList<ItemDto> getAllItem() throws Exception {
      return itemService.getAllItem();
    }

    public String updateItem(ItemDto itemDto) throws Exception {
       return itemService.updateItem(itemDto);
    }

    public String deleteItem(String id) throws Exception {
        return itemService.deleteItem(id);
    }

    public ItemDto getItem(String custId) throws Exception {
       return itemService.getItem(custId);
    }
}
