package com.xiaohei.wms.server.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.List;

/**
 * 批量产品入库DTO
 */
public class BatchInventoryInDTO {

    @NotEmpty(message = "序列号列表不能为空")
    private List<String> sns;   // 产品序列号列表

    private List<String> macs;   // MAC地址列表(可选)

    @NotBlank(message = "用户ID不能为空")
    private String uid = "5116334187"; // 默认入库用户ID

    @NotNull(message = "产品类型不能为空")
    private Integer productTypeId; // 产品类型ID

    @NotNull(message = "操作时间不能为空")
    private LocalDateTime operationTime; // 入库时间
}
