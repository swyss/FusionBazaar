<template>
  <div class="t_bar">
  <q-toolbar>
    <q-toolbar-title>
      <q-avatar>
        <img src="https://cdn.quasar.dev/logo-v2/svg/logo-mono-white.svg" alt="">
      </q-avatar>
      Title
    </q-toolbar-title>
    <q-btn dense flat icon="o_info" round @click="printInfo"></q-btn>
    <q-btn dense flat icon="o_dark_mode" round @click="toggleDarkMode"></q-btn>
  </q-toolbar>
  </div>
</template>

<style scoped>
.t_bar{height: 72px}
</style>
<script setup>
import { useQuasar } from 'quasar'
// variable
const $q = useQuasar()
const msg = 'Hello, from APP'

// functions
function toggleDarkMode () {
  $q.dark.toggle()
}
function printInfo () {
  console.log(msg)
  console.log($q.version)
  console.log($q.lang.getLocale())
  console.log($q.platform.is)
}
</script>
