(ns bizzbuzz.core
  (use [bizzbuzz.bb])
  (:gen-class))

(defn -main [& args]
  (println (bb 100)))
