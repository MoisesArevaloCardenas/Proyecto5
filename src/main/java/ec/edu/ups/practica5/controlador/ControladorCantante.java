/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.practica5.controlador;

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

    public ControladorCantante(ICantanteDAO cantanteDAO) {
        this.cantanteDAO = cantanteDAO;
    }

    public void crearCantante(Cantante cantante) {
        this.cantante = cantante;
        cantanteDAO.create(cantante);
    }

    public void verCantante(int codigo) {
        cantante = cantanteDAO.read(codigo);

    }

    public boolean actualizarCantante(Cantante cantante) {
        Cantante cantanteEncontrado = this.buscar(cantante.getCodigo());
        if (cantanteEncontrado != null) {
            cantanteDAO.update(cantanteEncontrado);
            return true;
        }
        return false;

    }

    public boolean eliminarCantante() {
        Cantante cantanteEncontrado = this.buscar(cantante.getCodigo());
        if (cantanteEncontrado != null) {
            cantanteDAO.delete(cantanteEncontrado);
            return true;
        }
        return false;
    }

    public List<Cantante> verCantantes() {
        return cantanteDAO.findAll();
    }

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
