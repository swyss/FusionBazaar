<template>
  <q-layout view="hHh lpR fFr">
    <!--HEADER-->
    <q-header class="bg-primary text-white" elevated height-hint="98" reveal>
      <!--ToolBar-->
      <app-tool-bar></app-tool-bar>
      <!--Tabs-->
      <q-tabs align="left">
        <q-route-tab label="Page One" to="/page1"/>
        <q-route-tab label="Page Two" to="/page2"/>
        <q-route-tab label="Page Three" to="/page3"/>
      </q-tabs>
    </q-header>
    <!--Drawer-->
    <app-drawer-right></app-drawer-right>
    <!--CONTENT-->
    <q-page-container>
      <router-view/>
      <button @click="log">{{ msg }}</button>
    </q-page-container>
    <!--FOOTER-->
    <q-footer class="bg-grey-8 text-white" elevated reveal>
      <q-toolbar>
        <q-toolbar-title>
          <q-avatar>
            <img src="https://cdn.quasar.dev/logo-v2/svg/logo-mono-white.svg" alt="">
          </q-avatar>
          <div>Title</div>
        </q-toolbar-title>
      </q-toolbar>
    </q-footer>

  </q-layout>
</template>

<script setup>
import AppDrawerRight from 'layouts/main/AppDrawerRight.vue'
import AppToolBar from 'layouts/main/AppToolBar.vue'
// variable
const msg = 'Hello! ToolBar'

// functions
function log () {
  console.log(msg)
}
</script>
