(ns clojure-101.derived-types
  "i display all the derived-types in clojure"
  {:clj-kondo/ignore [:missing-docstring
                      :clojure-lsp/unused-public-var]})

;; =====vector===== 
;; eager + realized

(def list-of-numbers
  [1 2 3])

(def list-of-nums
  (vector 1 2 3 4))

;; =====sequence=====

(def seq-of-numbers
  '(1 2 3 4))

(def seq-of-nums
  (seq [1 2 3 4]))

;; =====set=====

(def set-of-numbers
  #{1 2 3 4})

(def set-of-nums
  (set [1 2 3 4 5]))

;; set extends a function which will used to validat
;; the existense of the value within the set

(set-of-numbers 1) ;; => 1

(set-of-numbers 101) ;; => nil


;; =====lazy-seq=====
;; not eager + not-realized unless required

(def lazy-seq-of-numbers
  (lazy-seq [1 2 3 4]))

;; =====hash-map=====
;; hash-map is like
;; - dictionary in python
;; - object in javascript
;; it requires { key -> value } meaning the hash-map
;; requires even-number of arguments

(def map-of-value {1 "one" "two" 2})

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
