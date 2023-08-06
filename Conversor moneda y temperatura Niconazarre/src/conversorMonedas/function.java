package conversorMonedas;

import javax.swing.JOptionPane;

public class function {

	ConvertirMonedas monedas = new ConvertirMonedas();
	ConvertirMonedasAPesos pesos = new ConvertirMonedasAPesos();
	
    public void ConvertirMonedas(double Minput) {
    	String opcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Pesos Argentinos a Dólares", 
    					"De Pesos Argentinos a Euros", 
    					"De Pesos Argentinos a Libras",
    					"De Pesos Argentinos a Yenes", 
    					"De Pesos Argentinos a Wones Coreanos", 
    					"De Dólares a Pesos Argentinos",
    					"De Euros a Pesos Argentinos", 
    					"De Libras a Pesos Argentinos", 
    					"De Yenes a Pesos Argentinos",
    					"De Wones Coreano a Pesos Argentinos"}, 
    			"Seleccion")).toString();
        switch(opcion) {
        case "De Pesos Argentinos a Dólares":
        	monedas.ConvertirPesosADolares(Minput);
        	break;
        case "De Pesos Argentinos a Euros":
        	monedas.ConvertirPesosAEuros(Minput);
        	break;
        case "De Pesos Argentinos a Libras":
        	monedas.ConvertirPesosALibras(Minput);
        	break;
        case "De Pesos a Yenes":
        	monedas.ConvertirPesosAYen(Minput);
        	break;
        case "De Pesos Argentinos a Wones Coreanos":
        	monedas.ConvertirPesosAWon(Minput);
        	break;    	    	                          
        case "De Dólares a Pesos Argentinos":
        	pesos.ConvertirDolaresAPesos(Minput);
        	break;
        case "De Euros a Pesos Argentinos":
        	pesos.ConvertirEurosAPesos(Minput);
        	break;
        case "De Libras a Pesos Argentinos":
        	pesos.ConvertirLibrasAPesos(Minput);
        	break;
        case "De Yenes a Pesos Argentinos":
        	pesos.ConvertirYenAPesos(Minput);
        	break;
        case "De Wones Coreano a Pesos Argentinos":
            pesos.ConvertirWonAPesos(Minput);
            break;
        }      
    }
        
}
