(ns bench)

(defprotocol P (f [_]))

;; direct implementation
(defrecord R [a] P (f [_] 1))
(def d (->R 1))

;; reify
(def re (reify P (f [_] 2)))

;; external extensions
(extend-protocol P String (f [_] 3))
(extend-protocol P Object (f [_] 4))

(defn run-all []
  (f d)
  (f re)
  (f "s")
  (f 100))

(defn run-rev []
  (f 100)
  (f "s")
  (f re)
  (f d))

(defn run-direct []
  (f d))

(defn run-reify []
  (f re))

(defn run-external []
  (f "s"))

(defn t []
  (println *clojure-version*)
  (println "run all")
  (dotimes [i 5] (time (dotimes [_ 500000000] (run-all))))
  (println "run rev")
  (dotimes [i 5] (time (dotimes [_ 500000000] (run-rev))))
  (println "run direct")
  (dotimes [i 5] (time (dotimes [_ 500000000] (run-direct))))
  (println "run reify")
  (dotimes [i 5] (time (dotimes [_ 500000000] (run-reify))))
  (println "run external")
  (dotimes [i 5] (time (dotimes [_ 500000000] (run-external))))
  )

;;(def m (with-meta [] {`f (constantly 4)}))  ;; metadata (1.10 only)
