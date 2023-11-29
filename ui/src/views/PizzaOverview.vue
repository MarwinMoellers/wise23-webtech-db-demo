<script setup lang="ts">
import axios from 'axios';
import { Ref, ref } from 'vue';
import AddPizza from '@/components/AddPizza.vue';

type Pizza = {
  id: string;
  name: string;
}
let pizzas: Ref<Pizza[]> = ref([]);
axios
    .get('http://localhost:8089/api/pizza')
    .then((response) => {
      pizzas.value = response.data;
    });

function pizzaAddedByComp(pizza: Pizza) {
  pizzas.value.push(pizza)
}

</script>

<template>
  <table>
    <tr>
      <th>ID</th>
      <th>Name</th>
    </tr>
    <tr v-for="pizza in pizzas.values()" :key="pizza.id">
      <td>{{ pizza.id }}</td>
      <td>{{ pizza.name }}</td>
    </tr>
  </table>

  <AddPizza @pizzaAdded="pizzaAddedByComp"></AddPizza>
</template>

<style scoped>
table, th, td {
  border: 1px solid;
}
</style>