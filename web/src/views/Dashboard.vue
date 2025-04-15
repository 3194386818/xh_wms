<template>
  <div class="dashboard">
    <el-row :gutter="20">
      <el-col :span="6">
        <el-card shadow="hover" class="data-card">
          <template #header>
            <div class="card-header">
              <span>总库存量</span>
              <el-icon><Box /></el-icon>
            </div>
          </template>
          <div class="card-content">
            <div class="number">1,234</div>
            <div class="unit">件</div>
          </div>
        </el-card>
      </el-col>
      <el-col :span="6">
        <el-card shadow="hover" class="data-card">
          <template #header>
            <div class="card-header">
              <span>今日入库</span>
              <el-icon><Upload /></el-icon>
            </div>
          </template>
          <div class="card-content">
            <div class="number">56</div>
            <div class="unit">单</div>
          </div>
        </el-card>
      </el-col>
      <el-col :span="6">
        <el-card shadow="hover" class="data-card">
          <template #header>
            <div class="card-header">
              <span>今日出库</span>
              <el-icon><Download /></el-icon>
            </div>
          </template>
          <div class="card-content">
            <div class="number">78</div>
            <div class="unit">单</div>
          </div>
        </el-card>
      </el-col>
      <el-col :span="6">
        <el-card shadow="hover" class="data-card">
          <template #header>
            <div class="card-header">
              <span>库存预警</span>
              <el-icon><Warning /></el-icon>
            </div>
          </template>
          <div class="card-content">
            <div class="number">12</div>
            <div class="unit">种</div>
          </div>
        </el-card>
      </el-col>
    </el-row>

    <el-row :gutter="20" class="chart-row">
      <el-col :span="12">
        <el-card shadow="hover">
          <template #header>
            <div class="card-header">
              <span>库存趋势</span>
            </div>
          </template>
          <div class="chart-container">
            <!-- 这里可以集成echarts图表 -->
            <div class="placeholder-chart">库存趋势图表</div>
          </div>
        </el-card>
      </el-col>
      <el-col :span="12">
        <el-card shadow="hover">
          <template #header>
            <div class="card-header">
              <span>出入库统计</span>
            </div>
          </template>
          <div class="chart-container">
            <!-- 这里可以集成echarts图表 -->
            <div class="placeholder-chart">出入库统计图表</div>
          </div>
        </el-card>
      </el-col>
    </el-row>
  </div>
</template>

<script>
import { Box, Upload, Download, Warning } from '@element-plus/icons-vue'

export default {
  name: 'Dashboard',
  components: {
    Box,
    Upload,
    Download,
    Warning
  }
}
</script>

<style lang="scss" scoped>
.dashboard {
  .data-card {
    .card-header {
      display: flex;
      justify-content: space-between;
      align-items: center;
    }

    .card-content {
      text-align: center;
      padding: 20px 0;

      .number {
        font-size: 24px;
        font-weight: bold;
        color: #409EFF;
      }

      .unit {
        margin-top: 10px;
        color: #909399;
      }
    }
  }

  .chart-row {
    margin-top: 20px;
  }

  .chart-container {
    height: 300px;
    display: flex;
    justify-content: center;
    align-items: center;

    .placeholder-chart {
      color: #909399;
    }
  }
}
</style> 