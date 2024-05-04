<template>
  <q-drawer v-model="rightDrawerOpen" bordered overlay side="right">
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
const rightDrawerOpen = ref(false)

// functions
export function updateToggle () {
  rightDrawerOpen.value = !rightDrawerOpen.value
}
</script>
