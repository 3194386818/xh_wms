package com.xiaohei.wms.server.service;

import com.xiaohei.wms.server.dto.LoginDTO;
import com.xiaohei.wms.server.dto.UserDTO;
import org.springframework.http.ResponseEntity;

public interface AuthService {
    ResponseEntity<?> login(LoginDTO loginDTO);
    UserDTO getUserInfo(String uid);
}
