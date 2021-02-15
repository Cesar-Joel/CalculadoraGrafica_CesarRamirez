import javax.swing.*;
import java.awt.event.*;
public class Calculadora{
   public static void main(String args[]){
      Ventana ventana = new Ventana();
      ventana.calculadora();
   }
}   
   
class Ventana extends JFrame implements ActionListener{   
   
   boolean ban = false;
   boolean flag = false;
   JLabel etiqueta;
   JTextField texto;
   JPanel panel;
   
   JButton botonC;
   JButton botonBorrar;
   JButton botonSiete;
   JButton botonOcho;
   JButton botonNueve;
   JButton botonEntre;
   JButton botonCuatro;
   JButton botonCinco;
   JButton botonSeis;
   JButton botonPor;
   JButton botonUno;
   JButton botonDos;
   JButton botonTres;
   JButton botonMenos;
   JButton botonPunto;
   JButton botonCero;
   JButton botonIgual;
   JButton botonMas;
   
   public void calculadora(){
            
      setSize(330,480);
      setTitle("Calculadora");
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      etiqueta = new JLabel("Calculadora");
      etiqueta.setBounds(130, 15, 300, 50);
      texto = new JTextField(25);
      texto.setText("");
      texto.setBounds(50, 50, 230, 50);
      texto.setEditable(false);
      
      panel = new JPanel();
      panel.setLayout(null);
      botonC = new JButton("C");
      botonC.setBounds(50, 125, 110, 50);
      botonBorrar = new JButton("Borrar");
      botonBorrar.setBounds(170, 125, 110, 50);
      botonSiete = new JButton("7");
      botonSiete.setBounds(50, 200, 50, 50);
      botonOcho = new JButton("8");
      botonOcho.setBounds(110, 200, 50, 50);
      botonNueve = new JButton("9");
      botonNueve.setBounds(170, 200, 50, 50);
      botonEntre = new JButton("/");
      botonEntre.setBounds(230, 200, 50, 50);
      botonCuatro = new JButton("4");
      botonCuatro.setBounds(50, 260, 50, 50);
      botonCinco = new JButton("5");
      botonCinco.setBounds(110, 260, 50, 50);
      botonSeis = new JButton("6");
      botonSeis.setBounds(170, 260, 50, 50);
      botonPor = new JButton("*");
      botonPor.setBounds(230, 260, 50, 50);
      botonUno = new JButton("1");
      botonUno.setBounds(50, 320, 50, 50);
      botonDos = new JButton("2");
      botonDos.setBounds(110, 320, 50, 50);
      botonTres = new JButton("3");
      botonTres.setBounds(170, 320, 50, 50);
      botonMenos = new JButton("-");
      botonMenos.setBounds(230, 320, 50, 50);
      botonPunto = new JButton(".");
      botonPunto.setBounds(50, 380, 50, 50);
      botonCero = new JButton("0");
      botonCero.setBounds(110, 380, 50, 50);
      botonIgual = new JButton("=");
      botonIgual.setBounds(170, 380, 50, 50);
      botonMas = new JButton("+");
      botonMas.setBounds(230, 380, 50, 50);
      
      
      panel.add(etiqueta);
      panel.add(texto);
      panel.add(botonC);
      panel.add(botonBorrar);
      panel.add(botonSiete);
      panel.add(botonOcho);
      panel.add(botonNueve);
      panel.add(botonEntre);
      panel.add(botonPunto);
      panel.add(botonCuatro);
      panel.add(botonCinco);
      panel.add(botonSeis);
      panel.add(botonPor);
      panel.add(botonUno);
      panel.add(botonDos);
      panel.add(botonTres);
      panel.add(botonMenos);
      panel.add(botonCero);
      panel.add(botonIgual);
      panel.add(botonMas);
      
      botonC.addActionListener(this);
      botonBorrar.addActionListener(this);
      botonSiete.addActionListener(this);
      botonOcho.addActionListener(this);
      botonNueve.addActionListener(this);
      botonEntre.addActionListener(this);
      botonPunto.addActionListener(this);
      botonCuatro.addActionListener(this);
      botonCinco.addActionListener(this);
      botonSeis.addActionListener(this);
      botonPor.addActionListener(this);
      botonUno.addActionListener(this);
      botonDos.addActionListener(this);
      botonTres.addActionListener(this);
      botonMenos.addActionListener(this);
      botonCero.addActionListener(this);
      botonIgual.addActionListener(this);
      botonMas.addActionListener(this);
      
      setContentPane(panel);
      setVisible(true);
      setResizable(false);
   }
   
   public void actionPerformed(ActionEvent e){
      
      boolean flagOperador = false, flagBreak = false;
      String cadena = "";
      
      if(e.getSource() == botonC){
         texto.setText(null);
         ban = false;
      }
      if(e.getSource() == botonBorrar){
         cadena = texto.getText();
         cadena = cadena.substring(0, cadena.length() - 1);
         texto.setText(cadena);
      }
      if(e.getSource() == botonSiete){
         if(ban == true){
            texto.setText(null);
            ban = false;
         }
         texto.setText(texto.getText() + "7");
      }
      if(e.getSource() == botonOcho){
         if(ban == true){
            texto.setText(null);
            ban = false;
         }
         texto.setText(texto.getText() + "8");
      }
      if(e.getSource() == botonNueve){
         if(ban == true){
            texto.setText(null);
            ban = false;
         }
         texto.setText(texto.getText() + "9");
      }
      if(e.getSource() == botonEntre){
         if(flag == true)
            igualPrematuro(cadena);
         texto.setText(texto.getText() + "/");
         flag = true;
         ban = false;
      }
      if(e.getSource() == botonPunto){
         texto.setText(texto.getText() + ".");
      }
      if(e.getSource() == botonCuatro){
         if(ban == true){
            texto.setText(null);
            ban = false;
         }
         texto.setText(texto.getText() + "4");
      }
      if(e.getSource() == botonCinco){
         if(ban == true){
            texto.setText(null);
            ban = false;
         }
         texto.setText(texto.getText() + "5");
      }
      if(e.getSource() == botonSeis){
         if(ban == true){
            texto.setText(null);
            ban = false;
         }
         texto.setText(texto.getText() + "6");
      }
      if(e.getSource() == botonPor){
         if(flag == true)
            igualPrematuro(cadena);
         texto.setText(texto.getText() + "*");
         flag = true;
         ban = false;
      }
      if(e.getSource() == botonUno){
         if(ban == true){
            texto.setText(null);
            ban = false;
         }
         texto.setText(texto.getText() + "1");
      }
      if(e.getSource() == botonDos){
         if(ban == true){
            texto.setText(null);
            ban = false;
         }
         texto.setText(texto.getText() + "2");
      }
      if(e.getSource() == botonTres){
         if(ban == true){
            texto.setText(null);
            ban = false;
         }
         texto.setText(texto.getText() + "3");
      }
      if(e.getSource() == botonMenos){
         if(flag == true)
            igualPrematuro(cadena);
         texto.setText(texto.getText() + "-");
         flag = true;
         ban = false;
      }
      if(e.getSource() == botonCero){
         if(ban == true){
            texto.setText(null);
            ban = false;
         }
         texto.setText(texto.getText() + "0");
      }
      if(e.getSource() == botonIgual){
         cadena = texto.getText();
         if(cadena.charAt(0) == '+' || cadena.charAt(0) == '*' || cadena.charAt(0) == '/'){
            JOptionPane.showMessageDialog(null, "Operacion no valida", "Error", JOptionPane.WARNING_MESSAGE);
            texto.setText(null);
         }
         for(int x = 0; x < cadena.length(); x++)
            if(cadena.charAt(x) == '+' || cadena.charAt(x) == '-' || cadena.charAt(x) == '*' || cadena.charAt(x) == '/')
               if(cadena.charAt(x + 1) == '+' || cadena.charAt(x + 1) == '-' || cadena.charAt(x + 1) == '*' || cadena.charAt(x + 1) == '/'){
                  JOptionPane.showMessageDialog(null, "Operacion no valida", "Error", JOptionPane.WARNING_MESSAGE);
                  texto.setText(null);
               }
         for(int x = 0; x < cadena.length(); x++)
            if(cadena.charAt(x) == '.'){
               for(int i = x+1; i < cadena.length(); i++){
                  if(flagBreak == true)
                     break;
                  else if(cadena.charAt(i) == '.' && flagOperador == false){
                     JOptionPane.showMessageDialog(null, "Operacion no valida", "Error", JOptionPane.WARNING_MESSAGE);
                     texto.setText(null);
                     flagBreak = true;
                  } else if(cadena.charAt(i) == '+' || cadena.charAt(i) == '-' || cadena.charAt(i) == '*' || cadena.charAt(i) == '/'){
                     flagOperador = true;
                  }
                  if(flagOperador == true){
                     flagOperador = false;
                     for(int y = i+1; y < cadena.length(); y++){
                        if(cadena.charAt(y) == '.'){
                           for(int z = y+1; z < cadena.length(); z++){
                              if(flagBreak == true)
                                 break;
                              else if(cadena.charAt(z) == '.' && flagOperador == false){
                                 JOptionPane.showMessageDialog(null, "Operacion no valida", "Error", JOptionPane.WARNING_MESSAGE);
                                 texto.setText(null);
                              } else if(cadena.charAt(z) == '+' || cadena.charAt(z) == '-' || cadena.charAt(z) == '*' || cadena.charAt(z) == '/'){
                                 flagOperador = true;
                              }
                           }
                           flagBreak = true;
                           break;
                        }
                     }
                  }
               }
               break;
            }
         operaciones(cadena);
         ban = true;
      }
      if(e.getSource() == botonMas){
         if(flag == true)
            igualPrematuro(cadena);
         texto.setText(texto.getText() + "+");
         flag = true;
         ban = false;
      }
   }
   
   public void igualPrematuro(String cadena){
      
      boolean flagOperador = false, flagBreak = false;
      
      cadena = texto.getText();
      if(cadena.charAt(0) == '+'|| cadena.charAt(0) == '*' || cadena.charAt(0) == '/'){
         JOptionPane.showMessageDialog(null, "Operacion no valida", "Error", JOptionPane.WARNING_MESSAGE);
         texto.setText(null);
      }
      for(int x = 0; x < cadena.length(); x++)
         if(cadena.charAt(x) == '+' || cadena.charAt(x) == '-' || cadena.charAt(x) == '*' || cadena.charAt(x) == '/')
            if(cadena.charAt(x + 1) == '+' || cadena.charAt(x + 1) == '-' || cadena.charAt(x + 1) == '*' || cadena.charAt(x + 1) == '/'){
               JOptionPane.showMessageDialog(null, "Operacion no valida", "Error", JOptionPane.WARNING_MESSAGE);
               texto.setText(null);
            }
      for(int x = 0; x < cadena.length(); x++)
            if(cadena.charAt(x) == '.'){
               for(int i = x+1; i < cadena.length(); i++){
                  if(flagBreak == true)
                     break;
                  else if(cadena.charAt(i) == '.' && flagOperador == false){
                     JOptionPane.showMessageDialog(null, "Operacion no valida", "Error", JOptionPane.WARNING_MESSAGE);
                     texto.setText(null);
                     flagBreak = true;
                  } else if(cadena.charAt(i) == '+' || cadena.charAt(i) == '-' || cadena.charAt(i) == '*' || cadena.charAt(i) == '/'){
                     flagOperador = true;
                  }
                  if(flagOperador == true){
                     flagOperador = false;
                     for(int y = i+1; y < cadena.length(); y++){
                        if(cadena.charAt(y) == '.'){
                           for(int z = y+1; z < cadena.length(); z++){
                              if(flagBreak == true)
                                 break;
                              else if(cadena.charAt(z) == '.' && flagOperador == false){
                                 JOptionPane.showMessageDialog(null, "Operacion no valida", "Error", JOptionPane.WARNING_MESSAGE);
                                 texto.setText(null);
                              } else if(cadena.charAt(z) == '+' || cadena.charAt(z) == '-' || cadena.charAt(z) == '*' || cadena.charAt(z) == '/'){
                                 flagOperador = true;
                              }
                           }
                           flagBreak = true;
                           break;
                        }
                     }
                  }
               }
               break;
            }
      operaciones(cadena);
   }
   
   public void operaciones(String cadena){
      
      int cont = 0;
      double resultado;
      String num1, num2;
      
      for(int x = 0; x < cadena.length(); x++){
         if(cadena.charAt(x) == '+'){
            num1 = cadena.substring(0, x);
            num2 = cadena.substring(x+1, cadena.length());
            resultado = Double.parseDouble(num1) + Double.parseDouble(num2);
            texto.setText(Double.toString(resultado));
            cont = 1;
         }
         if(x != 0)
            if(cadena.charAt(x) == '-'){
               num1 = cadena.substring(0, x);
               num2 = cadena.substring(x+1, cadena.length());
               resultado = Double.parseDouble(num1) - Double.parseDouble(num2);
               texto.setText(Double.toString(resultado));
               cont = 1;
            }
         if(cadena.charAt(x) == '*'){
            num1 = cadena.substring(0, x);
            num2 = cadena.substring(x+1, cadena.length());
            resultado = Double.parseDouble(num1) * Double.parseDouble(num2);
            texto.setText(Double.toString(resultado));
            cont = 1;
         }
         if(cadena.charAt(x) == '/'){
            num1 = cadena.substring(0, x);
            num2 = cadena.substring(x+1, cadena.length());
            resultado = Double.parseDouble(num1) / Double.parseDouble(num2);
            texto.setText(Double.toString(resultado));
            cont = 1;
         }
      }
   }
}