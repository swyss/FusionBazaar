<template>
  <q-drawer show-if-above v-model="leftDrawerOpen" side="left" bordered>
    <button @click="log">{{ msg }}</button>
  </q-drawer>
</template>

<style scoped>

</style>

<script setup>
// variable
const msg = 'Hello! ToolBar'

// functions
function log () {
  console.log(msg)
}
</script>
<script>
import { ref } from 'vue'
// variable
const leftDrawerOpen = ref(false)
// functions
export function updateToggleLeft () {
  leftDrawerOpen.value = !leftDrawerOpen.value
}
</script>
