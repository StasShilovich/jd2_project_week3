package com.gmail.shilovich.stas.servicemodule.converter.impl;

import com.gmail.shilovich.stas.datamodule.model.Item;
import com.gmail.shilovich.stas.servicemodule.converter.ItemStatusDTOConverter;
import com.gmail.shilovich.stas.servicemodule.model.ItemStatusDTO;
import org.springframework.stereotype.Component;

@Component
public class ItemStatusDTOConverterImpl implements ItemStatusDTOConverter {
    @Override
    public Item fromDTO(ItemStatusDTO itemStatusDTO) {
        Item item=new Item();
        item.setId(itemStatusDTO.getId());
        item.setStatus(itemStatusDTO.getStatus());
        return item;
    }
}
