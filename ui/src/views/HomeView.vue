<script setup lang="ts">
import TheWelcome from '../components/TheWelcome.vue'
import AddPizza from '@/components/AddPizza.vue';
import router from '@/router';
</script>

<template>
  <main>
    <router-link to="/pizza" data-cy="overview-button"> Pizza Übersicht </router-link>
    <router-link to="/gridflow" data-cy="overview-button"> Grid-Flow Example </router-link>
    <AddPizza @pizzaAdded="router.push('/pizza')"></AddPizza>
  </main>
</template>
