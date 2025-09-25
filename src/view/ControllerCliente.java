/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.ApmCliente;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author win10
 */
public class ControllerCliente extends AbstractTableModel {
    
    private List lstCliente;
    
    public void setList(List lstCliente){
        this.lstCliente = lstCliente;
    }
    
    public ApmCliente getBean(int rowIndex){
        return (ApmCliente) lstCliente.get(rowIndex);
        
    }

    @Override
    public int getRowCount() {
        return lstCliente.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ApmCliente apmCliente = (ApmCliente) lstCliente.get(rowIndex);
        if (columnIndex == 0 ){
            return apmCliente.getApmIdCliente();
        } else if (columnIndex == 1) {
            return  apmCliente.getApmNome();
        } else if (columnIndex == 2 ){
            return  apmCliente.getApmApelido();
        } else if (columnIndex == 3 ){
            return apmCliente.getApmCpf();
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
