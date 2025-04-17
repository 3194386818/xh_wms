package com.xiaohei.wms.server.dao;

import com.xiaohei.wms.server.dto.InventoryQueryDTO;
import com.xiaohei.wms.server.entity.Inventory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InventoryMapper {

    void insertOrUpdateInventory(Inventory inventory);

    Inventory selectBySn(String sn);

    List<Inventory> selectByCondition(InventoryQueryDTO query);
}
