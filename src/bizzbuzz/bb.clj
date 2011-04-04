(ns bizzbuzz.bb
  (use [clojure.string :only [join]]))

(defn bizz [n]
  (if (zero? (mod n 3)) "Bizz" nil))

(defn buzz [n]
  (if (zero? (mod n 5)) "Buzz" nil))

(defn bizzbuzz [n]
  (let [bb (list (bizz n) (buzz n))
        filtered (filter #(not (nil? %1)) bb)]
    (if (empty? filtered) n (join "" filtered))))

(defn bb-until [n]
  (let [r (rest (range (inc n)))]
    (map bizzbuzz r)))

(def *max-num* 1000)

(defn bb [n]
  (let [min-n (min n *max-num*)]
    (bb-until min-n)))

