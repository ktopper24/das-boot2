/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.boot.controller;

import com.boot.model.Shipwreck;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ktopper3
 */
@RestController
@RequestMapping("api/v1/")
public class ShipwreckController {
    @RequestMapping(value="shipwrecks", method = RequestMethod.GET)
    public List<Shipwreck> list() {
        return  ShipwreckStub.list();
    }
        @RequestMapping(value="shipwrecks/", method = RequestMethod.POST)
    public Shipwreck create(@RequestBody Shipwreck shipwreck) {
        return  ShipwreckStub.create(shipwreck);
    }
        @RequestMapping(value="shipwrecks/{id}", method = RequestMethod.GET)
    public Shipwreck get(@PathVariable Long id) {
        return  ShipwreckStub.get(id);
    }
        @RequestMapping(value="shipwrecks", method = RequestMethod.PUT)
    public Shipwreck update(@PathVariable Long id, @RequestBody Shipwreck shipwreck) {
        return  ShipwreckStub.update(id, shipwreck);
    }
        @RequestMapping(value="shipwrecks", method = RequestMethod.DELETE)
    public Shipwreck delete(@PathVariable Long id) {
        return  ShipwreckStub.delete(id);
    }
}
