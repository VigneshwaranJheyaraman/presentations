<style>
.elastic-layout {
    background-image: url("../assets/elastic101/logo.png");
    background-size: contain;
    background-position: center;
    background-repeat: no-repeat;
    overflow: scroll;
}

.elastic-layout :not(pre) > code {
    --slidev-code-background: #848484;
}

.elastic-layout h1{
    color: white;
}

.elastic-layout .left, .elastic-layout .right {
    width:50%;
    display: inline-block;
}

</style>

<script setup>
    import ColumnOrTwo from "./ColumnOrTwo.vue";
</script>

<template>
    <ColumnOrTwo className="elastic-layout">
        <template #left v-if="$slots.left"><slot name="left"/> </template>
        <template #right v-if="$slots.right"><slot name="right"/></template>
        <template #default><slot /></template>
    </ColumnOrTwo>
</template>
