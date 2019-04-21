package com.gmail.shilovich.stas.servicemodule.converter;

import com.gmail.shilovich.stas.datamodule.model.Item;
import com.gmail.shilovich.stas.servicemodule.model.ItemDTO;

public interface ItemDTOConverter {
    Item fromDTO(ItemDTO itemDTO);
}
