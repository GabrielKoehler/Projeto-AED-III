package Telas;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class telaLogin extends javax.swing.JFrame {
    
    public telaLogin() {
        initComponents();
    }
    public void criaUsuario(String fileName)
	{
		FileOutputStream file;
		PrintStream writter;

	    try
	    {
	        file = new FileOutputStream(fileName);
	        writter = new PrintStream(file);
	        //Usuário = Senha ;
                if(JRadioButtonGerente.isSelected()){
                writter.print(JTextFieldLogin.getText()+"="+JPasswordFieldSenha.getText()+"*"+"1;");
                    }else if(JRadioButtonPadrao.isSelected()){
                    writter.print(JTextFieldLogin.getText()+"="+JPasswordFieldSenha.getText()+"*"+"2;");                   
                        }else{
                        //Alerta de preenchimento 
                        }
                    file.close();

	        System.out.println("Arquivo gerado com sucesso...");
	    }

	    catch(IOException erro)
	    {
	    	System.out.println("Não foi possível escrever o arquivo no disco...");
	    }
	
        }
    public void buscaUsuarioCaminho(String fileName){
        String caminho = "C:\\Users\\K. Gabriel\\Desktop\\Projeto AED-III\\projetoSistema\\Usuarios\\";
        File arquivoUsuario =  new File(caminho+JTextFieldLogin.getText()+".txt");
        System.out.println(arquivoUsuario); 
        if(arquivoUsuario.exists()){
        System.out.println("Usuario localizado");
        }else{
        System.out.println("Usuario nao localizado");
        }
    }   
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        JLabelLogin = new javax.swing.JLabel();
        JTextFieldLogin = new javax.swing.JTextField();
        JLabelSenha = new javax.swing.JLabel();
        JButtonEntrar = new javax.swing.JButton();
        JButtonCriar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        JPasswordFieldSenha = new javax.swing.JPasswordField();
        JRadioButtonGerente = new javax.swing.JRadioButton();
        JRadioButtonPadrao = new javax.swing.JRadioButton();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JLabelLogin.setText("LOGIN");

        JTextFieldLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextFieldLoginActionPerformed(evt);
            }
        });

        JLabelSenha.setText("SENHA");

        JButtonEntrar.setText("ENTRAR");
        JButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonEntrarActionPerformed(evt);
            }
        });

        JButtonCriar.setText("CRIAR");
        JButtonCriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonCriarActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/login.png"))); // NOI18N
        jLabel5.setToolTipText("");

        buttonGroup1.add(JRadioButtonGerente);
        JRadioButtonGerente.setText("Gerente");

        buttonGroup1.add(JRadioButtonPadrao);
        JRadioButtonPadrao.setText("Padrão");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JLabelLogin)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JLabelSenha))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JRadioButtonPadrao)
                                    .addComponent(JRadioButtonGerente)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JButtonEntrar)
                        .addGap(39, 39, 39)
                        .addComponent(JButtonCriar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JLabelLogin)
                .addGap(18, 18, 18)
                .addComponent(JTextFieldLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JLabelSenha)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JPasswordFieldSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JRadioButtonGerente)
                        .addGap(3, 3, 3)
                        .addComponent(JRadioButtonPadrao)))
                .addGap(50, 50, 50)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JButtonEntrar)
                    .addComponent(JButtonCriar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonEntrarActionPerformed
        String caminho = "C:\\Users\\K. Gabriel\\Desktop\\Projeto AED-III\\projetoSistema\\Usuarios\\";
        buscaUsuarioCaminho(caminho+JTextFieldLogin.getText()+".txt");
        
        
    }//GEN-LAST:event_JButtonEntrarActionPerformed

    private void JTextFieldLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextFieldLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextFieldLoginActionPerformed

    private void JButtonCriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonCriarActionPerformed
        String caminho = "C:\\Users\\K. Gabriel\\Desktop\\Projeto AED-III\\projetoSistema\\Usuarios\\";
        criaUsuario(caminho+JTextFieldLogin.getText()+".txt");
    }//GEN-LAST:event_JButtonCriarActionPerformed

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
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonCriar;
    private javax.swing.JButton JButtonEntrar;
    private javax.swing.JLabel JLabelLogin;
    private javax.swing.JLabel JLabelSenha;
    private javax.swing.JPasswordField JPasswordFieldSenha;
    private javax.swing.JRadioButton JRadioButtonGerente;
    private javax.swing.JRadioButton JRadioButtonPadrao;
    private javax.swing.JTextField JTextFieldLogin;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
