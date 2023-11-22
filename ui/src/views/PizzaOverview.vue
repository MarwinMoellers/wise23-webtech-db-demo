<script lang="ts">
import axios from 'axios';

export default {
  data() {
    return {
      pizzas: {}
    };
  },
  mounted() {
    axios
        .get('http://localhost:8088/api/pizza')
        .then((response) => {
          this.pizzas = response.data;
        });
  }
};
</script>

<template>
  <div v-for="pizza in pizzas" :key="pizza.id">
    <p>{{ pizza.id }}</p>
    {{ pizza.name }}
  </div>
</template>

<style scoped>

</style>