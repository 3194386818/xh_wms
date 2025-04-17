package com.xiaohei.wms.server.entity;

import lombok.Data;

import java.time.LocalDateTime;


@Data
public class Inventory {
    private String sn;
    private String mac;
    private String uid;
    private Integer productTypeId;
    private String status;
    private LocalDateTime lastOperationTime;
}
