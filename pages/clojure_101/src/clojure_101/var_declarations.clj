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

(declare unassigned-var-2)

(println unassigned-var-2)

(+ unassigned-var-2 2)

(def unassigned-var-2 1)

(def unassigned-variable "new-value")


(defn unassigned->assigned
  []
  (declare var-1)
  (println var-1)
  (try
    (+ var-1 1)
    (catch Exception e
      (println "unassigned cannot be used assign some value")))
  (def var-1 5)
  (println (+ var-1 1)))

(unassigned->assigned)
