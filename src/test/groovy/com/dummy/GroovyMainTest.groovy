package com.dummy;

import org.junit.Test;

import com.dummy.GroovyMain;

class GroovyMainTest {
    @Test
    void shouldSum() {
        def main = new GroovyMain()
        assert 3 == main.sum(1, 2)
        assert 4 == main.sum(1, 3)
    }
}
