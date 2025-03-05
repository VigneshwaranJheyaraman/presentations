---
title: "Clojure snippets"
transition: slide-up
---

# Variable declarations

```clojure
;; def vs defonce

;; def can overrite the variable value
;; defonce will not allow to override the value
(def can-change 1)

(defonce cannot-change 2)

(println can-change) ;; => 1

(println cannot-change) ;; => 1

(def can-change 2)

(defonce cannot-change 2)

(println can-change) ;; => 2

(println cannot-change) ;; => 1
```

```clojure
;; def

(def variable-name "value")

;; clojure always follows kebab-case meaning
;; allt the variables created are seperated by `-`
;; for example
;; getStatus  is in camelCase
;; get-status is in kebab-case
;; get_status is in snake_case
```

```clojure
;; let block
;; let allows multiple variables to assigned within the execution block

(let [variable-1 "value-1"
      variable-2 "value-2"]
  (println variable-1 variable-1))
```

```clojure
;; fn declaration
(defn function-name
  [fn-argument]
  ;; body of the function
  (println fn-argument))


;; every fn will implicitly return `nil` value
```

```clojure
;; unassigned variables

(declare unassigned-variable)

(println unassigned-variable)

(def unassigned-variable "new-value")
```

# Scalar type

```clojure
;; integer
(def int_i 1)
```

```clojure
;; float
(def float_i (float 1))
```

```clojure
;; double
(def double_i (double 1))
```

```clojure
;; long
(def long_i (long 1))
```

```clojure
;; boolean
(def bool_i true)
```

```clojure
;; string
(def string_i "string")

;; char
(def char_i \c)
```

# Dervied types

```clojure
;; =====vector===== 
;; eager + realized

(def list-of-numbers
  [1 2 3])

(def list-of-nums
  (vector 1 2 3 4))
```

```clojure
;; =====sequence=====

(def seq-of-numbers
  '(1 2 3 4))

(def seq-of-nums
  (seq [1 2 3 4]))
```

```clojure
;; =====set=====

(def set-of-numbers
  #{1 2 3 4})

(def set-of-nums
  (set [1 2 3 4 5]))

;; set extends a function which will used to validat
;; the existense of the value within the set

(set-of-numbers 1) ;; => 1

(set-of-numbers 101) ;; => nil
```

```clojure
;; =====lazy-seq=====
;; not eager + not-realized unless required

(def lazy-seq-of-numbers
  (lazy-seq [1 2 3 4]))
```

```clojure
;; =====hash-map=====
;; hash-map is like
;; - dictionary in python
;; - object in javascript
;; it requires { key -> value } meaning the hash-map
;; requires even-number of arguments

(def map-of-value {1 "one" "two" 2})
```

```clojure
;; =====extracting data=====

;; to extract data from
;; - vector
;; - sequence
;; - lazy-seq
;; you make use of `index`

(get list-of-nums 0) ;; => 1
(get seq-of-nums 0) ;; => 1
(get lazy-seq-of-numbers 0) ;; => 1

;; to extract data from hash-map you make use of key
(get map-of-value 1) ;; => "one"
(get map-of-value "two") ;; => 2

;; not in hash-map is returned as nil
(get map-of-value "three") ;; => nil
(get map-of-value 3) ;; => nil
```

# Expressions

```clojure
;; if block
;; (if condition-to-check
;;   true-fn?
;;   false-fn?)


;; if can only have min 2 max 3 arguments

(if true
  "its true") ;; => "its true"

(if (> 2 1)
  (println "2 is greater than 1")
  (println "2 is not greater than 1")) ;; => 2 is not greater than 1 [nil]
```

```clojure
;; when
;; similar to `if` block but when will only
;; execute the `body` if the condition is true
;; else won't execute them

(when true
  (println "its true")
  (println "yayyyy!!!"))


;; when is more opted when you have bunch of executions
;; to be done when the condition == true

;; (if true
;;   (println "its true"))
;; both are the same
;; (when true
;;   (println "its true"))

;; (if true
;;   (println "its true")   [TRUE-FN]
;;   (println "yayyyy!!!")) [FALSE-FN]
;; both are not the same
;; (when true
;;   (println "its true")   [TRUE-FN]
;;   (println "yayyyy!!!")) [TRUE-FN]

```

```clojure
;; ====do====  
;; do block is to execute set of expressions under a single function
;; mostly used with `if` block to execute multiple expressions for [TRUE-FN] 
;; or [FALSE-FN]

(if true
  (do (println "its true")
      (println "yayyyyyyyyy!!!"))
  (println "its false"))

```

```clojure
;;====while==== 
;; while is used to execute a set of expressions till the condition is true

(let [counter (atom 1)]
  (while (< @counter 7)
    (println @counter)
    (swap! counter inc)
    ;; (reset! counter 7)
    ))
```
