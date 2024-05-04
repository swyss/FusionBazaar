<template>
  <q-toolbar>
    <q-toolbar-title>
      <q-avatar>
        <img src="https://cdn.quasar.dev/logo-v2/svg/logo-mono-white.svg" alt="">
      </q-avatar>
      Title
    </q-toolbar-title>

    <q-btn dense flat icon="menu" round @click="toggleRightDrawer"/>
    <button @click="log">{{ msg }}</button>
  </q-toolbar>
</template>

<style scoped>

</style>
<script setup>
import { updateToggle } from 'layouts/main/AppDrawerRight.vue'
// variable
const msg = 'Hello! ToolBar'

// functions
function log () {
  console.log(msg)
}

function toggleRightDrawer () {
  updateToggle()
}
</script>
