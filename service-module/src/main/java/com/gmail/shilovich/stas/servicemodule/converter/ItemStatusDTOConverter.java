package com.gmail.shilovich.stas.servicemodule.converter;

import com.gmail.shilovich.stas.datamodule.model.Item;
import com.gmail.shilovich.stas.servicemodule.model.ItemStatusDTO;

public interface ItemStatusDTOConverter {
    Item fromDTO(ItemStatusDTO itemStatusDTO);
}
