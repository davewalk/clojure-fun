(ns first-app.core)

(defn -main
  "Multiply a number by itself"
  [x]
  (* x x))

(defn next-fib-pair
	[[a b]]
	[a (+ a b)])

(iterate next-fib-pair [0 1])

(defn format-name
	[name]
	(let [{salutation :salutation
		   first-name :first-name
		   last-name :last-name}
		   name]
		(str/join " " [salutation first-name last-name])))

(format-name {:salutation "Mr." :first-name "David" :last-name "Walk"})

(defn format-name
	[{:keys [salutation first-name last-name]}]
	(str/join " " [salutation first-name last-name]))

(format-name {:salutation "Mr." :first-name "David" :last-name "Walk"})
