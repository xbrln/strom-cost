# strom-cost

A Clojure library designed to calculate the electricity cost for an appliance.

## Usage

- Add to your leiningen dependencies in project.clj
`[xbrln/strom-cost "0.1.0"]`
- Require in your code `[strom-cost.core :as sc]`
- Example use `(sc/calculate {:appliance-wattage 19
                              :price-per-kWh 0.3055
                              :currency "Euro"
                              :usage-in-hours 120})`

## License

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.
