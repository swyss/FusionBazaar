<template>
    <q-toolbar>
      <q-toolbar-title class="q-pa-lg">
        <q-avatar>
          <img alt="" src="https://cdn.quasar.dev/logo-v2/svg/logo-mono-white.svg">
        </q-avatar>
        Title
      </q-toolbar-title>
      <q-space></q-space>
      <q-btn padding="sm md" dense flat square icon="bi-person-square"></q-btn>
      <q-btn padding="sm" dense flat square icon="bi-info-circle" @click="printInfo"></q-btn>
      <q-btn padding="sm" dense flat square icon="bi-moon-stars" @click="toggleDarkMode"></q-btn>
    </q-toolbar>
</template>
<style scoped>

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
