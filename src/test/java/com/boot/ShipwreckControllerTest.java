/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boot;

import com.boot.controller.ShipwreckController;
import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;
import static junit.framework.TestCase.assertEquals;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import org.mockito.MockitoAnnotations;

/**
 *
 * @author ktopper3
 */
public class ShipwreckControllerTest {
    @InjectMocks
    private ShipwreckController sc;
    
    @Mock
    private ShipwreckRepository shipWreckRepository;
    
    @Before
    public void init() {
        MockitoAnnotations.initMocks(this);
    }
    
    @Test
    public void testShipwreckGet() {
        Shipwreck sw = new Shipwreck();
        sw.setId(1l);
        when(shipWreckRepository.findOne(1l)).thenReturn(sw);
        
        Shipwreck wreck = sc.get(1l);
        
        verify(shipWreckRepository).findOne(1l);
        
//        assertEquals(1l, wreck.getId().longValue());
        assertThat(wreck.getId(), is(1l));
    }
}
