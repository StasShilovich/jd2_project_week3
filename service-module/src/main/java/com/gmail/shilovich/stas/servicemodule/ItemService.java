package com.gmail.shilovich.stas.servicemodule;

import com.gmail.shilovich.stas.servicemodule.model.ItemDTO;

import java.util.List;

public interface ItemService {
    ItemDTO add(ItemDTO item);

    List<ItemDTO> getItems();

    int update(Long id, String status);
}
