<template>
  <div class="t_bar vertical-bottom">
  <q-toolbar>
    <q-btn padding="md" size="md" dense flat  square icon="bi-list" @click="toggleLeftDrawer"/>
    <q-separator vertical inset  color="white"/>
    <q-btn padding="md" size="md" dense flat square icon="bi-house"/>
    <q-btn padding="md" size="md" dense flat square icon="bi-star"/>
    <q-space />
    <q-tabs align="left">
      <q-route-tab label="Page One" to="/page1"/>
      <q-route-tab label="Page Two" to="/page2"/>
      <q-route-tab label="Page Three" to="/page3"/>
    </q-tabs>
    <q-space />
    <q-btn padding="md" size="md" dense flat square icon="bi-gear"/>
    <q-separator vertical inset  color="white"/>
    <q-btn padding="md" size="md" dense flat square icon="bi-sliders"  @click="toggleRightDrawer"/>
  </q-toolbar>
  </div>
  <!--Tabs-->

</template>

<style scoped>
.t_bar {
  height: 72px;

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
