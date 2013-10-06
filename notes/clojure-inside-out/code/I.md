#### Metadata
* `var` gives you the metadata of a form including the doc string, version that it was added, etc.
* `&` puts everything after it into a list named next, i.e. `x y & more`

#### Namespacing

* Namespaces are defined at the top of each Clojure file like: `(ns example.foo` with example being the directory that the foo.clj file is in
* Require other namespaces with: `(:require clojure.data.generators)` which you can alias with `:as gen`
