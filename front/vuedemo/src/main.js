// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import VueRouter from 'vue-router'
import App from './App'
import router from './router'
import 'iview/dist/styles/iview.css'
import iView from 'iview';

var axios = require('axios');
axios.defaults.baseURL = 'https://localhost:8080/api'
//将API方法绑定到全局
Vue.prototype.$axios = axios;
Vue.config.productionTip = false

Vue.use(VueRouter);
Vue.use(iView);

/* eslint-disable no-new */
new Vue({
  router,
  render: h => h(App),
}).$mount('#app')

