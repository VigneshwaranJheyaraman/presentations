<style>
.neovim-layout {
    background-image: url("../assets/neovim/logo.png");
    background-size: contain;
    background-position: center;
    background-repeat: no-repeat;
    overflow: scroll;
}

.neovim-layout :not(pre) > code {
    --slidev-code-background: #848484;
}

.neovim-layout h1{
    color: white;
}

.neovim-layout .left, .neovim-layout .right {
    width:50%;
    display: inline-block;
}

</style>

<script setup>
    import ColumnOrTwo from "./ColumnOrTwo.vue";
</script>

<template>
    <ColumnOrTwo className="neovim-layout">
        <template #header v-if="$slots.header"><slot name="header" /> </template>
        <template #left v-if="$slots.left"><slot name="left"/> </template>
        <template #right v-if="$slots.right"><slot name="right"/></template>
        <template #default><slot /></template>
    </ColumnOrTwo>
</template>
