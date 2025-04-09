package com.xiaohei.wms.server.service;

import com.xiaohei.wms.server.dto.BatchInventoryInDTO;
import com.xiaohei.wms.server.dto.InventoryInDTO;
import com.xiaohei.wms.server.dto.InventoryOutDTO;
import com.xiaohei.wms.server.dto.InventoryQueryDTO;
import com.xiaohei.wms.server.entity.Inventory;
import com.xiaohei.wms.server.entity.InventoryOperation;

import java.util.List;

public interface InventoryService {
    void inStock(InventoryInDTO dto);
    void outStock(InventoryOutDTO dto);
    void batchInStock(BatchInventoryInDTO dto);
    List<Inventory> queryInventory(InventoryQueryDTO query);
    List<InventoryOperation> getOperations(InventoryQueryDTO query);
}
