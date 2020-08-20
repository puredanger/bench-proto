Start Clojure using one of:

```
# Clojure 1.9
clj -A:c9

# Clojure 1.10.0-beta5
clj -A:c10
```

Then run the benchmark test:

```
(use 'bench)
(t)
```

Tests are:

1. all - invoke direct, reify, external extension with string, external extension with number
2. rev - same as all, reverse order
3. direct - single direct call
4. reify - single reify call
5. extension - single extension call


