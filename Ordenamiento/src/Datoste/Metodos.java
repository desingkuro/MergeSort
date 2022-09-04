
package Datoste;

import java.util.ArrayList;


public class Metodos {
    
    ArrayList <Telefonos> lista;
    public Metodos(){
        lista= new ArrayList<>();
    }
    
    public void Add(Telefonos x){
        lista.add(x);
    }
    
    public void Set(int ind,Telefonos x){
        lista.set(ind, x);
    }
    
    public int size(){
        return lista.size();
    }
    
    public Telefonos get(int ind){
        return lista.get(ind);
    }
    
    public ArrayList <Telefonos> getList(){
        return lista;
    }
    
    public void setList(ArrayList <Telefonos> x){
        lista=x;
    }
    
    @Override
    public String toString(){
        String aux="Lista vacia.";
        if(!lista.isEmpty()){
            aux="Telefonos:\nMARCA-------------MODELO------------IMEI------------PRECIO";
            for (int i = 0; i < lista.size(); i++) {
                aux+="\n"+lista.get(i).toString();
            }
        }
        return aux;
    }
    
    public ArrayList <Telefonos> MergeSort(){
        if (lista.size()<=1){
            return lista;
        }else{
            
            Metodos left=new Metodos();
            Metodos right=new Metodos();
            
            int left_size=0;
            if(lista.size()%2==0){
                left_size=lista.size()/2;
            }else{
                left_size=lista.size()/2+1;
            }
            
            int i;
            for (i = 0; i < left_size; i++) {
                left.Add(lista.get(i));
            }
            
            int k=0;
            for (int j = i; j < lista.size(); j++) {
                right.Add(lista.get(j));
            }
            
            ArrayList <Telefonos> ordenado = Merge(left.MergeSort(),right.MergeSort());
            return ordenado;
        }
    }
    public ArrayList <Telefonos> Merge(ArrayList <Telefonos> a,ArrayList <Telefonos> b){
        int i=0,j=0;
        int lim=a.size()+b.size();
        ArrayList <Telefonos> aux=new ArrayList<>();
        for (int k = 0; k < lim; k++) {
            if(a.get(i).getprecio() < b.get(j).getprecio()){
                aux.add(a.get(i));
                ++i;
            }else{
                aux.add(b.get(j));
                ++j;
            }
            if (i==a.size()){
                ++k;
                for (j = j; j < b.size(); j++) {
                    aux.add(b.get(j));
                    ++k;
                }
            }else if(j==b.size()){
                ++k;
                for (i = i; i < a.size(); i++) {
                    aux.add(a.get(i));
                    ++k;
                }
            }
        }
        return aux;
    }

}
