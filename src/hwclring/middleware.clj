(ns hwclring.middleware)

(defn log-requests [handler]
  (fn [request]
    (println
      (str
        (:request-method request)
        " "
        (:uri request)))
    (handler request)))
