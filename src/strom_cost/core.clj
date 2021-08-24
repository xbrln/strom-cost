(ns strom-cost.core)

(defn calculate
  "Function to calculate electricity cost for an appliance.
  The input map should have :appliance-wattage, :price-per-kWh, :currency and :usage-in-hours.
  Function returs the given input map with an additional :cost keyword which holds the value for the cost of electricity"
  [i]
  (let [cost
        (Float/parseFloat (format "%.2f" (* (/ (* (:appliance-wattage i) (* 3600 (:usage-in-hours i))) 3600000) (:price-per-kWh i))))]
    (conj i [:cost cost])))

(comment
  ; Example usage
  (calculate {:appliance-wattage 19
              :price-per-kWh 0.3055
              :currency "Euro"
              :usage-in-hours 120}))
