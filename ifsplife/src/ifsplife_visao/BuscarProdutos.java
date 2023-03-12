/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ifsplife_visao;

/**
 *
 * @author xandy
 */
public class BuscarProdutos extends javax.swing.JFrame {

    /**
     * Creates new form Teste
     */
    public BuscarProdutos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        IconX4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        logoIFSP_LIFE = new javax.swing.JLabel();
        JscrollPane_DadosProdutos = new javax.swing.JScrollPane();
        JTable_Produtos = new javax.swing.JTable();
        JLabel_ProcurarCodigoProduto = new javax.swing.JLabel();
        JLabel_ProcurarNomeProduto = new javax.swing.JLabel();
        JTextField_NomeDoProduto = new javax.swing.JTextField();
        JLabel_NomeDoProduto = new javax.swing.JLabel();
        JTextField_CodigoDoProduto = new javax.swing.JTextField();
        JLabel_CodigoDoProduto = new javax.swing.JLabel();
        JLabel_Titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1095, 575));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SplashScreen/Assets/icons8_menu_48px_1.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 70));

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 0, 20, 70));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Pharmacy Managment System");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 5, -1, 60));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SplashScreen/Assets/male_user_50px.png"))); // NOI18N
        jLabel3.setText("Welcome Admin");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, -1, 70));

        IconX4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        IconX4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SplashScreen/Assets/icons8-excluir-30.png"))); // NOI18N
        IconX4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconX4MouseClicked(evt);
            }
        });
        jPanel1.add(IconX4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1030, 0, 50, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, -1));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));

        logoIFSP_LIFE.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoIFSP_LIFE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/SplashScreen/Assets/default_transparent_765x625_resized.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(logoIFSP_LIFE, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoIFSP_LIFE, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 451, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 180, 600));

        JTable_Produtos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Codigo", "Nome", "Valor", "Vencimento", "Tipo", "Quantidade"
            }
        ));
        JscrollPane_DadosProdutos.setViewportView(JTable_Produtos);

        getContentPane().add(JscrollPane_DadosProdutos, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 880, 340));

        JLabel_ProcurarCodigoProduto.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        JLabel_ProcurarCodigoProduto.setText("Procurar por Codigo_Produto");
        getContentPane().add(JLabel_ProcurarCodigoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 180, -1, -1));

        JLabel_ProcurarNomeProduto.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        JLabel_ProcurarNomeProduto.setText("Procurar por Nome_Produto");
        getContentPane().add(JLabel_ProcurarNomeProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 180, -1, -1));
        getContentPane().add(JTextField_NomeDoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 150, 170, 30));

        JLabel_NomeDoProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLabel_NomeDoProduto.setText("Nome do Produto:");
        getContentPane().add(JLabel_NomeDoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 150, -1, -1));
        getContentPane().add(JTextField_CodigoDoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 170, 30));

        JLabel_CodigoDoProduto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        JLabel_CodigoDoProduto.setText("Codigo do Produto:");
        getContentPane().add(JLabel_CodigoDoProduto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, -1, -1));

        JLabel_Titulo.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        JLabel_Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        JLabel_Titulo.setText("Buscar Produtos");
        getContentPane().add(JLabel_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 910, 60));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void IconX4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconX4MouseClicked
        System.exit(0);
    }//GEN-LAST:event_IconX4MouseClicked

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
            java.util.logging.Logger.getLogger(BuscarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarProdutos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarProdutos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel IconX4;
    private javax.swing.JLabel JLabel_CodigoDoProduto;
    private javax.swing.JLabel JLabel_NomeDoProduto;
    private javax.swing.JLabel JLabel_ProcurarCodigoProduto;
    private javax.swing.JLabel JLabel_ProcurarNomeProduto;
    private javax.swing.JLabel JLabel_Titulo;
    private javax.swing.JTable JTable_Produtos;
    private javax.swing.JTextField JTextField_CodigoDoProduto;
    private javax.swing.JTextField JTextField_NomeDoProduto;
    private javax.swing.JScrollPane JscrollPane_DadosProdutos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel logoIFSP_LIFE;
    // End of variables declaration//GEN-END:variables
}