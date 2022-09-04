
package Datoste;


public class Telefonos {
    private String modelo;
    private float precio;
    private String marca;
    private String imei;

    public Telefonos(float precio, String marca,String model, String imei) {
        this.modelo=model;
        this.precio = precio;
        this.marca = marca;
        this.imei = imei;
    }

    @Override
    public String toString() {
        String aux="";
        //"\n\t" + marca + "\t"+ modelo + "\t" + precio + "\t" + imei
        aux+=marca;
        int lim = 21-marca.length();
        for (int i = 0; i <lim ; i++) {
            aux+="-";
        }
        aux+=modelo;
        lim = 23-modelo.length();
        for (int i = 0; i <lim ; i++) {
            aux+="-";
        }
        
        aux+=imei;
        lim = 16-imei.length();
        for (int i = 0; i <lim ; i++) {
            aux+="-";
        }
        String strprecio = String.format("%.2f", precio);
        aux+=strprecio;
        return aux;
    }
    /**
     * @param precio************/
    public void setprecio(float precio){
        this.precio=precio;
    }
    public void setimei(String imei){
        this.imei=imei;
    }
    public void setmarca(String marca){
        this.marca=marca;
    }
    
    public float getprecio(){
        return precio;
    }
    public String getimei(){
        return imei;
    }
    public String getmarca(){
        return marca;
    }
    
}
