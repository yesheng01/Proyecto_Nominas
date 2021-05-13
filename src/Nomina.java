
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.sql.*;

public class Nomina {

    private int id;
    private String dni_empleado;
    private String nombre;
    private String apellidos;
    private String grupo_profesional;
    private int grupo_cotizacion;
    private String num_ss_empleado;
    private double irpf;
    private String nombre_empresa;
    private String cif;
    private String domicilio;
    private int  ccc_de_ss;
    private String localidad;
    private java.sql.Date fecha_inicio_nomina;
    private java.sql.Date fecha_final_nomina;
    private int  total_dias;
    private double salario_bruto;
    private double horas_extra_fm;
    private double horas_extra_resto;
    private double horas_complementarias;
    private double contingencias_comunes;
    private double antiguedad;
    private double formacion_profesional;
    private double total_devengo;
    private double total_a_deducir;
    private double total_a_percibir;


    public Nomina(int id, String dni_empleado, String nombre, String apellidos, String grupo_profesional, int grupo_cotizacion, String num_ss_empleado,
                  double irpf, String nombre_empresa, String cif, String domicilio, int ccc_de_ss, String localidad, Date fecha_inicio_nomina,
                  Date fecha_final_nomina, int total_dias, double salario_bruto, double horas_extra_fm, double horas_extra_resto,
                  double horas_complementarias, double contingencias_comunes, double total_devengo, double total_a_deducir, double total_a_percibir
                  , double antiguedad,double formacion_profesional  ) {
        setId(id);
        setDni_empleado(dni_empleado);
        setNombre(nombre);
        setApellidos(apellidos);
        setGrupo_profesional(grupo_profesional);
        setGrupo_cotizacion(grupo_cotizacion);
        setNum_ss_empleado(num_ss_empleado);
        setIrpf(irpf);
        setNombre_empresa(nombre_empresa);
        setCif(cif);
        setDomicilio(domicilio);
        setCcc_de_ss(ccc_de_ss);
        setLocalidad(localidad);
        setFecha_inicio_nomina(fecha_inicio_nomina);
        setFecha_final_nomina(fecha_final_nomina);
        setTotal_dias(total_dias);
        setSalario_bruto(salario_bruto);
        setHoras_extra_fm(horas_extra_fm);
        setHoras_extra_resto(horas_extra_resto);
        setHoras_complementarias(horas_complementarias);
        setContingencias_comunes(contingencias_comunes);
        setTotal_devengo(total_devengo);
        setTotal_a_deducir(total_a_deducir);
        setTotal_a_percibir(total_a_percibir);
        setAntiguedad(antiguedad);
        setFormacion_profesional(formacion_profesional);
    }


    public int getId() {
        return id;
    }

    public String getDni_empleado() {
        return dni_empleado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getGrupo_profesional() {
        return grupo_profesional;
    }

    public int getGrupo_cotizacion() {
        return grupo_cotizacion;
    }

    public String getNum_ss_empleado() {
        return num_ss_empleado;
    }

    public double getIrpf() {
        return irpf;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public String getCif() {
        return cif;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public int getCcc_de_ss() {
        return ccc_de_ss;
    }

    public String getLocalidad() {
        return localidad;
    }

    public Date getFecha_inicio_nomina() {
        return fecha_inicio_nomina;
    }

    public Date getFecha_final_nomina() {
        return fecha_final_nomina;
    }

    public double getFormacion_profesional() {
        return formacion_profesional;
    }

    public void setFormacion_profesional(double formacion_profesional) {
        this.formacion_profesional = formacion_profesional;
    }

    public int getTotal_dias() {
        return total_dias;
    }

    public double getSalario_bruto() {
        return salario_bruto;
    }


    public double getHoras_extra_fm() {
        return horas_extra_fm;
    }

    public double getHoras_extra_resto() {
        return horas_extra_resto;
    }

    public double getHoras_complementarias() {
        return horas_complementarias;
    }

    public double getContingencias_comunes() {
        return contingencias_comunes;
    }

    public double getTotal_devengo() {
        return total_devengo;
    }

    public double getTotal_a_deducir() {
        return total_a_deducir;
    }

    public double getTotal_a_percibir() {
        return total_a_percibir;
    }

    public double getAntiguedad(){
        return antiguedad;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDni_empleado(String dni_empleado) {
        this.dni_empleado = dni_empleado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setGrupo_profesional(String grupo_profesional) {
        this.grupo_profesional = grupo_profesional;
    }

    public void setGrupo_cotizacion(int grupo_cotizacion) {
        this.grupo_cotizacion = grupo_cotizacion;
    }

    public void setNum_ss_empleado(String num_ss_empleado) {
        this.num_ss_empleado = num_ss_empleado;
    }

    public void setIrpf(double irpf) {
        this.irpf = irpf;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setCcc_de_ss(int ccc_de_ss) {
        this.ccc_de_ss = ccc_de_ss;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setFecha_inicio_nomina(Date fecha_inicio_nomina) {
        this.fecha_inicio_nomina = fecha_inicio_nomina;
    }

    public void setFecha_final_nomina(Date fecha_final_nomina) {
        this.fecha_final_nomina = fecha_final_nomina;
    }

    public void setTotal_dias(int total_dias) {
        this.total_dias = total_dias;
    }

    public void setSalario_bruto(double salario_bruto) {
        this.salario_bruto = salario_bruto;
    }

    public void setHoras_extra_fm(double horas_extra_fm) {
        this.horas_extra_fm = horas_extra_fm;
    }

    public void setHoras_extra_resto(double horas_extra_resto) {
        this.horas_extra_resto = horas_extra_resto;
    }

    public void setHoras_complementarias(double horas_complementarias) {
        this.horas_complementarias = horas_complementarias;
    }

    public void setContingencias_comunes(double contingencias_comunes) {
        this.contingencias_comunes = contingencias_comunes;
    }


    public void setTotal_devengo(double total_devengo) {
        this.total_devengo = total_devengo;
    }

    public void setTotal_a_deducir(double total_a_deducir) {
        this.total_a_deducir = total_a_deducir;
    }

    public void setTotal_a_percibir(double total_a_percibir) {
        this.total_a_percibir = total_a_percibir;
    }

    public void setAntiguedad(double antiguedad) {
        this.antiguedad = antiguedad;
    }

    public void createXml(){
        BufferedWriter bw = null;
        try {
            String xml = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n" +
                    "<nomina>\n" +
                    "<id>" + getId() + "</id>\n" +
                    "<dni_empleado>"+getDni_empleado()+"</dni_empleado>\n" +
                    "<nombre>"+getNombre()+"</nombre>\n" +
                    "<apellidos>"+getApellidos()+"</apellidos>\n" +
                    "<grupo_profesional>" +getGrupo_profesional()+ "</grupo_profesional>\n" +
                    "<grupo_cotizacion>"+getGrupo_cotizacion()+ "</grupo_cotizacion>\n" +
                    "<num_ss_emplado>"+getNum_ss_empleado()+"</num_ss_emplado>\n" +
                    "<irpf>" +getIrpf()+"</irpf>\n" +
                    "<nombre_empresa>" + getNombre_empresa()  +"</nombre_empresa>\n" +
                    "<cif>" +getCif() +"</cif>\n" +
                    "<domicilio>" + getDomicilio() +"</domicilio>\n" +
                    "<ccc_de_ss>"+ getCcc_de_ss() +"</ccc_de_ss>\n" +
                    "<localidad>" +getLocalidad() +"</localidad>\n" +
                    "<fecha_inicio_nomina>"+getFecha_inicio_nomina()+"</fecha_inicio_nomina>\n" +
                    "<fecha_final_nomina>"+getFecha_final_nomina() +"</fecha_final_nomina>\n" +
                    "<total_dias>"+ getTotal_dias() +"</total_dias>\n" +
                    "<salario_bruto>"+getSalario_bruto()+"</salario_bruto>\n" +
                    "<horas_extra_fm>"+getHoras_extra_fm()+"</horas_extra_fm>\n" +
                    "<horas_extra_resto>"+getHoras_extra_resto()+"</horas_extra_resto>\n" +
                    "<horas_complementarias>"+getHoras_complementarias()+"</horas_complementarias>\n" +
                    "<contingencias_comunes>"+getContingencias_comunes()+"</contingencias_comunes>\n" +
                    "<antiguedad>"+getAntiguedad()+"</antiguedad>\n" +
                    "<total_devengo>"+getTotal_devengo()+"</total_devengo>\n" +
                    "<total_a_deducir>"+getTotal_a_deducir()+"</total_a_deducir>\n" +
                    "<total_a_percibir>"+getTotal_a_percibir()+"</total_a_percibir>\n" +
                    "</nomina>";
            //Ruta
            String path = "src\\save\\";
            //Nombre del fichero
            String filename = "nomina_"+getId()+"_"+getFecha_final_nomina().toString()+ ".xml";
            File file = new File(path + filename);

            /* This logic will make sure that the file
             * gets created if it is not present at the
             * specified location*/
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fw = new FileWriter(file);
            bw = new BufferedWriter(fw);
            bw.write(xml);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                if (bw != null)
                    bw.close();
            } catch (Exception ex) {
                System.out.println("Error in closing the BufferedWriter" + ex);
            }
        }
    }
}
