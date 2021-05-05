import java.awt.*;
import java.awt.image.*;
import javax.imageio.*;
import javax.swing.*;
import javax.swing.GroupLayout;
import net.miginfocom.swing.*;
/*
 * Created by JFormDesigner on Tue May 04 20:47:46 CEST 2021
 */



/**
 * @author unknown
 */
public class panel extends JPanel {
    public panel() {
        initComponents();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - unknown
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

        //======== this ========
        setDoubleBuffered(false);
        setBorder ( new javax . swing. border .CompoundBorder ( new javax . swing. border .TitledBorder ( new javax . swing. border .EmptyBorder
        ( 0, 0 ,0 , 0) ,  "JFor\u006dDesi\u0067ner \u0045valu\u0061tion" , javax. swing .border . TitledBorder. CENTER ,javax . swing. border
        .TitledBorder . BOTTOM, new java. awt .Font ( "Dia\u006cog", java .awt . Font. BOLD ,12 ) ,java . awt
        . Color .red ) , getBorder () ) );  addPropertyChangeListener( new java. beans .PropertyChangeListener ( ){ @Override public void
        propertyChange (java . beans. PropertyChangeEvent e) { if( "bord\u0065r" .equals ( e. getPropertyName () ) )throw new RuntimeException( )
        ;} } );

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

        GroupLayout layout = new GroupLayout(this);
        setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addGap(211, 211, 211)
                    .addComponent(ar_button, GroupLayout.PREFERRED_SIZE, 149, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 210, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(123, 123, 123)
                            .addGroup(layout.createParallelGroup()
                                .addComponent(fecha_inicio)
                                .addComponent(fecha_final))
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
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
                                .addGroup(layout.createSequentialGroup()
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
                        .addGroup(layout.createSequentialGroup()
                            .addGap(258, 258, 258)
                            .addComponent(dni_nif))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup()
                                .addComponent(separator, GroupLayout.Alignment.TRAILING, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup()
                                        .addComponent(nombre, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(apellidos, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup()
                                        .addComponent(apellidos_tf, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(nombre_tf, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup()
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(direccion, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE)
                                            .addGap(0, 1, Short.MAX_VALUE))
                                        .addComponent(email, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                        .addComponent(email_tf, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                                        .addComponent(direccion_tf, GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE))
                                    .addGap(8, 8, 8))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(logocide)
                                    .addGap(56, 56, 56)
                                    .addGroup(layout.createParallelGroup()
                                        .addComponent(dni_nif_r, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(titulo))
                                    .addGap(0, 188, Short.MAX_VALUE)))))
                    .addContainerGap())
                .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup()
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup()
                                        .addComponent(hefm)
                                        .addComponent(her))
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup()
                                        .addComponent(her_tf, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(hefm_tf, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(hc)
                                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(hc_tf, GroupLayout.PREFERRED_SIZE, 151, GroupLayout.PREFERRED_SIZE)))
                            .addGap(134, 134, 134))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(gn_button, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE)
                            .addGap(198, 198, 198))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup()
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(logocide)
                            .addGap(21, 21, 21))
                        .addGroup(GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(titulo)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)))
                    .addComponent(dni_nif)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(dni_nif_r, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(ar_button)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(nombre)
                        .addComponent(nombre_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(email_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(email))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(apellidos)
                        .addComponent(apellidos_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addComponent(direccion)
                        .addComponent(direccion_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup()
                        .addGroup(layout.createSequentialGroup()
                            .addGap(13, 13, 13)
                            .addComponent(fecha_inicio))
                        .addGroup(layout.createSequentialGroup()
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(fi_dia)
                                .addComponent(fi_dia_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(fi_mes)
                                .addComponent(fi_mes_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(fi_año)
                                .addComponent(fi_año_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup()
                                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(ff_dia_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ff_mes)
                                    .addComponent(ff_mes_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ff_año_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ff_año))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(7, 7, 7)
                                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(ff_dia)
                                        .addComponent(fecha_final))))))
                    .addGap(18, 18, 18)
                    .addComponent(separator)
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(hefm)
                        .addComponent(hefm_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addGap(12, 12, 12)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(her)
                        .addComponent(her_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                        .addComponent(hc)
                        .addComponent(hc_tf, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(gn_button)
                    .addGap(12, 12, 12))
        );
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - unknown
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
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
