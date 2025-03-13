---
layout: Clojure
transition: slide-left
zoom: 0.6
---

<template v-slot:left>

# Leiningen

`leinigen` tools provides support at a very high-level abstracting all the bundling and other boiler plates for faster setup

All the project related information needs to be specified inside a file called `project.clj` (_this is a `clojure` file  which withelds the information
about the project inside as `function` called `defproject`_)


```clojure
(defproject clojure.101 "0.1.1"
  ;; list of dependencies and their version
  :dependencies [[org.clojure/clojure "1.11.1"]
                 [camel-snake-kebab "0.4.3"]]
  ;; profiles are for isolation
  :profiles {:dev { ;; this is `namespace` which will be loaded by default on REPL
                    :main clojure-101.expr}})
```

starting a REPL

```shell
lein repl
```

</template>

<template v-slot:right>

# Deps.edn

`deps.edn` is _recommended by `clojure`'s official site_ which is requires information being explicitly mentioned, and also doesn't provide
boiler-plates out of the box

All the project related information needs to specified inside a file called `deps.edn` (_this is an `EDN` file i.e., Extensible Data Notation_) which clojure
can understand

Project specification example

```clojure
{;; location of all project files
 :paths ["src"]
 ;; location of all configuration files
 :resource-paths ["resources"]
 ;; profiles are called aliases here
 :aliases {:random {:deps {io.github.clojure/tools.build {:mvn/version "0.10.7"}}
                    :ns-default sanjay}
           ;; if I execute clj -A:uberjar jar :jar Depstar.jar
           ;; jar is a function inside #'hf.depstart/jar namespace 
           ;; only then it will pull "com.github.seancorfield/depstar"
           ;; from artifactory by default its not loaded
           :uberjar {:deps {com.github.seancorfield/depstar {:mvn/version "2.1.303"}}
                     ;; default namespace for this profile
                     ;; so you can access the variables directly
                     :ns-default hf.depstar}}
 ;; map of dependencies mapped to their versions
 :deps {camel-snake-kebab {:mvn/version "0.4.3"}
        com.comcast.multipass/toolbox {:mvn/version "0.3.2-SNAPSHOT"}}}
```

starting a REPL

```shell
clj
```

</template>

<template v-slot:header>

# REPL utils

REPL is `Read` -> `Evaluate` -> `Print` -> `Loop` which makes developement more interactive.

So for `clojure` we make use of `REPL`, here are the common commands used inside `REPL`:

* `(require '<namespace>)` -> will COMPILE & load the namespace
* `(require '<namespace> :reload)` -> will refresh the `namespace` file, RE-COMPILE it again and loads

</template>
