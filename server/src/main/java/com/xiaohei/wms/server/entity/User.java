package com.xiaohei.wms.server.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class User {

    private String uid;
    private String username;
    private String passwd;
    private String name;
    private String imgBase64;
    private LocalDateTime create_time;
    private LocalDateTime update_time;
}
