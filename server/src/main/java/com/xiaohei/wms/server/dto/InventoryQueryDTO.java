package com.xiaohei.wms.server.dto;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class InventoryQueryDTO {
    // 基础查询条件
    private String sn;          // 产品序列号
    private String mac;         // 设备MAC地址
    private String uid;         // 用户ID
    private Integer productTypeId; // 产品类型ID,,1: 摄像头， 2: IPTV
    private String status;      // 库存状态: IN_STOCK/OUT_STOCK

    // 时间范围查询
    private LocalDateTime startTime = null; // 开始时间(用于操作时间范围查询)
    private LocalDateTime endTime = null;   // 结束时间(用于操作时间范围查询)

    // 分页参数
    private Integer pageNum = 1;    // 当前页码
    private Integer pageSize = 4;   // 每页数量

    // 排序参数
    private String sortField = "";   // 排序字段(如: lastOperationTime)
    private String sortOrder = "";   // 排序方向(asc/desc)

    public String getOrderByClause() {
        if (sortField == null || sortField.isEmpty()) {
            return "last_operation_time DESC"; // 默认排序
        }

        String fieldName;
        switch (sortField) {
            case "sn":
                fieldName = "sn";
                break;
            case "mac":
                fieldName = "mac";
                break;
            case "uid":
                fieldName = "uid";
                break;
            case "lastOperationTime":
            default:
                fieldName = "last_operation_time";
        }

        return fieldName + " " + ("desc".equalsIgnoreCase(sortOrder) ? "DESC" : "ASC");
    }
}
