(ns hwclring.handlers
  (:require [hwclring.middleware :refer [log-requests]]))

(defn say-hello
  "A basic first handler"
  [req]
  {:status 200
   :headers {"Content-Type" "text/plain"}
   :body "Hello World"})

(def app
  (-> say-hello
      log-requests))