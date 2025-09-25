/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.ApmFuncionario;
import bean.ApmUsuarios;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author win10
 */
public class ControllerFuncionario extends AbstractTableModel{
    
    private List lstFuncionario;
    
    public void setList(List lstFuncionario){
        this.lstFuncionario = lstFuncionario;
    }    

    public ApmFuncionario getBean(int rowIndex){
        return (ApmFuncionario) lstFuncionario.get(rowIndex);
    }

    @Override
    public int getRowCount() {
        return lstFuncionario.size();
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        ApmFuncionario apmFuncionario = (ApmFuncionario) lstFuncionario.get(rowIndex);
        if (columnIndex == 0 ){
            return apmFuncionario.getApmIdFuncionario();
        } else if (columnIndex == 1) {
            return  apmFuncionario.getApmNome();
        } else if (columnIndex == 2 ){
            return  apmFuncionario.getApmApelido();
        } else if (columnIndex == 3 ){
            return apmFuncionario.getApmCpf();
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
