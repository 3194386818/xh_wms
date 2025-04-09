package com.xiaohei.wms.server.dao;

import com.xiaohei.wms.server.dto.InventoryQueryDTO;
import com.xiaohei.wms.server.entity.InventoryOperation;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface InventoryOperationMapper {

    void insertInventoryOperation(InventoryOperation operation);

    List<InventoryOperation> selectOperation(InventoryQueryDTO query);
}
