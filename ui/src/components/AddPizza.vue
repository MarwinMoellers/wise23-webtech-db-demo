<script setup lang="ts">
import { ref } from 'vue';
import axios from 'axios';

function onSubmit() {
  console.log('sumitted: ' + name.value);
  axios
      .post('http://localhost:8080/api/pizza', {name: name.value})
      .then((response) => {
        console.log("erstellt: " + response.data.id)
        emit('pizzaAdded', response.data)
      });
}
const emit = defineEmits(['pizzaAdded'])


const name = ref('');
</script>

<template>
  <form @submit.prevent="onSubmit">
    <label>Name:</label>
    <input v-model="name" type="text">
    <button>Hinzufügen</button>
  </form>
  {{name}}
</template>

<style scoped>

</style>