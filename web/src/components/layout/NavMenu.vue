<template>
  <el-menu
    :default-active="activeMenu"
    class="nav-menu"
    :collapse="sidebarCollapse"
    background-color="#304156"
    text-color="#bfcbd9"
    active-text-color="#409EFF"
    router
  >
    <el-menu-item index="/dashboard">
      <el-icon><DataLine /></el-icon>
      <template #title>仪表盘</template>
    </el-menu-item>
    
    <el-sub-menu index="inventory">
      <template #title>
        <el-icon><Box /></el-icon>
        <span>库存管理</span>
      </template>
      <el-menu-item index="/inventory/list">库存列表</el-menu-item>
      <el-menu-item index="/inventory/stock">库存盘点</el-menu-item>
      <el-menu-item index="/inventory/transfer">库存调拨</el-menu-item>
    </el-sub-menu>

    <el-sub-menu index="warehouse">
      <template #title>
        <el-icon><House /></el-icon>
        <span>仓库管理</span>
      </template>
      <el-menu-item index="/warehouse/list">仓库列表</el-menu-item>
      <el-menu-item index="/warehouse/area">库区管理</el-menu-item>
      <el-menu-item index="/warehouse/location">库位管理</el-menu-item>
    </el-sub-menu>

    <el-sub-menu index="goods">
      <template #title>
        <el-icon><Goods /></el-icon>
        <span>商品管理</span>
      </template>
      <el-menu-item index="/goods/list">商品列表</el-menu-item>
      <el-menu-item index="/goods/category">商品分类</el-menu-item>
    </el-sub-menu>

    <el-sub-menu index="order">
      <template #title>
        <el-icon><List /></el-icon>
        <span>订单管理</span>
      </template>
      <el-menu-item index="/order/inbound">入库单</el-menu-item>
      <el-menu-item index="/order/outbound">出库单</el-menu-item>
    </el-sub-menu>
  </el-menu>
</template>

<script>
import { computed } from 'vue'
import { useStore } from 'vuex'
import { useRoute } from 'vue-router'
import {
  DataLine,
  Box,
  House,
  Goods,
  List
} from '@element-plus/icons-vue'

export default {
  name: 'NavMenu',
  components: {
    DataLine,
    Box,
    House,
    Goods,
    List
  },
  setup() {
    const store = useStore()
    const route = useRoute()

    const sidebarCollapse = computed(() => store.state.sidebarCollapse)
    const activeMenu = computed(() => route.path)

    return {
      sidebarCollapse,
      activeMenu
    }
  }
}
</script>

<style lang="scss" scoped>
.nav-menu {
  height: 100%;
  border-right: none;

  :deep(.el-menu-item),
  :deep(.el-sub-menu__title) {
    &:hover {
      background-color: #263445 !important;
    }
  }

  :deep(.el-menu-item.is-active) {
    background-color: #263445 !important;
  }
}
</style> 