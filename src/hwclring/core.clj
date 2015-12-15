(ns hwclring.core
  (:require [hwclring.handlers :refer [app]])
  (:require [ring.adapter.jetty :refer [run-jetty]]))

(defn -main
  "Start a webserver that says hello"
  []
  (println "Starting webserver on port 3000")
  (run-jetty app {:port 3000}))
