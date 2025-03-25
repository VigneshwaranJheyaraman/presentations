(ns clojure-101.scientific
  (:require [clojure-101.arithmetic :as arithmetic]))

(def operations-supported
  #{::add})

(defn print-add
  []
  (println ::add "<- scientific addition")
  (println arithmetic/operations-supported "<-- arithmetic ops supported")
  (println ::arithmetic/add "<-- arithmetic addition"))

(def album
  {:name "something something"
   :director "myskin"
   :rating 4})

(def latest-album
  {:name "something something"
   :director "myskin"
   :rating 4
   :y-o-p 2025})

(def old-album
  {:name "something something"
   :director "myskin"
   :rating 4
   :y-o-p nil})

(defn print-album-info
  [{:keys [name director
           y-o-p]
    :or {y-o-p 2024}
    :as album}]
  (println "name="name)
  (println "director="director)
  (println "year of publish="y-o-p)
  (assoc album :y-o-p y-o-p))

