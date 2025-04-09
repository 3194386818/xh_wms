package com.xiaohei.wms.server.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

/**
 * 单件产品入库DTO
 */
@Data
public class InventoryInDTO {

    @NotBlank(message = "产品序列号不能为空")
    private String sn;          // 产品序列号

    private String mac;         // 设备MAC地址(可选)

    @NotBlank(message = "用户ID不能为空")
    private String uid = "5116334187"; // 默认入库用户ID

    @NotNull(message = "产品类型不能为空")
    private Integer productTypeId; // 产品类型ID

    @NotNull(message = "操作时间不能为空")
    private LocalDateTime operationTime; // 入库时间
}
