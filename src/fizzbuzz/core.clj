(ns fizzbuzz.core)

(def fizz? #(zero? (mod % 3)))
(def buzz? #(zero? (mod % 5)))
(def fizzbuzz? #(and (fizz? %) (buzz? %)))

(def fizzbuzz
  #(cond
    (fizzbuzz? %) "FizzBuzz"
    (fizz? %)     "Fizz"
    (buzz? %)     "Buzz"
    :else %))

(defn main []
  (doseq [item (map fizzbuzz (range 1 101))]
    (println item)))
