package edu.progavud.taller1pa.control;

import edu.progavud.taller1pa.vista.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import edu.progavud.taller1pa.control.ControlTipoProducto;

public class ControlVentana implements ActionListener {
    //Se podria definir las propiedade como final
    private final ControlPrincipal cPrin;
    private MainView vistaPrincipal;
    private CategoriaView vistaCategorias;
    

    public ControlVentana(ControlPrincipal cPrin){//Solo recibe el control principal
        this.cPrin = cPrin;//Guardar el contorl prinicpal
        //Se crean los controles de la vista, reciben el param this
        vistaPrincipal = new MainView();
        configurarMainView();
        vistaPrincipal.setVisible(true);
        //this.vistaCategorias = vistaCategorias;
    }
    
    private void configurarMainView(){
        vistaPrincipal.getBtnCatalogo();
        vistaPrincipal.getBtnVerPedidos();
        vistaPrincipal.getBtnSalir();
    }
    

    @Override
    public void actionPerformed(ActionEvent e){ //ActionPerformed para elegir si el pedido es para llevar o para la mesa
        String comando = e.getActionCommand();
        
        switch(comando){
            case "🛍️ Ver Catálogo de Productos":
                vistaPrincipal.dispose();
                //vistaCategorias.setVisible(true);
            case "📦 Ver Pedidos":
                vistaPrincipal.mostrarMensajeEnDesarrollo();
                
            case "❌ Salir":
                vistaPrincipal.dispose();
                
        }
        
    }
    
    
        
        
    }