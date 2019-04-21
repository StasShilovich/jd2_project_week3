package com.gmail.shilovich.stas.servicemodule.impl;

import com.gmail.shilovich.stas.datamodule.ItemRepository;
import com.gmail.shilovich.stas.servicemodule.ItemService;
import com.gmail.shilovich.stas.servicemodule.converter.ItemConverter;
import com.gmail.shilovich.stas.servicemodule.converter.ItemDTOConverter;
import com.gmail.shilovich.stas.servicemodule.converter.ItemStatusDTOConverter;
import com.gmail.shilovich.stas.servicemodule.model.ItemDTO;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemServiceImpl implements ItemService {

    private static final Logger logger = LogManager.getLogger(ItemServiceImpl.class);
    private static final String ERROR_MESSAGE = "Service module operation failed";

    private final ItemRepository itemRepository;
    private final ItemConverter itemConverter;
    private final ItemDTOConverter itemDTOConverter;
    private final ItemStatusDTOConverter itemStatusDTOConverter;

    @Autowired
    public ItemServiceImpl(ItemRepository itemRepository, ItemConverter itemConverter, ItemDTOConverter itemDTOConverter, ItemStatusDTOConverter itemStatusDTOConverter) {
        this.itemRepository = itemRepository;
        this.itemConverter = itemConverter;
        this.itemDTOConverter = itemDTOConverter;
        this.itemStatusDTOConverter = itemStatusDTOConverter;
    }

    @Override
    public ItemDTO add(ItemDTO item) {
        return null;
    }

    @Override
    public List<ItemDTO> getItems() {
        return null;
    }

    @Override
    public int update(Long id, String status) {
        return 0;
    }
}
