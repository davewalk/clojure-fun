* Set a namespace with: `(ns name & references)`
* Use `defn` for public functions that can be used from any namespace and `defn-` for private functions that can only be used within the nammespace they aree defined
* There are four references:
    * `use` to pull in all of the public functions from an external library by namespace **into the current namespace**, i.e. `(use 'org.danlarkin.json)`
    * `require` does the same thing but doesn't bring the library's functions into the current namespace, i.e. `(require '(org.danlarkin [json :as json-lib]))` You would use the alias, such as `json-lib` later when you want to call one of its functions, i.e. `json-lib/encode-to-str`
