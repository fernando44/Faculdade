/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade;

import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ButtonGroup;

/**
 *
 * @author ferna
 */
public class cadastroDeCasa extends javax.swing.JFrame {
   
    
    telaInicial inicio;
    
    List<Imovel> listaImovel= new ArrayList<>();//criação da List para salvar os imoveis que serao criados
    
    /**
     * Creates new form cadastroDeCasa
     */
    public cadastroDeCasa() {
        initComponents();
        configurarFormulario();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fundoDaTela = new javax.swing.JPanel();
        txtTitulo = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        txtCadastroNomeProprietario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtCadastroDescricao = new javax.swing.JTextArea();
        txtSubtitulo0 = new javax.swing.JLabel();
        rdbCadastroResidencial = new javax.swing.JRadioButton();
        rdbCadastroComercial = new javax.swing.JRadioButton();
        txtSubtitulo1 = new javax.swing.JLabel();
        cbxCadastroTipos = new javax.swing.JComboBox();
        txtCadastroValorDaVenda = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        fundoDaTela.setBackground(new java.awt.Color(0, 23, 31));
        fundoDaTela.setForeground(new java.awt.Color(153, 153, 153));

        txtTitulo.setBackground(new java.awt.Color(2, 16, 50));
        txtTitulo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(0, 126, 167));
        txtTitulo.setText("Cadastro");

        btnSalvar.setBackground(new java.awt.Color(0, 52, 89));
        btnSalvar.setForeground(new java.awt.Color(0, 168, 232));
        btnSalvar.setText("Salvar");
        btnSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalvarMouseClicked(evt);
            }
        });

        txtCadastroNomeProprietario.setBackground(new java.awt.Color(0, 52, 89));
        txtCadastroNomeProprietario.setForeground(new java.awt.Color(0, 126, 167));
        txtCadastroNomeProprietario.setText("Informe o nome completo do proprietario");
        txtCadastroNomeProprietario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCadastroNomeProprietarioKeyPressed(evt);
            }
        });

        txtCadastroDescricao.setBackground(new java.awt.Color(0, 52, 89));
        txtCadastroDescricao.setColumns(20);
        txtCadastroDescricao.setForeground(new java.awt.Color(0, 126, 167));
        txtCadastroDescricao.setRows(5);
        txtCadastroDescricao.setText("Descrição do imóvel");
        jScrollPane1.setViewportView(txtCadastroDescricao);

        txtSubtitulo0.setForeground(new java.awt.Color(0, 126, 167));
        txtSubtitulo0.setText("Categoria do imóvel");

        rdbCadastroResidencial.setBackground(new java.awt.Color(0, 52, 89));
        rdbCadastroResidencial.setForeground(new java.awt.Color(0, 126, 167));
        rdbCadastroResidencial.setText("Residencial");

        rdbCadastroComercial.setBackground(new java.awt.Color(0, 52, 89));
        rdbCadastroComercial.setForeground(new java.awt.Color(0, 126, 167));
        rdbCadastroComercial.setText("comercial");
        rdbCadastroComercial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbCadastroComercialActionPerformed(evt);
            }
        });

        txtSubtitulo1.setForeground(new java.awt.Color(0, 126, 167));
        txtSubtitulo1.setText("Tipo do imóvel");

        cbxCadastroTipos.setBackground(new java.awt.Color(0, 52, 89));
        cbxCadastroTipos.setForeground(new java.awt.Color(0, 126, 167));
        cbxCadastroTipos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Casa", "Apartamento", "Chácara", "Sala", "Salão", "Sítio" }));
        cbxCadastroTipos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxCadastroTiposItemStateChanged(evt);
            }
        });

        txtCadastroValorDaVenda.setBackground(new java.awt.Color(0, 52, 89));
        txtCadastroValorDaVenda.setForeground(new java.awt.Color(0, 126, 167));
        txtCadastroValorDaVenda.setText("0.0");
        txtCadastroValorDaVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCadastroValorDaVendaActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(0, 126, 167));
        jLabel1.setText("Informe o valor da venda");

        javax.swing.GroupLayout fundoDaTelaLayout = new javax.swing.GroupLayout(fundoDaTela);
        fundoDaTela.setLayout(fundoDaTelaLayout);
        fundoDaTelaLayout.setHorizontalGroup(
            fundoDaTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoDaTelaLayout.createSequentialGroup()
                .addGroup(fundoDaTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fundoDaTelaLayout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(fundoDaTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(rdbCadastroResidencial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbxCadastroTipos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtSubtitulo1, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(fundoDaTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(fundoDaTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(rdbCadastroComercial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCadastroValorDaVenda))
                            .addComponent(jLabel1))
                        .addGap(0, 48, Short.MAX_VALUE))
                    .addGroup(fundoDaTelaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(fundoDaTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCadastroNomeProprietario, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoDaTelaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(119, 119, 119))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoDaTelaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fundoDaTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoDaTelaLayout.createSequentialGroup()
                        .addComponent(txtSubtitulo0)
                        .addGap(141, 141, 141))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fundoDaTelaLayout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addGap(174, 174, 174))))
        );
        fundoDaTelaLayout.setVerticalGroup(
            fundoDaTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fundoDaTelaLayout.createSequentialGroup()
                .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCadastroNomeProprietario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSubtitulo0)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fundoDaTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(rdbCadastroComercial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(rdbCadastroResidencial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(fundoDaTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSubtitulo1)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(fundoDaTelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCadastroTipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCadastroValorDaVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalvar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoDaTela, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fundoDaTela, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rdbCadastroComercialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbCadastroComercialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbCadastroComercialActionPerformed

    private void txtCadastroValorDaVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCadastroValorDaVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCadastroValorDaVendaActionPerformed

    private void cbxCadastroTiposItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxCadastroTiposItemStateChanged
        int idx = cbxCadastroTipos.getSelectedIndex();
        
        if(idx>=0){
            String elem =  (String) cbxCadastroTipos.getSelectedItem().toString();
            //JOptionPane.showMessageDialog(null, "Elemento: "+ elem +"\n"+"Posição: "+idx);
        }
    }//GEN-LAST:event_cbxCadastroTiposItemStateChanged

    private void btnSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalvarMouseClicked
        // click no botao
        // recolher os dados
        // passar os dados e criar um objeto
        // salvar o objeto na lista
        
        Imovel imovel;
        imovel = new Imovel();
        
        imovel.setNomeImovel(txtCadastroNomeProprietario.getText());
        
        imovel.setDescricao(txtCadastroDescricao.getText());
        
        if(rdbCadastroComercial.isSelected()){
            imovel.setCategoria(rdbCadastroComercial.getText());
        }
        else{
            imovel.setCategoria(rdbCadastroResidencial.getText());
        }
        
        imovel.setTipoDoImovel((String) cbxCadastroTipos.getSelectedItem().toString());

        
        float aux = Float.parseFloat(txtCadastroValorDaVenda.getText());
        imovel.setValorDaVenda(aux);
        
        listaImovel.add(imovel);//adiciona na lista

        //chama o menu
        if(inicio == null)
        {
            System.out.println("1");
            inicio = new telaInicial();
            inicio.setVisible(true);
            
            //passar os dados para a tela inicial
            for(Imovel objeto : listaImovel) {
                inicio.receberDados(objeto);
                System.out.println(objeto);
                System.out.println("001");
            }
            this.dispose();
            
        }
        else 
        {
            System.out.println("2");
            inicio.setVisible(true);
            inicio.lista.get(WIDTH);
            inicio.setState(procurarCasa.NORMAL);
            for (Imovel listaImovel1 : listaImovel) {
                inicio.receberDados(listaImovel1);
            }
        }
                        
        
        this.dispose();
    }//GEN-LAST:event_btnSalvarMouseClicked

    private void txtCadastroNomeProprietarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCadastroNomeProprietarioKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode() == KeyEvent.VK_ENTER)
        {
            txtCadastroDescricao.requestFocus();
        }
    }//GEN-LAST:event_txtCadastroNomeProprietarioKeyPressed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(cadastroDeCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(cadastroDeCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(cadastroDeCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(cadastroDeCasa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new cadastroDeCasa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvar;
    private javax.swing.JComboBox cbxCadastroTipos;
    private javax.swing.JPanel fundoDaTela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdbCadastroComercial;
    private javax.swing.JRadioButton rdbCadastroResidencial;
    private javax.swing.JTextArea txtCadastroDescricao;
    private javax.swing.JTextField txtCadastroNomeProprietario;
    private javax.swing.JTextField txtCadastroValorDaVenda;
    private javax.swing.JLabel txtSubtitulo0;
    private javax.swing.JLabel txtSubtitulo1;
    private javax.swing.JLabel txtTitulo;
    // End of variables declaration//GEN-END:variables
    
    private void configurarFormulario() {
        
        this.setTitle("Cadastro");
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        
        
        //definir a seleção do radioButton como 
        //mutuamente exclusiva
        ButtonGroup bg = new ButtonGroup();
        bg.add(rdbCadastroComercial);
        bg.add(rdbCadastroResidencial);
        
        rdbCadastroComercial.setSelected(true); // iniciando com o comercial selecionado
        
    }
    
    //receber os dados para atualizar a lista
    public void receberDados(Imovel objeto)
    {
        Imovel tela;
        tela = new Imovel();
        tela.setCategoria(objeto.getCategoria());
        tela.setDescricao(objeto.getDescricao());
        tela.setNomeImovel(objeto.getNomeImovel());
        tela.setTipoDoImovel(objeto.getTipoDoImovel());
        tela.setValorDaVenda(objeto.getValorDaVenda());
        listaImovel.add(tela);
    }
    
    public void mostrarDados()
    {
        for (Imovel listaSalva1 : listaImovel) {
            txtCadastroDescricao.setText(listaSalva1.toString());
        }
    }

}
