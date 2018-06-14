package Controlador;

import javax.swing.JComponent;

import javax.swing.JPanel;

import javax.swing.ImageIcon;

import java.awt.Graphics;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class Contenedor extends JComponent {

    static JPanel panel;
    static int ganador;
    static int columna = 3;
    static int columna2 = 3;
    static int columna3 = 3;
    static int columna4 = 3;
    static int columnameta = 950;
    static int columnalinea = 225;
    static int columnalinea2 = 450;
    static int columnalinea3 = 675;

    static int fila = 10;
    static int fila2 = 69;
    static int fila3 = 130;
    static int fila4 = 196;
    static int filameta = 10;
    static int filalinea = 10;
    static int numero = 1;
    static int numero2 = 9;
    static int numero3 = 13;
    static int numero4 = 16;

    Contenedor(JPanel panel) {
        this.panel = panel;

        setBounds(0, 0, panel.getWidth(), panel.getHeight());
    }

    public void paint(Graphics g) {

        ImageIcon imagen = new ImageIcon(new ImageIcon(getClass().getResource("imagenes/" + numero + ".png")).getImage());
        ImageIcon imagen2 = new ImageIcon(new ImageIcon(getClass().getResource("imagenes/" + numero2 + ".png")).getImage());
        ImageIcon imagen3 = new ImageIcon(new ImageIcon(getClass().getResource("imagenes/" + numero3 + ".png")).getImage());
        ImageIcon imagen4 = new ImageIcon(new ImageIcon(getClass().getResource("imagenes/" + numero4 + ".png")).getImage());
        ImageIcon linea = new ImageIcon(new ImageIcon(getClass().getResource("imagenes/linea.png")).getImage());
        ImageIcon linea2 = new ImageIcon(new ImageIcon(getClass().getResource("imagenes/linea.png")).getImage());
        ImageIcon linea3 = new ImageIcon(new ImageIcon(getClass().getResource("imagenes/linea.png")).getImage());
        ImageIcon meta = new ImageIcon(new ImageIcon(getClass().getResource("imagenes/meta.png")).getImage());

        g.drawImage(imagen.getImage(), columna, fila, 50, 48, null);
        g.drawImage(imagen2.getImage(), columna2, fila2, 50, 48, null);
        g.drawImage(imagen3.getImage(), columna3, fila3, 50, 48, null);
        g.drawImage(imagen4.getImage(), columna4, fila4, 50, 48, null);
        g.drawImage(linea.getImage(), columnalinea, filalinea, 148, 253, null);
        g.drawImage(linea2.getImage(), columnalinea2, filalinea, 148, 253, null);
        g.drawImage(linea3.getImage(), columnalinea3, filalinea, 148, 253, null);
        g.drawImage(meta.getImage(), columnameta, filameta, 148, 253, null);

    }

    static Thread hilo = new Thread() {
        Ventana ventana = new Ventana();

        @Override
        public void run() {
            try {
                int tiempo = 0;
                while (true) {

                    numero++;
                    numero2++;
                    numero3++;
                    numero4++;
                    tiempo++;
                    if (numero == 8) {
                        numero = 1;
                    }
                    if (numero2 == 12) {
                        numero2 = 9;
                    }
                    if (numero3 == 15) {
                        numero3 = 13;
                    }
                     if (numero4 == 21) {
                        numero4 = 16;
                    }

                    panel.repaint();

                    columna += Math.floor(Math.random() * 10 + 1);
                    columna2 += Math.floor(Math.random() * 10 + 1);
                    columna3 += Math.floor(Math.random() * 10 + 1);
                    columna4 += Math.floor(Math.random() * 10 + 1);

                    System.out.println(columna);

                    int parcial1 = 0, parcial2 = 0, parcial3 = 0, resultado = 0;

                    if (columna > 248 && columna < 253) {
                        ganador = 1;
                        parcial1 = tiempo;
                        System.out.println("Primeros 100mts:  " + ganador
                                + " Con un tiempo de: " + parcial1);
                    } else if (columna2 > 248 && columna2 < 253) {
                        ganador = 2;
                        parcial1 = tiempo;
                        System.out.println("Primeros 100mts: " + ganador
                                + " Con un tiempo de: " + parcial1);
                    } else if (columna3 > 248 && columna3 < 253) {
                        ganador = 3;
                        parcial1 = tiempo;
                        System.out.println("Primeros 100mts:  " + ganador
                                + " Con un tiempo de: " + parcial1);
                    } else if (columna4 > 248 && columna4 < 253) {
                        ganador = 4;
                        parcial1 = tiempo;
                        System.out.println("Primeros 100mts:  " + ganador
                                + " Con un tiempo de: " + parcial1);
                    }
                    if (columna > 496 && columna < 501) {
                        ganador = 1;
                        parcial2 = tiempo;
                        System.out.println("Primeros 200mts:  " + ganador
                                + " Con un tiempo de: " + parcial2);
                    } else if (columna2 > 496 && columna2 < 501) {
                        ganador = 2;
                        System.out.println("Primeros 200mts: " + ganador
                                + " Con un tiempo de: " + parcial2);
                    } else if (columna3 > 496 && columna3 < 501) {
                        ganador = 3;
                        parcial2 = tiempo;
                        System.out.println("Primeros 200mts: " + ganador
                                + " Con un tiempo de: " + parcial2);
                    } else if (columna4 > 496 && columna4 < 501) {
                        ganador = 4;
                        parcial2 = tiempo;
                        System.out.println("Primeros 200mts: " + ganador
                                + " Con un tiempo de: " + parcial2);
                    }
                    if (columna > 744 && columna < 749) {
                        ganador = 1;
                        parcial3 = tiempo;
                        System.out.println("Primeros 300mts: " + ganador
                                + " Con un tiempo de: " + parcial3);
                  
                    } else if (columna2 > 744 && columna2 < 749) {
                        ganador = 2;
                        parcial3 = tiempo;
                        System.out.println("Primeros 300mts: " + ganador
                                + " Con un tiempo de: " + parcial3);
                   

                    } else if (columna3 > 744 && columna3 < 749) {
                        ganador = 3;
                        parcial3 = tiempo;
                        System.out.println("Primeros 300mts: " + ganador
                                + " Con un tiempo de: " + parcial3);
                   

                    } else if (columna4 > 744 && columna4 < 749) {
                        ganador = 4;
                        parcial3 = tiempo;
                        System.out.println("Primeros 300mts: " + ganador
                                + " Con un tiempo de: " + parcial3);
                   
                    }
                    if (columna > 940) {
                        ganador = 1;
                        resultado = tiempo;
                        System.out.println("El ganador es: " + ganador
                                + " Con un tiempo de: " + resultado);
                        break;
                    } else if (columna2 > 940) {
                        ganador = 2;
                        resultado = tiempo;
                        System.out.println("El ganador es: " + ganador
                                + " Con un tiempo de: " + resultado);
                        break;
                    } else if (columna3 > 940) {
                        ganador = 3;
                        resultado = tiempo;
                        System.out.println("El ganador es: " + ganador
                                + " Con un tiempo de: " + resultado);
                        break;

                    } else if (columna4 > 940) {
                        ganador = 4;
                        resultado = tiempo;
                        System.out.println("El ganador es: " + ganador
                                + " Con un tiempo de: " + resultado);
                        break;
                    }
                    hilo.sleep(100);
                }

            } catch (java.lang.InterruptedException ex) {
                System.out.println(ex.getMessage());
            }

        }
    };

    public static void mover() {
        if (!hilo.isAlive()) {
            hilo.start();
        }
        columna = 3;
    }
}
