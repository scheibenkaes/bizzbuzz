(defproject bizzbuzz "1.0.0-SNAPSHOT"
  :description "BizzBuzz"
  :dependencies [[org.clojure/clojure "1.2.1"]
                 [compojure "0.6.2"]
                 [hiccup "0.3.4"]]
  :dev-dependencies [[lein-ring "0.4.0"]]
  :main bizzbuzz.core
  :ring {:handler bizzbuzz.web/run-web})
