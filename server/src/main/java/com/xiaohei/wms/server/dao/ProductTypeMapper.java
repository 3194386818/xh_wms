package com.xiaohei.wms.server.dao;

import com.xiaohei.wms.server.entity.ProductType;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ProductTypeMapper {
    ProductType findByName(String name);
}
