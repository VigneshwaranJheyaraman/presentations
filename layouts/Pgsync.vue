<style>
.pgsync-layout::before {
    position: absolute;
    width:100%;
    height:100%;
    content:"";
    z-index:-1;
    background-size: contain;
    background-position: center;
    background-repeat: no-repeat;
    background-image: url("../assets/pgsync/logo.svg");
    filter: blur(8px);
}
.pgsync-layout {
    overflow: scroll;
}

.pgsync-layout :not(pre) > code {
    --slidev-code-background: #ffffff;
    color: black;
}
</style>
<script setup>
    import ColumnOrTwo from "./ColumnOrTwo.vue";
</script>

<template>
    <ColumnOrTwo className="pgsync-layout">
        <template #header v-if="$slots.header"><slot name="header" /> </template>
        <template #left v-if="$slots.left"><slot name="left"/> </template>
        <template #right v-if="$slots.right"><slot name="right"/></template>
        <template #default><slot /></template>
    </ColumnOrTwo>
</template>
