package com.xiaohei.wms.server.controller;


import com.xiaohei.wms.server.dto.InventoryQueryDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/inventory")
public class InventoryController {

    @PostMapping("/in")
    public ResponseEntity<?> inStock(InventoryQueryDTO dto) {


        return ResponseEntity.ok().build();
    }
}
