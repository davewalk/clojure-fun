* To create a new instance: `Widget. "red"`
* Access static members: `Math/PI`
* Access instance members: `(.nextInt rnd)` - verb always comes first
* Chaining: `(.. person getAddress getZipCode)`
* All forms are lists with the verb coming first
* `let` allows for the definition of a local variable within a function
* quote (`'`) means dont' evaluate the next thing
* anonymous function: `#`

#### Special forms
* `def` to define a value to a symbol (`(def var 10)`)
* `(if test then else?)`
* `(do exprs*)` to bring in side effects  - in Clojure only the last line is returned but with `do` you can have all of the lines execute
* `(fn name? [params*] exprs*)`
* `(fn name? ([params*] exprs*)+)`
* `(let [bindings*] exprs*)`
* `loop [bindings*] exprs*)` - only difference from let is that you can go back to it later with:
* `(recur exprs*)`
* `(throw expr)`
* `(try expr* catch-clause* finally-clause?)`
* 