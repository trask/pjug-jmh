/*
 * Copyright 2014 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package benchmark;

import java.util.HashMap;

public class Example2 {

    public static void main(String[] args) {
        new Example2().harness(100000000);
    }

    void harness(int iterations) {
        long start = System.currentTimeMillis();
        for (int i = 0; i < iterations; i++) {
            benchmark();
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

    void benchmark() {
        new HashMap<>();
    }
}
