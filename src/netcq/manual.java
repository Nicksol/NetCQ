/*
 * manuel.java
 * extracting data according to quaries   
 * Version 1.4.1
 * 18/12/2014
 */
package netcq;

import java.util.ArrayList;
import java.util.List;

public class manual extends javax.swing.JFrame {

    public static List<Integer> srclist;
    public static List<Integer> destlist;
    public static List<Integer> srcportlist;
    public static List<Integer> destportlist;
    public static List<Integer> lengthlist;
    public static List<Integer> protolist;
    public static List<Integer> choise1;
    public static List<Integer> choise2;
    public static List<Integer> choise3;
    public static List<Integer> choise4;
    public static List<Integer> choise5;
    public static List< List<Integer>> que = new ArrayList<>();
    public static String srcip_sel;
    public static Integer srcport_sel;
    public static String desip_sel;
    public static String selected_proto;
    public static Integer desport_sel;
    public static String protocol_sel;
    public static Integer length_sel;
    public static String srcip_show;
    public static String desip_show;
    public static int srcport_show;
    public static int desport_show;
    public static int length_show;
    public static String protocol_show;
    public static int select = 0;
    public static List<Integer> sel6, sel5, sel4, sel3, sel2, sel1;
    public static String length_com_str;
    public static String srcport_com_str;
    public static String desport_com_str;
    public static String[] proto_des = new String[6];
    public static List<String> temp_pro_array;
    public static int a = 0;
    public static int b = 0;
    public static int c = 0;
    public static int d = 0;
    public static int e = 0;
    public static int f = 0;

    /**
     * Creates new form manual
     */
    public manual() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        srcip = new javax.swing.JRadioButton();
        srciport = new javax.swing.JRadioButton();
        desip = new javax.swing.JRadioButton();
        desport = new javax.swing.JRadioButton();
        protocole = new javax.swing.JRadioButton();
        length = new javax.swing.JRadioButton();
        srcipcom = new javax.swing.JComboBox();
        srcportcom = new javax.swing.JComboBox();
        desipcom = new javax.swing.JComboBox();
        desportcom = new javax.swing.JComboBox();
        protocolcom = new javax.swing.JComboBox();
        lengthcom = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        reset = new javax.swing.JButton();

        setTitle("Query");

        srcip.setText("       SRC IP");
        srcip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srcipActionPerformed(evt);
            }
        });

        srciport.setText("       SRC PORT");
        srciport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srciportActionPerformed(evt);
            }
        });

        desip.setText("        DEST IP");
        desip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desipActionPerformed(evt);
            }
        });

        desport.setText("        DEST PORT");
        desport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desportActionPerformed(evt);
            }
        });

        protocole.setText("       PROTOCOL");
        protocole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                protocoleActionPerformed(evt);
            }
        });

        length.setText("        LENGTH");
        length.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthActionPerformed(evt);
            }
        });

        srcipcom.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                srcipcomComponentAdded(evt);
            }
        });
        srcipcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srcipcomActionPerformed(evt);
            }
        });

        srcportcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                srcportcomActionPerformed(evt);
            }
        });

        desipcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desipcomActionPerformed(evt);
            }
        });

        desportcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                desportcomActionPerformed(evt);
            }
        });

        protocolcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                protocolcomActionPerformed(evt);
            }
        });

        lengthcom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lengthcomActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("SHOW DATA");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        reset.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(srcip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(srciport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(desip, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(desport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(protocole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(length, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(srcipcom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(srcportcom, 0, 117, Short.MAX_VALUE)
                            .addComponent(desipcom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(desportcom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(protocolcom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lengthcom, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(srcip)
                    .addComponent(srcipcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(srciport)
                    .addComponent(srcportcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desip)
                    .addComponent(desipcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(desport)
                    .addComponent(desportcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(protocole)
                    .addComponent(protocolcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(length)
                    .addComponent(lengthcom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void desipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desipActionPerformed
        if (desip.isSelected()) {        // TODO add your handling code here:
            b = 1;
            Data.destip_map.keySet().remove(null);
            Object[] max3 = Data.destip_map.keySet().toArray();
            desipcom.setModel(new javax.swing.DefaultComboBoxModel(max3));
    }//GEN-LAST:event_desipActionPerformed
      else {
            desipcom.setModel(new javax.swing.DefaultComboBoxModel());

        }
    }
    private void protocoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_protocoleActionPerformed
        // TODO add your handling code here:
        if (protocole.isSelected()) {
            e = 1;
            proto_des = new String[]{"IP", "TCP", "UDP", "HTTP", "FTP", "Telnet", "SMTP", "DNS", "NBNS"};
            protocolcom.setModel(new javax.swing.DefaultComboBoxModel(proto_des));
    }//GEN-LAST:event_protocoleActionPerformed
        else {
            protocolcom.setModel(new javax.swing.DefaultComboBoxModel());

        }
    }
    private void desportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desportActionPerformed
        // TODO add your handling code here:
        if (desport.isSelected()) {
            d = 1;
            Data.destport_map.keySet().remove(null);
            Object[] max4 = Data.destport_map.keySet().toArray();
            desportcom.setModel(new javax.swing.DefaultComboBoxModel(max4));

    }//GEN-LAST:event_desportActionPerformed
        else {
            desportcom.setModel(new javax.swing.DefaultComboBoxModel());

        }
    }
    private void srcipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcipActionPerformed
        // TODO add your handling code here:
        if (srcip.isSelected()) {
            a = 1;
            Data.srcip_map.keySet().remove(null);
            Object[] max1 = Data.srcip_map.keySet().toArray();
            srcipcom.setModel(new javax.swing.DefaultComboBoxModel(max1));
        } else {
            srcipcom.setModel(new javax.swing.DefaultComboBoxModel());
        }
    }//GEN-LAST:event_srcipActionPerformed

    private void srcipcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcipcomActionPerformed
        // TODO add your handling code here:
        srcip_sel = srcipcom.getSelectedItem().toString();
        select++;
    }//GEN-LAST:event_srcipcomActionPerformed

    private void srcipcomComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_srcipcomComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_srcipcomComponentAdded

    private void srciportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srciportActionPerformed
        // TODO add your handling code here:
        if (srciport.isSelected()) {
            c = 1;
            Data.srcport_map.keySet().remove(null);
            Object[] max2 = Data.srcport_map.keySet().toArray();
            srcportcom.setModel(new javax.swing.DefaultComboBoxModel(max2));

    }//GEN-LAST:event_srciportActionPerformed
        else {
            srcportcom.setModel(new javax.swing.DefaultComboBoxModel());
        }
    }
    private void lengthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthActionPerformed
        // TODO add your handling code here:
        if (length.isSelected()) {
            f = 1;
            Data.length_map.keySet().remove(null);
            Object[] max6 = Data.length_map.keySet().toArray();
            lengthcom.setModel(new javax.swing.DefaultComboBoxModel(max6));

    }//GEN-LAST:event_lengthActionPerformed
        else {
            lengthcom.setModel(new javax.swing.DefaultComboBoxModel());

        }
    }
    private void srcportcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_srcportcomActionPerformed
        // TODO add your handling code here:
        srcport_com_str = srcportcom.getSelectedItem().toString();
        select++;
    }//GEN-LAST:event_srcportcomActionPerformed

    private void desipcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desipcomActionPerformed
        // TODO add your handling code here:
        desip_sel = desipcom.getSelectedItem().toString();
        select++;
    }//GEN-LAST:event_desipcomActionPerformed

    private void desportcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_desportcomActionPerformed
        // TODO add your handling code here:
        desport_com_str = desportcom.getSelectedItem().toString();
        select++;
    }//GEN-LAST:event_desportcomActionPerformed

    private void protocolcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_protocolcomActionPerformed
        // TODO add your handling code here:

        protocol_sel = protocolcom.getSelectedItem().toString();
        select++;
    }//GEN-LAST:event_protocolcomActionPerformed

    private void lengthcomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lengthcomActionPerformed
        // TODO add your handling code here:
        length_com_str = lengthcom.getSelectedItem().toString();
        select++;
    }//GEN-LAST:event_lengthcomActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        //Select relevant function according to number of selected items from "Quary" dialog box
        if (select == 6) {
            sel6 = getlist6();
            disyourdata(sel6);
        } else if (select == 5) {
            sel5 = getlist5();
            disyourdata(sel5);
        } else if (select == 4) {
            sel4 = getlist4();
            disyourdata(sel4);
        } else if (select == 3) {
            sel3 = getlist3();
            disyourdata(sel3);
        } else if (select == 2) {
            sel2 = getlist2();
            disyourdata(sel2);
        } else if (select == 1) {
            sel1 = getlist();
            disyourdata(sel1);
        }
        select = 0;
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;

    }//GEN-LAST:event_jButton1ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
        // TODO add your handling code here:
        srcipcom.setModel(new javax.swing.DefaultComboBoxModel());
        srcportcom.setModel(new javax.swing.DefaultComboBoxModel());
        desipcom.setModel(new javax.swing.DefaultComboBoxModel());
        desportcom.setModel(new javax.swing.DefaultComboBoxModel());
        protocolcom.setModel(new javax.swing.DefaultComboBoxModel());
        lengthcom.setModel(new javax.swing.DefaultComboBoxModel());
        srcip.setSelected(false);
        desip.setSelected(false);
        desport.setSelected(false);
        srciport.setSelected(false);
        protocole.setSelected(false);
        length.setSelected(false);
        select = 0;
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;

        srclist = new ArrayList<>();
        destlist = new ArrayList<>();
        srcportlist = new ArrayList<>();
        destportlist = new ArrayList<>();
        lengthlist = new ArrayList<>();
        protolist = new ArrayList<>();
        choise1 = new ArrayList<>();
        choise2 = new ArrayList<>();
        choise3 = new ArrayList<>();
        choise4 = new ArrayList<>();
        choise5 = new ArrayList<>();
        que = new ArrayList<>();
        srcport_com_str = null;
        length_com_str = null;
        desport_com_str = null;
        srcip_sel = null;
        desip_sel = null;
        protocol_sel = null;


    }//GEN-LAST:event_resetActionPerformed
    // }

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
            java.util.logging.Logger.getLogger(manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manual.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manual().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JRadioButton desip;
    private javax.swing.JComboBox desipcom;
    public javax.swing.JRadioButton desport;
    private javax.swing.JComboBox desportcom;
    private javax.swing.JButton jButton1;
    public javax.swing.JRadioButton length;
    private javax.swing.JComboBox lengthcom;
    private javax.swing.JComboBox protocolcom;
    public javax.swing.JRadioButton protocole;
    private javax.swing.JButton reset;
    public javax.swing.JRadioButton srcip;
    private javax.swing.JComboBox srcipcom;
    public javax.swing.JRadioButton srciport;
    private javax.swing.JComboBox srcportcom;
    // End of variables declaration//GEN-END:variables

    /*functions to get common packet number list when items are selected from "Quary" dialog box */
    public static List<Integer> getlist6() {

        srclist = Data.srcip_map.get(srcip_sel);
        destlist = Data.destip_map.get(desip_sel);
        srcportlist = Data.srcport_map.get((Integer.parseInt(srcport_com_str)));
        destportlist = Data.destport_map.get((Integer.parseInt(desport_com_str)));
        lengthlist = Data.length_map.get((Integer.parseInt(length_com_str)));
        protolist = Data.protocol_map.get(protocol_sel);
        choise1 = extract.getcommon(srclist, destlist);
        choise2 = extract.getcommon(srcportlist, destportlist);
        choise3 = extract.getcommon(lengthlist, protolist);
        choise4 = extract.getcommon(choise1, choise2);
        choise5 = extract.getcommon(choise3, choise4);

        return choise5;
    }

    public static List<Integer> getlist5() {

        if (srcip_sel != null) {
            srclist = Data.srcip_map.get(srcip_sel);
            que.add(srclist);
        }
        if (desip_sel != null) {
            destlist = Data.destip_map.get(desip_sel);
            que.add(destlist);

        }
        if (srcport_com_str != null) {
            srcportlist = Data.srcport_map.get((Integer.parseInt(srcport_com_str)));
            que.add(srcportlist);

        }
        if (desport_com_str != null) {
            destportlist = Data.destport_map.get((Integer.parseInt(desport_com_str)));
            que.add(destportlist);

        }
        if (protocol_sel != null) {

            protolist = Data.protocol_map.get(protocol_sel);
            que.add(protolist);

        }
        if (length_com_str != null) {
            lengthlist = Data.length_map.get((Integer.parseInt(length_com_str)));
            que.add(lengthlist);
        }

        choise1 = extract.getcommon(que.get(0), que.get(1));
        choise2 = extract.getcommon(que.get(2), que.get(3));
        choise3 = extract.getcommon(choise1, choise2);
        choise4 = extract.getcommon(choise3, que.get(4));
        return choise4;

    }

    public static List<Integer> getlist4() {

        if (srcip_sel != null) {
            srclist = Data.srcip_map.get(srcip_sel);
            que.add(srclist);
        }
        if (desip_sel != null) {
            destlist = Data.destip_map.get(desip_sel);
            que.add(destlist);

        }
        if (srcport_com_str != null) {

            srcportlist = Data.srcport_map.get((Integer.parseInt(srcport_com_str)));
            que.add(srcportlist);

        }
        if (desport_com_str != null) {
            destportlist = Data.destport_map.get((Integer.parseInt(desport_com_str)));
            que.add(destportlist);

        }
        if (protocol_sel != null) {

            protolist = Data.protocol_map.get(protocol_sel);
            que.add(protolist);

        }
        if (length_com_str != null) {
            lengthlist = Data.length_map.get((Integer.parseInt(length_com_str)));
            que.add(lengthlist);
        }
        choise1 = extract.getcommon(que.get(0), que.get(1));
        choise2 = extract.getcommon(que.get(2), que.get(3));
        choise3 = extract.getcommon(choise1, choise2);
        return choise3;
    }

    public static List<Integer> getlist3() {

        if (srcip_sel != null) {
            srclist = Data.srcip_map.get(srcip_sel);
            que.add(srclist);
        }
        if (desip_sel != null) {
            destlist = Data.destip_map.get(desip_sel);
            que.add(destlist);

        }
        if (srcport_com_str != null) {

            srcportlist = Data.srcport_map.get((Integer.parseInt(srcport_com_str)));
            que.add(srcportlist);

        }
        if (desport_com_str != null) {
            destportlist = Data.destport_map.get((Integer.parseInt(desport_com_str)));
            que.add(destportlist);

        }
        if (protocol_sel != null) {

            protolist = Data.protocol_map.get(protocol_sel);
            que.add(protolist);

        }
        if (length_com_str != null) {
            lengthlist = Data.length_map.get((Integer.parseInt(length_com_str)));
            que.add(lengthlist);
        }
        choise1 = extract.getcommon(que.get(0), que.get(1));
        choise2 = extract.getcommon(que.get(2), choise1);
        return choise2;
    }

    public static List<Integer> getlist2() {

        if (srcip_sel != null) {
            srclist = Data.srcip_map.get(srcip_sel);
            que.add(srclist);
        }
        if (desip_sel != null) {
            destlist = Data.destip_map.get(desip_sel);
            que.add(destlist);

        }
        if (srcport_com_str != null) {
            srcportlist = Data.srcport_map.get((Integer.parseInt(srcport_com_str)));
            que.add(srcportlist);

        }
        if (desport_com_str != null) {
            destportlist = Data.destport_map.get((Integer.parseInt(desport_com_str)));
            que.add(destportlist);

        }
        if (protocol_sel != null) {

            protolist = Data.protocol_map.get(protocol_sel);
            que.add(protolist);

        }
        if (length_com_str != null) {
            lengthlist = Data.length_map.get((Integer.parseInt(length_com_str)));
            que.add(lengthlist);
        }
        choise1 = extract.getcommon(que.get(0), que.get(1));
        return choise1;

    }

    public static List<Integer> getlist() {

        if (srcip_sel != null) {
            srclist = Data.srcip_map.get(srcip_sel);
            que.add(srclist);
        }
        if (desip_sel != null) {
            destlist = Data.destip_map.get(desip_sel);
            que.add(destlist);

        }
        if (srcport_com_str != null) {
            srcportlist = Data.srcport_map.get((Integer.parseInt(srcport_com_str)));
            que.add(srcportlist);

        }
        if (desport_com_str != null) {
            destportlist = Data.destport_map.get((Integer.parseInt(desport_com_str)));
            que.add(destportlist);

        }
        if (protocol_sel != null) {
            protolist = Data.protocol_map.get(protocol_sel);
            que.add(protolist);

        }
        if (length_com_str != null) {
            lengthlist = Data.length_map.get((Integer.parseInt(length_com_str)));
            que.add(lengthlist);
        }
        return que.get(0);
    }

    public void disyourdata(List<Integer> numlist) {
        NetCQ.model.setRowCount(0);
        try {

            for (int i = 0; i < numlist.size(); i++) {
                PacketData lastpkt = Data.alldata_map.get(numlist.get(i));
                srcip_show = lastpkt.src_ip1;
                desip_show = lastpkt.dest_ip1;
                srcport_show = lastpkt.src_port1;
                desport_show = lastpkt.dest_port1;
                length_show = lastpkt.length1;
                temp_pro_array = lastpkt.protocol1;
                if (e == 1) {
                    protocol_show = protocol_sel;
                } else {
                    protocol_show = temp_pro_array.get(temp_pro_array.size() - 1);
                    if (protocol_show.equals("U")) {
                        protocol_show = "UDP";
                    }
                    if (protocol_show.equals("T")) {
                        protocol_show = "TCP";
                    }
                }
                NetCQ.model.addRow(new Object[]{numlist.get(i), srcip_show, desip_show, srcport_show, desport_show, length_show, protocol_show});

            }
        } catch (NullPointerException e) {
        }
    }
}
