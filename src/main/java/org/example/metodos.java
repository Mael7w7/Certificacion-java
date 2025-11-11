package org.example;

public class metodos {

    Producto pro = new Producto();
    public void vender(int cantidad){
        if(pro.getStock()>cantidad){
            int total = pro.getStock() - cantidad;
            pro.setStock(total);
            System.out.println("El stock es "+pro.getStock());
        }else {
            System.out.println("La cantidad sobrepasa el valor del stock");
        }
    }

    public void reponer(int cantidad){

        int total = pro.getStock() + cantidad;
        pro.setStock(total);
        System.out.println("Se agrego productos nuevos stock : " +total);
    }

    public void mostrarInfo(){

        System.out.println("El nombre del producto es :  "+pro.getNombre());
        System.out.println("El precio del producto es : " +pro.getPrecio());
        System.out.println("El stock del producto es : "+pro.getStock());

    }

    public metodos(Producto pro) {
        this.pro = pro;
    }
    public metodos() {

    }



}
