(ns bizzbuzz.web
  (:use [bizzbuzz.bb])
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
        [:get "/until"]
        (text-field "number" 100)
        (submit-button "Berechne")) ]]))


(defn- to-ul [bbs]
  (unordered-list bbs))

(defn until [n]
  (let [number (try (Integer/parseInt n) (catch Exception e 100))]
    (html5
      [:head [:title (str "BizzBuzz bis " n)]]
      [:body
       [:div (to-ul (bb number))]])))

(defroutes 
  main-routes
  (GET "/" [] (max-form))
  (GET "/until" [number] (until number))
  (not-found "Huh?"))

(def run-web 
  (site main-routes))
