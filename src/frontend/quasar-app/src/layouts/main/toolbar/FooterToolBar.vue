<template>
  <div class="t_bar">
  <q-toolbar>
    <q-btn push color="primary" round icon="bi-list" @click="toggleLeftDrawer"/>
    <q-space />
    <q-btn push color="primary" round icon="bi-sliders" @click="toggleRightDrawer"/>
  </q-toolbar>
  </div>
</template>

<style scoped>
.t_bar {
  height: 64px

}
</style>
<script setup>
import { updateToggleLeft } from 'layouts/main/drawer/AppDrawerLeft.vue'
import { updateToggleRight } from 'layouts/main/drawer/AppDrawerRight.vue'
// variable

// functions
function toggleLeftDrawer () {
  updateToggleLeft()
}
function toggleRightDrawer () {
  updateToggleRight()
}
</script>
