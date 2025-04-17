import { createRouter, createWebHistory } from 'vue-router'

const routes = [
  {
    path: '/',
    redirect: '/dashboard'
  },
  {
    path: '/dashboard',
    name: 'Dashboard',
    component: () => import('../views/Dashboard.vue'),
    meta: { title: '仪表盘' }
  },
  {
    path: '/inventory',
    name: 'Inventory',
    component: () => import('../views/Inventory.vue'),
    meta: { title: '库存管理' }
  },
  {
    path: '/warehouse',
    name: 'Warehouse',
    component: () => import('../views/Warehouse.vue'),
    meta: { title: '仓库管理' }
  },
  {
    path: '/goods',
    name: 'Goods',
    component: () => import('../views/Goods.vue'),
    meta: { title: '商品管理' }
  },
  {
    path: '/order',
    name: 'Order',
    component: () => import('../views/Order.vue'),
    meta: { title: '订单管理' }
  },
  {
    path: '/order/track',
    name: 'OrderTrack',
    component: () => import('../views/OrderTrack.vue'),
    meta: { title: '跟踪订单' }
  }
]

const router = createRouter({
  history: createWebHistory(process.env.BASE_URL),
  routes
})

export default router 