/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boot;

import com.boot.model.Shipwreck;
import com.boot.repository.ShipwreckRepository;
import java.util.List;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author ktopper3
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(App.class)
public class ShipwreckRepositoryIntegrationTest {
    @Autowired
    private ShipwreckRepository shipwreckRepository;
    
    @Test
    public void testFindAll() {
        List<Shipwreck> wrecks = shipwreckRepository.findAll();
        assertThat(wrecks.size(), is(greaterThanOrEqualTo(0)));
    }
}
