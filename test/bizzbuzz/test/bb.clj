(ns bizzbuzz.test.bb
  (:use [bizzbuzz.bb])
  (:use [clojure.test]))

(deftest detects-bizz
  (is (bizz 3)))

(deftest bizz?-ignores-other-vals
  (is (not (bizz 4))))

(deftest buzz-with-multiples-of-5
  (is (buzz 5)))

(deftest buzz-with-no-multiple-of-5
  (is (nil? (buzz 6))))
