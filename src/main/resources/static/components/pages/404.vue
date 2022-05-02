<template>
  <div style="background-color: white; width: 100%; height: 100vh" class="text-center align-center justify-center">
    <v-img src="/img/404.png" style="height: 100vh"></v-img>
  </div>
</template>
<script>
module.exports = {
  mounted() {
    this.$vuetify.rtl = false
  },
}
</script>
<style>
.fillheight {
  min-height: calc(100vh - 368px);
  height: -o-calc(100vh - 368px);
  height: -webkit-calc(100vh - 368px);
  height: -moz-calc(100vh - 368px);
}
</style>