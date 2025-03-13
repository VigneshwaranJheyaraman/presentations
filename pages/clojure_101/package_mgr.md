---
layout: Clojure
transition: slide-left
zoom: 0.7
---

<template v-slot:header>

# Package manager

> `package-manager` is a tool that helps manage software packages by handling their installation, updating, removal, and dependency resolution in an organized manner

For any programming language you will have _package-managers_ which help us organize the dependencies and build up project.
In the same case `clojure` is also having `package-manager`(s) the most widely used are:
1. `lein` called [Leiningen](https://leiningen.org)
2. `deps.edn` called [Deps](https://clojure.org/guides/deps_and_cli)        

Irrespective of any `package-manager` basic information required are:
* `src-paths` / `paths` -> this is the name of folder which contains `clojure` code
* `resource-paths` -> this is the name of folder which contains `configuration-file` which will be made available inside JVM
* `aliases` / `profiles` -> this feature enables _isolation_ of the runtime i.e., for specific usecases you make use of specific project configuration

Since `clojure` is standalone uses `lisp` paradigm it still runs in JVM meaning, it can _inter-operate (interop)_ with other JVM languages like JAVA, Scala, Kotlin etc.,
So _artifactory_ (centralized servers which host the libraries developed by the community) for downloading `jar` are
1. `clojars` -> Pure clojure libraries are pushed here
2. `maven` -> All java languages library's JAR are pushed here

> FYI: both `lein` and `deps.edn` will lookup on both `clojars` + `maven`

Also `package-manager` will _cache_ these libraries on _local computer_ (your system). So whenever `lein` / `clj` commands are executed, it first
looks-up at local _cache_ and _if and only if_ it exists the local cache will be used else latest JAR will be pulled from artifactory

The cache location for all `java-jar` is
* LINUX / MAC => `~/.m2/repository/`
* WINDOWS => `%HOME%/.m2/repository/`

</template>
