(ns bizzbuzz.web
  (:use [hiccup.core])
  (:use [hiccup.form-helpers]))

(defn max-form []
  (html
    [:div 
     (form-to 
       [:post "/show"]
       (text-field number 100))]))

(defroutes main-routes
  (GET "/" (max-form)))

