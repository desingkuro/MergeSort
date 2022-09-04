/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package principal;
import Datoste.Metodos;
import Datoste.Telefonos;
import javax.swing.JOptionPane;
 

public class ejecucion {
    public static void main(String[] args) {
        Metodos xd=new Metodos();
        Metodos Ordenado=new Metodos();
        xd.Add(new Telefonos(12, "xd","guchi", "9"));
        xd.Add(new Telefonos(4, "guchi","guchi", "5"));
        xd.Add(new Telefonos(3, "eche","tumae", "3"));
        xd.Add(new Telefonos(6, "guchi","guchi", "2"));
        xd.Add(new Telefonos(96, "guchi","awevo pai", "3"));
        String modelo,entrada,marca,imei,titulo;
        float precio;
        int op,n=1;
        do{
           entrada = JOptionPane.showInputDialog(null,"""
                            Bienvenido, por favor escoja una opcion: 
                            1.ingresar un Telefono
                            2.listar Telefonos
                            3.Ordenar por precio
                            4.salir""","Menu",JOptionPane.QUESTION_MESSAGE);

            if(entrada != null){
               if(!entrada.trim().equals("")){
                   op=Integer.parseInt(entrada);
               }else{
                  JOptionPane.showMessageDialog(null, "No digitaste nada!","Error!", JOptionPane.ERROR_MESSAGE);
                  op=4;
               }

            }else{
               op=4;
            }
            
            switch(op){
               case 1:
                   titulo="Telefono"+n;
                    //ingresar telefono
                    entrada= JOptionPane.showInputDialog(null,"Inserte modelo",titulo,JOptionPane.QUESTION_MESSAGE);
                    if(entrada != null){
                        if(!entrada.trim().equals("")){
                            modelo=entrada;
                        }else{
                            JOptionPane.showMessageDialog(null, "No digitaste nada!","Error!", JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }else{
                        op=1;
                        break;
                    }
                    
                    entrada=JOptionPane.showInputDialog(null,"Inserte precio",titulo,JOptionPane.QUESTION_MESSAGE);
                    if(entrada != null){
                        if(!entrada.trim().equals("")){
                            precio=Float.parseFloat(entrada);
                        }else{
                            JOptionPane.showMessageDialog(null, "No digitaste nada!","Error!", JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }else{
                        op=1;
                        break;
                    }
                   
                    entrada= JOptionPane.showInputDialog(null,"Inserte marca",titulo,JOptionPane.QUESTION_MESSAGE);
                    if(entrada != null){
                        if(!entrada.trim().equals("")){
                            marca=entrada;
                        }else{
                            JOptionPane.showMessageDialog(null, "No digitaste nada!","Error!", JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }else{
                        op=1;
                        break;
                    }
                    
                    entrada= JOptionPane.showInputDialog(null,"Inserte imei",titulo,JOptionPane.QUESTION_MESSAGE);
                    if(entrada != null){
                        if(!entrada.trim().equals("")){
                            imei=entrada;
                        }else{
                            JOptionPane.showMessageDialog(null, "No digitaste nada!","Error!", JOptionPane.ERROR_MESSAGE);
                            break;
                        }
                    }else{
                        op=1;
                        break;
                    }
                    xd.Add(new Telefonos(precio,marca,modelo,imei));
                    ++n;
                    break;
                    
               case 2:
                    JOptionPane.showMessageDialog(null, xd.toString(),"Lista",JOptionPane.INFORMATION_MESSAGE);
                    break;
               case 3:
                    Ordenado.setList(xd.MergeSort());
                    JOptionPane.showMessageDialog(null, Ordenado.toString(),"Lista Ordenada",JOptionPane.INFORMATION_MESSAGE);
                    break;
               case 4:
                    System.exit(0);
                    break;
            }
        }while (op>=1 && op<4);
    }
}