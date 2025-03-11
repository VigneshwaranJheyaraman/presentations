<style>
.elastic-layout {
    background-image: url("https://gts-ts.com/wp-content/uploads/2024/05/elastic-logo-H-black-outline.png");
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

<template>
    <div class="slidev-layout default elastic-layout">
        <div class="w-full h-full grid grid-cols-2 grid-gap-2" v-if="$slots.left && $slots.right">
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
