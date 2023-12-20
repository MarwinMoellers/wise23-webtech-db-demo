<script setup lang="ts">

</script>

<template>
  <div class="grid">
    <div class="header">
      <h2>Header</h2>
    </div>
    <div class="content">
      <h2>Content</h2>
      <div class="content-flex">
        <div>1</div>
        <div>2</div>
        <div>3</div>
        <div>4</div>
        <div>5</div>
        <div>6</div>
        <div>7</div>
        <div>8</div>
        <div>9</div>
        <div>10</div>
      </div>
    </div>
    <div class="irgendwas">
      <h2>Irgendwas</h2>
    </div>
    <div class="sidebar">
      <h2>Sidebar</h2>
    </div>
    <div class="footer">
      <h2>Footer</h2>
    </div>
  </div>
</template>

<style scoped>

h2 {
  color: black;
}

.grid {
  display: grid;
  height: 100vh;
  width: 100vw;

  grid-column-gap: 1em;
  grid-row-gap: 1em;

  grid-template-columns: 20% auto;
  grid-template-areas:
      "header content content"
      "sidebar content content"
      "footer footer irgendwas";
}

.irgendwas {
  grid-area: irgendwas;
  background: pink;
}

.header {
  grid-area: header;
  background: lightcoral;
}

.content {
  grid-area: content;
  background: grey;
}

.content-flex {
  div {
    color: black;
    min-width: 100px;
  }

  display: flex;
  flex-direction: row;
  flex-wrap: nowrap;
}

.sidebar {
  grid-area: sidebar;
  background: lightblue;
}

.footer {
  grid-area: footer;
  background: lightgreen;
}

</style>