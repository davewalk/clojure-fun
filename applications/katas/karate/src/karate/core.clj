(ns karate.core
  (:gen-class))

;; (defn -main
;;   "I don't do a whole lot ... yet."
;;   [& args]
;;   ;; work around dangerous default behaviour in Clojure
;;   (alter-var-root #'*read-eval* (constantly false))
;;   (println "Hello, World!"))

(use 'clojure.repl)
(defn chop
  "Chops a collection in half until it gets the index of the target value"
  [target array]
  array)

(doc chop)

(chop 1 [1 3 5])
