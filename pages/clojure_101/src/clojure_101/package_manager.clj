(ns clojure-101.package-manager
  (:require [toolbox.lang :as lang]))

(defn first-2-chars
  [string]
  (lang/substring string 0 2))
