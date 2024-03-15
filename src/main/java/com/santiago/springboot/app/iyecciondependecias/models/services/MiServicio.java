package com.santiago.springboot.app.iyecciondependecias.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service("miServicioPrincipal")
public class MiServicio implements IService{

    @Override
    public String operacion(){
        return "Ejecuntado algun servicio importantemnet simple";
    }
}
