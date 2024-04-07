package com.bellwood.bellwoodinterview.controllers;

import com.bellwood.bellwoodinterview.models.Type;
import com.bellwood.bellwoodinterview.services.ServiceA;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;


@RestController("/test")
public class Controller {

    @GetMapping("/{type}")
    public ResponseEntity<Object> getByType(@PathVariable Type type) {
        return ResponseEntity.ok(this.getHardCodedBusinessLogic(type));
    }

    private Object getHardCodedBusinessLogic(Type type) {
        if (type.equals(Type.A)) {
            return new ServiceA().businessLogic();
        }
        throw new IllegalArgumentException();
    }

}
