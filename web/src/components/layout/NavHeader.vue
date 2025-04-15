<template>
  <div class="nav-header">
    <div class="left">
      <el-icon class="toggle-sidebar" @click="toggleSidebar">
        <Fold v-if="!sidebarCollapse" />
        <Expand v-else />
      </el-icon>
      <span class="title">小黑仓库管理系统</span>
    </div>
    <div class="right">
      <el-dropdown>
        <span class="user-info">
          {{ userInfo?.username || '未登录' }}
          <el-icon><ArrowDown /></el-icon>
        </span>
        <template #dropdown>
          <el-dropdown-menu>
            <el-dropdown-item @click="handleLogout">退出登录</el-dropdown-item>
          </el-dropdown-menu>
        </template>
      </el-dropdown>
    </div>
  </div>
</template>

<script>
import { computed } from 'vue'
import { useStore } from 'vuex'
import { useRouter } from 'vue-router'
import { Fold, Expand, ArrowDown } from '@element-plus/icons-vue'

export default {
  name: 'NavHeader',
  components: {
    Fold,
    Expand,
    ArrowDown
  },
  setup() {
    const store = useStore()
    const router = useRouter()

    const sidebarCollapse = computed(() => store.state.sidebarCollapse)
    const userInfo = computed(() => store.state.userInfo)

    const toggleSidebar = () => {
      store.commit('TOGGLE_SIDEBAR')
    }

    const handleLogout = async () => {
      await store.dispatch('logout')
      router.push('/login')
    }

    return {
      sidebarCollapse,
      userInfo,
      toggleSidebar,
      handleLogout
    }
  }
}
</script>

<style lang="scss" scoped>
.nav-header {
  display: flex;
  justify-content: space-between;
  align-items: center;
  height: 100%;
  padding: 0 20px;

  .left {
    display: flex;
    align-items: center;

    .toggle-sidebar {
      font-size: 20px;
      cursor: pointer;
      margin-right: 20px;
    }

    .title {
      font-size: 18px;
      font-weight: bold;
    }
  }

  .right {
    .user-info {
      color: white;
      cursor: pointer;
      display: flex;
      align-items: center;

      .el-icon {
        margin-left: 5px;
      }
    }
  }
}
</style> 