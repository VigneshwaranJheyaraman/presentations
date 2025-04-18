(ns clojure-101.expr
  ;; doc-string meaning the documentation about the namespace
  "I will have all the basic expressions
  provided natively by clojure")

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


;; ====do====  
;; do block is to execute set of expressions under a single function
;; mostly used with `if` block to execute multiple expressions for [TRUE-FN] 
;; or [FALSE-FN]

(if true
  (do (println "its true")
      (println "yayyyyyyyyy!!!"))
  (println "its false"))


;;====while==== 
;; while is used to execute a set of expressions till the condition is true

(let [counter (atom 1)]
  (while (< @counter 7)
    (println @counter)
    (swap! counter inc)
    ;; (reset! counter 7)
    ))

(defn say-hello
  [name-of-the-person]
  (println "Hola!!!! " name-of-the-person))
