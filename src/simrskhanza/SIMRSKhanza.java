/*
  Dilarang keras memperjualbelikan/mengambil keuntungan dari Software 
  ini dalam bentuk apapun tanpa seijin pembuat software
  (Khanza.Soft Media). Bagi yang sengaja membajak softaware ini ta
  npa ijin, kami sumpahi sial 1000 turunan, miskin sampai 500 turu
  nan. Selalu mendapat kecelakaan sampai 400 turunan. Anak pertama
  nya cacat tidak punya kaki sampai 300 turunan. Susah cari jodoh
  sampai umur 50 tahun sampai 200 turunan. Ya Alloh maafkan kami 
  karena telah berdoa buruk, semua ini kami lakukan karena kami ti
  dak pernah rela karya kami dibajak tanpa ijin.
 */
package simrskhanza;

import java.io.FileInputStream;
import java.util.Properties;
import usu.widget.util.WidgetUtilities;

/**
 *
 * @author khanzasoft
 */
public class SIMRSKhanza {
private static final Properties propVer = new Properties();  
private static final Properties propDatabase = new Properties();  
public static String version;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            propVer.loadFromXML(new FileInputStream("setting/version.xml"));
            propDatabase.loadFromXML(new FileInputStream("setting/database.xml"));
        } catch (Exception e) {
            System.out.println("Notif Setting : "+e);
        }
        version = propVer.getProperty("VERSION");
        if(propDatabase.getProperty("AUTOUPDATESISTEM").equals("aktif"))
         {
             
         
         try {
            if (!Updater.getLatestVersion().equals(version) ) {
                new UpdateInfo(Updater.getWhatsNew());
            }
            else
            {
//                if(koneksiDB.condb() == null){
//                String[] run = {"java","-jar","updater/SetKoneksiServer.jar"};
//                    try {
//                            Runtime.getRuntime().exec(run);
//                        } catch (Exception ex) {
//                            ex.printStackTrace();
//                        }
//                    }else{
                             WidgetUtilities.invokeLater(() -> {
                               main utama= new main();
//                               utama.isWall();
                               //utama.setIconImage(new javax.swing.ImageIcon( getClass(). getResource("/picture/home.PNG")).getImage());
                               utama.setVisible(true);
                           });
//                         }
            }
            } catch (Exception ex) {
                    ex.printStackTrace();
                }
         
//         }
//           else  if(koneksiDB.condb() == null)
//           {
//                     String[] run = {"java","-jar","updater/SetKoneksiServer.jar"};
//                try {
//                    Runtime.getRuntime().exec(run);
//                } catch (Exception ex) {
//                    ex.printStackTrace();
//                }
         } 
        else {
              WidgetUtilities.invokeLater(() -> {
           main utama= new main();
//           utama.isWall();
           //utama.setIconImage(new javax.swing.ImageIcon( getClass(). getResource("/picture/home.PNG")).getImage());
           utama.setVisible(true);
       });
    }
    }
}
