<style>
.clojure-layout {
    background-image: url("../assets/clojure101/logo.png");
    background-color:  lightgray;
    background-size: contain;
    background-position: center;
    background-repeat: no-repeat;
    overflow: auto;
    color: black;
}
.clojure-layout :not(pre) > code {
    --slidev-code-background: #848484;
}

.clojure-layout h1{
    color: black;
    font-weight: 900;
    font-style: italic;
    text-decoration: underline;
}

.clojure-layout .left, .clojure-layout .right {
    width:50%;
    display: inline-block;
}
</style>

<script setup>
    import ColumnOrTwo from "./ColumnOrTwo.vue";
</script>

<template>
    <ColumnOrTwo className="clojure-layout">
        <template #header v-if="$slots.header"><slot name="header"/></template>
        <template #left v-if="$slots.left"><slot name="left"/> </template>
        <template #right v-if="$slots.right"><slot name="right"/></template>
        <template #default><slot /></template>
    </ColumnOrTwo>
</template>
