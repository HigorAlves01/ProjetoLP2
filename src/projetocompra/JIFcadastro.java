/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetocompra;

import data.UsuarioData;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.Usuario;


/**
 *
 * @author Usuario
 */
public class JIFcadastro extends javax.swing.JInternalFrame {
    private final Usuario obj;
    private final int acao;
    private UsuarioData DAO;
    /**
     * Creates new form JIFcadastro
     */
    public JIFcadastro() {
        acao =0 ;
        initComponents();
        obj = new Usuario();
         try {
            DAO = new UsuarioData();
        } catch (Exception ex) {
            Logger.getLogger(JIFcadastro.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel1 = new javax.swing.JLabel();
        nome = new javax.swing.JLabel();
        senha = new javax.swing.JLabel();
        email = new javax.swing.JLabel();
        JTId = new javax.swing.JTextField();
        jlEnde = new javax.swing.JTextField();
        jlEmail = new javax.swing.JTextField();
        jlSenha = new javax.swing.JPasswordField();
        jbLogin = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jbsalvar = new javax.swing.JButton();
        ende = new javax.swing.JLabel();
        tel = new javax.swing.JLabel();
        jlNome = new javax.swing.JTextField();
        jlTel = new javax.swing.JTextField();

        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Cadastro de usuarios");

        jLabel1.setText("Id");

        nome.setText("Nome");

        senha.setText("Senha");

        email.setText("Email");

        JTId.setEditable(false);
        JTId.setText("0");

        jbLogin.setText("Login");
        jbLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLoginActionPerformed(evt);
            }
        });

        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        jbsalvar.setText("Salvar");
        jbsalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbsalvarActionPerformed(evt);
            }
        });

        ende.setText("Endereço");

        tel.setText("Telefone");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbLogin)
                        .addGap(87, 87, 87)
                        .addComponent(jbCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jbsalvar)
                        .addGap(55, 55, 55))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(email)
                                    .addComponent(senha)
                                    .addComponent(tel))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlSenha)
                                    .addComponent(jlEmail)
                                    .addComponent(jlEnde)
                                    .addComponent(jlTel)))
                            .addComponent(ende)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(nome))
                                .addGap(76, 76, 76)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlNome, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(154, 154, 154))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(JTId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nome)
                    .addComponent(jlNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(email)
                    .addComponent(jlEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(senha)
                    .addComponent(jlSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ende)
                    .addComponent(jlEnde, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tel)
                    .addComponent(jlTel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbLogin)
                    .addComponent(jbCancelar)
                    .addComponent(jbsalvar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLoginActionPerformed
        new JFLogin().setVisible(true);
            dispose();
    }//GEN-LAST:event_jbLoginActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
       
      if(JOptionPane.showConfirmDialog(this, "Deseja limpar os campos?")
              ==JOptionPane.YES_OPTION){
        jlEmail.setText("");
        jlEnde.setText("");
        jlNome.setText("");
        jlSenha.setText("");
        jlTel.setText("");
        }else{
         System.exit(0);
      }
       
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbsalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbsalvarActionPerformed
        
            try{
            if(validarCampos()){
            if(acao==1){
                    if(preencherObjeto()){
                        if(DAO.incluir(obj)){
                            JOptionPane.showMessageDialog(this, "Salvo com sucesso!",
                                    "Meu sistema", JOptionPane.INFORMATION_MESSAGE);
                            jlEmail.setText("");
                            jlEnde.setText("");
                            jlNome.setText("");
                            jlSenha.setText("");
                            jlTel.setText("");
                        }
                    }  

            if(acao==2){
                  JOptionPane.showMessageDialog(this, "Editado com sucesso!", 
                   "Meu sistema", JOptionPane.INFORMATION_MESSAGE);
                     //salvar no banco
                     jbCancelarActionPerformed(evt);
                }
             }
            } 
            }catch(Exception erro){
                JOptionPane.showMessageDialog(this,"Erro ao salvar:"+erro.getMessage(),
                       "Sistema",JOptionPane.ERROR_MESSAGE);
                }
              
    }//GEN-LAST:event_jbsalvarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField JTId;
    private javax.swing.JLabel email;
    private javax.swing.JLabel ende;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbLogin;
    private javax.swing.JButton jbsalvar;
    private javax.swing.JTextField jlEmail;
    private javax.swing.JTextField jlEnde;
    private javax.swing.JTextField jlNome;
    private javax.swing.JPasswordField jlSenha;
    private javax.swing.JTextField jlTel;
    private javax.swing.JLabel nome;
    private javax.swing.JLabel senha;
    private javax.swing.JLabel tel;
    // End of variables declaration//GEN-END:variables

    private boolean validarCampos(){
String msg="";
        if(jlNome.getText().length()<3 || jlNome.getText().length()>100)
            msg+="\nO campo nome deve conter entre 3 e 100 caracteres";
        if(jlEmail.getText().length()<5 || jlEmail.getText().length()>50)
            msg+="\nO campo e-mail deve conter entre 5 e 50 caracteres";
        else if(!jlEmail.getText().contains("@") && 
           !jlEmail.getText().contains("."))
            msg+="\nO e-mail é inválido!";
        if(jlSenha.getText().length()<5 || jlSenha.getText().length()>20)
            msg+="\nO campo senha deve conter entre 5 e 20 caracteres";
        if(jlEnde.getText().length()<3 || jlEnde.getText().length()>100)
            msg+="\nO campo endereco deve conter entre 3 e 100 caracteres";
        if(jlTel.getText().length()<3 || jlTel.getText().length()>100);
            //msg + "\nO campo telefone deve conter entre 3 e 100 caracteres";
        if(msg.isEmpty()) return true;
        else JOptionPane.showMessageDialog(this, "Os campos abaixo precisam de atenção:"
                +msg,"Atenção",JOptionPane.ERROR_MESSAGE);
    return false;
}
     private boolean preencherObjeto() throws Exception {
       obj.setId(Integer.parseInt(JTId.getText()));
       obj.setEmail(jlEmail.getText());
       obj.setEndereco(jlEnde.getText());
       obj.setNome(jlNome.getText());
       obj.setSenha(jlSenha.getText());
       obj.setTelefone(Integer.parseInt(jlTel.getText()));
        return true;
    }


}
