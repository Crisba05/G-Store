
package gFrame;
import gclass.SQLdata;
import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;

public class mainStore extends javax.swing.JFrame {
    
    int mouseX, mouseY;
    
    dataProd producto = new dataProd();
    SQLdata datosSql = new SQLdata();
    
    
    public mainStore() {
        initComponents();
        carBuyACT.setVisible(false);
        
        //PRUEBA MONTO
        String valor = datosSql.monto(1);
        txtvalor01.setText(valor);
        
    }
    
    public static void Izq(JComponent componente, int milisegundos, int saltos, int parar) {
        (new Thread() {
            @Override
            public void run() {
                for (int i = componente.getWidth(); i >= parar; i -= saltos) {
                    try {
                        Thread.sleep(milisegundos);
                        componente.setPreferredSize(new Dimension(i, componente.getHeight()));
                        SwingUtilities.updateComponentTreeUI(componente);
                    } catch (InterruptedException e) {
                        System.out.println("Error Thread Interrumpido: " + e);
                    }
                }
            }
        }).start();
    }

    public static void Der(JComponent componente, int milisegundos, int saltos, int parar) {
        (new Thread() {
            @Override
            public void run() {
                for (int i = componente.getWidth(); i <= parar; i += saltos) {
                    try {
                        Thread.sleep(milisegundos);
                        componente.setPreferredSize(new Dimension(i, componente.getHeight()));
                        SwingUtilities.updateComponentTreeUI(componente);
                    } catch (InterruptedException e) {
                        System.out.println("Error Thread Interrumpido: " + e);
                    }
                }
            }
        }).start();
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        P_otros = new javax.swing.JPanel();
        lblOtros = new javax.swing.JLabel();
        P_tarjeta = new javax.swing.JPanel();
        lblTarjeta = new javax.swing.JLabel();
        P_laptop = new javax.swing.JPanel();
        lblLaptop = new javax.swing.JLabel();
        P_sonido = new javax.swing.JPanel();
        lblSonido = new javax.swing.JLabel();
        P_monitor = new javax.swing.JPanel();
        lblMonitor = new javax.swing.JLabel();
        P_audifono = new javax.swing.JPanel();
        lblAudifono = new javax.swing.JLabel();
        P_teclado = new javax.swing.JPanel();
        lblTeclado = new javax.swing.JLabel();
        P_mouse = new javax.swing.JPanel();
        lblMouse = new javax.swing.JLabel();
        lblContactos = new javax.swing.JLabel();
        lblCategorias = new javax.swing.JLabel();
        btnMin = new javax.swing.JLabel();
        btnClose = new javax.swing.JLabel();
        ContacIcon = new javax.swing.JLabel();
        lblCorreo = new javax.swing.JLabel();
        lblWsp2 = new javax.swing.JLabel();
        wsp2 = new javax.swing.JLabel();
        lblWsp1 = new javax.swing.JLabel();
        wsp1 = new javax.swing.JLabel();
        panel2 = new javax.swing.JLabel();
        panel1 = new javax.swing.JLabel();
        txtvalor2 = new javax.swing.JLabel();
        txtvalor01 = new javax.swing.JLabel();
        IconWhite6 = new javax.swing.JLabel();
        IconWhite2 = new javax.swing.JLabel();
        IconWhite1 = new javax.swing.JLabel();
        IconWhite5 = new javax.swing.JLabel();
        IconWhite3 = new javax.swing.JLabel();
        IconWhite7 = new javax.swing.JLabel();
        IconWhite4 = new javax.swing.JLabel();
        IconWhite8 = new javax.swing.JLabel();
        IconDark01 = new javax.swing.JLabel();
        IconDark2 = new javax.swing.JLabel();
        IconDark3 = new javax.swing.JLabel();
        IconDark4 = new javax.swing.JLabel();
        IconDark5 = new javax.swing.JLabel();
        IconDark6 = new javax.swing.JLabel();
        IconDark7 = new javax.swing.JLabel();
        IconDark8 = new javax.swing.JLabel();
        carBuy = new javax.swing.JLabel();
        carBuyACT = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        Profile = new javax.swing.JLabel();
        disconnectUser = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        searchIcon = new javax.swing.JLabel();
        searchBoar = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();
        background = new javax.swing.JLabel();
        block = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        P_otros.setBackground(new java.awt.Color(191, 216, 255));
        P_otros.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_otros.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                P_otrosMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                P_otrosMouseExited(evt);
            }
        });

        lblOtros.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblOtros.setForeground(new java.awt.Color(0, 51, 204));
        lblOtros.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOtros.setText("Otros...");
        P_otros.add(lblOtros);

        getContentPane().add(P_otros, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 180, 20));

        P_tarjeta.setBackground(new java.awt.Color(191, 216, 255));
        P_tarjeta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_tarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                P_tarjetaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                P_tarjetaMouseExited(evt);
            }
        });

        lblTarjeta.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblTarjeta.setForeground(new java.awt.Color(0, 51, 204));
        lblTarjeta.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTarjeta.setText("Tarjeta de Video");
        P_tarjeta.add(lblTarjeta);

        getContentPane().add(P_tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 180, 20));

        P_laptop.setBackground(new java.awt.Color(191, 216, 255));
        P_laptop.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_laptop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                P_laptopMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                P_laptopMouseExited(evt);
            }
        });

        lblLaptop.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblLaptop.setForeground(new java.awt.Color(0, 51, 204));
        lblLaptop.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLaptop.setText("Laptop");
        P_laptop.add(lblLaptop);

        getContentPane().add(P_laptop, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 180, 20));

        P_sonido.setBackground(new java.awt.Color(191, 216, 255));
        P_sonido.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_sonido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                P_sonidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                P_sonidoMouseExited(evt);
            }
        });

        lblSonido.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblSonido.setForeground(new java.awt.Color(0, 51, 204));
        lblSonido.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSonido.setText("Equipo de sonido");
        P_sonido.add(lblSonido);

        getContentPane().add(P_sonido, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 180, 20));

        P_monitor.setBackground(new java.awt.Color(191, 216, 255));
        P_monitor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_monitor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                P_monitorMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                P_monitorMouseExited(evt);
            }
        });

        lblMonitor.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblMonitor.setForeground(new java.awt.Color(0, 51, 204));
        lblMonitor.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMonitor.setText("Monitor");
        P_monitor.add(lblMonitor);

        getContentPane().add(P_monitor, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 180, 20));

        P_audifono.setBackground(new java.awt.Color(191, 216, 255));
        P_audifono.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_audifono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                P_audifonoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                P_audifonoMouseExited(evt);
            }
        });

        lblAudifono.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblAudifono.setForeground(new java.awt.Color(0, 51, 204));
        lblAudifono.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAudifono.setText("Audifono");
        P_audifono.add(lblAudifono);

        getContentPane().add(P_audifono, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 180, 20));

        P_teclado.setBackground(new java.awt.Color(191, 216, 255));
        P_teclado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_teclado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                P_tecladoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                P_tecladoMouseExited(evt);
            }
        });

        lblTeclado.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblTeclado.setForeground(new java.awt.Color(0, 51, 204));
        lblTeclado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTeclado.setText("Teclado");
        P_teclado.add(lblTeclado);

        getContentPane().add(P_teclado, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 180, 20));

        P_mouse.setBackground(new java.awt.Color(191, 216, 255));
        P_mouse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        P_mouse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                P_mouseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                P_mouseMouseExited(evt);
            }
        });

        lblMouse.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        lblMouse.setForeground(new java.awt.Color(0, 51, 204));
        lblMouse.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMouse.setText("Mouse");
        P_mouse.add(lblMouse);

        getContentPane().add(P_mouse, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 180, 20));

        lblContactos.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblContactos.setForeground(new java.awt.Color(255, 255, 255));
        lblContactos.setText("CONTACTOS");
        lblContactos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblContactos, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, 100, 30));

        lblCategorias.setFont(new java.awt.Font("Calibri", 1, 16)); // NOI18N
        lblCategorias.setForeground(new java.awt.Color(255, 255, 255));
        lblCategorias.setText("CATEGORIAS");
        lblCategorias.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(lblCategorias, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 100, 30));

        btnMin.setFont(new java.awt.Font("Arial Black", 0, 24)); // NOI18N
        btnMin.setForeground(new java.awt.Color(102, 153, 255));
        btnMin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnMin.setText("-");
        btnMin.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        btnMin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMinMouseExited(evt);
            }
        });
        getContentPane().add(btnMin, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 0, 40, 30));

        btnClose.setBackground(new java.awt.Color(0, 102, 255));
        btnClose.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        btnClose.setForeground(new java.awt.Color(102, 153, 255));
        btnClose.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnClose.setText("X");
        btnClose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCloseMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCloseMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCloseMouseExited(evt);
            }
        });
        getContentPane().add(btnClose, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 0, 40, 30));

        ContacIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/asesor.png"))); // NOI18N
        getContentPane().add(ContacIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 130, 100));

        lblCorreo.setFont(new java.awt.Font("Ebrima", 0, 10)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(0, 102, 204));
        lblCorreo.setText("gstore@gmail.com");
        getContentPane().add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, -1, -1));

        lblWsp2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblWsp2.setForeground(new java.awt.Color(0, 102, 255));
        lblWsp2.setText("981 356 053");
        lblWsp2.setToolTipText("");
        getContentPane().add(lblWsp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 500, -1, -1));

        wsp2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/wsp.png"))); // NOI18N
        getContentPane().add(wsp2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, 10, 10));

        lblWsp1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        lblWsp1.setForeground(new java.awt.Color(0, 102, 255));
        lblWsp1.setText("937 050 119");
        lblWsp1.setToolTipText("");
        getContentPane().add(lblWsp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 520, -1, -1));

        wsp1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/wsp.png"))); // NOI18N
        getContentPane().add(wsp1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 10, 10));

        panel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/panel.png"))); // NOI18N
        getContentPane().add(panel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, 190, 220));

        panel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/panel.png"))); // NOI18N
        getContentPane().add(panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 180, 220));

        txtvalor2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtvalor2.setForeground(new java.awt.Color(0, 0, 153));
        txtvalor2.setText("MONTO");
        getContentPane().add(txtvalor2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));

        txtvalor01.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        txtvalor01.setForeground(new java.awt.Color(0, 0, 153));
        txtvalor01.setText("MONTO");
        getContentPane().add(txtvalor01, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 280, -1, -1));

        IconWhite6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/ICONWHITE.png"))); // NOI18N
        IconWhite6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IconWhite6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IconWhite6MouseExited(evt);
            }
        });
        getContentPane().add(IconWhite6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 330, 160, 200));

        IconWhite2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/ICONWHITE.png"))); // NOI18N
        IconWhite2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IconWhite2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IconWhite2MouseExited(evt);
            }
        });
        getContentPane().add(IconWhite2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 160, 200));

        IconWhite1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/ICONWHITE.png"))); // NOI18N
        IconWhite1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IconWhite1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IconWhite1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IconWhite1MouseExited(evt);
            }
        });
        getContentPane().add(IconWhite1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, 160, 200));

        IconWhite5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/ICONWHITE.png"))); // NOI18N
        IconWhite5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IconWhite5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IconWhite5MouseExited(evt);
            }
        });
        getContentPane().add(IconWhite5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 330, 160, 200));

        IconWhite3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/ICONWHITE.png"))); // NOI18N
        IconWhite3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IconWhite3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IconWhite3MouseExited(evt);
            }
        });
        getContentPane().add(IconWhite3, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 110, 160, 200));

        IconWhite7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/ICONWHITE.png"))); // NOI18N
        IconWhite7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IconWhite7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IconWhite7MouseExited(evt);
            }
        });
        getContentPane().add(IconWhite7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 330, 160, 200));

        IconWhite4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/ICONWHITE.png"))); // NOI18N
        IconWhite4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IconWhite4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IconWhite4MouseExited(evt);
            }
        });
        getContentPane().add(IconWhite4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 110, 160, 200));

        IconWhite8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/ICONWHITE.png"))); // NOI18N
        IconWhite8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                IconWhite8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                IconWhite8MouseExited(evt);
            }
        });
        getContentPane().add(IconWhite8, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 330, 160, 200));

        IconDark01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/ICONDARK.png"))); // NOI18N
        getContentPane().add(IconDark01, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, 160, 200));

        IconDark2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/ICONDARK.png"))); // NOI18N
        getContentPane().add(IconDark2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, 160, 200));

        IconDark3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/ICONDARK.png"))); // NOI18N
        getContentPane().add(IconDark3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 120, 160, 200));

        IconDark4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/ICONDARK.png"))); // NOI18N
        getContentPane().add(IconDark4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 120, 160, 200));

        IconDark5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/ICONDARK.png"))); // NOI18N
        getContentPane().add(IconDark5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 340, 160, 200));

        IconDark6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/ICONDARK.png"))); // NOI18N
        getContentPane().add(IconDark6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 340, 160, 200));

        IconDark7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/ICONDARK.png"))); // NOI18N
        getContentPane().add(IconDark7, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 160, 200));

        IconDark8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/ICONDARK.png"))); // NOI18N
        getContentPane().add(IconDark8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 340, 160, 200));

        carBuy.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/carrito.png"))); // NOI18N
        getContentPane().add(carBuy, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 60, -1));

        carBuyACT.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/carritoRED.png"))); // NOI18N
        getContentPane().add(carBuyACT, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 30, 70, -1));

        lblUsername.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(82, 122, 255));
        lblUsername.setText("USERNAME");
        getContentPane().add(lblUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 40, 100, 30));

        Profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/profile.png"))); // NOI18N
        getContentPane().add(Profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 60, 70));

        disconnectUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/diconectUser.png"))); // NOI18N
        disconnectUser.setToolTipText("disconnect");
        disconnectUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(disconnectUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 70, -1, -1));

        txtSearch.setBackground(new java.awt.Color(236, 244, 255));
        txtSearch.setFont(new java.awt.Font("Corbel", 0, 14)); // NOI18N
        txtSearch.setForeground(new java.awt.Color(0, 153, 255));
        txtSearch.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtSearch.setBorder(null);
        txtSearch.setOpaque(false);
        getContentPane().add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 400, 20));

        searchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/searchIcon.png"))); // NOI18N
        searchIcon.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(searchIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 40, 40, 40));

        searchBoar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/searchBoar.png"))); // NOI18N
        getContentPane().add(searchBoar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, 40));

        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/logo.png"))); // NOI18N
        getContentPane().add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 170, 70));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/main/background.png"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 600));

        block.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gImg/login/block.png"))); // NOI18N
        block.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                blockMouseDragged(evt);
            }
        });
        block.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                blockMousePressed(evt);
            }
        });
        getContentPane().add(block, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMinMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseClicked
        this.setExtendedState(1); //ICONIFIED
    }//GEN-LAST:event_btnMinMouseClicked

    private void btnMinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseEntered
        btnMin.setForeground(Color.gray);
    }//GEN-LAST:event_btnMinMouseEntered

    private void btnMinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinMouseExited
        btnMin.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_btnMinMouseExited

    private void btnCloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseClicked
        System.exit(0);
    }//GEN-LAST:event_btnCloseMouseClicked

    private void btnCloseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseEntered
        btnClose.setForeground(Color.red);
    }//GEN-LAST:event_btnCloseMouseEntered

    private void btnCloseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCloseMouseExited
        btnClose.setForeground(new Color(102,153,255));
    }//GEN-LAST:event_btnCloseMouseExited

    private void blockMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blockMouseDragged
        int xx = evt.getXOnScreen();
        int yy = evt.getYOnScreen();

        this.setLocation(xx - mouseX, yy - mouseY);
    }//GEN-LAST:event_blockMouseDragged

    private void blockMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_blockMousePressed
        mouseX = evt.getX();
        mouseX = evt.getY();
    }//GEN-LAST:event_blockMousePressed

    private void P_mouseMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_mouseMouseEntered
        P_mouse.setBackground(new Color(121,164,232));
        lblMouse.setForeground(Color.white);
    }//GEN-LAST:event_P_mouseMouseEntered

    private void P_mouseMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_mouseMouseExited
        P_mouse.setBackground(new Color(191,216,255));
        lblMouse.setForeground(new Color(0,51,204));
    }//GEN-LAST:event_P_mouseMouseExited

    private void P_tecladoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_tecladoMouseEntered
        P_teclado.setBackground(new Color(121,164,232));
        lblTeclado.setForeground(Color.white);
    }//GEN-LAST:event_P_tecladoMouseEntered

    private void P_tecladoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_tecladoMouseExited
        P_teclado.setBackground(new Color(191,216,255));
        lblTeclado.setForeground(new Color(0,51,204));
    }//GEN-LAST:event_P_tecladoMouseExited

    private void P_audifonoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_audifonoMouseEntered
        P_audifono.setBackground(new Color(121,164,232));
        lblAudifono.setForeground(Color.white);
    }//GEN-LAST:event_P_audifonoMouseEntered

    private void P_audifonoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_audifonoMouseExited
        P_audifono.setBackground(new Color(191,216,255));
        lblAudifono.setForeground(new Color(0,51,204));
    }//GEN-LAST:event_P_audifonoMouseExited

    private void P_monitorMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_monitorMouseEntered
        P_monitor.setBackground(new Color(121,164,232));
        lblMonitor.setForeground(Color.white);
    }//GEN-LAST:event_P_monitorMouseEntered

    private void P_monitorMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_monitorMouseExited
        P_monitor.setBackground(new Color(191,216,255));
        lblMonitor.setForeground(new Color(0,51,204));
    }//GEN-LAST:event_P_monitorMouseExited

    private void P_tarjetaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_tarjetaMouseExited
        P_tarjeta.setBackground(new Color(191,216,255));
        lblTarjeta.setForeground(new Color(0,51,204));
    }//GEN-LAST:event_P_tarjetaMouseExited

    private void P_tarjetaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_tarjetaMouseEntered
        P_tarjeta.setBackground(new Color(121,164,232));
        lblTarjeta.setForeground(Color.white);
    }//GEN-LAST:event_P_tarjetaMouseEntered

    private void P_sonidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_sonidoMouseEntered
        P_sonido.setBackground(new Color(121,164,232));
        lblSonido.setForeground(Color.white);
    }//GEN-LAST:event_P_sonidoMouseEntered

    private void P_sonidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_sonidoMouseExited
        P_sonido.setBackground(new Color(191,216,255));
        lblSonido.setForeground(new Color(0,51,204));
    }//GEN-LAST:event_P_sonidoMouseExited

    private void P_laptopMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_laptopMouseEntered
        P_laptop.setBackground(new Color(121,164,232));
        lblLaptop.setForeground(Color.white);
    }//GEN-LAST:event_P_laptopMouseEntered

    private void P_laptopMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_laptopMouseExited
        P_laptop.setBackground(new Color(191,216,255));
        lblLaptop.setForeground(new Color(0,51,204));
    }//GEN-LAST:event_P_laptopMouseExited

    private void P_otrosMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_otrosMouseEntered
        P_otros.setBackground(new Color(121,164,232));
        lblOtros.setForeground(Color.white);
    }//GEN-LAST:event_P_otrosMouseEntered

    private void P_otrosMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_P_otrosMouseExited
        P_otros.setBackground(new Color(191,216,255));
        lblOtros.setForeground(new Color(0,51,204));
    }//GEN-LAST:event_P_otrosMouseExited

    private void IconWhite1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconWhite1MouseEntered
        IconWhite1.setLocation(230, 120);
        txtvalor01.setLocation(280, 290);
    }//GEN-LAST:event_IconWhite1MouseEntered

    private void IconWhite1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconWhite1MouseExited
        IconWhite1.setLocation(240, 110);
        txtvalor01.setLocation(290, 280);
    }//GEN-LAST:event_IconWhite1MouseExited

    private void IconWhite2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconWhite2MouseEntered
        IconWhite2.setLocation(420, 120);
        txtvalor2.setLocation(470, 290);
    }//GEN-LAST:event_IconWhite2MouseEntered

    private void IconWhite2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconWhite2MouseExited
        IconWhite2.setLocation(430, 110);
        txtvalor2.setLocation(480, 280);
    }//GEN-LAST:event_IconWhite2MouseExited

    private void IconWhite3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconWhite3MouseEntered
        IconWhite3.setLocation(610, 120);
    }//GEN-LAST:event_IconWhite3MouseEntered

    private void IconWhite3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconWhite3MouseExited
        IconWhite3.setLocation(620, 110);
    }//GEN-LAST:event_IconWhite3MouseExited

    private void IconWhite4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconWhite4MouseEntered
        IconWhite4.setLocation(800, 120);
    }//GEN-LAST:event_IconWhite4MouseEntered

    private void IconWhite4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconWhite4MouseExited
        IconWhite4.setLocation(810, 110);
    }//GEN-LAST:event_IconWhite4MouseExited

    private void IconWhite5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconWhite5MouseEntered
        IconWhite5.setLocation(230, 340);
    }//GEN-LAST:event_IconWhite5MouseEntered

    private void IconWhite5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconWhite5MouseExited
        IconWhite5.setLocation(240, 330);
    }//GEN-LAST:event_IconWhite5MouseExited

    private void IconWhite6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconWhite6MouseEntered
        IconWhite6.setLocation(420, 340);
    }//GEN-LAST:event_IconWhite6MouseEntered

    private void IconWhite6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconWhite6MouseExited
        IconWhite6.setLocation(430, 330);
    }//GEN-LAST:event_IconWhite6MouseExited

    private void IconWhite7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconWhite7MouseEntered
        IconWhite7.setLocation(610, 340);
    }//GEN-LAST:event_IconWhite7MouseEntered

    private void IconWhite7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconWhite7MouseExited
        IconWhite7.setLocation(620, 330);
    }//GEN-LAST:event_IconWhite7MouseExited

    private void IconWhite8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconWhite8MouseEntered
        IconWhite8.setLocation(800, 340);
    }//GEN-LAST:event_IconWhite8MouseEntered

    private void IconWhite8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconWhite8MouseExited
        IconWhite8.setLocation(810, 330);
    }//GEN-LAST:event_IconWhite8MouseExited

    private void IconWhite1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IconWhite1MouseClicked
        producto.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_IconWhite1MouseClicked

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
            java.util.logging.Logger.getLogger(mainStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainStore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainStore().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ContacIcon;
    private javax.swing.JLabel IconDark01;
    private javax.swing.JLabel IconDark2;
    private javax.swing.JLabel IconDark3;
    private javax.swing.JLabel IconDark4;
    private javax.swing.JLabel IconDark5;
    private javax.swing.JLabel IconDark6;
    private javax.swing.JLabel IconDark7;
    private javax.swing.JLabel IconDark8;
    private javax.swing.JLabel IconWhite1;
    private javax.swing.JLabel IconWhite2;
    private javax.swing.JLabel IconWhite3;
    private javax.swing.JLabel IconWhite4;
    private javax.swing.JLabel IconWhite5;
    private javax.swing.JLabel IconWhite6;
    private javax.swing.JLabel IconWhite7;
    private javax.swing.JLabel IconWhite8;
    private javax.swing.JPanel P_audifono;
    private javax.swing.JPanel P_laptop;
    private javax.swing.JPanel P_monitor;
    private javax.swing.JPanel P_mouse;
    private javax.swing.JPanel P_otros;
    private javax.swing.JPanel P_sonido;
    private javax.swing.JPanel P_tarjeta;
    private javax.swing.JPanel P_teclado;
    private javax.swing.JLabel Profile;
    private javax.swing.JLabel background;
    private javax.swing.JLabel block;
    private javax.swing.JLabel btnClose;
    private javax.swing.JLabel btnMin;
    private javax.swing.JLabel carBuy;
    private javax.swing.JLabel carBuyACT;
    private javax.swing.JLabel disconnectUser;
    private javax.swing.JLabel lblAudifono;
    private javax.swing.JLabel lblCategorias;
    private javax.swing.JLabel lblContactos;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblLaptop;
    private javax.swing.JLabel lblMonitor;
    private javax.swing.JLabel lblMouse;
    private javax.swing.JLabel lblOtros;
    private javax.swing.JLabel lblSonido;
    private javax.swing.JLabel lblTarjeta;
    private javax.swing.JLabel lblTeclado;
    public javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWsp1;
    private javax.swing.JLabel lblWsp2;
    private javax.swing.JLabel logo;
    private javax.swing.JLabel panel1;
    private javax.swing.JLabel panel2;
    private javax.swing.JLabel searchBoar;
    private javax.swing.JLabel searchIcon;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JLabel txtvalor01;
    private javax.swing.JLabel txtvalor2;
    private javax.swing.JLabel wsp1;
    private javax.swing.JLabel wsp2;
    // End of variables declaration//GEN-END:variables
}
