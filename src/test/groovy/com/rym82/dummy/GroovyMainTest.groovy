package com.rym82.dummy;

import org.junit.Test;

class GroovyMainTest {
    @Test
    void shouldSum() {
        def main = new GroovyMain()
        assert 3 == main.sum(1, 2)
    }
}
