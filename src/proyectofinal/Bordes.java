package proyectofinal;

public class Bordes extends javax.swing.JFrame {
/** Creates new form ScrollBarTest */
public Bordes() {
initComponents(); 
}
private void initComponents() {//GEN-BEGIN:initComponents
jTextArea1 = new javax.swing.JTextArea("Test",10,10);
//jTextArea1.set
jScrollPane1 = new javax.swing.JScrollPane(jTextArea1);
button = new javax.swing.JButton("TestButton");
addWindowListener(new java.awt.event.WindowAdapter() {
public void windowClosing(java.awt.event.WindowEvent evt) {
exitForm(evt);
}
});
getContentPane().add(jScrollPane1, java.awt.BorderLayout.CENTER);
getContentPane().add(button, java.awt.BorderLayout.SOUTH);
java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
setSize(new java.awt.Dimension(200, 150));
setLocation((screenSize.width-150)/2,(screenSize.height-100)/2);
}//GEN-END:initComponents
/** Exit the Application */
private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
System.exit(0);
}//GEN-LAST:event_exitForm
/**
* @param args the command line arguments
*/
public static void main(String args[]) {
try{
javax.swing.UIManager.put("ScrollBar.thumb", new javax.swing.plaf.ColorUIResource(33,129,176));
javax.swing.UIManager.put("Button.foreground", new javax.swing.plaf.ColorUIResource(0,0,0));
}catch(Exception e){
e.printStackTrace();
}
Bordes test = new Bordes();
test.show();
}
 
// Variables declaration - do not modify//GEN-BEGIN:variables
private javax.swing.JScrollPane jScrollPane1;
private javax.swing.JTextArea jTextArea1;
private javax.swing.JButton button;
// End of variables declaration//GEN-END:variables
}