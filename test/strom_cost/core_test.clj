(ns strom-cost.core-test
  (:require [clojure.test :refer :all]
            [strom-cost.core :refer :all]))

(def test-input {:appliance-wattage 19
                 :price-per-kWh 0.5
                 :currency "Euro"
                 :usage-in-hours 120})

(deftest a-test
  (testing "if input is returned untouched in response."
    (is (= (:appliance-wattage test-input) (:appliance-wattage (calculate test-input))))
    (is (= (:price-per-kWh test-input) (:price-per-kWh (calculate test-input))))
    (is (= (:currency test-input) (:currency (calculate test-input))))
    (is (= (:usage-in-hours test-input) (:usage-in-hours (calculate test-input)))))

  (testing "if response contains cost"
    (is (= true (contains? (calculate test-input) :cost))))

  (testing "if value of cost is correct"
    (is (compare 1.14 (:cost (calculate test-input))))))
