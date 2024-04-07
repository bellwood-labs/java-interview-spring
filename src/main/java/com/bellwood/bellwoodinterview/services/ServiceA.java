package com.bellwood.bellwoodinterview.services;

import com.bellwood.bellwoodinterview.models.Type;
import org.springframework.stereotype.Service;

@Service
public class ServiceA implements IService {

    @Override
    public Type type() {
        return Type.A;
    }

    @Override
    public Object businessLogic() {
        return String.format("%s specific business logic", Type.A);
    }

}
