package com.opencnc.beans;
// Generated 14/05/2014 12:34:47 AM by Hibernate Tools 3.6.0


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Modelo generated by hbm2java
 */
public class Modelo  implements java.io.Serializable {


     private Integer modeloId;
     private UnidadMedida unidadMedida;
     private Usuario usuario;
     private TipoMaquina tipoMaquina;
     private String nombre;
     private String descripcion;
     private float puntoCeroMaquinaX;
     private float puntoCeroMaquinaY;
     private float piezaAncho;
     private float piezaLargo;
     private int creadoPor;
     private Date creadoFecha;
     private Integer modificadoPor;
     private Date modificadoFecha;
     private Set programas = new HashSet(0);
     private Set elementoGraficos = new HashSet(0);

    public Modelo() {
    }

	
    public Modelo(UnidadMedida unidadMedida, Usuario usuario, TipoMaquina tipoMaquina, String nombre, float puntoCeroMaquinaX, float puntoCeroMaquinaY, float piezaAncho, float piezaLargo, int creadoPor, Date creadoFecha) {
        this.unidadMedida = unidadMedida;
        this.usuario = usuario;
        this.tipoMaquina = tipoMaquina;
        this.nombre = nombre;
        this.puntoCeroMaquinaX = puntoCeroMaquinaX;
        this.puntoCeroMaquinaY = puntoCeroMaquinaY;
        this.piezaAncho = piezaAncho;
        this.piezaLargo = piezaLargo;
        this.creadoPor = creadoPor;
        this.creadoFecha = creadoFecha;
    }
    public Modelo(UnidadMedida unidadMedida, Usuario usuario, TipoMaquina tipoMaquina, String nombre, String descripcion, float puntoCeroMaquinaX, float puntoCeroMaquinaY, float piezaAncho, float piezaLargo, int creadoPor, Date creadoFecha, Integer modificadoPor, Date modificadoFecha, Set programas, Set elementoGraficos) {
       this.unidadMedida = unidadMedida;
       this.usuario = usuario;
       this.tipoMaquina = tipoMaquina;
       this.nombre = nombre;
       this.descripcion = descripcion;
       this.puntoCeroMaquinaX = puntoCeroMaquinaX;
       this.puntoCeroMaquinaY = puntoCeroMaquinaY;
       this.piezaAncho = piezaAncho;
       this.piezaLargo = piezaLargo;
       this.creadoPor = creadoPor;
       this.creadoFecha = creadoFecha;
       this.modificadoPor = modificadoPor;
       this.modificadoFecha = modificadoFecha;
       this.programas = programas;
       this.elementoGraficos = elementoGraficos;
    }
   
    public Integer getModeloId() {
        return this.modeloId;
    }
    
    public void setModeloId(Integer modeloId) {
        this.modeloId = modeloId;
    }
    public UnidadMedida getUnidadMedida() {
        return this.unidadMedida;
    }
    
    public void setUnidadMedida(UnidadMedida unidadMedida) {
        this.unidadMedida = unidadMedida;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public TipoMaquina getTipoMaquina() {
        return this.tipoMaquina;
    }
    
    public void setTipoMaquina(TipoMaquina tipoMaquina) {
        this.tipoMaquina = tipoMaquina;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public float getPuntoCeroMaquinaX() {
        return this.puntoCeroMaquinaX;
    }
    
    public void setPuntoCeroMaquinaX(float puntoCeroMaquinaX) {
        this.puntoCeroMaquinaX = puntoCeroMaquinaX;
    }
    public float getPuntoCeroMaquinaY() {
        return this.puntoCeroMaquinaY;
    }
    
    public void setPuntoCeroMaquinaY(float puntoCeroMaquinaY) {
        this.puntoCeroMaquinaY = puntoCeroMaquinaY;
    }
    public float getPiezaAncho() {
        return this.piezaAncho;
    }
    
    public void setPiezaAncho(float piezaAncho) {
        this.piezaAncho = piezaAncho;
    }
    public float getPiezaLargo() {
        return this.piezaLargo;
    }
    
    public void setPiezaLargo(float piezaLargo) {
        this.piezaLargo = piezaLargo;
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
    public Set getProgramas() {
        return this.programas;
    }
    
    public void setProgramas(Set programas) {
        this.programas = programas;
    }
    public Set getElementoGraficos() {
        return this.elementoGraficos;
    }
    
    public void setElementoGraficos(Set elementoGraficos) {
        this.elementoGraficos = elementoGraficos;
    }




}


