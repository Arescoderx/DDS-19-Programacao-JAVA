/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.projeto_17_conecaomysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author m.schmidt
 */
public class PROJETO_17_TELA extends javax.swing.JFrame {

    /**
     * Creates new form PROJETO_17_TELA
     */
    public PROJETO_17_TELA() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        JPanel_Background = new javax.swing.JPanel();
        JPanel_Campos = new javax.swing.JPanel();
        JTextField_CampoNome = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        JTextField_CampoCPF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        JTextField_CampoEstado = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JTextField_CampoCidade = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        JTextField_CampoBairro = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        JButton_Salvar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        JTextField_CampoSobrenome = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        JTextField_CampoSexo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        JTextField_CampoDt_Nascimento = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        JTextField_CampoIdade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        JTextField_CampoRG = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        JTextField_CampoPais = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        JTextField_CampoCNPJ = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        JTextField_CampoRua = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        JTextField_CampoNum_Rua = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        JTextField_CampoP_Doenca = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        JTextField_CampoSigla_uf = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        JTextField_CampoTipo_Pessoa = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        JTextField_CampoEmail = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        JTextField_CampoComplemento = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        JTextField_CampoCelular = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        JTextField_CampoP_Filho = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        JTextField_CampoQ_Filho = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        JTextField_CampoNome_pai = new javax.swing.JTextField();
        jLabel25 = new javax.swing.JLabel();
        JTextField_CampoNome_mae = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        JTextField_CampoTrabalha = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(403, 403));

        JPanel_Background.setBackground(new java.awt.Color(255, 255, 255));

        JPanel_Campos.setBackground(new java.awt.Color(255, 255, 255));
        JPanel_Campos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Nome");

        jLabel3.setText("CPF");

        jLabel4.setText("Estado");

        jLabel2.setText("Cidade");

        jLabel5.setText("Bairro");

        JButton_Salvar.setBackground(new java.awt.Color(51, 255, 51));
        JButton_Salvar.setForeground(new java.awt.Color(0, 0, 0));
        JButton_Salvar.setText("Salvar");
        JButton_Salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButton_SalvarActionPerformed(evt);
            }
        });

        jLabel6.setText("Sobrenome");

        jLabel7.setText("Sexo");

        jLabel8.setText("Data de Nascimento");

        jLabel9.setText("Idade");

        jLabel10.setText("RG");

        jLabel12.setText("Pais");

        jLabel13.setText("CNPJ");

        jLabel14.setText("Rua");

        jLabel15.setText("Numero Casa");

        jLabel16.setText("Possui Doença");

        jLabel17.setText("Sigla Estado");

        jLabel18.setText("Tipo Pessoa");

        jLabel19.setText("Email");

        jLabel20.setText("Complemento");

        jLabel21.setText("Celular");

        jLabel22.setText("Possui Filho");

        jLabel23.setText("Quantos Filhos");

        jLabel24.setText("Nome Pai");

        jLabel25.setText("Nome Mae");

        JTextField_CampoNome_mae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTextField_CampoNome_maeActionPerformed(evt);
            }
        });

        jLabel26.setText("Trabalha");

        javax.swing.GroupLayout JPanel_CamposLayout = new javax.swing.GroupLayout(JPanel_Campos);
        JPanel_Campos.setLayout(JPanel_CamposLayout);
        JPanel_CamposLayout.setHorizontalGroup(
            JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_CamposLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_CamposLayout.createSequentialGroup()
                        .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextField_CampoSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextField_CampoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(JTextField_CampoDt_Nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(JTextField_CampoP_Doenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextField_CampoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(18, 18, 18)
                        .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextField_CampoP_Filho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel22))
                        .addGap(18, 18, 18)
                        .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(JTextField_CampoQ_Filho))
                        .addGap(18, 18, 18)
                        .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanel_CamposLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel24))
                            .addComponent(JTextField_CampoNome_pai, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel25)
                            .addComponent(JTextField_CampoNome_mae, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel26)
                            .addGroup(JPanel_CamposLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(JTextField_CampoTrabalha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel1)
                    .addGroup(JPanel_CamposLayout.createSequentialGroup()
                        .addComponent(JTextField_CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextField_CampoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(JTextField_CampoPais, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextField_CampoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(34, 34, 34)
                        .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(JPanel_CamposLayout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTextField_CampoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel19))
                                .addGap(18, 18, 18)
                                .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel20)
                                    .addComponent(JTextField_CampoComplemento)))
                            .addGroup(JPanel_CamposLayout.createSequentialGroup()
                                .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTextField_CampoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(JTextField_CampoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addGap(18, 18, 18)
                                .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel17)
                                    .addComponent(JTextField_CampoSigla_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(JPanel_CamposLayout.createSequentialGroup()
                        .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextField_CampoSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanel_CamposLayout.createSequentialGroup()
                                .addComponent(JTextField_CampoRG, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(JTextField_CampoCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JPanel_CamposLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(113, 113, 113)
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel13)))
                        .addGap(18, 18, 18)
                        .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextField_CampoRua, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JTextField_CampoNum_Rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel15))
                        .addGap(18, 18, 18)
                        .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel18)
                            .addComponent(JTextField_CampoTipo_Pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(208, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_CamposLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JButton_Salvar)
                .addContainerGap())
        );
        JPanel_CamposLayout.setVerticalGroup(
            JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_CamposLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(JPanel_CamposLayout.createSequentialGroup()
                        .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel12)
                            .addComponent(jLabel17))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextField_CampoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextField_CampoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextField_CampoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextField_CampoCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextField_CampoBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextField_CampoPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextField_CampoSigla_uf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(JTextField_CampoSobrenome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextField_CampoRG, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextField_CampoCNPJ, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextField_CampoRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextField_CampoNum_Rua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextField_CampoTipo_Pessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextField_CampoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(JTextField_CampoComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanel_CamposLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(JPanel_CamposLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTextField_CampoSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_CamposLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(JTextField_CampoIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(JPanel_CamposLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel21)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel23)
                                    .addComponent(jLabel24)
                                    .addComponent(jLabel25)
                                    .addComponent(jLabel26))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(JPanel_CamposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(JTextField_CampoCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTextField_CampoP_Filho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTextField_CampoQ_Filho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTextField_CampoNome_pai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTextField_CampoNome_mae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JTextField_CampoTrabalha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(JPanel_CamposLayout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextField_CampoDt_Nascimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanel_CamposLayout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(JTextField_CampoP_Doenca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JButton_Salvar)
                .addContainerGap())
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Estado", "Cidade", "Bairro"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout JPanel_BackgroundLayout = new javax.swing.GroupLayout(JPanel_Background);
        JPanel_Background.setLayout(JPanel_BackgroundLayout);
        JPanel_BackgroundLayout.setHorizontalGroup(
            JPanel_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_Campos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(JPanel_BackgroundLayout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        JPanel_BackgroundLayout.setVerticalGroup(
            JPanel_BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_BackgroundLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(JPanel_Campos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButton_SalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButton_SalvarActionPerformed
        try {
            // TODO add your handling code here:
            Connection conexao = null;
            PreparedStatement statement = null;
            
            String url = "jdbc:mysql://127.0.0.1:3306/cadastro";
            String usuario = "root";
            String senha = "";
            
            conexao = DriverManager.getConnection(url, usuario, senha);
            String sql = "INSERT INTO pessoas (Nome,Dt_Nascimento, Sexo, P_Doenca, Tipo_Pessoa, Sobrenome, idade, CPF, RG, CNPJ, Pais, Estado, Sigla_uf, Cidade, Bairro, Complemento, Email, Rua, Num_Rua, Celular , P_Filho, Q_Filho, Nome_pai, Nome_mae, Trabalha) "
                    + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            statement = conexao.prepareStatement(sql);
            statement.setString(1,JTextField_CampoNome.getText()); //Nome
            statement.setString(2,JTextField_CampoDt_Nascimento.getText()); //Dt_Nascimento
            statement.setString(3,JTextField_CampoSexo.getText()); //Sexo
            statement.setString(4,JTextField_CampoP_Doenca.getText()); //P_Doenca
            statement.setString(5,JTextField_CampoTipo_Pessoa.getText()); //Tipo_Pessoa
            statement.setString(6,JTextField_CampoSobrenome.getText()); //Sobrenome
            statement.setString(7,JTextField_CampoIdade.getText()); //idade
            statement.setString(8,JTextField_CampoCPF.getText()); //CPF
            statement.setString(9,JTextField_CampoRG.getText()); //RG
            statement.setString(10,JTextField_CampoCNPJ.getText()); //CNPJ
            statement.setString(11,JTextField_CampoPais.getText()); //Pais
            statement.setString(12,JTextField_CampoSigla_uf.getText()); //Sigla_uf
            statement.setString(13,JTextField_CampoEstado.getText()); //Estado
            statement.setString(14,JTextField_CampoBairro.getText()); //Cidade
            statement.setString(15,JTextField_CampoCidade.getText()); //Bairro
            statement.setString(16,JTextField_CampoComplemento.getText()); //Complemento
            statement.setString(17,JTextField_CampoEmail.getText()); //Email
            statement.setString(18,JTextField_CampoRua.getText()); //Rua
            statement.setString(19,JTextField_CampoNum_Rua.getText()); //Num_Rua
            statement.setString(20,JTextField_CampoCelular.getText()); //Celular
            statement.setString(21,JTextField_CampoP_Filho.getText()); //P_Filho
            statement.setString(22,JTextField_CampoQ_Filho.getText()); //Q_Filho
            statement.setString(23,JTextField_CampoNome_pai.getText()); //Nome_pai
            statement.setString(24,JTextField_CampoNome_mae.getText()); //Nome_mae
            statement.setString(25,JTextField_CampoTrabalha.getText()); //Trabalha
            statement.executeUpdate();
            System.out.println("Você foi Cadastrado");
        } catch (SQLException ex) {
            System.out.println("Erro no codigo"+ ex.getMessage());
        }
        

        
    }//GEN-LAST:event_JButton_SalvarActionPerformed

    private void JTextField_CampoNome_maeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTextField_CampoNome_maeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTextField_CampoNome_maeActionPerformed

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
            java.util.logging.Logger.getLogger(PROJETO_17_TELA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PROJETO_17_TELA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PROJETO_17_TELA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PROJETO_17_TELA.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PROJETO_17_TELA().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButton_Salvar;
    private javax.swing.JPanel JPanel_Background;
    private javax.swing.JPanel JPanel_Campos;
    private javax.swing.JTextField JTextField_CampoBairro;
    private javax.swing.JTextField JTextField_CampoCNPJ;
    private javax.swing.JTextField JTextField_CampoCPF;
    private javax.swing.JTextField JTextField_CampoCelular;
    private javax.swing.JTextField JTextField_CampoCidade;
    private javax.swing.JTextField JTextField_CampoComplemento;
    private javax.swing.JTextField JTextField_CampoDt_Nascimento;
    private javax.swing.JTextField JTextField_CampoEmail;
    private javax.swing.JTextField JTextField_CampoEstado;
    private javax.swing.JTextField JTextField_CampoIdade;
    private javax.swing.JTextField JTextField_CampoNome;
    private javax.swing.JTextField JTextField_CampoNome_mae;
    private javax.swing.JTextField JTextField_CampoNome_pai;
    private javax.swing.JTextField JTextField_CampoNum_Rua;
    private javax.swing.JTextField JTextField_CampoP_Doenca;
    private javax.swing.JTextField JTextField_CampoP_Filho;
    private javax.swing.JTextField JTextField_CampoPais;
    private javax.swing.JTextField JTextField_CampoQ_Filho;
    private javax.swing.JTextField JTextField_CampoRG;
    private javax.swing.JTextField JTextField_CampoRua;
    private javax.swing.JTextField JTextField_CampoSexo;
    private javax.swing.JTextField JTextField_CampoSigla_uf;
    private javax.swing.JTextField JTextField_CampoSobrenome;
    private javax.swing.JTextField JTextField_CampoTipo_Pessoa;
    private javax.swing.JTextField JTextField_CampoTrabalha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables
}
