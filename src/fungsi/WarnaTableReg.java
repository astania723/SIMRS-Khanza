/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fungsi;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;

/**
 *
 * @author Owner
 */
public class WarnaTableReg extends DefaultTableCellRenderer {
    @Override
        public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column){
        Component component = super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column);

        String statusfinger = table.getValueAt(row, 27).toString();
        if (row % 2 == 1){
            component.setBackground(new Color(255,244,244));
            //component.setForeground(new Color(50,50,50));
        }else{
            component.setBackground(new Color(255,255,255));
            //component.setForeground(new Color(50,50,50));
        } 
        if( statusfinger.equals("Belum Finger")){component.setBackground(new Color(255,244,244));}
        else if( statusfinger.equals("Sudah Finger")){component.setBackground(new Color(255,204,204));}
        
        
        
        
        //else if( statusfinger.equals("Sep Terbit")){component.setBackground(new Color(204,255,229));}
        if(table.getValueAt(row,32).toString().equals("Sudah Terbit")){
            component.setBackground(new Color(204,255,229));
            component.setForeground(new Color(50,50,50));
       // }else if(table.getValueAt(row,32).toString().equals("Sudah Finger")){
         //   component.setBackground(new Color(255,204,204));
           // component.setForeground(new Color(50,50,50));
       // }else if(table.getValueAt(row,32).toString().equals("Sep Terbit")){
       //     component.setBackground(new Color(204,204,255));
       //     component.setForeground(new Color(120,110,50));
      // }else if(table.getValueAt(row,10).toString().equals("Dirujuk")||table.getValueAt(row,19).toString().equals("Meninggal")||table.getValueAt(row,19).toString().equals("Pulang Paksa")){
         // component.setBackground(new Color(152,152,156));Belum Finger
         // component.setForeground(new Color(245,245,255));
       // }else if(table.getValueAt(row,10).toString().equals("Dirawat")){
            //component.setBackground(new Color(119,221,119));
           // component.setForeground(new Color(245,255,245));
        }
        return component;
    }
}


