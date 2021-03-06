package com.opencnc.beans;
// Generated 14/05/2014 12:34:47 AM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Usuario generated by hbm2java
 */
public class Usuario  implements java.io.Serializable {


     private Integer usuarioId;
     private String nombre;
     private String apellido;
     private String organizacion;
     private String email;
     private byte[] clave;
     private String estado;
     private int creadoPor;
     private Date creadoFecha;
     private Integer modificadoPor;
     private Date modificadoFecha;
     private Set rols = new HashSet(0);
     private Set modelos = new HashSet(0);

    public Usuario() {
    }

	
    public Usuario(String nombre, String apellido, String email, String estado, int creadoPor, Date creadoFecha) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.estado = estado;
        this.creadoPor = creadoPor;
        this.creadoFecha = creadoFecha;
    }
    public Usuario(String nombre, String apellido, String organizacion, String email, byte[] clave, String estado, int creadoPor, Date creadoFecha, Integer modificadoPor, Date modificadoFecha, Set rols, Set modelos) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.organizacion = organizacion;
       this.email = email;
       this.clave = clave;
       this.estado = estado;
       this.creadoPor = creadoPor;
       this.creadoFecha = creadoFecha;
       this.modificadoPor = modificadoPor;
       this.modificadoFecha = modificadoFecha;
       this.rols = rols;
       this.modelos = modelos;
    }
   
    public Integer getUsuarioId() {
        return this.usuarioId;
    }
    
    public void setUsuarioId(Integer usuarioId) {
        this.usuarioId = usuarioId;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getOrganizacion() {
        return this.organizacion;
    }
    
    public void setOrganizacion(String organizacion) {
        this.organizacion = organizacion;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public byte[] getClave() {
        return this.clave;
    }
    
    public void setClave(byte[] clave) {
        this.clave = clave;
    }
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public int getCreadoPor() {
        return this.creadoPor;
    }
    
    public void setCreadoPor(int creadoPor) {
        this.creadoPor = creadoPor;
    }
    public Date getCreadoFecha() {
        return this.creadoFecha;
    }
    
    public void setCreadoFecha(Date creadoFecha) {
        this.creadoFecha = creadoFecha;
    }
    public Integer getModificadoPor() {
        return this.modificadoPor;
    }
    
    public void setModificadoPor(Integer modificadoPor) {
        this.modificadoPor = modificadoPor;
    }
    public Date getModificadoFecha() {
        return this.modificadoFecha;
    }
    
    public void setModificadoFecha(Date modificadoFecha) {
        this.modificadoFecha = modificadoFecha;
    }
    public Set getRols() {
        return this.rols;
    }
    
    public void setRols(Set rols) {
        this.rols = rols;
    }
    public Set getModelos() {
        return this.modelos;
    }
    
    public void setModelos(Set modelos) {
        this.modelos = modelos;
    }




}


