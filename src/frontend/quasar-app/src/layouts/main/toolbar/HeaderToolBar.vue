<template>
  <q-toolbar height="172px">
    <q-btn dense flat icon="o_menu" round @click="toggleLeftDrawer"/>
    <q-separator dark vertical inset />
    <q-space />
    <q-tabs align="left">
      <q-route-tab label="Page One" to="/page1"/>
      <q-route-tab label="Page Two" to="/page2"/>
      <q-route-tab label="Page Three" to="/page3"/>
    </q-tabs>
    <q-space />
    <q-btn dense flat icon="o_account_circle" round @click="toggleRightDrawer"/>
  </q-toolbar>
  <!--Tabs-->

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
