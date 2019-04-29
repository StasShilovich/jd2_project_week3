package com.gmail.shilovich.stas.servicemodule.converter;

import com.gmail.shilovich.stas.datamodule.model.Item;
import com.gmail.shilovich.stas.servicemodule.model.ItemDTO;
import com.gmail.shilovich.stas.servicemodule.model.ItemStatusDTO;

public interface ItemConverter {
    ItemDTO toDTO(Item item);
    ItemStatusDTO toStatusDTO(Item item);
}
