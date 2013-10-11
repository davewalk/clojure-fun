(ns karate.core-test
  (:require [clojure.test :refer :all]
            [karate.core :refer :all]))

(deftest chop1
  (is (= (karate.core/chop 3 []) -1))
  (is (= (karate.core/chop 3 [1]) -1))
  (is (= (karate.core/chop 1 [1]) 0))
  (is (= (karate.core/chop 1 [1 3 5]) 0))
  (is (= (karate.core/chop 5 [1 3 5]) 2))
  (is (= (karate.core/chop 0 [1 3 5]) -1))
  (is (= (karate.core/chop 2 [1 3 5]) -1))
  (is (= (karate.core/chop 4 [1 3 5]) -1))
  (is (= (karate.core/chop 6 [1 3 5]) -1))
  (is (= (karate.core/chop 1 [1 3 5 7]) 0))
  (is (= (karate.core/chop 3 [1 3 5 7]) 1))
  (is (= (karate.core/chop 5 [1 3 5 7]) 2))
  (is (= (karate.core/chop 7 [1 3 5 7]) 3))
  (is (= (karate.core/chop 0 [1 3 5 7]) -1))
  (is (= (karate.core/chop 2 [1 3 5 7]) -1))
  (is (= (karate.core/chop 4 [1 3 5 7]) -1))
  (is (= (karate.core/chop 6 [1 3 5 7]) -1))
  (is (= (karate.core/chop 8 [1 3 5 7]) -1)))

(use 'clojure.test)

(run-tests 'karate.core-test)
