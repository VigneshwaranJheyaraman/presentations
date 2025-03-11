---
layout: Elastic
transition: slide-up
---

<template v-slot:left>

# `pgsync`

`PG`+_syncs to `elastic` / `opensearch`_ = `pgSync` [lib](https://pgsync.com) authored by `Tolu Aina`

`pgsync` leverages the following `postgres` functionalities to sync them to `elastic`

- `triggers`
- `WAL log`
- `replication slot`
- `notification-channel`

Written in `python`, Includes the following processes

* `bootstrap`
* `pgsync`

The process must be running for real-time updates

It captures all require `mapping` + `schema` using `schema.json` then denormalizes into
`json` at runtime and publishes to `elastic`

</template>

<template v-slot:right>

# Other Elastic supporting tools

The `ELK` stack has been there for a while which abbrevates to
- `Elastic`
- `Logstash`
- `Kibana`

![elastic-stack](../../assets/elastic101/elastc-stack.png)

Tools defintions

- `Kibana` => nice UI for viewing records from `elastic`
- `Beats` => data shipper which extracts data from source -> sink [destination]
- `Logstash` => centralized data processing pipeline that ingest them logs to stash
- `ECE` => Elastic's cloud enterprise
- `Cloud` => for serverless elastic support provided as a service

</template>
