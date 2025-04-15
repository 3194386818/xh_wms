<template>
  <el-container class="app-container">
    <el-header>
      <nav-header />
    </el-header>
    <el-container>
      <el-aside width="200px">
        <nav-menu />
      </el-aside>
      <el-main>
        <router-view />
      </el-main>
    </el-container>
  </el-container>
</template>

<script>
import NavHeader from './components/layout/NavHeader.vue'
import NavMenu from './components/layout/NavMenu.vue'

export default {
  name: 'App',
  components: {
    NavHeader,
    NavMenu
  }
}
</script>

<style lang="scss">
.app-container {
  height: 100vh;
  
  .el-header {
    background-color: #409EFF;
    color: white;
    line-height: 60px;
    padding: 0;
  }
  
  .el-aside {
    background-color: #304156;
    color: white;
  }
  
  .el-main {
    background-color: #f0f2f5;
    padding: 20px;
  }
}
</style> 