package com.pediatrica.entidades;

import com.pediatrica.entidades.Usuario;
import com.pediatrica.entidades.Vacuna;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-03T23:59:19")
@StaticMetamodel(Hijo.class)
public class Hijo_ { 

    public static volatile SingularAttribute<Hijo, String> apellidos;
    public static volatile CollectionAttribute<Hijo, Vacuna> vacunaCollection;
    public static volatile SingularAttribute<Hijo, Date> fechaNacimiento;
    public static volatile SingularAttribute<Hijo, String> municipio;
    public static volatile SingularAttribute<Hijo, String> direccion;
    public static volatile SingularAttribute<Hijo, String> barrioCnia;
    public static volatile SingularAttribute<Hijo, String> telContacto;
    public static volatile SingularAttribute<Hijo, Usuario> idPadre;
    public static volatile SingularAttribute<Hijo, String> nombres;
    public static volatile SingularAttribute<Hijo, String> nacionalidad;
    public static volatile SingularAttribute<Hijo, String> alergiaContaminacion;
    public static volatile SingularAttribute<Hijo, String> cedulaCod;
    public static volatile SingularAttribute<Hijo, String> referenciaDomicilio;
    public static volatile SingularAttribute<Hijo, String> sexo;
    public static volatile SingularAttribute<Hijo, String> lugarNacimiento;
    public static volatile SingularAttribute<Hijo, String> seguroMedico;
    public static volatile SingularAttribute<Hijo, String> nombreMadrePadreTutor;

}