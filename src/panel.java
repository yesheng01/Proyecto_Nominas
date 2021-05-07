import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Tue May 04 20:47:46 CEST 2021
 */

/**
 * @author unknown
 */
public class panel extends JFrame{
    public panel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
        ventanaMain = new JPanel();
        titulo = new JLabel();
        nombre = new JLabel();
        apellidos = new JLabel();
        email = new JLabel();
        direccion = new JLabel();
        fi_dia = new JLabel();
        fi_mes = new JLabel();
        fi_año = new JLabel();
        fi_dia_tf = new JTextField();
        fi_mes_tf = new JTextField();
        fi_año_tf = new JTextField();
        dni_nif = new JLabel();
        dni_nif_r = new JComboBox();
        nombre_tf = new JTextField();
        apellidos_tf = new JTextField();
        email_tf = new JTextField();
        direccion_tf = new JTextField();
        ar_button = new JButton();
        separator = new JLabel();
        hefm = new JLabel();
        her = new JLabel();
        hc = new JLabel();
        hefm_tf = new JTextField();
        her_tf = new JTextField();
        hc_tf = new JTextField();
        gn_button = new JButton();
        ff_dia = new JLabel();
        ff_mes = new JLabel();
        ff_año = new JLabel();
        ff_dia_tf = new JTextField();
        ff_mes_tf = new JTextField();
        ff_año_tf = new JTextField();
        fecha_inicio = new JLabel();
        fecha_final = new JLabel();
        logocide = new JLabel();
        ventanaNomina = new JPanel();
        titulo2 = new JLabel();
        logocide2 = new JLabel();
        id_nomina = new JLabel();
        panel1 = new JPanel();
        label2 = new JLabel();
        in_dni = new JLabel();
        label3 = new JLabel();
        in_nom = new JLabel();
        label4 = new JLabel();
        in_lape = new JLabel();
        label5 = new JLabel();
        in_gp = new JLabel();
        label6 = new JLabel();
        in_gc = new JLabel();
        panel2 = new JPanel();
        label7 = new JLabel();
        in_emp_nom = new JLabel();
        label8 = new JLabel();
        in_dom = new JLabel();
        label9 = new JLabel();
        in_loc = new JLabel();
        label10 = new JLabel();
        in_cif = new JLabel();
        label11 = new JLabel();
        in_ccc = new JLabel();
        panel3 = new JPanel();
        periodo = new JLabel();
        del = new JLabel();
        dia_inicio = new JLabel();
        mes_inicio = new JLabel();
        año__inicio = new JLabel();
        al = new JLabel();
        dia_final = new JLabel();
        mes__final = new JLabel();
        año__final = new JLabel();
        total_dias = new JLabel();
        total_dias_num = new JLabel();
        id_nomina_num = new JLabel();
        panel4 = new JPanel();
        label1 = new JLabel();
        label21 = new JLabel();
        label12 = new JLabel();
        label35 = new JLabel();
        label13 = new JLabel();
        label36 = new JLabel();
        label14 = new JLabel();
        label37 = new JLabel();
        label15 = new JLabel();
        label38 = new JLabel();
        label34 = new JLabel();
        label39 = new JLabel();
        panel5 = new JPanel();
        label16 = new JLabel();
        label23 = new JLabel();
        label28 = new JLabel();
        label17 = new JLabel();
        label24 = new JLabel();
        label29 = new JLabel();
        label18 = new JLabel();
        label25 = new JLabel();
        label30 = new JLabel();
        label19 = new JLabel();
        label26 = new JLabel();
        label31 = new JLabel();
        label20 = new JLabel();
        label27 = new JLabel();
        panel6 = new JPanel();
        label22 = new JLabel();
        label32 = new JLabel();
        label33 = new JLabel();
        button1 = new JButton();
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();

        //======== ventanaMain ========
        {
            ventanaMain.setDoubleBuffered(false);
            ventanaMain.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing. border
            . EmptyBorder( 0, 0, 0, 0) , "JF\u006frmDesi\u0067ner Ev\u0061luatio\u006e", javax. swing. border. TitledBorder. CENTER, javax
            . swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dialo\u0067" ,java .awt .Font .BOLD ,
            12 ), java. awt. Color. red) ,ventanaMain. getBorder( )) ); ventanaMain. addPropertyChangeListener (new java. beans
            . PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e) {if ("borde\u0072" .equals (e .
            getPropertyName () )) throw new RuntimeException( ); }} );

            //---- titulo ----
            titulo.setText("NOMINABALEARS");
            titulo.setFont(titulo.getFont().deriveFont(titulo.getFont().getStyle() | Font.ITALIC, titulo.getFont().getSize() + 10f));

            //---- nombre ----
            nombre.setText("Nombre: ");

            //---- apellidos ----
            apellidos.setText("Apellidos: ");

            //---- email ----
            email.setText("E-Mail: ");

            //---- direccion ----
            direccion.setText("Direcci\u00f3n: ");

            //---- fi_dia ----
            fi_dia.setText("Dia: ");

            //---- fi_mes ----
            fi_mes.setText("Mes: ");

            //---- fi_año ----
            fi_año.setText("A\u00f1o: ");

            //---- dni_nif ----
            dni_nif.setText("DNI o NIF:");

            //---- ar_button ----
            ar_button.setText("Auto Rellenar");

            //---- separator ----
            separator.setText("......................................................................................................................................................................................................");

            //---- hefm ----
            hefm.setText("Horas Extra Fuerza Mayor: ");

            //---- her ----
            her.setText("Horas Extra Resto:");

            //---- hc ----
            hc.setText("Horas Complementarias: ");

            //---- gn_button ----
            gn_button.setText("Generar Nomina");

            //---- ff_dia ----
            ff_dia.setText("Dia: ");

            //---- ff_mes ----
            ff_mes.setText("Mes: ");

            //---- ff_año ----
            ff_año.setText("A\u00f1o: ");

            //---- fecha_inicio ----
            fecha_inicio.setText("Fecha Inicio: ");

            //---- fecha_final ----
            fecha_final.setText("Fecha Final: ");

            //---- logocide ----
            logocide.setIcon(new ImageIcon(getClass().getResource("/recursos/logomaspeque.png")));

            GroupLayout ventanaMainLayout = new GroupLayout(ventanaMain);
            ventanaMain.setLayout(ventanaMainLayout);
            ventanaMainLayout.setHorizontalGroup(
                ventanaMainLayout.createParallelGroup()
                    .addGroup(ventanaMainLayout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addComponent(ar_button, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 210, Short.MAX_VALUE))
                    .addGroup(ventanaMainLayout.createSequentialGroup()
                        .addGroup(ventanaMainLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, ventanaMainLayout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addGroup(ventanaMainLayout.createParallelGroup()
                                    .addComponent(fecha_inicio)
                                    .addComponent(fecha_final))
                                .addGroup(ventanaMainLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(ventanaMainLayout.createSequentialGroup()
                                        .addComponent(ff_dia)
                                        .addGap(1, 1, 1)
                                        .addComponent(ff_dia_tf, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ff_mes)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ff_mes_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ff_año)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ff_año_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(ventanaMainLayout.createSequentialGroup()
                                        .addComponent(fi_dia)
                                        .addGap(1, 1, 1)
                                        .addComponent(fi_dia_tf, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fi_mes)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fi_mes_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fi_año)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(fi_año_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGap(111, 111, 111))
                            .addGroup(ventanaMainLayout.createSequentialGroup()
                                .addGap(258, 258, 258)
                                .addComponent(dni_nif))
                            .addGroup(ventanaMainLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(ventanaMainLayout.createParallelGroup()
                                    .addComponent(separator, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                                    .addGroup(GroupLayout.Alignment.TRAILING, ventanaMainLayout.createSequentialGroup()
                                        .addGroup(ventanaMainLayout.createParallelGroup()
                                            .addComponent(nombre, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(apellidos, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ventanaMainLayout.createParallelGroup()
                                            .addComponent(apellidos_tf, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(nombre_tf, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(ventanaMainLayout.createParallelGroup()
                                            .addGroup(ventanaMainLayout.createSequentialGroup()
                                                .addComponent(direccion, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 1, Short.MAX_VALUE))
                                            .addComponent(email, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ventanaMainLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                            .addComponent(email_tf, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                            .addComponent(direccion_tf, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                        .addGap(8, 8, 8))
                                    .addGroup(ventanaMainLayout.createSequentialGroup()
                                        .addComponent(logocide)
                                        .addGap(56, 56, 56)
                                        .addGroup(ventanaMainLayout.createParallelGroup()
                                            .addComponent(dni_nif_r, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(titulo))
                                        .addGap(0, 188, Short.MAX_VALUE)))))
                        .addContainerGap())
                    .addGroup(GroupLayout.Alignment.TRAILING, ventanaMainLayout.createSequentialGroup()
                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(ventanaMainLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, ventanaMainLayout.createSequentialGroup()
                                .addGroup(ventanaMainLayout.createParallelGroup()
                                    .addGroup(ventanaMainLayout.createSequentialGroup()
                                        .addGroup(ventanaMainLayout.createParallelGroup()
                                            .addComponent(hefm)
                                            .addComponent(her))
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(ventanaMainLayout.createParallelGroup()
                                            .addComponent(her_tf, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(hefm_tf, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(ventanaMainLayout.createSequentialGroup()
                                        .addComponent(hc)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(hc_tf, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)))
                                .addGap(134, 134, 134))
                            .addGroup(GroupLayout.Alignment.TRAILING, ventanaMainLayout.createSequentialGroup()
                                .addComponent(gn_button, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
                                .addGap(198, 198, 198))))
            );
            ventanaMainLayout.setVerticalGroup(
                ventanaMainLayout.createParallelGroup()
                    .addGroup(ventanaMainLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ventanaMainLayout.createParallelGroup()
                            .addGroup(ventanaMainLayout.createSequentialGroup()
                                .addComponent(logocide)
                                .addGap(21, 21, 21))
                            .addGroup(GroupLayout.Alignment.TRAILING, ventanaMainLayout.createSequentialGroup()
                                .addComponent(titulo)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                        .addComponent(dni_nif)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dni_nif_r, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ar_button)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addGroup(ventanaMainLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre)
                            .addComponent(nombre_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(email_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(email))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ventanaMainLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(apellidos)
                            .addComponent(apellidos_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(direccion)
                            .addComponent(direccion_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGroup(ventanaMainLayout.createParallelGroup()
                            .addGroup(ventanaMainLayout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(fecha_inicio))
                            .addGroup(ventanaMainLayout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ventanaMainLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(fi_dia)
                                    .addComponent(fi_dia_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fi_mes)
                                    .addComponent(fi_mes_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(fi_año)
                                    .addComponent(fi_año_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                .addGroup(ventanaMainLayout.createParallelGroup()
                                    .addGroup(ventanaMainLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(ff_dia_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ff_mes)
                                        .addComponent(ff_mes_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ff_año_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(ff_año))
                                    .addGroup(ventanaMainLayout.createSequentialGroup()
                                        .addGap(7, 7, 7)
                                        .addGroup(ventanaMainLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(ff_dia)
                                            .addComponent(fecha_final))))))
                        .addGap(18, 18, 18)
                        .addComponent(separator)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ventanaMainLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(hefm)
                            .addComponent(hefm_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(ventanaMainLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(her)
                            .addComponent(her_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(ventanaMainLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(hc)
                            .addComponent(hc_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(gn_button)
                        .addGap(12, 12, 12))
            );
        }

        //======== ventanaNomina ========
        {
            ventanaNomina.setDoubleBuffered(false);
            ventanaNomina.setBorder (new javax. swing. border. CompoundBorder( new javax .swing .border .TitledBorder (new javax. swing
            . border. EmptyBorder( 0, 0, 0, 0) , "JFor\u006dDesi\u0067ner \u0045valu\u0061tion", javax. swing. border. TitledBorder
            . CENTER, javax. swing. border. TitledBorder. BOTTOM, new java .awt .Font ("Dia\u006cog" ,java .
            awt .Font .BOLD ,12 ), java. awt. Color. red) ,ventanaNomina. getBorder( )) )
            ; ventanaNomina. addPropertyChangeListener (new java. beans. PropertyChangeListener( ){ @Override public void propertyChange (java .beans .PropertyChangeEvent e
            ) {if ("bord\u0065r" .equals (e .getPropertyName () )) throw new RuntimeException( ); }} )
            ;

            //---- titulo2 ----
            titulo2.setText("NOMINABALEARS");
            titulo2.setFont(titulo2.getFont().deriveFont(titulo2.getFont().getStyle() | Font.ITALIC, titulo2.getFont().getSize() + 10f));

            //---- logocide2 ----
            logocide2.setIcon(new ImageIcon(getClass().getResource("/recursos/logomaspeque.png")));

            //---- id_nomina ----
            id_nomina.setText("ID Nomina: ");

            //======== panel1 ========
            {
                panel1.setBorder(new TitledBorder(null, "Empleado", TitledBorder.CENTER, TitledBorder.TOP));
                panel1.setLayout(new MigLayout(
                    "fillx,hidemode 3",
                    // columns
                    "[fill]" +
                    "[fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]"));

                //---- label2 ----
                label2.setText("DNI:");
                panel1.add(label2, "cell 0 0");

                //---- in_dni ----
                in_dni.setText("instert1");
                panel1.add(in_dni, "cell 1 0");

                //---- label3 ----
                label3.setText("Nombre: ");
                panel1.add(label3, "cell 0 1");

                //---- in_nom ----
                in_nom.setText("instert2");
                panel1.add(in_nom, "cell 1 1");

                //---- label4 ----
                label4.setText("Apellidos: ");
                panel1.add(label4, "cell 0 2");

                //---- in_lape ----
                in_lape.setText("instert3");
                panel1.add(in_lape, "cell 1 2");

                //---- label5 ----
                label5.setText("Grupo Profesional: ");
                panel1.add(label5, "cell 0 3");

                //---- in_gp ----
                in_gp.setText("instert4");
                panel1.add(in_gp, "cell 1 3");

                //---- label6 ----
                label6.setText("Grupo de Cotizaci\u00f3n");
                panel1.add(label6, "cell 0 4");

                //---- in_gc ----
                in_gc.setText("instert5");
                panel1.add(in_gc, "cell 1 4");
            }

            //======== panel2 ========
            {
                panel2.setBorder(new TitledBorder(null, "Empresa", TitledBorder.CENTER, TitledBorder.TOP));
                panel2.setLayout(new MigLayout(
                    "fillx,hidemode 3",
                    // columns
                    "[fill]" +
                    "[fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]"));

                //---- label7 ----
                label7.setText("Nombre: ");
                panel2.add(label7, "cell 0 0");

                //---- in_emp_nom ----
                in_emp_nom.setText("instert1");
                panel2.add(in_emp_nom, "cell 1 0");

                //---- label8 ----
                label8.setText("Domicilio: ");
                panel2.add(label8, "cell 0 1");

                //---- in_dom ----
                in_dom.setText("instert2");
                panel2.add(in_dom, "cell 1 1");

                //---- label9 ----
                label9.setText("Localidad: ");
                panel2.add(label9, "cell 0 2");

                //---- in_loc ----
                in_loc.setText("instert3");
                panel2.add(in_loc, "cell 1 2");

                //---- label10 ----
                label10.setText("CIF: ");
                panel2.add(label10, "cell 0 3");

                //---- in_cif ----
                in_cif.setText("instert4");
                panel2.add(in_cif, "cell 1 3");

                //---- label11 ----
                label11.setText("CCC de la SS: ");
                panel2.add(label11, "cell 0 4");

                //---- in_ccc ----
                in_ccc.setText("instert5");
                panel2.add(in_ccc, "cell 1 4");
            }

            //======== panel3 ========
            {
                panel3.setBorder(new BevelBorder(BevelBorder.LOWERED));
                panel3.setLayout(new MigLayout(
                    "fillx,hidemode 3",
                    // columns
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]" +
                    "[fill]",
                    // rows
                    "[]"));

                //---- periodo ----
                periodo.setText("Periodo de Liquidaci\u00f3n: ");
                panel3.add(periodo, "cell 0 0");

                //---- del ----
                del.setText("del");
                panel3.add(del, "cell 2 0");

                //---- dia_inicio ----
                dia_inicio.setText("00");
                panel3.add(dia_inicio, "cell 4 0");

                //---- mes_inicio ----
                mes_inicio.setText("00");
                panel3.add(mes_inicio, "cell 5 0");

                //---- año__inicio ----
                año__inicio.setText("0000");
                panel3.add(año__inicio, "cell 6 0");

                //---- al ----
                al.setText("al");
                panel3.add(al, "cell 8 0");

                //---- dia_final ----
                dia_final.setText("00");
                panel3.add(dia_final, "cell 10 0");

                //---- mes__final ----
                mes__final.setText("00");
                panel3.add(mes__final, "cell 11 0");

                //---- año__final ----
                año__final.setText("0000");
                panel3.add(año__final, "cell 12 0");

                //---- total_dias ----
                total_dias.setText("Total de dias: ");
                panel3.add(total_dias, "cell 13 0");

                //---- total_dias_num ----
                total_dias_num.setText("00");
                panel3.add(total_dias_num, "cell 14 0");
            }

            //---- id_nomina_num ----
            id_nomina_num.setText("00000000000000");

            //======== panel4 ========
            {
                panel4.setLayout(new MigLayout(
                    "fillx,hidemode 3",
                    // columns
                    "[]" +
                    "[fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]"));

                //---- label1 ----
                label1.setText("Salario Base:");
                panel4.add(label1, "cell 0 0");

                //---- label21 ----
                label21.setText("0000.00");
                panel4.add(label21, "cell 1 0");

                //---- label12 ----
                label12.setText("Horas Extra Fuerza Mayor: ");
                panel4.add(label12, "cell 0 1");

                //---- label35 ----
                label35.setText("000");
                panel4.add(label35, "cell 1 1");

                //---- label13 ----
                label13.setText("Horas Extra Resto:");
                panel4.add(label13, "cell 0 2");

                //---- label36 ----
                label36.setText("000");
                panel4.add(label36, "cell 1 2");

                //---- label14 ----
                label14.setText("Horas Complementarias: ");
                panel4.add(label14, "cell 0 3");

                //---- label37 ----
                label37.setText("000");
                panel4.add(label37, "cell 1 3");

                //---- label15 ----
                label15.setText("Antiguedad: ");
                panel4.add(label15, "cell 0 4");

                //---- label38 ----
                label38.setText("000");
                panel4.add(label38, "cell 1 4");

                //---- label34 ----
                label34.setText("TOTAL DEVENGADO: ");
                panel4.add(label34, "cell 0 5");

                //---- label39 ----
                label39.setText("0000.00");
                panel4.add(label39, "cell 1 5");
            }

            //======== panel5 ========
            {
                panel5.setLayout(new MigLayout(
                    "fillx,hidemode 3",
                    // columns
                    "[]" +
                    "[fill]" +
                    "[fill]",
                    // rows
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]" +
                    "[]"));

                //---- label16 ----
                label16.setText("Contingencias comunes: ");
                panel5.add(label16, "cell 0 0");

                //---- label23 ----
                label23.setText("porcentaje");
                panel5.add(label23, "cell 1 0");

                //---- label28 ----
                label28.setText("euros");
                panel5.add(label28, "cell 2 0");

                //---- label17 ----
                label17.setText("Formaci\u00f3n Profesional: ");
                panel5.add(label17, "cell 0 1");

                //---- label24 ----
                label24.setText("porcentaje");
                panel5.add(label24, "cell 1 1");

                //---- label29 ----
                label29.setText("euros");
                panel5.add(label29, "cell 2 1");

                //---- label18 ----
                label18.setText("IRPF: ");
                panel5.add(label18, "cell 0 2");

                //---- label25 ----
                label25.setText("porcenaje");
                panel5.add(label25, "cell 1 2");

                //---- label30 ----
                label30.setText("euros");
                panel5.add(label30, "cell 2 2");

                //---- label19 ----
                label19.setText("Anticipos: ");
                panel5.add(label19, "cell 0 3");

                //---- label26 ----
                label26.setText("porcentaje");
                panel5.add(label26, "cell 1 3");

                //---- label31 ----
                label31.setText("euros");
                panel5.add(label31, "cell 2 3");

                //---- label20 ----
                label20.setText("TOTAL A DEDUCIR: ");
                panel5.add(label20, "cell 0 4");

                //---- label27 ----
                label27.setText("0000");
                panel5.add(label27, "cell 1 4");
            }

            //======== panel6 ========
            {
                panel6.setLayout(new MigLayout(
                    "fillx,hidemode 3",
                    // columns
                    "[fill]" +
                    "[fill]" +
                    "[fill]",
                    // rows
                    "[38]"));

                //---- label22 ----
                label22.setText("LIQUIDO TOTAL A PERCIBIR: ");
                panel6.add(label22, "cell 0 0");

                //---- label32 ----
                label32.setText("0000.00");
                panel6.add(label32, "cell 1 0");

                //---- label33 ----
                label33.setText("\u20ac");
                panel6.add(label33, "cell 2 0");
            }

            //---- button1 ----
            button1.setText("Generar PDF");

            //---- button2 ----
            button2.setText("Generar CSV");

            //---- button3 ----
            button3.setText("Generar XML");

            //---- button4 ----
            button4.setText("EXIT");

            GroupLayout ventanaNominaLayout = new GroupLayout(ventanaNomina);
            ventanaNomina.setLayout(ventanaNominaLayout);
            ventanaNominaLayout.setHorizontalGroup(
                ventanaNominaLayout.createParallelGroup()
                    .addGroup(ventanaNominaLayout.createSequentialGroup()
                        .addGroup(ventanaNominaLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, ventanaNominaLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(button4))
                            .addGroup(ventanaNominaLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(logocide2)
                                .addGap(56, 56, 56)
                                .addComponent(titulo2)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(ventanaNominaLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(ventanaNominaLayout.createParallelGroup()
                                    .addComponent(panel3, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(ventanaNominaLayout.createSequentialGroup()
                                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, 276, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(panel2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(ventanaNominaLayout.createSequentialGroup()
                                        .addComponent(id_nomina)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(id_nomina_num)))))
                        .addContainerGap())
                    .addGroup(GroupLayout.Alignment.TRAILING, ventanaNominaLayout.createSequentialGroup()
                        .addGap(0, 94, Short.MAX_VALUE)
                        .addGroup(ventanaNominaLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                            .addComponent(button2, GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                            .addComponent(button1, GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
                            .addComponent(button3, GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE))
                        .addGap(91, 91, 91))
                    .addGroup(ventanaNominaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ventanaNominaLayout.createParallelGroup()
                            .addComponent(panel6, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(ventanaNominaLayout.createSequentialGroup()
                                .addComponent(panel5, GroupLayout.PREFERRED_SIZE, 552, GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 6, Short.MAX_VALUE))
                            .addComponent(panel4, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
            );
            ventanaNominaLayout.setVerticalGroup(
                ventanaNominaLayout.createParallelGroup()
                    .addGroup(ventanaNominaLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(ventanaNominaLayout.createParallelGroup()
                            .addComponent(logocide2)
                            .addComponent(titulo2))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                        .addGroup(ventanaNominaLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                            .addComponent(id_nomina)
                            .addComponent(id_nomina_num))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(ventanaNominaLayout.createParallelGroup()
                            .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(panel2, GroupLayout.PREFERRED_SIZE, 145, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel4, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panel5, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(panel6, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(button1, GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button2)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button3)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(button4)
                        .addContainerGap())
            );
        }
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
    private JPanel ventanaMain;
    private JLabel titulo;
    private JLabel nombre;
    private JLabel apellidos;
    private JLabel email;
    private JLabel direccion;
    private JLabel fi_dia;
    private JLabel fi_mes;
    private JLabel fi_año;
    private JTextField fi_dia_tf;
    private JTextField fi_mes_tf;
    private JTextField fi_año_tf;
    private JLabel dni_nif;
    private JComboBox dni_nif_r;
    private JTextField nombre_tf;
    private JTextField apellidos_tf;
    private JTextField email_tf;
    private JTextField direccion_tf;
    private JButton ar_button;
    private JLabel separator;
    private JLabel hefm;
    private JLabel her;
    private JLabel hc;
    private JTextField hefm_tf;
    private JTextField her_tf;
    private JTextField hc_tf;
    private JButton gn_button;
    private JLabel ff_dia;
    private JLabel ff_mes;
    private JLabel ff_año;
    private JTextField ff_dia_tf;
    private JTextField ff_mes_tf;
    private JTextField ff_año_tf;
    private JLabel fecha_inicio;
    private JLabel fecha_final;
    private JLabel logocide;
    private JPanel ventanaNomina;
    private JLabel titulo2;
    private JLabel logocide2;
    private JLabel id_nomina;
    private JPanel panel1;
    private JLabel label2;
    private JLabel in_dni;
    private JLabel label3;
    private JLabel in_nom;
    private JLabel label4;
    private JLabel in_lape;
    private JLabel label5;
    private JLabel in_gp;
    private JLabel label6;
    private JLabel in_gc;
    private JPanel panel2;
    private JLabel label7;
    private JLabel in_emp_nom;
    private JLabel label8;
    private JLabel in_dom;
    private JLabel label9;
    private JLabel in_loc;
    private JLabel label10;
    private JLabel in_cif;
    private JLabel label11;
    private JLabel in_ccc;
    private JPanel panel3;
    private JLabel periodo;
    private JLabel del;
    private JLabel dia_inicio;
    private JLabel mes_inicio;
    private JLabel año__inicio;
    private JLabel al;
    private JLabel dia_final;
    private JLabel mes__final;
    private JLabel año__final;
    private JLabel total_dias;
    private JLabel total_dias_num;
    private JLabel id_nomina_num;
    private JPanel panel4;
    private JLabel label1;
    private JLabel label21;
    private JLabel label12;
    private JLabel label35;
    private JLabel label13;
    private JLabel label36;
    private JLabel label14;
    private JLabel label37;
    private JLabel label15;
    private JLabel label38;
    private JLabel label34;
    private JLabel label39;
    private JPanel panel5;
    private JLabel label16;
    private JLabel label23;
    private JLabel label28;
    private JLabel label17;
    private JLabel label24;
    private JLabel label29;
    private JLabel label18;
    private JLabel label25;
    private JLabel label30;
    private JLabel label19;
    private JLabel label26;
    private JLabel label31;
    private JLabel label20;
    private JLabel label27;
    private JPanel panel6;
    private JLabel label22;
    private JLabel label32;
    private JLabel label33;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
