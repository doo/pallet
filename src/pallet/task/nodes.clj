(ns pallet.task.nodes
  "list nodes."
  (:require
   [pallet.compute :as compute]
   [clojure.pprint :as pprint])
  (:use clojure.tools.logging))

(defn nodes
  [request]
  (let [ns (compute/nodes (:compute request))]
    (doseq [n ns]
      (println n))))
