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
  (let [r (rest (range n))]
    (map bizzbuzz r)))

(defn bb [n]
  (let [max-n (min n 1000)]
    (bb-until max-n)))

