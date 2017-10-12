/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phrmc.dao.impl;

import java.util.List;
import org.hibernate.Query;
import phrmc.dao.ObatDao;
import phrmc.model.ObatModel;

/**
 *
 * @author premium
 */
public class ObatDaoImpl extends HibernateUtil implements ObatDao{

    @Override
    public List<ObatModel> getListObat() {
        List<ObatModel> listobat = null;
        String sql = "select model from ObatModel model";
        Query q = createQuery(sql);
        listobat = q.list();
        return listobat;
    }

    @Override
    public void saveObat(ObatModel data) {
        getSession().save(data);
    }

    @Override
    public void deleteObatModel(String id) {
        ObatModel obat = new ObatModel();
        obat.setKode(id);
        
    }

    @Override
    public ObatModel getObatById(String id) {
        ObatModel obat = new ObatModel();
        String sql = "select model from ObatModel model where id=:id1";
        Query q=createQuery(sql).setParameter("id1",id);
        return (ObatModel) q.uniqueResult();    
    }
    
}
