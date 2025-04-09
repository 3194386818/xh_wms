package com.xiaohei.wms.server.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class InventoryOperation {
    private Long id;
    private String sn;
    private String mac;
    private String uid;
    private Integer productTypeId;
    private String operationType;
    private LocalDateTime operationTime;
    private String operatorUid;
}
