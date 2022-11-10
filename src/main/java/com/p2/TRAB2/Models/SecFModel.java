/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.p2.TRAB2.Models;

import com.p2.TRAB1.normais.SecFinanceira;
import com.p2.TRAB2.Menu1;
import javax.swing.AbstractListModel;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Eu2020
 */
public class SecFModel extends AbstractListModel implements ComboBoxModel{
    private SecFinanceira selecionado;
    
    @Override
    public int getSize() {
        return Menu1.FNsecretarios.size();
    }

    @Override
    public Object getElementAt(int index) {
        return Menu1.FNsecretarios.get(index);
    }

    @Override
    public void setSelectedItem(Object anItem) {
        this.selecionado = (SecFinanceira) anItem;
        fireContentsChanged(Menu1.FNsecretarios, 0, Menu1.FNsecretarios.size());
    }

    @Override
    public Object getSelectedItem() {
        return this.selecionado;
    }
    
}
