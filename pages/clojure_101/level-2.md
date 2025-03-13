---
layout: Clojure
zoom: 0.35
transition: slide-up
---

<template v-slot:header>

# Clojure helpers and Macros -> [Refer](https://clojure.org/guides/learn/clojure)

</template>

<template v-slot:left>

# macro

1. What is a `macro`?

> _macros are functions that take code and produce code_

```clojure
(defmacro twice-fn
  "I return a new function who will call the function twice"
  [fn-to-call]
  `(fn []
    (~fn-to-call (~fn-to-call))))
```

2. What is an `keyword`?

> `keyword` is a `function` and also `value` in clojure which is widely used with `hash-map` for `key`
thus we can extract them without `get` function

```clojure
(def hanuman-kind {:hit-song "Big Dawgs"
                   :liked "10million"})

(get hanuman-kind :hit-song) ;; => "Big Dawgs"

(:hit-song hanuman-kind) ;; => "Big Dawgs"

;; similar to `get` its null safe

(:Hit-song hanuman-kind) ;; => nil
(get hanuman-kind :Hit-song) ;; => nil
```

3. `namespaced-keys`

> namespaced-keys are keywords associated with `namespace`

```clojure
(ns universe
  (:require [milky-way :as mway]))

(def milky-way :milky-way) ;; regular keyword

(defn get-mikly-way-planets
  []
  ms/planets)

(-> (get-mikly-way-planets)
    println)

;; => #{:milky-way/mercury :milky-way/venus :milky-way/earth :milky-way/mars ....}
```

```clojure
(ns milky-way)

(def planets
  #{::mercury ;; namespaced-keys
    ::venus   ;; ::<keyword-name> means <current-namespace>/<keyword-name>
    ::earth   ;; => :milky-way/earth
    ::mars    ;; => :milky-way/mars
    ::jupiter ::saturn ::uranus ::neptune})

(def planets-map
 {::mercury "mercury"
  ::venus   "venus"
  ::earth   "earth"
  ::mars    "mars"
  ::jupiter "jupiter"
  ::saturn  "saturn"
  ::uranus  "uranus"
  ::neptune "neptune"})
```

3.1 destructuring `namespaced-keys`

```clojure
(ns destruct-ns-keys
  (:require [milky-way :as mway]))

(let [{:milky-way/keys [mercury
                        venus
                        earth
                        mars]} mway/planets-map]
  (println mercury "," venus "," earth "," mars)) ;; => mercury,venus,earth,mars
```

</template>

<template v-slot:right>

# threading macros

> _Threading macros, also known as arrow macros, convert nested function calls into a linear flow of function calls, improving readability._

So by default with `lisp` we might endup with `paranthesis-hell` and makes it touch to reable
i.e.,

```clojure
(function-4 (function-3 (function-2 (function-1))))
```

here :point_up: we read from `right -> left` meaning function-1 => function-2 => function-3 => function-4

So to achieve the same we can make use of _threading-macros_ called `->` and `->>`, the difference between is that
`->` will pass the output of `fn` as the _first argument_ for the next function
`->>` will pass the output of `fn` as the _last argument)_ for the next function

```clojure
(-> (function-1)
    (function-2)
    (function-3)
    (function-4)))
```

So  ☝️  is more readable using _threading-macros_

# destructuring

> _destructuring is process of extracting information from variable possible `collection` in `clojure` directly while initialization_

```clojure
(def list-of-nums [1 2 3 4])

(let [num-one (first list-of-nums)
      num-two (second list-of-nums)]
  (+ num-one num-two) ;; => 3
  (inc num-one)) ;; => 2

;; destructuring

(let [[num-one num-two] list-of-nums]
  (+ num-one num-two) ;; => 3
  (inc num-one)) ;; => 1

;; this applies for `hash-map` as well using `keys` / `or` / `as`

(def user-harry-potter {:name "harry potter"
                        :age 12
                        :school "hogwarts"})

(let [harry-name (get user-harry-potter :name)
      age        (get user-harry-potter :age)
      schoool    (get user-harry-potter :school)]
  (println "Hi I am " harry-name " I am " age " yrs old, I study at " school)) ;; Hi I am harry potter I am 12 yrs old, I study at hogwarts

;; destructuring

(let [{:keys [age school] harry-name :name} user-harry-potter]
  (println "Hi I am " harry-name " I am " age " yrs old, I study at " school)) ;; Hi I am harry potter I am 12 yrs old, I study at hogwarts

;; we can populate values with default while destructuring
(let [{:keys [age school
              salutation]
       harry-name :name ;; for key called name store the value inside harry-name variable
       :or {salutation "Master."}
       :as harry-potter} user-harry-potter]
  (println "Hi I am " salutation harry-name " I am " age " yrs old, I study at " school)) ;; Hi I am Master.harry potter I am 12 yrs old, I study at hogwarts
```

</template>
