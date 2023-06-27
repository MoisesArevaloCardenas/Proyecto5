/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica5.controlador;

import ec.edu.ups.practica5.dao.CantanteDAO;
import ec.edu.ups.practica5.idao.ICantanteDAO;
import ec.edu.ups.practica5.modelo.Cantante;
import ec.edu.ups.practica5.modelo.Disco;
import java.util.List;

/**
 *
 * @author Administrator
 */
public class ControladorCantante {

    private Cantante cantante;
    private Disco disco;

    private ICantanteDAO cantanteDAO;

    public ControladorCantante() {
    }

    public ControladorCantante(Cantante cantante, Disco disco, ICantanteDAO cantanteDAO) {
        this.cantante = cantante;
        this.disco = disco;
        this.cantanteDAO = cantanteDAO;
    }

    //llama al DAO para guardar un cliente
    public void registrar() {
        cantanteDAO.create(cantante);
    }

    //llama al DAO para obtener un cliente por el id y luego los muestra en la vista
    public void verCantante(int codigo) {
        cantante = cantanteDAO.read(codigo);

    }

    //llama al DAO para actualizar un cliente
    public boolean actualizar(Cantante cantante) {
        Cantante cantanteEncontrado = this.buscar(cantante.getCodigo());
        if (cantanteEncontrado != null) {
            cantanteDAO.update(cantanteEncontrado);
            return true;
        }
        return false;

    }

    //llama al DAO para eliminar un cliente
    public boolean eliminar() {
        Cantante cantanteEncontrado = this.buscar(cantante.getCodigo());
        if (cantanteEncontrado != null) {
            cantanteDAO.delete(cantanteEncontrado);
            return true;
        }
        return false;
    }

    //llama al DAO para obtener todos los clientes y luego los muestra en la vista
    public List<Cantante> verCantantes() {
        return cantanteDAO.findAll();
    }

    //ejemplo de agregacion
    public void agregarDisco(int codigo) {
        cantante = cantanteDAO.read(codigo);
        cantante.agregarDisco(disco);
    }

    private Cantante buscar(int codigo) {
        cantante = cantanteDAO.read(codigo);
        cantante.agregarDisco(disco);
        return cantante;
    }

}
