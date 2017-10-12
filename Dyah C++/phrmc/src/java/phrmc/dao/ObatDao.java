/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phrmc.dao;

import java.util.List;
import phrmc.model.ObatModel;

public interface ObatDao {
    public List<ObatModel> getListObat();
    public void saveObat(ObatModel nm);
    public void deleteObatModel(Integer id);
    ObatModel getObatById(Integer id);
}
