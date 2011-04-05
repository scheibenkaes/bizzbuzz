(ns bizzbuzz.core
  (use [bizzbuzz.web])
  (:gen-class))

(defn -main [& args]
  (run-web))
