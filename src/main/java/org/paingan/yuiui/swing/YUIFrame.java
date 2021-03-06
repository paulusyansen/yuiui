/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.paingan.yuiui.swing;

import com.sun.glass.events.KeyEvent;
import org.paingan.yuiui.service.YUICompressor;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JMenuItem;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.paingan.yuiui.Options;

/**
 *
 * @author paulusyansen
 */
public class YUIFrame extends javax.swing.JFrame {

    /**
     * Creates new form YUIGUIFrame
     */
    public YUIFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMain = new javax.swing.JPanel();
        lblSource = new javax.swing.JLabel();
        txtPath = new javax.swing.JTextField();
        jspConsole = new javax.swing.JScrollPane();
        txtConsole = new javax.swing.JTextArea();
        lblClear = new javax.swing.JLabel();
        menuBar = new javax.swing.JMenuBar();
        menuFile = new javax.swing.JMenu();
        mItemFileOpen = new javax.swing.JMenuItem();
        menuOpenRecent = new javax.swing.JMenu();
        menuHelp = new javax.swing.JMenu();
        mItemHelpReport = new javax.swing.JMenuItem();
        menuItemAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("yuiui - Simple YUI Compressor v1.0");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFont(new java.awt.Font("Courier New", 1, 12)); // NOI18N
        setName("frm"); // NOI18N
        setResizable(false);

        panelMain.setBackground(new java.awt.Color(204, 204, 204));

        lblSource.setText("Source");

        txtPath.setEditable(false);
        txtPath.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtPath.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtPath.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPathMouseClicked(evt);
            }
        });

        txtConsole.setEditable(false);
        txtConsole.setColumns(20);
        txtConsole.setFont(new java.awt.Font("Lucida Console", 0, 12)); // NOI18N
        txtConsole.setRows(5);
        txtConsole.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jspConsole.setViewportView(txtConsole);

        lblClear.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        lblClear.setText("clear");
        lblClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblClearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelMainLayout = new javax.swing.GroupLayout(panelMain);
        panelMain.setLayout(panelMainLayout);
        panelMainLayout.setHorizontalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jspConsole)
                    .addGroup(panelMainLayout.createSequentialGroup()
                        .addComponent(lblSource)
                        .addGap(18, 18, 18)
                        .addComponent(txtPath, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMainLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblClear)
                        .addGap(10, 10, 10)))
                .addContainerGap())
        );
        panelMainLayout.setVerticalGroup(
            panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSource)
                    .addComponent(txtPath, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspConsole, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblClear)
                .addContainerGap())
        );

        menuBar.setBackground(new java.awt.Color(204, 204, 204));
        menuBar.setBorder(null);
        menuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        menuBar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N

        menuFile.setBorder(null);
        menuFile.setText("File");
        menuFile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuFile.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        mItemFileOpen.setMnemonic('O');
        mItemFileOpen.setText("Open");
        mItemFileOpen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        mItemFileOpen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mItemFileOpenActionPerformed(evt);
            }
        });
        menuFile.add(mItemFileOpen);

        menuOpenRecent.setMnemonic('R');
        menuOpenRecent.setText("Open Recent");
        menuOpenRecent.setToolTipText("");
        menuOpenRecent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuFile.add(menuOpenRecent);

        menuBar.add(menuFile);

        menuHelp.setBorder(null);
        menuHelp.setText("Help");
        menuHelp.setActionCommand("");
        menuHelp.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuHelp.setEnabled(false);
        menuHelp.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N

        mItemHelpReport.setText("Report an Issue");
        mItemHelpReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuHelp.add(mItemHelpReport);

        menuItemAbout.setText("About");
        menuItemAbout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        menuHelp.add(menuItemAbout);

        menuBar.add(menuHelp);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panelMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPathMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPathMouseClicked
        actionOpenFile();
    }//GEN-LAST:event_txtPathMouseClicked

    private void mItemFileOpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mItemFileOpenActionPerformed
        actionOpenFile();
    }//GEN-LAST:event_mItemFileOpenActionPerformed

    private void lblClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblClearMouseClicked
        txtConsole.setText("");
    }//GEN-LAST:event_lblClearMouseClicked
    
    /**
     * 
     */
    private void actionOpenFile() {
        
        FileNameExtensionFilter filter = new FileNameExtensionFilter("javascript, css, html","js","css","html");
        
        JFileChooser jfc = new JFileChooser(new File(System.getProperty("user.dir")));
        
        jfc.setFileFilter(filter);
        jfc.setDialogTitle("Choose a directory or file: ");
        jfc.setDialogType(jfc.SAVE_DIALOG);
        jfc.setApproveButtonText("Compress");
        jfc.setApproveButtonToolTipText("Compress file");
        jfc.setApproveButtonMnemonic(KeyEvent.VK_C);
        jfc.setFileSelectionMode(jfc.FILES_AND_DIRECTORIES);
        jfc.setMultiSelectionEnabled(false);
       
        int returnValue = jfc.showSaveDialog(null);
        
        if (returnValue == jfc.APPROVE_OPTION) {
            
            if (jfc.getSelectedFile().isFile()) {
                txtPath.setText(jfc.getSelectedFile().getAbsolutePath());
                
                final String inputFilename = jfc.getSelectedFile().getAbsolutePath();
                int index = jfc.getSelectedFile().getName().indexOf(".");
                String filename = jfc.getSelectedFile().getName().substring(0, index);
                final String ext = jfc.getSelectedFile().getName().substring(index);

                final String outputFilename = jfc.getSelectedFile().getParent() +"/"+ filename +".min"+ ext;
                final String fileNameExt = jfc.getSelectedFile().getName();
//                Options o = new Options();

                JMenuItem newItem = new JMenuItem();
                newItem.setText(inputFilename);
                newItem.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        compressFile(inputFilename, outputFilename,fileNameExt , ext);
                    }
                });
                int sizeRecent = menuOpenRecent.getItemCount();
                for(int i=0; i < sizeRecent; i++) {
                    JMenuItem thisItem = menuOpenRecent.getItem(i);
                    if(thisItem.getText().equals(inputFilename)) {
                        menuOpenRecent.remove(thisItem);
                    }
                }
                menuOpenRecent.add(newItem);
                
                
                compressFile(inputFilename, outputFilename, fileNameExt, ext);
            }
            
            if(jfc.getSelectedFile().isDirectory()) {
                File[] filesInDirectory = jfc.getSelectedFile().listFiles();
                
                for ( File file : filesInDirectory ) {
                    txtPath.setText(jfc.getSelectedFile().getPath());
                    
                    final String fileNameExt = file.getName();
                    final String inputFilename = file.getAbsolutePath();
                    int index = fileNameExt.indexOf(".");
                    
                    if(index > 0) { // must has extension
                        final String ext = fileNameExt.substring(index);
                        String filename = fileNameExt.substring(0, index);
                        final String outputFilename = file.getParent() +"/"+ filename +".min"+ ext;
                        
                        JMenuItem newItem = new JMenuItem();
                        newItem.setText(inputFilename);
                        newItem.addActionListener(new java.awt.event.ActionListener() {
                            public void actionPerformed(java.awt.event.ActionEvent evt) {
                                compressFile(inputFilename, outputFilename,fileNameExt , ext);
                            }
                        });
                        int sizeRecent = menuOpenRecent.getItemCount();
                        for(int i=0; i < sizeRecent; i++) {
                            JMenuItem thisItem = menuOpenRecent.getItem(i);
                                if(thisItem.getText().equals(inputFilename)) {
                                    menuOpenRecent.remove(thisItem);
                                }
                        }
                        menuOpenRecent.add(newItem);
                
                        compressFile(inputFilename, outputFilename,fileNameExt , ext);
                    }
                }
            }
        } else {
            txtConsole.setText("No file chosen!");
        }
    }
    
    /**
     * 
     * @param inputFilename
     * @param outputFilename
     * @param filename
     * @param ext 
     */
    private void compressFile(String inputFilename, String outputFilename, String filename, String ext){

        Options o = new Options();

        try {
            if (".js".equals(ext)) {
                YUICompressor.compressJavaScript(inputFilename, outputFilename, o);
                txtConsole.append(filename + " JS file compress successfully\n");
            }
            if (".css".equals(ext)) {
                YUICompressor.compressCSS(inputFilename, outputFilename, o);
                txtConsole.append(filename + " CSS file compress successfully\n");
            }
            if (".html".equals(ext)) {
                YUICompressor.compressHTML(inputFilename, outputFilename, o);
                txtConsole.append(filename + " HTML file compress successfully\n");
            }

        } catch (Exception ex) {
            Logger.getLogger(YUIFrame.class.getName()).log(Level.SEVERE, null, ex);
            txtConsole.append(ex.getMessage() + "\n");
        }
        
    }
    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(YUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(YUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(YUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(YUIFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new YUIFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jspConsole;
    private javax.swing.JLabel lblClear;
    private javax.swing.JLabel lblSource;
    private javax.swing.JMenuItem mItemFileOpen;
    private javax.swing.JMenuItem mItemHelpReport;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenu menuFile;
    private javax.swing.JMenu menuHelp;
    private javax.swing.JMenuItem menuItemAbout;
    private javax.swing.JMenu menuOpenRecent;
    private javax.swing.JPanel panelMain;
    private javax.swing.JTextArea txtConsole;
    private javax.swing.JTextField txtPath;
    // End of variables declaration//GEN-END:variables
}