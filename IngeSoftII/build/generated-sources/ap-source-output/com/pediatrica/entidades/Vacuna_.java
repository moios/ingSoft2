package com.pediatrica.entidades;

import com.pediatrica.entidades.Hijo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-03T23:59:19")
@StaticMetamodel(Vacuna.class)
public class Vacuna_ { 

    public static volatile SingularAttribute<Vacuna, Hijo> idHijo;
    public static volatile SingularAttribute<Vacuna, Date> fechaAplicacion;
    public static volatile SingularAttribute<Vacuna, String> aplicada;
    public static volatile SingularAttribute<Vacuna, Integer> id;
    public static volatile SingularAttribute<Vacuna, String> nombre;

}