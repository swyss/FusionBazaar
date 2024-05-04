<template>
  <q-layout view="hHh lpR fFr">
    <!--HEADER-->
    <q-header class="bg-primary text-white" elevated height-hint="98" reveal>
      <!--ToolBar's-->
      <header-tool-bar-top></header-tool-bar-top>
      <header-tool-bar></header-tool-bar>
    </q-header>
    <!--Drawer's-->
    <app-drawer-left></app-drawer-left>
    <app-drawer-right></app-drawer-right>
    <!--CONTENT-->
    <q-page-container>
      <router-view/>
    </q-page-container>
    <!--FOOTER-->
    <q-footer class="bg-grey-8 text-white" elevated reveal>
      <!--ToolBar's-->
      <footer-tool-bar></footer-tool-bar>
    </q-footer>

  </q-layout>
</template>

<script setup>
import AppDrawerLeft from 'layouts/main/drawer/AppDrawerLeft.vue'
import AppDrawerRight from 'layouts/main/drawer/AppDrawerRight.vue'
import HeaderToolBar from 'layouts/main/toolbar/HeaderToolBar.vue'
import HeaderToolBarTop from 'layouts/main/toolbar/HeaderToolBarTop.vue'
import FooterToolBar from 'layouts/main/toolbar/FooterToolBar.vue'
//
// variable

// functions

</script>
