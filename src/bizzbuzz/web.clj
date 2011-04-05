(ns bizzbuzz.web
  (:use [compojure.core])
  (:use [compojure.handler])
  (:use [compojure.route])
  (:use [hiccup.core])
  (:use [hiccup.page-helpers])
  (:use [hiccup.form-helpers]))


(defn max-form []
  (html5
    [:head [:title "BizzBuzz Nummern"]]
    [:body 
     [:div 
      (form-to 
        [:GET "/show"]
        (text-field "number" 100)
        (submit-button "Berechne")) ]]))

(defroutes 
  main-routes
  (GET "/" [] (max-form))
  ;(GET "/until/:id" [id] (until id))
  (not-found "Huh?"))

(def run-web 
  (site main-routes))
