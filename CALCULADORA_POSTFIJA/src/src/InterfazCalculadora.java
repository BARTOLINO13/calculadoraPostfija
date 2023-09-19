
package src;

import java.util.ArrayList;
import src.Calculadora;

/**
 *
 * @author maher
 */
public class InterfazCalculadora extends javax.swing.JFrame {
    private StringBuilder operacion;
    private int tamanho;
    /**
     * Creates new form XX
     */
    public InterfazCalculadora() {
        initComponents();
        operacion= new StringBuilder();
        tamanho=0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        boton2 = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        boton3 = new javax.swing.JButton();
        botonDivision = new javax.swing.JButton();
        boton0 = new javax.swing.JButton();
        botonParentesisAbre = new javax.swing.JButton();
        botonPunto = new javax.swing.JButton();
        botonParentesisCierra = new javax.swing.JButton();
        botonMenosRaro = new javax.swing.JButton();
        botonElevar = new javax.swing.JButton();
        botonIgual = new javax.swing.JButton();
        botonSuma = new javax.swing.JButton();
        botonReiniciar = new javax.swing.JButton();
        boton7 = new javax.swing.JButton();
        boton8 = new javax.swing.JButton();
        boton9 = new javax.swing.JButton();
        boton4 = new javax.swing.JButton();
        boton5 = new javax.swing.JButton();
        boton6 = new javax.swing.JButton();
        botonResta = new javax.swing.JButton();
        boton1 = new javax.swing.JButton();
        botonMultiplicacion = new javax.swing.JButton();
        respuesta = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));

        boton2.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        boton2.setText("2");
        boton2.setActionCommand("boton2");
        boton2.setPreferredSize(new java.awt.Dimension(70, 50));
        boton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton2ActionPerformed(evt);
            }
        });

        botonBorrar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        botonBorrar.setText("DEL");
        botonBorrar.setActionCommand("boton7");
        botonBorrar.setPreferredSize(new java.awt.Dimension(60, 50));
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        boton3.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        boton3.setText("3");
        boton3.setActionCommand("boton3");
        boton3.setPreferredSize(new java.awt.Dimension(70, 50));
        boton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton3ActionPerformed(evt);
            }
        });

        botonDivision.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        botonDivision.setForeground(new java.awt.Color(255, 51, 0));
        botonDivision.setText("/");
        botonDivision.setActionCommand("boton7");
        botonDivision.setPreferredSize(new java.awt.Dimension(60, 50));
        botonDivision.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDivisionActionPerformed(evt);
            }
        });

        boton0.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        boton0.setText("0");
        boton0.setActionCommand("boton0");
        boton0.setPreferredSize(new java.awt.Dimension(70, 50));
        boton0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton0ActionPerformed(evt);
            }
        });

        botonParentesisAbre.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        botonParentesisAbre.setForeground(new java.awt.Color(255, 51, 0));
        botonParentesisAbre.setText("(");
        botonParentesisAbre.setActionCommand("boton7");
        botonParentesisAbre.setPreferredSize(new java.awt.Dimension(60, 50));
        botonParentesisAbre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonParentesisAbreActionPerformed(evt);
            }
        });

        botonPunto.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        botonPunto.setText(".");
        botonPunto.setActionCommand("botonPunto");
        botonPunto.setPreferredSize(new java.awt.Dimension(70, 50));
        botonPunto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPuntoActionPerformed(evt);
            }
        });

        botonParentesisCierra.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        botonParentesisCierra.setForeground(new java.awt.Color(255, 51, 0));
        botonParentesisCierra.setText(")");
        botonParentesisCierra.setActionCommand("boton7");
        botonParentesisCierra.setPreferredSize(new java.awt.Dimension(60, 50));
        botonParentesisCierra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonParentesisCierraActionPerformed(evt);
            }
        });

        botonMenosRaro.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        botonMenosRaro.setText("(-)");
        botonMenosRaro.setActionCommand("botonMenosDif");
        botonMenosRaro.setPreferredSize(new java.awt.Dimension(70, 50));
        botonMenosRaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenosRaroActionPerformed(evt);
            }
        });

        botonElevar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        botonElevar.setForeground(new java.awt.Color(255, 51, 0));
        botonElevar.setText("^");
        botonElevar.setPreferredSize(new java.awt.Dimension(70, 50));
        botonElevar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonElevarActionPerformed(evt);
            }
        });

        botonIgual.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        botonIgual.setForeground(new java.awt.Color(255, 51, 0));
        botonIgual.setText("=");
        botonIgual.setActionCommand("boton7");
        botonIgual.setPreferredSize(new java.awt.Dimension(70, 50));
        botonIgual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonIgualActionPerformed(evt);
            }
        });

        botonSuma.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        botonSuma.setForeground(new java.awt.Color(255, 51, 0));
        botonSuma.setText("+");
        botonSuma.setActionCommand("boton7");
        botonSuma.setPreferredSize(new java.awt.Dimension(70, 50));
        botonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSumaActionPerformed(evt);
            }
        });

        botonReiniciar.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        botonReiniciar.setText("CE");
        botonReiniciar.setActionCommand("boton7");
        botonReiniciar.setPreferredSize(new java.awt.Dimension(60, 50));
        botonReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonReiniciarActionPerformed(evt);
            }
        });

        boton7.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        boton7.setText("7");
        boton7.setActionCommand("boton7");
        boton7.setPreferredSize(new java.awt.Dimension(70, 50));
        boton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton7ActionPerformed(evt);
            }
        });

        boton8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        boton8.setText("8");
        boton8.setActionCommand("boton8");
        boton8.setPreferredSize(new java.awt.Dimension(70, 50));
        boton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton8ActionPerformed(evt);
            }
        });

        boton9.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        boton9.setText("9");
        boton9.setActionCommand("boton9");
        boton9.setPreferredSize(new java.awt.Dimension(70, 50));
        boton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton9ActionPerformed(evt);
            }
        });

        boton4.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        boton4.setText("4");
        boton4.setActionCommand("boton4");
        boton4.setPreferredSize(new java.awt.Dimension(70, 50));
        boton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton4ActionPerformed(evt);
            }
        });

        boton5.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        boton5.setText("5");
        boton5.setActionCommand("boton5");
        boton5.setPreferredSize(new java.awt.Dimension(70, 50));
        boton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton5ActionPerformed(evt);
            }
        });

        boton6.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        boton6.setText("6");
        boton6.setActionCommand("boton6");
        boton6.setPreferredSize(new java.awt.Dimension(70, 50));
        boton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton6ActionPerformed(evt);
            }
        });

        botonResta.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        botonResta.setForeground(new java.awt.Color(255, 51, 0));
        botonResta.setText("-");
        botonResta.setActionCommand("boton7");
        botonResta.setPreferredSize(new java.awt.Dimension(70, 50));
        botonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRestaActionPerformed(evt);
            }
        });

        boton1.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        boton1.setText("1");
        boton1.setActionCommand("boton1");
        boton1.setPreferredSize(new java.awt.Dimension(70, 50));
        boton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton1ActionPerformed(evt);
            }
        });

        botonMultiplicacion.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        botonMultiplicacion.setForeground(new java.awt.Color(255, 51, 0));
        botonMultiplicacion.setText("X");
        botonMultiplicacion.setActionCommand("boton7");
        botonMultiplicacion.setPreferredSize(new java.awt.Dimension(70, 50));
        botonMultiplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMultiplicacionActionPerformed(evt);
            }
        });

        respuesta.setBackground(new java.awt.Color(0, 0, 0));
        respuesta.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 18)); // NOI18N
        respuesta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        respuesta.setText("Calculadora");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(respuesta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(boton0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(botonParentesisAbre, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(botonPunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(botonMenosRaro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonResta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonParentesisCierra, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonElevar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(botonReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(botonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(respuesta, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonReiniciar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonDivision, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonElevar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonParentesisAbre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonParentesisCierra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonMultiplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonResta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonSuma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonMenosRaro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonPunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonIgual, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>                        

    private void boton2ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        operacion.append("2");
        respuesta.setText(operacion.toString());
        tamanho++;
    }                                      

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        if(tamanho>0){
            tamanho--;
            operacion.setLength(tamanho);
            respuesta.setText(operacion.toString());
        }
        else
            respuesta.setText("0");
    }                                           

    private void boton3ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        operacion.append("3");
        respuesta.setText(operacion.toString());
        tamanho++;
    }                                      

    private void botonDivisionActionPerformed(java.awt.event.ActionEvent evt) {                                              
        operacion.append("/");
        respuesta.setText(operacion.toString());
        tamanho++;
    }                                             

    private void boton0ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        operacion.append("0");
        respuesta.setText(operacion.toString());
        tamanho++;
    }                                      

    private void botonParentesisAbreActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        operacion.append("(");
        respuesta.setText(operacion.toString());
        tamanho++;
    }                                                   

    private void botonPuntoActionPerformed(java.awt.event.ActionEvent evt) {                                           
        operacion.append(".");
        respuesta.setText(operacion.toString());
        tamanho++;
    }                                          

    private void botonParentesisCierraActionPerformed(java.awt.event.ActionEvent evt) {                                                      
        operacion.append(")");
        respuesta.setText(operacion.toString());
        tamanho++;
    }                                                     

    private void botonMenosRaroActionPerformed(java.awt.event.ActionEvent evt) {                                               
        Character ch;
        
        if(operacion.length() == 0){
            operacion.append("!");
            tamanho++;
        }
        else{
            ch=operacion.charAt(tamanho-1);
            if(ch=='+' || ch == '-' || ch == '*' || ch == '/' || ch == '^' || ch == '('){
                operacion.append("!");
                tamanho++;
            }
            else{
                if(ch=='!'){
                    tamanho--;
                    operacion.setLength(tamanho);
                    respuesta.setText(operacion.toString()); 
                }
                else{
                    operacion.append("-");
                    tamanho++;
                }
            }
        }
        respuesta.setText(operacion.toString());
    }                                              

    private void botonElevarActionPerformed(java.awt.event.ActionEvent evt) {                                            
        operacion.append("^");
        respuesta.setText(operacion.toString());
        tamanho++;
    }                                           

    private void botonIgualActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Calculadora calculadora;
        ArrayList postfijo = new ArrayList();
        double respuestaNumerica;

        calculadora= new Calculadora(operacion.toString());
        if(calculadora.revisadorParentesis() && calculadora.revisadorPuntos() && calculadora.revisadorSignos()){
            postfijo=calculadora.convertidor();
            respuestaNumerica=calculadora.evalua(postfijo);
            respuesta.setText(" "+respuestaNumerica);
            operacion.setLength(0);
            operacion.append(respuestaNumerica);
            tamanho=operacion.length();
        }
        else{
            respuesta.setText("ERROR");
            operacion.setLength(0);
            tamanho=0;
        }
        
    }                                          

    private void botonSumaActionPerformed(java.awt.event.ActionEvent evt) {                                          
        operacion.append("+");
        respuesta.setText(operacion.toString());
        tamanho++;
    }                                         

    private void botonReiniciarActionPerformed(java.awt.event.ActionEvent evt) {                                               
        operacion.setLength(0);
        respuesta.setText("0");
        tamanho=0;
    }                                              

    private void boton7ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        operacion.append("7");
        respuesta.setText(operacion.toString());
        tamanho++;
    }                                      

    private void boton8ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        operacion.append("8");
        respuesta.setText(operacion.toString());
        tamanho++;
    }                                      

    private void boton9ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        operacion.append("9");
        respuesta.setText(operacion.toString());
        tamanho++;
    }                                      

    private void boton4ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        operacion.append("4");
        respuesta.setText(operacion.toString());
        tamanho++;
    }                                      

    private void boton5ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        operacion.append("5");
        respuesta.setText(operacion.toString());
        tamanho++;
    }                                      

    private void boton6ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        operacion.append("6");
        respuesta.setText(operacion.toString());
        tamanho++;
    }                                      

    private void botonRestaActionPerformed(java.awt.event.ActionEvent evt) {                                           
        operacion.append("-");
        respuesta.setText(operacion.toString());
        tamanho++;
    }                                          

    private void boton1ActionPerformed(java.awt.event.ActionEvent evt) {                                       
        operacion.append("1");
        respuesta.setText(operacion.toString());
        tamanho++;
    }                                      

    private void botonMultiplicacionActionPerformed(java.awt.event.ActionEvent evt) {                                                    
        operacion.append("*");
        respuesta.setText(operacion.toString());
        tamanho++;
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
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazCalculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazCalculadora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton boton0;
    private javax.swing.JButton boton1;
    private javax.swing.JButton boton2;
    private javax.swing.JButton boton3;
    private javax.swing.JButton boton4;
    private javax.swing.JButton boton5;
    private javax.swing.JButton boton6;
    private javax.swing.JButton boton7;
    private javax.swing.JButton boton8;
    private javax.swing.JButton boton9;
    private javax.swing.JButton botonBorrar;
    private javax.swing.JButton botonDivision;
    private javax.swing.JButton botonElevar;
    private javax.swing.JButton botonIgual;
    private javax.swing.JButton botonMenosRaro;
    private javax.swing.JButton botonMultiplicacion;
    private javax.swing.JButton botonParentesisAbre;
    private javax.swing.JButton botonParentesisCierra;
    private javax.swing.JButton botonPunto;
    private javax.swing.JButton botonReiniciar;
    private javax.swing.JButton botonResta;
    private javax.swing.JButton botonSuma;
    private javax.swing.JLabel respuesta;
    // End of variables declaration                   
}