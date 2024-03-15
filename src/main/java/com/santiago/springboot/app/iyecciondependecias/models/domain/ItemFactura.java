package com.santiago.springboot.app.iyecciondependecias.models.domain;

public class ItemFactura {

    private Producto producto;
    private Integer catidad;

    public ItemFactura(Producto producto, Integer catidad) {
        this.producto = producto;
        this.catidad = catidad;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public Integer getCatidad() {
        return catidad;
    }

    public void setCatidad(Integer catidad) {
        this.catidad = catidad;
    }

    public Integer cacularImporte() {
        return catidad * producto.getPrecio();
    }

}
