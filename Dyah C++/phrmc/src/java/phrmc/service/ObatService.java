/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phrmc.service;

import java.util.List;
import phrmc.dto.ObatDto;
import phrmc.model.ObatModel;

/**
 *
 * @author premium
 */
public interface ObatService {
    public List<ObatDto> getlistObat();
    public void saveObat(ObatDto data);
    public void deleteObat(String id);
    public ObatModel getObatById(String id);
}
