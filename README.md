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

Example results:

```
{:major 1, :minor 9, :incremental 0}
run all
"Elapsed time: 7733.494133 msecs"
"Elapsed time: 7571.521332 msecs"
"Elapsed time: 7588.168379 msecs"
"Elapsed time: 7612.208692 msecs"
"Elapsed time: 7640.332416 msecs"
run rev
"Elapsed time: 7632.255755 msecs"
"Elapsed time: 7328.150728 msecs"
"Elapsed time: 7349.380235 msecs"
"Elapsed time: 7331.910272 msecs"
"Elapsed time: 7345.874004 msecs"
run direct
"Elapsed time: 734.76715 msecs"
"Elapsed time: 887.668367 msecs"
"Elapsed time: 738.728727 msecs"
"Elapsed time: 727.583548 msecs"
"Elapsed time: 730.168751 msecs"
run reify
"Elapsed time: 725.503951 msecs"
"Elapsed time: 891.017929 msecs"
"Elapsed time: 726.111873 msecs"
"Elapsed time: 734.68858 msecs"
"Elapsed time: 730.587599 msecs"
run external
"Elapsed time: 1795.936427 msecs"
"Elapsed time: 1784.620466 msecs"
"Elapsed time: 1646.402804 msecs"
"Elapsed time: 1647.128838 msecs"
"Elapsed time: 1635.010386 msecs"


{:major 1, :minor 10, :incremental 0, :qualifier beta5}
run all
"Elapsed time: 27899.235642 msecs"
"Elapsed time: 27602.70625 msecs"
"Elapsed time: 27516.79538 msecs"
"Elapsed time: 27507.276665 msecs"
"Elapsed time: 27574.055086 msecs"
run rev
"Elapsed time: 28706.129384 msecs"
"Elapsed time: 28384.379995 msecs"
"Elapsed time: 28310.421721 msecs"
"Elapsed time: 28374.727123 msecs"
"Elapsed time: 28639.310311 msecs"
run direct
"Elapsed time: 735.098462 msecs"
"Elapsed time: 899.935619 msecs"
"Elapsed time: 726.088565 msecs"
"Elapsed time: 733.303366 msecs"
"Elapsed time: 746.049781 msecs"
run reify
"Elapsed time: 737.292859 msecs"
"Elapsed time: 891.788052 msecs"
"Elapsed time: 728.301011 msecs"
"Elapsed time: 740.083934 msecs"
"Elapsed time: 732.783194 msecs"
run external
"Elapsed time: 11792.508611 msecs"
"Elapsed time: 11892.989249 msecs"
"Elapsed time: 11908.992623 msecs"
"Elapsed time: 12006.195661 msecs"
"Elapsed time: 11979.886142 msecs"
```

