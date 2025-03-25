<script setup>
import { defineProps } from "vue";
const props = defineProps(["className"]);
const elasicBackup = "slidev-layout default";
const className = `${elasicBackup} ${props["className"]}`;

</script>

<template>
    <div :class="className">
        <slot name="header"/>
        <div class="w-full grid grid-cols-2 grid-gap-2" v-if="$slots.left && $slots.right">
            <div class="col-left">
                <slot name="left" />
            </div>
            <div class="col-right">
                <slot name="right" />
            </div>
        </div>
        <slot name="default"/>
    </div>
</template>
