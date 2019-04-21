package com.gmail.shilovich.stas.servicemodule.converter.impl;

import com.gmail.shilovich.stas.datamodule.model.Item;
import com.gmail.shilovich.stas.servicemodule.converter.ItemDTOConverter;
import com.gmail.shilovich.stas.servicemodule.model.ItemDTO;
import org.springframework.stereotype.Component;

@Component
public class ItemDTOConverterImpl implements ItemDTOConverter {
    @Override
    public Item fromDTO(ItemDTO itemDTO) {
        Item item=new Item();
        item.setId(itemDTO.getId());
        item.setName(itemDTO.getName());
        item.setStatus(itemDTO.getStatus());
        return item;
    }
}
