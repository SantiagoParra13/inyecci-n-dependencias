package com.santiago.springboot.app.iyecciondependecias.models.services;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Service("miServicioCmplejo")
public class MiServicioComplejo implements IService{

    @Override
    public String operacion(){
        return "Ejecuntado algun servicio importantemente complejo";
    }
}
