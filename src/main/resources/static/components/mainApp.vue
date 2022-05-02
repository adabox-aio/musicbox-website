<template>
  <v-app id="inspire" dark>
    <v-sheet class="overflow-hidden">
      <v-main class="fill-height" dark>
        <v-container style="max-width: 1920px;margin: 0 auto; position: relative; color: #000; padding: 0;">
          <router-view></router-view>
        </v-container>
      </v-main>
      <v-footer inset app color="#000" flat tile class="transparent text-center pa-10 foot">
        <div style="text-align: center;">
          <v-img eager src="img/cardano-logo.png" contain max-width="50" style="margin: auto; -webkit-filter: drop-shadow(1px 1px 1px #000); filter: drop-shadow(1px 1px 1px #000);"></v-img>
          <v-card-title class="justify-center px-0 pt-1" style="font-size: 12px;text-shadow: 1px 1px 1px rgba(0, 0, 0, 1);">Powered by Cardano</v-card-title>
        </div>
        <div style="text-align: center;" v-if="!$vuetify.breakpoint.mobile" class="pb-2">
          <v-card-text class="text-center pa-0" style="font-size: 12px;">420 Edition Drop Policy: <a href="https://cardanoscan.io/tokenPolicy/7136e7f40b368b3f3d9656f97b2c5ae01d0545882bc3cd86f8a80159" target="_blank" style="text-decoration: underline; color: #ffffff">7136e7f40b368b3f3d9656f97b2c5ae01d0545882bc3cd86f8a80159</a></v-card-text>
          <v-card-text class="text-center pa-0" style="font-size: 12px;">Alpha Drop Policy: <a href="https://cardanoscan.io/tokenPolicy/f7535d3356b29a16ce50a2843c539c9a05c94abfca7b96a26a56012c" target="_blank" style="text-decoration: underline; color: #ffffff">f7535d3356b29a16ce50a2843c539c9a05c94abfca7b96a26a56012c</a></v-card-text>
          <v-card-text class="text-center pa-0" style="font-size: 12px;">Custom Boxes Policy: <a href="https://cardanoscan.io/tokenPolicy/9668ef339ea4b29a29b7a500b1a1f6769568ddb623cc463f95fe07f2" target="_blank" style="text-decoration: underline; color: #ffffff">9668ef339ea4b29a29b7a500b1a1f6769568ddb623cc463f95fe07f2</a></v-card-text>
          <v-card-text class="text-center pa-0" style="font-size: 12px;">SpookyBox Policy: <a href="https://cardanoscan.io/tokenPolicy/b4da47758e35791000ea410d2bce998e05dded4370ef46e54b1fc1b0" target="_blank" style="text-decoration: underline; color: #ffffff">b4da47758e35791000ea410d2bce998e05dded4370ef46e54b1fc1b0</a></v-card-text>
        </div>
        <div style="display: flex; flex-direction: column; justify-content: space-between;">
          <div style="display: flex; justify-content: space-around;">
            <v-btn large href="https://twitter.com/MusicBoxCNFTs" target="_blank" icon>
              <v-icon large style="text-shadow: 1px 1px 3px rgba(0, 0, 0, 1);">mdi-twitter</v-icon>
            </v-btn>
            <v-btn large href="https://discord.gg/y9WQPWPSfF" target="_blank" icon>
              <v-icon large style="text-shadow: 1px 1px 3px rgba(0, 0, 0, 1);">mdi-discord</v-icon>
            </v-btn>
            <v-btn large href="https://www.instagram.com/musicboxcnft/" target="_blank" icon>
              <v-icon large style="text-shadow: 1px 1px 3px rgba(0, 0, 0, 1);">mdi-instagram</v-icon>
            </v-btn>
            <v-btn large href="https://www.youtube.com/channel/UCHJYf0DlshYXnk-BxYwvhWg" target="_blank" icon>
              <v-icon large style="text-shadow: 1px 1px 3px rgba(0, 0, 0, 1);">mdi-youtube</v-icon>
            </v-btn>
          </div>
          <div style="display: block;">
            <v-card-title class="justify-center px-0 pt-1" style="font-size: 12px;text-shadow: 1px 1px 1px rgba(0, 0, 0, 1);">{{ new Date().getFullYear() }} &copy; MusicBox</v-card-title>
          </div>
        </div>
      </v-footer>
    </v-sheet>
  </v-app>
</template>
<script>
module.exports = {
  created() {
    let vm = this;
    vm.$router.addRoutes([
      { path: '/', component: httpVueLoader('../components/pages/NFTs.vue')},
      { path: '*', component: httpVueLoader('../components/pages/404.vue') }
    ]);
  },
  mounted() {
    let vm = this;
  },
  methods: {},
  components: {
    'nfts': httpVueLoader('../components/pages/NFTs.vue'),
  },
  router: new VueRouter({
    mode: 'history'
  }),
  watch: {},
  data: () => ({
  })
}
</script>
<style>
.foot {
  max-width: 1920px;margin: auto;position: absolute; bottom: 0;width: 100%;z-index: 1; align-items: flex-end; display: flex; justify-content: space-between
}

@media (max-width: 430px) {
  .foot {
    justify-content: center;
  }
}
</style>