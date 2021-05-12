import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Engine {
    Connection conn;

    public Engine() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conn = DriverManager.getConnection("jdbc:mysql://bq7xcggx4wgir1svxet5-mysql.services.clever-cloud.com:3306/bq7xcggx4wgir1svxet5", "ucaywecixura7e1v", "z20eE9b0KKtixeD35nHS");
    }

    public void tancar() throws Exception {
        conn.close();
    }

    public ArrayList<String> dnis() throws SQLException {
        ArrayList<String> alldni = new ArrayList<String>();
        String dni;
        Statement dnis = conn.createStatement();
        ResultSet resultQuery = dnis.executeQuery("SELECT dni FROM empleados");
        while (resultQuery.next()) {
            dni = resultQuery.getString("dni");
            alldni.add(dni);
        }
        return alldni;
    }
    public List<Empleado> getEmpleadoByDni(String dni) throws SQLException {
        List<Empleado> results = null;
        Statement getFDni = conn.createStatement();
        try {
            ResultSet resultSet = getFDni.executeQuery("SELECT * FROM empleados WHERE dni='" + dni + "'");
            results = new ArrayList<Empleado>();
            while (resultSet.next()) {
                results.add(new Empleado(
                        resultSet.getInt("id"),
                        resultSet.getString("dni"),
                        resultSet.getString("nombre"),
                        resultSet.getString("apellidos"),
                        resultSet.getString("mail"),
                        resultSet.getString("direccion"),
                        resultSet.getInt("id_convenio")));
            }
        }catch (SQLException sqlException){
            sqlException.printStackTrace();
        }
        return results;
    }
    public List<Nomina> getLastNomina(int idNom) throws Exception {
        List<Nomina> results = null;
        if (idNom == 0){
            tancar();
        }else {

            Statement getNomById = conn.createStatement();
            try {
                ResultSet resultSet = getNomById.executeQuery("SELECT * FROM historial_nominas WHERE id='" + idNom + "'");
                results = new ArrayList<Nomina>();
                while (resultSet.next()) {
                    results.add(new Nomina(
                            resultSet.getInt("id"),
                            resultSet.getString("dni_empleado"),
                            resultSet.getString("nombre"),
                            resultSet.getString("apellidos"),
                            resultSet.getString("grupo_profesional"),
                            resultSet.getInt("grupo_cotzacion"),
                            resultSet.getString("num_ss_empleado"),
                            resultSet.getDouble("irpf"),
                            resultSet.getString("nombre_empresa"),
                            resultSet.getString("cif"),
                            resultSet.getString("domicilio"),
                            resultSet.getInt("ccc_de_ss"),
                            resultSet.getString("localidad"),
                            resultSet.getDate("fecha_inicio_nomina"),
                            resultSet.getDate("fecha_final_nomina"),
                            resultSet.getInt("total_dias"),
                            resultSet.getDouble("salario_bruto"),
                            resultSet.getDouble("horas_extra_fm"),
                            resultSet.getDouble("horas_extra_resto"),
                            resultSet.getDouble("horas_complemetarias"),
                            resultSet.getDouble("contingencias_comunes"),
                            resultSet.getDouble("total_devengo"),
                            resultSet.getDouble("total_a_deducir"),
                            resultSet.getDouble("total_a_percibir"),
                            resultSet.getDouble("antiguedad"),
                            resultSet.getDouble("formacion_porfesional")
                            )
                    );
                }
            }catch (SQLException sqlException){
                sqlException.printStackTrace();
            }

        }
        return results;
    }

    public int obtenerUltimoId() throws Exception {
        Statement cercaMaxId = conn.createStatement();
        ResultSet r = cercaMaxId.executeQuery("SELECT MAX(ID) FROM historial_nominas");
        if (r.next()) return (r.getInt(1));
        else return 0;
    }

    public int calcularAntiguedad (java.util.Date fecha_cont, java.util.Date fecha_fin){
        Calendar ff = Calendar.getInstance();
        Calendar fc = Calendar.getInstance();
        fc.setTime(fecha_cont);
        ff.setTime(fecha_fin);
        int any = ff.get(Calendar.YEAR)- fc.get(Calendar.YEAR);
        int mes =ff.get(Calendar.MONTH)- fc.get(Calendar.MONTH);
        int dia = ff.get(Calendar.DATE)- fc.get(Calendar.DATE);
        //Se ajusta el año dependiendo el mes y el día
        if(mes<0 || (mes==0 && dia<0)){
            any--;
        }
        return any;
    }
    public int totalDias (java.util.Date fecha_inicio, java.util.Date fecha_fin){
        return (int) ((fecha_fin.getTime()-fecha_inicio.getTime())/86400000);
    }

    public void insertarNomina(int id, String dni_empleado, String nombre, String apellidos, String grupo_profesional, int grupo_cotizacion, String num_ss_empleado,
                               double irpf, int ccc_de_ss, Date fecha_inicio_nomina,
                               Date fecha_final_nomina, int total_dias, double salario_bruto, double horas_extra_fm, double horas_extra_resto,
                               double horas_complementarias, double contingencias_comunes, double total_devengo, double total_a_deducir, double total_a_percibir
            , double antiguedad , double fp ) throws SQLException {

        Statement insert = conn.createStatement();
        insert.executeUpdate("INSERT INTO `bq7xcggx4wgir1svxet5`.`historial_nominas` (`id`, `dni_empleado`, `nombre`, `apellidos`, `grupo_profesional`, `grupo_cotzacion`, `num_ss_empleado`, `irpf`, `fecha_inicio_nomina`, `fecha_final_nomina`," +
                " `total_dias`, `salario_bruto`,`ccc_de_ss`, `horas_extra_fm`, `horas_extra_resto`, `horas_complemetarias`, `antiguedad`, `formacion_porfesional`, `contingencias_comunes`, `total_devengo`, `total_a_deducir`, `total_a_percibir`) VALUES ('"+id+"', '"+dni_empleado+"', " +
                "'"+nombre+"', '"+apellidos+"', '"+grupo_profesional+"', '"+grupo_cotizacion+"', '"+num_ss_empleado+"', '"+irpf+"', '"+fecha_inicio_nomina+"', '"+fecha_final_nomina+"', '"+total_dias+"', '"+salario_bruto+"', '"+ccc_de_ss+"', '"+horas_extra_fm+"', '"+horas_extra_resto+"', '"+horas_complementarias+"'" +
                ", '"+antiguedad+"', '"+fp+"', '"+contingencias_comunes+"', '"+total_devengo+"', '"+total_a_deducir+"', '"+total_a_percibir+"');");
    }

    public int obtenirNouIDNomina() throws Exception {
        Statement cercaMaxId = conn.createStatement();
        ResultSet r = cercaMaxId.executeQuery("SELECT MAX(ID) FROM historial_nominas");
        if (r.next()) return (1 + r.getInt(1));
        else return 1;
    }

    /////////////////////////////////////////////////// GETERS-Convenios ///////////////////////////////////////////////

    public int selectHorasExtFM(int id_convenio) throws SQLException {
        Statement hora = conn.createStatement();
        int precioHora;
        ResultSet resultQuery = hora.executeQuery("SELECT precio_hefm FROM convenios WHERE id=" + id_convenio + "");
        resultQuery.next();
        precioHora = resultQuery.getInt("precio_hefm");
        return precioHora;
    }

    public int selectHorasExtR(int id_convenio) throws SQLException {
        Statement hora = conn.createStatement();
        int precioHora;
        ResultSet resultQuery = hora.executeQuery("SELECT precio_her FROM convenios WHERE id=" + id_convenio + "");
        resultQuery.next();
        precioHora = resultQuery.getInt("precio_her");
        return precioHora;
    }

    public int selectHorasCompl(int id_convenio) throws SQLException {
        Statement hora = conn.createStatement();
        int precioHora;
        ResultSet resultQuery = hora.executeQuery("SELECT precio_hc FROM convenios WHERE id=" + id_convenio + "");
        resultQuery.next();
        precioHora = resultQuery.getInt("precio_hc");
        return precioHora;
    }

    public double antiguedad(int id_convenio) throws SQLException {
        Statement hora = conn.createStatement();
        double antiguedad;
        ResultSet resultQuery = hora.executeQuery("SELECT antiguedad FROM convenios WHERE id=" + id_convenio + "");
        resultQuery.next();
        antiguedad = resultQuery.getDouble("antiguedad");
        return antiguedad;
    }
    public double fp(int id_convenio) throws SQLException {
        Statement hora = conn.createStatement();
        double fp;
        ResultSet resultQuery = hora.executeQuery("SELECT porcentaje_fp FROM convenios WHERE id=" + id_convenio + "");
        resultQuery.next();
        fp = resultQuery.getInt("porcentaje_fp");
        return fp;
    }


    public int calcHoras(int cantidad, int precio) {
        return cantidad * precio;
    }

    ///////////////////////////////////////////////// GETERS-EMPLEADOS ////////////////////////////////////////////////


    public String getNombre(String dni) throws SQLException {
        Statement st = conn.createStatement();
        String nom;
        ResultSet resultQuery = st.executeQuery("SELECT nombre FROM empleados WHERE dni='" + dni + "'");
        resultQuery.next();
        nom = resultQuery.getString("nombre");
        return nom;
    }

    public String getApellidos(String dni) throws SQLException {
        Statement st = conn.createStatement();
        String app;
        ResultSet resultQuery = st.executeQuery("SELECT apellidos FROM empleados WHERE dni='" + dni + "'");
        resultQuery.next();
        app = resultQuery.getString("apellidos");
        return app;
    }

    public String getMail(String dni) throws SQLException {
        Statement st = conn.createStatement();
        String mail;
        ResultSet resultQuery = st.executeQuery("SELECT mail FROM empleados WHERE dni='" + dni + "'");
        resultQuery.next();
        mail = resultQuery.getString("mail");
        return mail;
    }

    public String getDireccion(String dni) throws SQLException {
        Statement st = conn.createStatement();
        String direc;
        ResultSet resultQuery = st.executeQuery("SELECT direccion FROM empleados WHERE dni='" + dni + "'");
        resultQuery.next();
        direc = resultQuery.getString("direccion");
        return direc;
    }

    public String getNum_ss(String dni) throws SQLException {
        Statement st = conn.createStatement();
        String num_ss;
        ResultSet resultQuery = st.executeQuery("SELECT num_ss FROM empleados WHERE dni='" + dni + "'");
        resultQuery.next();
        num_ss = resultQuery.getString("num_ss");
        return num_ss;
    }

    public int getIrpf(String dni) throws SQLException {
        Statement st = conn.createStatement();
        int irpf;
        ResultSet resultQuery = st.executeQuery("SELECT irpf FROM empleados WHERE dni='" + dni + "'");
        resultQuery.next();
        irpf = resultQuery.getInt("irpf");
        return irpf;
    }

    public java.sql.Date getFecha_Contratacion(String dni) throws SQLException {
        Statement st = conn.createStatement();
        java.sql.Date fecha;
        ResultSet resultQuery = st.executeQuery("SELECT fecha_contratacion FROM empleados WHERE dni='" + dni + "'");
        resultQuery.next();
        fecha = resultQuery.getDate("fecha_contratacion");
        return fecha;
    }
    public java.util.Date getFecha_Contrata_Date(String dni) throws SQLException {
        Statement st = conn.createStatement();
        java.sql.Date fecha;
        ResultSet resultQuery = st.executeQuery("SELECT fecha_contratacion FROM empleados WHERE dni='" + dni + "'");
        resultQuery.next();
        fecha = resultQuery.getDate("fecha_contratacion");

        return fecha;
    }

    public int getSueldo_base(String dni) throws SQLException {
        Statement st = conn.createStatement();
        int sueldcon;
        ResultSet resultQuery = st.executeQuery("SELECT sueldo_base FROM empleados WHERE dni='" + dni + "'");
        resultQuery.next();
        sueldcon = resultQuery.getInt("sueldo_base");
        return sueldcon;
    }

    public int getId_convenio(String dni) throws SQLException {
        Statement st = conn.createStatement();
        int idconv;
        ResultSet resultQuery = st.executeQuery("SELECT id_convenio FROM empleados WHERE dni='" + dni + "'");
        resultQuery.next();
        idconv = resultQuery.getInt("id_convenio");
        return idconv;
    }

    public String getGrupo_profesional(String dni) throws SQLException {
        Statement st = conn.createStatement();
        String grconv;
        ResultSet resultQuery = st.executeQuery("SELECT grupo_profesional FROM empleados WHERE dni='" + dni + "'");
        resultQuery.next();
        grconv = resultQuery.getString("grupo_profesional");
        return grconv;

    }

    public int getGrupo_cotizacion(String dni) throws SQLException {
        Statement st = conn.createStatement();
        int grcot;
        ResultSet resultQuery = st.executeQuery("SELECT grupo_cotizacion  FROM empleados WHERE dni='" + dni + "'");
        resultQuery.next();
        grcot = resultQuery.getInt("grupo_cotizacion");
        return grcot;

    }

    ////////////////////////////////////////// GETERS-Base_Cotizacion //////////////////////////////////////////////////


    public String getCategorias_profesionales(int id) throws SQLException {
        Statement st = conn.createStatement();
        String catpr;
        ResultSet resultQuery = st.executeQuery("SELECT categorias_profesionales  FROM base_cotizacion WHERE id=" + id + "");
        resultQuery.next();
        catpr = resultQuery.getString("categorias_profesionales");
        return catpr;
    }

    public int getBase_minima_eurosmes(int id) throws SQLException {
        Statement st = conn.createStatement();
        int bme;
        ResultSet resultQuery = st.executeQuery("SELECT base_minima_eurosmes FROM base_cotizacion WHERE id=" + id + "");
        resultQuery.next();
        bme = resultQuery.getInt("id_convenio");
        return bme;

    }
    public int getBase_maximas_eurosmes(int id) throws SQLException {
        Statement st = conn.createStatement();
        int bmaxeu;
        ResultSet resultQuery = st.executeQuery("SELECT base_maximas_eurosmes FROM base_cotizacion WHERE id=" + id + "");
        resultQuery.next();
        bmaxeu = resultQuery.getInt("id_convenio");
        return bmaxeu;
    }


    /////////////////////////////////////////////////// GETERS-Empresa ////////////////////////////////////////////////


    public String getCif(String nombre_empresa) throws SQLException {
        Statement st = conn.createStatement();
        String cif;
        ResultSet resultQuery = st.executeQuery("SELECT cif  FROM empresa WHERE nombre_empresa='" + nombre_empresa + "'");
        resultQuery.next();
        cif = resultQuery.getString("cif");
        return cif;
    }

    public String getNombre_empresa(String cif) throws SQLException {
        Statement st = conn.createStatement();
        String ne;
        ResultSet resultQuery = st.executeQuery("SELECT nombre_empresa  FROM empresa WHERE cif='" + cif + "'");
        resultQuery.next();
        ne = resultQuery.getString("nombre_empresa");
        return ne;
    }

    public String getDomicilo(String cif) throws SQLException {
        Statement st = conn.createStatement();
        String gd;
        ResultSet resultQuery = st.executeQuery("SELECT domicilo  FROM empresa WHERE cif='" + cif + "'");
        resultQuery.next();
        gd = resultQuery.getString("domicilo");
        return gd;
    }
    public String getLocalidad(String cif) throws SQLException {
        Statement st = conn.createStatement();
        String gL;
        ResultSet resultQuery = st.executeQuery("SELECT localidad  FROM empresa WHERE cif='" + cif + "'");
        resultQuery.next();
        gL = resultQuery.getString("localidad");
        return gL;
    }
    public int getCcc_ss(String cif) throws SQLException {
        Statement st = conn.createStatement();
        int ccc_ss;
        ResultSet resultQuery = st.executeQuery("SELECT ccc_ss  FROM empresa WHERE cif='" + cif + "'");
        resultQuery.next();
        ccc_ss = resultQuery.getInt("ccc_ss");
        return ccc_ss;
    }


    ///////////////////////////////////////////////// GETERS-Deducciones ///////////////////////////////////////////////

    public int getId_deducciones(int id_convenio) throws SQLException {
        Statement st = conn.createStatement();
        int phefm;
        ResultSet resultQuery = st.executeQuery("SELECT porce_hefm FROM deducciones WHERE id_convenio=" + id_convenio + "");
        resultQuery.next();
        phefm = resultQuery.getInt("porce_hefm");
        return phefm;
    }

    public int getPorcentaje_hefm(int id_convenio) throws SQLException {
        Statement st = conn.createStatement();
        int phefm;
        ResultSet resultQuery = st.executeQuery("SELECT porce_hefm FROM deducciones WHERE id_convenio=" + id_convenio + "");
        resultQuery.next();
        phefm = resultQuery.getInt("porce_hefm");
        return phefm;
    }
    public int getPorcentaje_her(int id_convenio) throws SQLException {
        Statement st = conn.createStatement();
        int pher;
        ResultSet resultQuery = st.executeQuery("SELECT porce_her FROM deducciones WHERE id_convenio=" + id_convenio + "");
        resultQuery.next();
        pher = resultQuery.getInt("porce_her");
        return pher;
    }

    public int getContingenciasCom(int id_convenio) throws SQLException {
        Statement st = conn.createStatement();
        int pher;
        ResultSet resultQuery = st.executeQuery("SELECT porce_her FROM deducciones WHERE id_convenio=" + id_convenio + "");
        resultQuery.next();
        pher = resultQuery.getInt("porce_her");
        return pher;
    }



//////////////////////////////////////////////////// Calculos //////////////////////////////////////////////////////////

//Total Devengado= Salario Base + Horas Extra Fuerza Mayor + Horas Extra Resto + Horas complementarias + antiguedad
//Contingencias comunes =Total devengado - (Horas Extra Fuerza Mayor + Horas Extra Resto + Horas complementarias + antiguedad)
//Formación Profesional= %(estipulado en convenio) de [Contingencias comunes + Horas Extra Fuerza Mayor + Horas Extra Resto + Horas complementarias  ]
//IRPF= % del Total Devengado
//Total a deducir=[contingencias comunes + formacion profesional + Horas Extra Fuerza Mayor + Horas Extra Resto]
//Liquido a percibir= total devengado - total a deducir

////////////////////////////////////////////// Metodos de Calculos /////////////////////////////////////////////////////

    public double totalDevengado(double sb, double hefm, double her, double hc, double antiguedad){
        return sb+hefm+her+hc+antiguedad;
    }

    public double cotingenciasComunes(double td, double hefm, double her, double hc){
        return td-(hefm+her+hc);
    }

    public double formacionProfesional(double porc_x, double cc,double hefm, double her, double hc){
        return  (porc_x*(cc+hefm+her+hc))/100;
    }

    public double totalaDeducir(double fp,double hefm, double her){
        return  fp+hefm+her;
    }
    public double liquidoaPercibir(double totDev, double totADed){
        return totDev-totADed;
    }

    public double cobradoAntiguedad(int anyosEmpl, double precioAnyo){
        return anyosEmpl * precioAnyo;
    }

}
