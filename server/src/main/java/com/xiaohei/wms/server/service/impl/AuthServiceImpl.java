package com.xiaohei.wms.server.service.impl;

import com.xiaohei.wms.server.dao.UserMapper;
import com.xiaohei.wms.server.dto.LoginDTO;
import com.xiaohei.wms.server.dto.UserDTO;
import com.xiaohei.wms.server.entity.User;
import com.xiaohei.wms.server.service.AuthService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl implements AuthService {

    private final AuthenticationManager authenticationManager;
    private final UserMapper userMapper;
    private final PasswordEncoder passwordEncoder;

    public AuthServiceImpl(AuthenticationManager authenticationManager,
                           UserMapper userMapper,
                           PasswordEncoder passwordEncoder) {
        this.authenticationManager = authenticationManager;
        this.userMapper = userMapper;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public ResponseEntity<?> login(LoginDTO loginDTO) {
        try {
            // 1. 生成认证令牌
            UsernamePasswordAuthenticationToken authenticationToken = new UsernamePasswordAuthenticationToken(
                    loginDTO.getUsername(),
                    loginDTO.getPassword()
            );


            // 2. 进行认证
            Authentication authentication = authenticationManager.authenticate(authenticationToken);

            // 3. 存储认证信息到安全上下文
            SecurityContextHolder.getContext().setAuthentication(authentication);

            // 4. 获取用户详细信息
            User user = userMapper.selectByUsername(loginDTO.getUsername());

            // 5.  返回用户DTO (排除敏感信息)
            return ResponseEntity.ok(convertToDTO(user));
        } catch (Exception e) {
            return ResponseEntity.status(401).body("登录失败: 用户名或密码错误");
        }
    }

    @Override
    public UserDTO getUserInfo(String uid) {
        User user = userMapper.selectByUid(uid);
        return convertToDTO(user);
    }

    private UserDTO convertToDTO(User user) {
        UserDTO dto = new UserDTO();
        dto.setUid(user.getUid());
        dto.setName(user.getName());
        dto.setUsername(user.getUsername());
        dto.setImgBase64(user.getImgBase64());
        return dto;
    }
}
