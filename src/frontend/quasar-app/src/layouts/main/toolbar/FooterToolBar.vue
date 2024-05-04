<template>
  <q-toolbar>
    <q-btn push color="primary" round icon="o_menu" @click="toggleLeftDrawer"/>
    <q-space />
    <q-btn push color="primary" round icon="o_account_circle" @click="toggleRightDrawer"/>
  </q-toolbar>
</template>

<style scoped>

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
