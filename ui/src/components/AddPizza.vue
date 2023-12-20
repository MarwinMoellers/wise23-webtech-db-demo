<script setup lang="ts">
import { ref } from 'vue'
import axios from 'axios'
import { type Pizza, PizzaControllerApi } from '@/app/api/generated'

function onSubmit() {
  console.log('sumitted: ' + name.value)
  new PizzaControllerApi().createPizza({ name: name.value } as Pizza)
    .then(value => emit('pizzaAdded', value.data))
}

const emit = defineEmits(['pizzaAdded'])


const name = ref('')
</script>

<template>
  <form @submit.prevent="onSubmit">
    <label>Name:</label>
    <input v-model="name" type="text">
    <button>Hinzufügen</button>
  </form>
  {{ name }}
</template>

<style scoped>

</style>