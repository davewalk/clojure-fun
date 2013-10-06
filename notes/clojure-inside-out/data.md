### Data

edn: extensible data notation

* Looks like JSON, but some differences
* Used as a data transfer format in Datomic
* A close representation of Clojure syntax
* Conveyance of data values, not that much metadata - a system of representing objects
* Has a grammar, but no schema

#### Scalars
| Scalar | Description
| :--------:| :--------------:
| `nil` | nil, null, or nothing
| booleans | `true` or `false`
| strings | enclosed in `"double quotes"`, may span multiple lines, `\t`, etc. supported
| characters | `\c`, `\newline`, etc.
| integers | 0-9 and negatives
| floating point | 64-bit (double) precision is expected

#### Names
|  Name | Description
| :--------:| :--------------:
| symbols | a string to represent identifiers - should map to something - may include namespaces
| keywords | identifiers that identify themselves - start w/ a colon

#### Collections
|  Collection | Description
| :--------:| :--------------:
| lists | sequence of values in `()`
| vectors | sequence of values supporting random access in `[]`
| maps | collections of unordered key/value associations, keys only once `{a: 1, "foo" : bar}`
| sets | collections of unordered, heterogenous, unique values with `#{}`

#### Tagged elements
* Allows for extensibility of edn
* Starts w/ `#`
* Built-in tagged elements:
    * `#inst "rfc-3339-format"` - an instance in time in RFC-3339 format
    * `#uuid` - unique identifier

#### disregard
* `;` for  commenting
* But also `#_` will read and disregard the next element

#### equality
* nil, booleans, strings, characters and symbols are equal to values of the same type with the same edn representation
* integers and floating point numbers should be considered equal to values only of the same magnitude, type and precision
* sequences (lists and vectors) are equal to other sequences whose count of elements is the same, and for which each corresponding pair of elements is equal
* sets are equal if they have the same count of elements
* maps are equal if they have the same number of entries and the same values for mapped keys
* tagged elements must define their own equality semantics

