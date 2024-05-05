<template>
  <q-drawer show-if-above v-model="leftDrawerOpen" side="left" bordered>
    <q-list padding>
      <q-item clickable v-ripple>
        <q-item-section avatar>
          <q-icon name="o_inbox" />
        </q-item-section>

        <q-item-section>
          Inbox
        </q-item-section>
      </q-item>

      <q-item active clickable v-ripple>
        <q-item-section avatar>
          <q-icon name="o_star" />
        </q-item-section>

        <q-item-section>
          Star
        </q-item-section>
      </q-item>

      <q-item clickable v-ripple>
        <q-item-section avatar>
          <q-icon name="o_send" />
        </q-item-section>

        <q-item-section>
          Send
        </q-item-section>
      </q-item>

      <q-item clickable v-ripple @click="log">
        <q-item-section avatar>
          <q-icon name="o_drafts" />
        </q-item-section>

        <q-item-section>
          Drafts
        </q-item-section>
      </q-item>
    </q-list>
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
