// The Vue build version to load with the `import` command
// (runtime-only or standalone) has been set in webpack.base.conf with an alias.
import Vue from 'vue'
import App from './App'
import router from './router'
import VueI18n from 'vue-i18n'
import Axios from 'axios';

Vue.use(VueI18n);

Vue.config.productionTip = false

const i18n = new VueI18n({
  locale: 'zh-CN'
});


/* eslint-disable no-new */
const app = new Vue({
  el: '#app',
  i18n,
  router,
  components: { App },
  template: '<App/>'
})

Axios.get('http://127.0.0.1:8080/internationalize/initInternationalize',{})
  .then(response => {
    i18n.setLocaleMessage('zh-CN',Object.assign(response.data));
  });


