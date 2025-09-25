/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.ApmCliente;
import bean.ApmUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author win10
 */
public class ControllerUsuario extends AbstractTableModel {
    
    private List lstUsuario;
    
    public void setList(List lstUsuario){
        this.lstUsuario = lstUsuario;
    }
    
    public ApmUsuarios getBean(int rowIndex){
        return (ApmUsuarios) lstUsuario.get(rowIndex);
        
    }

    @Override
    public int getRowCount() {
        return lstUsuario.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ApmUsuarios apmUsuarios = (ApmUsuarios) lstUsuario.get(rowIndex);
        if (columnIndex == 0 ){
            return apmUsuarios.getApmIdUsuario();
        } else if (columnIndex == 1) {
            return  apmUsuarios.getApmNome();
        } else if (columnIndex == 2 ){
            return  apmUsuarios.getApmApelido();
        } else if (columnIndex == 3 ){
            return apmUsuarios.getApmCpf();
        }
        return "";
    }
    
    @Override
    public String getColumnName(int columnIndex){
        if ( columnIndex == 0 ){
            return "Código";
        } else if ( columnIndex == 1 ){
            return "Nome";
        } else if ( columnIndex == 2 ){
            return "Apelido";
        } else if (columnIndex == 3 ){
            return "Cpf";
        }
        return "";
    }
    
}
