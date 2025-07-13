package fjff;

import javax.swing.table.DefaultTableModel;

public class DatosCompartidos {
    private static DefaultTableModel modelo = new DefaultTableModel();

    static {
        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("CANTIDAD");
        modelo.addColumn("PRECIO");
    }

    public static DefaultTableModel getModelo() {
        return modelo;
    }

    static Object getModel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
