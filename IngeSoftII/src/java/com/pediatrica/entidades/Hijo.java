/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pediatrica.entidades;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author moios
 */
@Entity
@Table(name = "hijo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hijo.findAll", query = "SELECT h FROM Hijo h")
    , @NamedQuery(name = "Hijo.findByPadre", query = "SELECT h FROM Hijo h WHERE h.idPadre = :idPadre")
    , @NamedQuery(name = "Hijo.findByCedulaCod", query = "SELECT h FROM Hijo h WHERE h.cedulaCod = :cedulaCod")
    , @NamedQuery(name = "Hijo.findByNombres", query = "SELECT h FROM Hijo h WHERE h.nombres = :nombres")
    , @NamedQuery(name = "Hijo.findByApellidos", query = "SELECT h FROM Hijo h WHERE h.apellidos = :apellidos")
    , @NamedQuery(name = "Hijo.findByFechaNacimiento", query = "SELECT h FROM Hijo h WHERE h.fechaNacimiento = :fechaNacimiento")
    , @NamedQuery(name = "Hijo.findByLugarNacimiento", query = "SELECT h FROM Hijo h WHERE h.lugarNacimiento = :lugarNacimiento")
    , @NamedQuery(name = "Hijo.findBySexo", query = "SELECT h FROM Hijo h WHERE h.sexo = :sexo")
    , @NamedQuery(name = "Hijo.findByNacionalidad", query = "SELECT h FROM Hijo h WHERE h.nacionalidad = :nacionalidad")
    , @NamedQuery(name = "Hijo.findByDireccion", query = "SELECT h FROM Hijo h WHERE h.direccion = :direccion")
    , @NamedQuery(name = "Hijo.findByMunicipio", query = "SELECT h FROM Hijo h WHERE h.municipio = :municipio")
    , @NamedQuery(name = "Hijo.findByBarrioCnia", query = "SELECT h FROM Hijo h WHERE h.barrioCnia = :barrioCnia")
    , @NamedQuery(name = "Hijo.findByReferenciaDomicilio", query = "SELECT h FROM Hijo h WHERE h.referenciaDomicilio = :referenciaDomicilio")
    , @NamedQuery(name = "Hijo.findByNombreMadrePadreTutor", query = "SELECT h FROM Hijo h WHERE h.nombreMadrePadreTutor = :nombreMadrePadreTutor")
    , @NamedQuery(name = "Hijo.findByTelContacto", query = "SELECT h FROM Hijo h WHERE h.telContacto = :telContacto")
    , @NamedQuery(name = "Hijo.findBySeguroMedico", query = "SELECT h FROM Hijo h WHERE h.seguroMedico = :seguroMedico")
    , @NamedQuery(name = "Hijo.findByAlergiaContaminacion", query = "SELECT h FROM Hijo h WHERE h.alergiaContaminacion = :alergiaContaminacion")})
public class Hijo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "cedula_cod")
    private String cedulaCod;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombres")
    private String nombres;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "apellidos")
    private String apellidos;
    @Basic(optional = false)
    @NotNull
    @Column(name = "fecha_nacimiento")
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "lugar_nacimiento")
    private String lugarNacimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "sexo")
    private String sexo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "nacionalidad")
    private String nacionalidad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "direccion")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "municipio")
    private String municipio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "barrio_cnia")
    private String barrioCnia;
    @Size(max = 30)
    @Column(name = "referencia_domicilio")
    private String referenciaDomicilio;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "nombre_madre_padre_tutor")
    private String nombreMadrePadreTutor;
    @Size(max = 20)
    @Column(name = "tel_contacto")
    private String telContacto;
    @Size(max = 30)
    @Column(name = "seguro_medico")
    private String seguroMedico;
    @Size(max = 50)
    @Column(name = "alergia_contaminacion")
    private String alergiaContaminacion;
    @OneToMany(mappedBy = "idHijo")
    private Collection<Vacuna> vacunaCollection;
    @JoinColumn(name = "id_padre", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Usuario idPadre;

    public Hijo() {
    }

    public Hijo(String cedulaCod) {
        this.cedulaCod = cedulaCod;
    }

    public Hijo(String cedulaCod, String nombres, String apellidos, Date fechaNacimiento, String lugarNacimiento, String sexo, String nacionalidad, String direccion, String municipio, String barrioCnia, String nombreMadrePadreTutor) {
        this.cedulaCod = cedulaCod;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.lugarNacimiento = lugarNacimiento;
        this.sexo = sexo;
        this.nacionalidad = nacionalidad;
        this.direccion = direccion;
        this.municipio = municipio;
        this.barrioCnia = barrioCnia;
        this.nombreMadrePadreTutor = nombreMadrePadreTutor;
    }

    public String getCedulaCod() {
        return cedulaCod;
    }

    public void setCedulaCod(String cedulaCod) {
        this.cedulaCod = cedulaCod;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(String lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public String getBarrioCnia() {
        return barrioCnia;
    }

    public void setBarrioCnia(String barrioCnia) {
        this.barrioCnia = barrioCnia;
    }

    public String getReferenciaDomicilio() {
        return referenciaDomicilio;
    }

    public void setReferenciaDomicilio(String referenciaDomicilio) {
        this.referenciaDomicilio = referenciaDomicilio;
    }

    public String getNombreMadrePadreTutor() {
        return nombreMadrePadreTutor;
    }

    public void setNombreMadrePadreTutor(String nombreMadrePadreTutor) {
        this.nombreMadrePadreTutor = nombreMadrePadreTutor;
    }

    public String getTelContacto() {
        return telContacto;
    }

    public void setTelContacto(String telContacto) {
        this.telContacto = telContacto;
    }

    public String getSeguroMedico() {
        return seguroMedico;
    }

    public void setSeguroMedico(String seguroMedico) {
        this.seguroMedico = seguroMedico;
    }

    public String getAlergiaContaminacion() {
        return alergiaContaminacion;
    }

    public void setAlergiaContaminacion(String alergiaContaminacion) {
        this.alergiaContaminacion = alergiaContaminacion;
    }

    @XmlTransient
    public Collection<Vacuna> getVacunaCollection() {
        return vacunaCollection;
    }

    public void setVacunaCollection(Collection<Vacuna> vacunaCollection) {
        this.vacunaCollection = vacunaCollection;
    }

    public Usuario getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(Usuario idPadre) {
        this.idPadre = idPadre;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedulaCod != null ? cedulaCod.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hijo)) {
            return false;
        }
        Hijo other = (Hijo) object;
        if ((this.cedulaCod == null && other.cedulaCod != null) || (this.cedulaCod != null && !this.cedulaCod.equals(other.cedulaCod))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pediatrica.entidades.Hijo[ cedulaCod=" + cedulaCod + " ]";
    }
    
}
