/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package view;

import bean.ApmProduto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author win10
 */
public class ControllerProduto extends AbstractTableModel {
    
    private List lstProduto;
    
    public void setList(List lstProduto){
        this.lstProduto = lstProduto;
    }    

    public ApmProduto getBean(int rowIndex){
        return (ApmProduto) lstProduto.get(rowIndex);
    }
    
    @Override
    public int getRowCount() {
        return lstProduto.size();     
    }

    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ApmProduto apmProduto = (ApmProduto) lstProduto.get(rowIndex);
        if ( rowIndex == 0 ){
            return apmProduto.getApmIdProduto();
        }else if ( rowIndex == 1 ){
            return apmProduto.getApmNome();
        }else if ( rowIndex == 2 ){
            return apmProduto.getApmMarca();
        }else if ( rowIndex == 3 ){
            return apmProduto.getApmTamanho();
        }
        return "";
    }
    
    public String getColumnName(int colulumnIndex) {
        if ( colulumnIndex == 0 ){
            return "Código";
        } else if ( colulumnIndex == 1 ){
            return "Nome";
        } else if ( colulumnIndex == 2 ){
            return "Marca";
        } else if ( colulumnIndex == 3 ){
            return "Tamanho";
        }
        return "";
    }
    
}
