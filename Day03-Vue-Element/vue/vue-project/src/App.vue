<template>
  <div>
    <!-- <h1>{{ message }}</h1> -->
    <ElementView></ElementView>
  </div>
</template>

<script>
import ElementView from './views/element/ElementVue.vue'

export default {
  components: {
    ElementView
  },
  data() {
    return {
      message: 'Hello dqwedvue222'
    }
  },
  methods: {
    // 可能的其他方法
  }
}
</script>

<style>
/* 可能的样式 */
</style>
