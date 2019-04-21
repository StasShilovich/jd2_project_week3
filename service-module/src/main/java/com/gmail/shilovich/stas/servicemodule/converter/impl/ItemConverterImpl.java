package com.gmail.shilovich.stas.servicemodule.converter.impl;

import com.gmail.shilovich.stas.datamodule.model.Item;
import com.gmail.shilovich.stas.servicemodule.converter.ItemConverter;
import com.gmail.shilovich.stas.servicemodule.model.ItemDTO;
import com.gmail.shilovich.stas.servicemodule.model.ItemStatusDTO;
import org.springframework.stereotype.Component;

@Component
public class ItemConverterImpl implements ItemConverter {
    @Override
    public ItemDTO toDTO(Item item) {
        ItemDTO itemDTO = new ItemDTO();
        itemDTO.setId(item.getId());
        itemDTO.setName(item.getName());
        itemDTO.setStatus(item.getStatus());
        return itemDTO;
    }

    @Override
    public ItemStatusDTO toStatusDTO(Item item) {
        ItemStatusDTO itemStatusDTO = new ItemStatusDTO();
        itemStatusDTO.setId(item.getId());
        itemStatusDTO.setStatus(item.getStatus());
        return itemStatusDTO;
    }
}
