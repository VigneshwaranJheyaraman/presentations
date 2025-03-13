(ns sanjay
  (:require [clojure.java.shell :as sh]))

(defn say-hi
  [{:keys [name]}]
  (println "Hi " name))

(defn get-git-version
  [_]
  (let [git-version-from-terminal (sh/sh "git" "--version")
        ;; {:out "output" :error "if any failure"}
        git-version-output        (get git-version-from-terminal :out)]
    (println git-version-output)))
