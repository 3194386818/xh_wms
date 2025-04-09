package com.xiaohei.wms.server.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * 产品出库DTO
 */
@Data
public class InventoryOutDTO {

    @NotBlank(message = "产品序列号不能为空")
    private String sn;          // 产品序列号

    @NotBlank(message = "MAC地址不能为空")
    private String mac;         // 设备MAC地址

    @NotBlank(message = "用户ID不能为空")
    private String uid;         // 出库目标用户ID

    @NotNull(message = "操作时间不能为空")
    private LocalDateTime operationTime; // 出库时间
}
