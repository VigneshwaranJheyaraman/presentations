(ns clojure-101.package-manager
  (:require [toolbox.lang :as lang]))

(defn first-2-chars
  [string]
  (lang/substring string 0 2))

(defmacro twice-fn
  "I return a new function who will call the function twice"
  [fn-to-call]
  (let [some-var 1]
    `(fn []
       (println ~fn-to-call ~some-var)
       (~fn-to-call)
       (~fn-to-call))))

(defn say-hello
  []
  (println "hello"))

(def say-hello-twice
  (twice-fn say-hello))


(defn output-of-macro
  []
  (say-hello)

  (say-hello-twice))
