package com.xiaohei.wms.server.controller;

import com.xiaohei.wms.server.dto.LoginDTO;
import com.xiaohei.wms.server.dto.UserDTO;
import com.xiaohei.wms.server.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
public class AuthController {

    private final AuthService authService;

    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @PostMapping("/login")
    public ResponseEntity<?> login(@RequestBody LoginDTO loginDTO) {
        return authService.login(loginDTO);
    }

    @GetMapping("/userinfo")
    public ResponseEntity<UserDTO> getUserInfo(@RequestParam String uid) {
        return ResponseEntity.ok(authService.getUserInfo(uid));
    }
}
