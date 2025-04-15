import { createStore } from 'vuex'

export default createStore({
  state: {
    userInfo: null,
    token: localStorage.getItem('token') || '',
    sidebarCollapse: false
  },
  mutations: {
    SET_USER_INFO(state, userInfo) {
      state.userInfo = userInfo
    },
    SET_TOKEN(state, token) {
      state.token = token
      localStorage.setItem('token', token)
    },
    TOGGLE_SIDEBAR(state) {
      state.sidebarCollapse = !state.sidebarCollapse
    }
  },
  actions: {
    login({ commit }, userInfo) {
      return new Promise((resolve) => {
        // TODO: 调用登录API
        commit('SET_TOKEN', 'mock-token')
        commit('SET_USER_INFO', userInfo)
        resolve()
      })
    },
    logout({ commit }) {
      return new Promise((resolve) => {
        commit('SET_TOKEN', '')
        commit('SET_USER_INFO', null)
        localStorage.removeItem('token')
        resolve()
      })
    }
  },
  getters: {
    isLoggedIn: state => !!state.token,
    userInfo: state => state.userInfo
  }
}) 