package com.proyecto;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ConsolaTest {

    @Test
    public void pruebaIsEsPortatil1() {
        Consola consola = new Consola("Nintendo Switch", "64GB", true);
        assertTrue(consola.isEsPortatil());
    }

    @Test
    public void pruebaIsEsPortatil2() {
        Consola consola = new Consola("PlayStation 5 Pro", "2TB", false);
        assertTrue(!consola.isEsPortatil());
    }
}
