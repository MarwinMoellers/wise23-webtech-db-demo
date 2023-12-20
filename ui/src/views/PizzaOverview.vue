<script setup lang="ts">
import { Ref, ref } from 'vue'
import AddPizza from '@/components/AddPizza.vue'
import { Configuration, type Pizza, PizzaControllerApi } from '@/app/api/generated'

let pizzas: Ref<Pizza[]> = ref([]);
// axios
//     .get('http://localhost:8080/api/pizza')
//     .then((response) => {
//       pizzas.value = response.data;
//     });
let pizzaController = new PizzaControllerApi({basePath: 'http://localhost:8080'} as Configuration)
pizzaController.findAll()
  .then(value => {
    pizzas.value = value.data;
  });

function pizzaAddedByComp(pizza: Pizza) {
  pizzas.value.push(pizza)
}

</script>

<template>
  <div>

  </div>

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