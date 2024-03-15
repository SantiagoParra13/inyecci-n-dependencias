package com.santiago.springboot.app.iyecciondependecias;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.santiago.springboot.app.iyecciondependecias.models.domain.ItemFactura;
import com.santiago.springboot.app.iyecciondependecias.models.domain.Producto;
import com.santiago.springboot.app.iyecciondependecias.models.services.IService;
import com.santiago.springboot.app.iyecciondependecias.models.services.MiServicio;
import com.santiago.springboot.app.iyecciondependecias.models.services.MiServicioComplejo;

@Configuration
public class AppConfig {

    @Bean("miServicioPrincipal")
    public IService registrarMiService() {
        return new MiServicio();
    }

    @Bean("miServicioComplejo")
    @Primary
    public IService registrarMiServiceComplejoService() {
        return new MiServicioComplejo();
    }

    @Bean("itemsFactura")
    public List<ItemFactura> registrarItems() {
        Producto producto1 = new Producto("camara GSony", 150);
        Producto producto2 = new Producto("Bicicleta Santa Cruz", 5000);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 4);

        return Arrays.asList(linea1, linea2);
    }


     @Bean("itemsFacturaOficina")
    public List<ItemFactura> registrarItemsOficina() {
        Producto producto1 = new Producto("Monitor asus lcd 24 1250ghz", 1500);
        Producto producto2 = new Producto("alianware 4090 128ram", 20000);
        Producto producto3 = new Producto("Impresora HP", 1000);
        Producto producto4 = new Producto("Escritorio", 500);

        ItemFactura linea1 = new ItemFactura(producto1, 2);
        ItemFactura linea2 = new ItemFactura(producto2, 4);
        ItemFactura linea3 = new ItemFactura(producto3, 2);
        ItemFactura linea4 = new ItemFactura(producto4, 1);

        return Arrays.asList(linea1, linea2 , linea3, linea4);
    }



}
