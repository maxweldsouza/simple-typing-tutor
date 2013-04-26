
import java.awt.Color;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import typing.keyInfo;
import typing.keyManager;

//TODO Increase Decrease Font Size
//TODO Help and instructions
//TODO Buttons to indicate finger
//TODO Statistics? lpm, correct percentage
/**
 *
 * @author Maxwel D'souza
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    keyManager manager = new keyManager();
    keyInfo currentKey;
    long startTime;
    public boolean IsExerciseMode = false;

    public MainJFrame() {
        initComponents();
        btnStart.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnStart = new javax.swing.JButton();
        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler2 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler3 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        filler4 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(32767, 0));
        jPanel1 = new javax.swing.JPanel();
        btnTop = new javax.swing.JToggleButton();
        btnNumber = new javax.swing.JToggleButton();
        btnBottom = new javax.swing.JToggleButton();
        btnMiddle = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        charLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnSymbols = new javax.swing.JToggleButton();
        btnCharacters = new javax.swing.JToggleButton();
        btnShift = new javax.swing.JToggleButton();
        fing2 = new javax.swing.JPanel();
        fing3 = new javax.swing.JPanel();
        fing1 = new javax.swing.JPanel();
        fing4 = new javax.swing.JPanel();
        fing5 = new javax.swing.JPanel();
        fing10 = new javax.swing.JPanel();
        fing8 = new javax.swing.JPanel();
        fing7 = new javax.swing.JPanel();
        fing6 = new javax.swing.JPanel();
        fing9 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Simple Typing Tutor");
        setBackground(new java.awt.Color(255, 255, 255));

        btnStart.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });
        btnStart.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                btnStartKeyPressed(evt);
            }
        });

        jPanel1.setFocusable(false);

        btnTop.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnTop.setText("Top Row");

        btnNumber.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnNumber.setText("Number Row");
        btnNumber.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnBottom.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnBottom.setText("Bottom Row");

        btnMiddle.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnMiddle.setText("Middle Row");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMiddle)
                    .addComponent(btnBottom)
                    .addComponent(btnNumber)
                    .addComponent(btnTop))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNumber)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTop)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMiddle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBottom)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Type the following key:");
        jLabel1.setFocusable(false);

        resultLabel.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        resultLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        resultLabel.setText("Result");
        resultLabel.setFocusable(false);

        charLabel.setBackground(new java.awt.Color(255, 255, 51));
        charLabel.setFont(new java.awt.Font("Tahoma", 1, 200)); // NOI18N
        charLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        charLabel.setText("-");
        charLabel.setFocusable(false);

        btnSymbols.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnSymbols.setText("Symbols");

        btnCharacters.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnCharacters.setSelected(true);
        btnCharacters.setText("Characters");

        btnShift.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnShift.setText("Shift");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSymbols, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnShift, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnCharacters, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCharacters)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSymbols)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnShift)
                .addContainerGap())
        );

        fing2.setBackground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout fing2Layout = new javax.swing.GroupLayout(fing2);
        fing2.setLayout(fing2Layout);
        fing2Layout.setHorizontalGroup(
            fing2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        fing2Layout.setVerticalGroup(
            fing2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        fing3.setBackground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout fing3Layout = new javax.swing.GroupLayout(fing3);
        fing3.setLayout(fing3Layout);
        fing3Layout.setHorizontalGroup(
            fing3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        fing3Layout.setVerticalGroup(
            fing3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        fing1.setBackground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout fing1Layout = new javax.swing.GroupLayout(fing1);
        fing1.setLayout(fing1Layout);
        fing1Layout.setHorizontalGroup(
            fing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        fing1Layout.setVerticalGroup(
            fing1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        fing4.setBackground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout fing4Layout = new javax.swing.GroupLayout(fing4);
        fing4.setLayout(fing4Layout);
        fing4Layout.setHorizontalGroup(
            fing4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        fing4Layout.setVerticalGroup(
            fing4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        fing5.setBackground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout fing5Layout = new javax.swing.GroupLayout(fing5);
        fing5.setLayout(fing5Layout);
        fing5Layout.setHorizontalGroup(
            fing5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        fing5Layout.setVerticalGroup(
            fing5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        fing10.setBackground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout fing10Layout = new javax.swing.GroupLayout(fing10);
        fing10.setLayout(fing10Layout);
        fing10Layout.setHorizontalGroup(
            fing10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        fing10Layout.setVerticalGroup(
            fing10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        fing8.setBackground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout fing8Layout = new javax.swing.GroupLayout(fing8);
        fing8.setLayout(fing8Layout);
        fing8Layout.setHorizontalGroup(
            fing8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        fing8Layout.setVerticalGroup(
            fing8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        fing7.setBackground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout fing7Layout = new javax.swing.GroupLayout(fing7);
        fing7.setLayout(fing7Layout);
        fing7Layout.setHorizontalGroup(
            fing7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        fing7Layout.setVerticalGroup(
            fing7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        fing6.setBackground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout fing6Layout = new javax.swing.GroupLayout(fing6);
        fing6.setLayout(fing6Layout);
        fing6Layout.setHorizontalGroup(
            fing6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        fing6Layout.setVerticalGroup(
            fing6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        fing9.setBackground(new java.awt.Color(0, 204, 0));

        javax.swing.GroupLayout fing9Layout = new javax.swing.GroupLayout(fing9);
        fing9.setLayout(fing9Layout);
        fing9Layout.setHorizontalGroup(
            fing9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        fing9Layout.setVerticalGroup(
            fing9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(charLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                                    .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(resultLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(filler4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(1, 1, 1)
                                        .addComponent(filler3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(filler2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fing1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fing2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fing3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fing4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fing5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fing6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fing7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fing8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fing9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fing10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(fing2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addComponent(filler4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(charLabel)
                                .addGap(18, 18, 18)
                                .addComponent(btnStart)
                                .addGap(18, 18, 18)
                                .addComponent(resultLabel)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fing1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fing3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fing5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fing8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(fing7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fing4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(filler3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(filler2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(fing10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(fing6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fing9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        if (IsExerciseMode) {
            stopExercise();
            IsExerciseMode = !IsExerciseMode;
        } else {
            generateManagerKeys();
            if (manager.NoKeysSelected()) {
                JOptionPane.showMessageDialog(null, "No keys selected", "Error", JOptionPane.WARNING_MESSAGE);
            } else {
                startExercise();
                IsExerciseMode = !IsExerciseMode;
            }
        }
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnStartKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_btnStartKeyPressed
        if (IsExerciseMode) {
            long elapsed = java.lang.System.nanoTime() - startTime;
            if (currentKey.checkKey(evt.getKeyChar(), elapsed)) {
                resultLabel.setText("Correct");
                resultLabel.setForeground(Color.green);
                next();
            } else if (evt.getKeyCode() == KeyEvent.VK_SHIFT
                    || evt.getKeyCode() == KeyEvent.VK_ENTER) {
                //Do nothing
            } else {
                resultLabel.setText("Incorrect");
                resultLabel.setForeground(Color.red);
            }
        }
    }//GEN-LAST:event_btnStartKeyPressed

    private void displayKey(keyInfo key) {
        charLabel.setText(Character.toString(key.getKey()));
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
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
            javax.swing.UIManager.setLookAndFeel(javax.swing.UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnBottom;
    private javax.swing.JToggleButton btnCharacters;
    private javax.swing.JToggleButton btnMiddle;
    private javax.swing.JToggleButton btnNumber;
    private javax.swing.JToggleButton btnShift;
    private javax.swing.JButton btnStart;
    private javax.swing.JToggleButton btnSymbols;
    private javax.swing.JToggleButton btnTop;
    private javax.swing.JLabel charLabel;
    private javax.swing.Box.Filler filler1;
    private javax.swing.Box.Filler filler2;
    private javax.swing.Box.Filler filler3;
    private javax.swing.Box.Filler filler4;
    private javax.swing.JPanel fing1;
    private javax.swing.JPanel fing10;
    private javax.swing.JPanel fing2;
    private javax.swing.JPanel fing3;
    private javax.swing.JPanel fing4;
    private javax.swing.JPanel fing5;
    private javax.swing.JPanel fing6;
    private javax.swing.JPanel fing7;
    private javax.swing.JPanel fing8;
    private javax.swing.JPanel fing9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel resultLabel;
    // End of variables declaration//GEN-END:variables

    private void next() {
        currentKey = manager.nextKey();
        startTime = java.lang.System.nanoTime();
        displayKey(currentKey);
        displayHint(currentKey);
    }

    //TODO Move to a more appropriate place
    private boolean contains(char[] array, char value) {
        for (char item : array) {
            if (item == value) {
                return true;
            }
        }
        return false;
    }

    private void displayHint(keyInfo currentKey) {
        char[] f1 = "1qaz`~!QAZ".toCharArray();
        char[] f2 = "2wsx@WSX".toCharArray();
        char[] f3 = "3edcEDC#".toCharArray();
        char[] f4 = "4rfv$RFV".toCharArray();
        char[] f5 = "5tgb%TGB".toCharArray();
        char[] f6 = "6yhn^YHN".toCharArray();
        char[] f7 = "7ujm&UJM".toCharArray();
        char[] f8 = "8ik,*<IK".toCharArray();
        char[] f9 = "9ol.(>OL".toCharArray();
        char[] f10 = "0p;/P):?-_=+[{]}'\"|\\".toCharArray();

        char testchar = currentKey.getKey();

        fing1.setBackground(Color.green);
        fing2.setBackground(Color.green);
        fing3.setBackground(Color.green);
        fing4.setBackground(Color.green);
        fing5.setBackground(Color.green);
        fing6.setBackground(Color.green);
        fing7.setBackground(Color.green);
        fing8.setBackground(Color.green);
        fing9.setBackground(Color.green);
        fing10.setBackground(Color.green);

        System.out.println(testchar);
        if (contains(f1, testchar)) {
            fing1.setBackground(Color.red);
        }
        if (contains(f2, testchar)) {
            fing2.setBackground(Color.red);
        }
        if (contains(f3, testchar)) {
            fing3.setBackground(Color.red);
        }
        if (contains(f4, testchar)) {
            fing4.setBackground(Color.red);
        }
        if (contains(f5, testchar)) {
            fing5.setBackground(Color.red);
        }
        if (contains(f6, testchar)) {
            fing6.setBackground(Color.red);
        }
        if (contains(f7, testchar)) {
            fing7.setBackground(Color.red);
        }
        if (contains(f8, testchar)) {
            fing8.setBackground(Color.red);
        }
        if (contains(f9, testchar)) {
            fing9.setBackground(Color.red);
        }
        if (contains(f10, testchar)) {
            fing10.setBackground(Color.red);
        }
    }

    private void setUIEnabled(boolean isEnabled) {
        //Stop exercise mode
        btnBottom.setEnabled(isEnabled);
        btnTop.setEnabled(isEnabled);
        btnMiddle.setEnabled(isEnabled);
        btnNumber.setEnabled(isEnabled);
        btnShift.setEnabled(isEnabled);
        btnSymbols.setEnabled(isEnabled);
    }

    private void stopExercise() {
        setUIEnabled(true);
        btnStart.setText("Start");
    }

    private void startExercise() {
        btnStart.requestFocus();
        setUIEnabled(false);
        btnStart.setText("Stop");
        next();
        //Disable controls
    }

    private void generateManagerKeys() {
        manager.generateKeys(btnNumber.isSelected(),
                btnTop.isSelected(),
                btnMiddle.isSelected(),
                btnBottom.isSelected(),
                btnSymbols.isSelected(),
                btnShift.isSelected(),
                btnCharacters.isSelected());
        manager.shuffleKeys();
    }
}
