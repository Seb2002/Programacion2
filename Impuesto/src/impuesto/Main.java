
package impuesto;

//import javax.swing.JOptionPane;

public class Main {

   
    
    public void mostrar(){
        Liquidacion mostrar = new Liquidacion(); 
        //Carro mostrar1 = new Carro();
         
        // solicitamos los datos y se procede a calcular el valor comercial 
        mostrar.solicitarDatos();
        // el usuario debe digitar si pago a tiempo, es de servicio publico, traslado de cuenta 
       //y con esos datos se procede hacer el descuento
        mostrar.mostrarLiquidacion();
    }
    
    
    
}
