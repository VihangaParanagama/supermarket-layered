/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package supermarket.layerd.service.custom.impl;

import java.util.ArrayList;
import supermarket.layerd.dao.DaoFactory;
import supermarket.layerd.dao.custom.ItemDao;
import supermarket.layerd.dto.CustomerDto;
import supermarket.layerd.dto.ItemDto;
import supermarket.layerd.entity.ItemEntity;
import supermarket.layerd.service.custom.ItemService;

/**
 *
 * @author Vihanga
 */
public class ItemServiceImpl implements ItemService{
  
    ItemDao ItemDao = (ItemDao) DaoFactory.getInstance().getDao(DaoFactory.DaoTypes.ITEM);
    
    @Override
    public String addItem(ItemDto dto) throws Exception {
        if( ItemDao.add(new ItemEntity(dto.getId(),
                dto.getDescription(), 
                dto.getPackSize(),
                dto.getUnitPrice(),
                dto.getQoh()))){
            return "Succesfully Saved";
        }else{
            return "Fail";
        }
    }

    @Override
    public String updateItem(ItemDto dto) throws Exception {
       if( ItemDao.update(new ItemEntity(dto.getId(),
                dto.getDescription(), 
                dto.getPackSize(),
                dto.getUnitPrice(),
                dto.getQoh()))){
            return "Succesfully Saved";
        }else{
            return "Fail";
        }
    }

    @Override
    public String deleteItem(String id) throws Exception {
     if(ItemDao.delete(id)){
         return "Succesfully Delete";
     }else{
         return "Fail";
     }
    }

    @Override
    public ItemDto getItem(String id) throws Exception {
        ItemEntity entity = ItemDao.get(id);
        return new ItemDto(entity.getId(),
                entity.getDescription(), 
                entity.getPackSize(),
                entity.getUnitPrice(),
                entity.getQoh());
    }

    @Override
    public ArrayList<ItemDto> getAllItem() throws Exception {
        ArrayList<ItemDto> itemDtos = new ArrayList<>();
        
       ArrayList<ItemEntity> itemEntitys = ItemDao.getAll();
       
        for (ItemEntity entity : itemEntitys) {
            ItemDto itemDto = new ItemDto(entity.getId(),
                entity.getDescription(), 
                entity.getPackSize(),
                entity.getUnitPrice(),
                entity.getQoh());
            itemDtos.add(itemDto);
        }
        return itemDtos;
   
    }
    
}
