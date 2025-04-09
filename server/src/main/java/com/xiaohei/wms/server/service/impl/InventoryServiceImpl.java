package com.xiaohei.wms.server.service.impl;

import com.xiaohei.wms.server.dto.BatchInventoryInDTO;
import com.xiaohei.wms.server.dto.InventoryInDTO;
import com.xiaohei.wms.server.dto.InventoryOutDTO;
import com.xiaohei.wms.server.dto.InventoryQueryDTO;
import com.xiaohei.wms.server.entity.Inventory;
import com.xiaohei.wms.server.entity.InventoryOperation;
import com.xiaohei.wms.server.service.InventoryService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService {
    @Override
    public void inStock(InventoryInDTO dto) {

    }

    @Override
    public void outStock(InventoryOutDTO dto) {

    }

    @Override
    public void batchInStock(BatchInventoryInDTO dto) {

    }

    @Override
    public List<Inventory> queryInventory(InventoryQueryDTO query) {
        return null;
    }

    @Override
    public List<InventoryOperation> getOperations(InventoryQueryDTO query) {
        return null;
    }
}
