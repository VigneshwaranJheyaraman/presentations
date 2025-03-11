---
layout: Elastic 
zoom: 0.87
transition: slide-left
---

<template v-slot:left>

<div class="grid grid-cols-2 grid-gap-2 align-center">
  <div class="col-left">
    <img src="https://miro.medium.com/v2/resize:fit:686/1*myxfDjOcFa20brPOVPEJqw.png" />
  </div>
  <div class="col-right">
    <img src="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR5pMUP6uY0yi-BCKXNH4OtapeU_5kBwHH7IQ&s" />
  </div>
</div>

# How does `elastic` work?

`elastic` _collects_ the `records` and _organizes_ them into `documents`. A `document`
is the _basic unit of information_ which can be of heterogenous type starting from a
`text` -> `nested JSON` etc., Every `document` has two important properties

1. `data-type` -> the _type of the document_ which defines the type of the entity information which the document withelds
2. `id` -> the unique identifier of the document (_commonly `_id`_)
The documents are searched using `index` + `inverted-index`
</template>

<template v-slot:right>

# Jargons on `elastic`

* `cluster` -> collection of `elastic` running nodes (docker container)
  * `master-node` -> performs all Create, Update and Delete operation
  * `data-node` -> performs all Read operations
  * `client-node` -> captures the request and sends it to `master-node` / `data-node`
* `shards` -> meaning _small part of a whole_
  - `elastic` will _divide the `index` into _multiple pieces called `shard`_ which is hosted on the `nodes` within the `cluster`_
  - fully functional and independent
* `replica(s)` -> the copies of the primary shards for data nodes and failure tolerance
</template>
