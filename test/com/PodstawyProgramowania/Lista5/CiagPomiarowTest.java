package com.PodstawyProgramowania.Lista5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by kokoseq on 06.02.2017.
 */
public class CiagPomiarowTest {
    CiagPomiarow cp;

    @Before
    public void setUp() throws Exception {
        Pomiar p = Pomiar.losowyPomiar();
        cp = new CiagPomiarow(new Pomiar[] {p});
    }

    @After
    public void tearDown() throws Exception {
        cp = null;
    }

    @Test
    public void zapiszDoPlikuIWczytajZPliku_gdyJedenPomiar() throws Exception {
        cp.zapiszDoPliku("CiagPomiarowTest");

        CiagPomiarow cpWczytane = new CiagPomiarow();
        cpWczytane.wczytajZPliku("CiagPomiarowTest");

        assertEquals(cp.getPomiary().length, cpWczytane.getPomiary().length);

        for (int i = 0; i < cp.getPomiary().length; i++){
            assertEquals(cpWczytane.getPomiary()[i].getTemperatura(), cp.getPomiary()[i].getTemperatura(), 0.001);
            assertEquals(cpWczytane.getPomiary()[i].getCzas(), cp.getPomiary()[i].getCzas());
        }

    }

}