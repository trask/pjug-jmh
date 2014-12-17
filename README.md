## Sample results

Environment:

* Intel Core i5-3427U CPU @ 1.80GHz (MacBook Air, Mid 2012)
* Windows 7
* Oracle JDK 8u25

```
Benchmark                      (initialCapacity)  Mode  Samples    Score    Error  Units
o.e.PJUG01.newArrayList                      N/A  avgt      200    0.382 ±  0.007  ns/op
o.e.PJUG02.newArrayList                      N/A  avgt      200    5.618 ±  0.122  ns/op
o.e.PJUG03.newArrayList                      N/A  avgt      200    5.479 ±  0.020  ns/op
o.e.PJUG04.logarithm                         N/A  avgt      200    3.027 ±  0.010  ns/op
o.e.PJUG05.logarithm                         N/A  avgt      200   35.747 ±  0.065  ns/op
o.e.PJUG06.logarithm                         N/A  avgt      200    3.010 ±  0.008  ns/op
o.e.PJUG07.logarithm                         N/A  avgt      200   35.538 ±  0.104  ns/op
o.e.PJUG08.harnessOverhead                   N/A  avgt      200    2.998 ±  0.007  ns/op
o.e.PJUG09.mapSize                           N/A  avgt      200    3.443 ±  0.015  ns/op
o.e.PJUG10.mapSize                           N/A  avgt      200    3.484 ±  0.025  ns/op
o.e.PJUG11.mapSize                           N/A  avgt      200    5.409 ±  0.026  ns/op
o.e.PJUG12.mapSize                           N/A  avgt      200    5.505 ±  0.006  ns/op
o.e.PJUG13.directCall                        N/A  avgt      200    3.779 ±  0.015  ns/op
o.e.PJUG13.harnessOverhead                   N/A  avgt      200    3.798 ±  0.009  ns/op
o.e.PJUG14.reflection                        N/A  avgt      200  461.169 ± 26.632  ns/op
o.e.PJUG15.reflection                        N/A  avgt      200    8.415 ±  0.036  ns/op
o.e.PJUG16.reflection                        N/A  avgt      200    7.075 ±  0.015  ns/op
o.e.PJUG17.group                             N/A  avgt      200   20.625 ±  0.342  ns/op
o.e.PJUG17.group:incrementX                  N/A  avgt      200   30.351 ±  0.763  ns/op
o.e.PJUG17.group:readY                       N/A  avgt      200   10.899 ±  0.342  ns/op
o.e.PJUG18.group                             N/A  avgt      200    8.425 ±  0.209  ns/op
o.e.PJUG18.group:incrementX                  N/A  avgt      200   13.414 ±  0.423  ns/op
o.e.PJUG18.group:readY                       N/A  avgt      200    3.437 ±  0.042  ns/op
o.e.PJUG19.newArrayList                        2  avgt      200  826.805 ±  2.626  ns/op
o.e.PJUG19.newArrayList                        4  avgt      200  761.433 ±  2.938  ns/op
o.e.PJUG19.newArrayList                        8  avgt      200  683.512 ±  3.054  ns/op
o.e.PJUG19.newArrayList                       16  avgt      200  624.361 ±  1.933  ns/op
o.e.PJUG19.newArrayList                       32  avgt      200  544.332 ±  5.626  ns/op
o.e.PJUG19.newArrayList                       64  avgt      200  549.919 ±  1.401  ns/op
o.e.PJUG19.newArrayList                      128  avgt      200  377.599 ±  1.135  ns/op
```
