(ns clojure-101.var-declarations
  "i explain how to initialize variables"
  {:clj-kondo/ignore [:missing-docstring
                      :clojure-lsp/unused-public-var]})

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

;; def

(def variable-name "value")

;; clojure always follows kebab-case meaning
;; allt the variables created are seperated by `-`
;; for example
;; getStatus  is in camelCase
;; get-status is in kebab-case
;; get_status is in snake_case

;; let block
;; let allows multiple variables to assigned within the execution block

(let [variable-1 "value-1"
      variable-2 "value-2"]
  (println variable-1 variable-1))


;; fn declaration
(defn function-name
  [fn-argument]
  ;; body of the function
  (println fn-argument))


;; every fn will implicitly return `nil` value


;; unassigned variables

(declare unassigned-variable)

(println unassigned-variable)

(def unassigned-variable "new-value")
