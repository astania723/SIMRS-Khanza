/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fungsi;


import java.awt.Desktop;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.net.URISyntaxException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.Properties;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import uz.ncipro.calendar.JDateTimePicker;
import widget.Button;
import widget.ComboBox;
import widget.Tanggal;
import widget.TextArea;
import java.io.File;
import widget.TextBox;
/**
 *
 * @author Owner
 */
public final class validasi2 {
    private int a,j,i,result=0;
    private String s,s1,auto,PEMBULATANHARGAOBAT=koneksiDB.PEMBULATANHARGAOBAT();
    private final Connection connect=koneksiDB.condb();
    private final sekuel sek=new sekuel();
    private final java.awt.Desktop desktop = java.awt.Desktop.getDesktop();
    private final DecimalFormat df2 = new DecimalFormat("###,###,###,###,###,###,###");  
    private final DecimalFormat df4 = new DecimalFormat("###,###,###,###,###,###,###.#################");  
    private final DecimalFormat df5 = new DecimalFormat("###,###,###,###,###,###,###.##");  
    private final DecimalFormat df3 = new DecimalFormat("######"); 
    private final DecimalFormat df6 = new DecimalFormat("######.###"); 
    private final DecimalFormat df7 = new DecimalFormat("######.#"); 
    private PreparedStatement ps;
    private ResultSet rs;
    private File file;
    private boolean status=true;
    private final Calendar now = Calendar.getInstance();
    private final int year=(now.get(Calendar.YEAR));
    private String[] nomina={"","satu","dua","tiga","empat","lima","enam",
                         "tujuh","delapan","sembilan","sepuluh","sebelas"};
    
    public validasi2(){
        super();
    };
public void autoNomer9(String sql,String strAwal,Integer pnj,javax.swing.JLabel teks){
        try {
            ps=connect.prepareStatement(sql);
            try{   
                rs=ps.executeQuery();
                s="1";
                while(rs.next()){
                    s=Integer.toString(Integer.parseInt(rs.getString(1))+1);
                }            

                j=s.length();
                s1="";
                for(i = 1;i<=pnj-j;i++){
                    s1=s1+"0";
                }
                teks.setText(strAwal+s1+s);
             }catch(Exception e){
                System.out.println("Notifikasi : "+e);
                JOptionPane.showMessageDialog(null,"Maaf, Query tidak bisa dijalankan...!!!!");
             }finally{
                if(rs != null){
                    rs.close();
                }
                
                if(ps != null){
                    ps.close();
                }
            }
        } catch (Exception e) {
            System.out.println("Notifikasi : "+e);
        }
    }
    
}
