(ns fizzbuzz.core-test
  (:require [clojure.test :refer :all]
            [fizzbuzz.core :refer :all]))

(deftest a-test
  (testing "Fizz"
    (is (= 1 1))))

(deftest fizz-test
  (testing "Fizz is a multiple of 3"
    (is (= true (fizz? 3)))
    (is (= false (fizz? 5)))
    (is (= true (fizz? 6)))))

(deftest buzz-test
  (testing "Buzz is a multiple of 5"
    (is (= false (buzz? 3)))
    (is (= true (buzz? 5)))
    (is (= false (buzz? 6)))))

(deftest fizzbuzz-test
  (testing "FizzBuzz is a multiple of 5 and 3"
    (is (= false (fizzbuzz? 3)))
    (is (= false (fizzbuzz? 5)))
    (is (= true (fizzbuzz? 15)))))

(deftest fizzbuzz-test
  (testing "Checking number to replace by FizzBuzz strings"
    (is (= 1 (fizzbuzz 1)))
    (is (= "Fizz" (fizzbuzz 3)))
    (is (= "FizzBuzz" (fizzbuzz 15)))
    (is (= "Buzz" (fizzbuzz 5)))))
