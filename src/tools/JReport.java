package tools;

import java.io.File;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import tools.DBConnection;

public class JReport {

    public static void main(String[] args) {
        printreport("report1");
        printreport("report2");
    }
    
    public static void printreport(String file){
        DBConnection connection = new DBConnection();
        try {
            String source = "src/Report/"+file+".jasper";
            File report = new File(source);
            JasperReport jr = (JasperReport) JRLoader.loadObject(report);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, connection.getConnection());
            JasperViewer.viewReport(jp);
            //Jasper
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Gagal");
        }
    }
}
