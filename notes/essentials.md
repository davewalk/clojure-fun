# Essentials (that I'm typing - there's a lot more)
* All expressions are wrapped in `()`
* To define something, start with `(def`
* Data structures are immutable so if you want to add to one, use a function like:

    `(def v [1 2 3])
    (conj v 4)`
    v is  still [1 2 3]

FYI: this isn't wasteful - "behind the scenes --- Clojure shares data structures. It keeps track of all their pieces and re-uses them pervasively."

* Clojure is whitespace-insensitive and commas are considered whitespace so you don't really need them
* Define a function with `fn` and of course `def`:
`(def my-func (fn [a b] (+a b)))`

But it's  probably better to use `defn` as a shortcut `defn-` creates a private function which can only be called from within the namespace it is created
