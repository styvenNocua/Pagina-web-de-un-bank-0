/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author DANIEL
 */
@Entity
@Table(name = "datos")
@NamedQueries({
    @NamedQuery(name = "Datos.findAll", query = "SELECT d FROM Datos d")
    , @NamedQuery(name = "Datos.findById", query = "SELECT d FROM Datos d WHERE d.id = :id")
    , @NamedQuery(name = "Datos.findByNombre", query = "SELECT d FROM Datos d WHERE d.nombre = :nombre")
    , @NamedQuery(name = "Datos.findByApellidos", query = "SELECT d FROM Datos d WHERE d.apellidos = :apellidos")
    , @NamedQuery(name = "Datos.findByTipoDeDocumento", query = "SELECT d FROM Datos d WHERE d.tipoDeDocumento = :tipoDeDocumento")
    , @NamedQuery(name = "Datos.findByNumeroDeDocumento", query = "SELECT d FROM Datos d WHERE d.numeroDeDocumento = :numeroDeDocumento")
    , @NamedQuery(name = "Datos.findByOcupacion", query = "SELECT d FROM Datos d WHERE d.ocupacion = :ocupacion")
    , @NamedQuery(name = "Datos.findByDepartamento", query = "SELECT d FROM Datos d WHERE d.departamento = :departamento")
    , @NamedQuery(name = "Datos.findByCiudad", query = "SELECT d FROM Datos d WHERE d.ciudad = :ciudad")
    , @NamedQuery(name = "Datos.findByEdad", query = "SELECT d FROM Datos d WHERE d.edad = :edad")
    , @NamedQuery(name = "Datos.findByFchaDeSolicitud", query = "SELECT d FROM Datos d WHERE d.fchaDeSolicitud = :fchaDeSolicitud")
    , @NamedQuery(name = "Datos.findByDireccion", query = "SELECT d FROM Datos d WHERE d.direccion = :direccion")
    , @NamedQuery(name = "Datos.findByTelefono", query = "SELECT d FROM Datos d WHERE d.telefono = :telefono")})
public class Datos implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NOMBRE")
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "APELLIDOS")
    private String apellidos;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "TIPO_DE_DOCUMENTO")
    private String tipoDeDocumento;
    @Basic(optional = false)
    @NotNull
    @Column(name = "NUMERO_DE_DOCUMENTO")
    private int numeroDeDocumento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 40)
    @Column(name = "OCUPACION")
    private String ocupacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "DEPARTAMENTO")
    private String departamento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "CIUDAD")
    private String ciudad;
    @Basic(optional = false)
    @NotNull
    @Column(name = "EDAD")
    private int edad;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "FCHA_DE_SOLICITUD")
    private String fchaDeSolicitud;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 30)
    @Column(name = "DIRECCION")
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "TELEFONO")
    private int telefono;

    public Datos() {
    }

    public Datos(Integer id) {
        this.id = id;
    }

    public Datos(Integer id, String nombre, String apellidos, String tipoDeDocumento, int numeroDeDocumento, String ocupacion, String departamento, String ciudad, int edad, String fchaDeSolicitud, String direccion, int telefono) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.tipoDeDocumento = tipoDeDocumento;
        this.numeroDeDocumento = numeroDeDocumento;
        this.ocupacion = ocupacion;
        this.departamento = departamento;
        this.ciudad = ciudad;
        this.edad = edad;
        this.fchaDeSolicitud = fchaDeSolicitud;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipoDeDocumento() {
        return tipoDeDocumento;
    }

    public void setTipoDeDocumento(String tipoDeDocumento) {
        this.tipoDeDocumento = tipoDeDocumento;
    }

    public int getNumeroDeDocumento() {
        return numeroDeDocumento;
    }

    public void setNumeroDeDocumento(int numeroDeDocumento) {
        this.numeroDeDocumento = numeroDeDocumento;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getFchaDeSolicitud() {
        return fchaDeSolicitud;
    }

    public void setFchaDeSolicitud(String fchaDeSolicitud) {
        this.fchaDeSolicitud = fchaDeSolicitud;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Datos)) {
            return false;
        }
        Datos other = (Datos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Datos[ id=" + id + " ]";
    }
    
}
