/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phrmc.service.impl;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import phrmc.dao.ObatDao;
import phrmc.dto.ObatDto;
import phrmc.model.ObatModel;
import phrmc.service.ObatService;

/**
 *
 * @author premium
 */
public class ObatServiceImpl implements ObatService {

    @Autowired
    ObatDao obatdao;

    @Override
    public List<ObatDto> getlistObat() {
        List<ObatModel> obat = obatdao.getListObat();
        List<ObatDto> obatdto = new ArrayList<>();
        ObatDto obatDto;
        if (obat != null) {
            for (ObatModel data : obat) {
                obatDto = new ObatDto();
                obatDto.setKode(data.getKode());
                obatDto.setNama(data.getNama());
                obatDto.setHarga(data.getHarga());
                obatDto.setStok(data.getStok());
                obatDto.setKategori(data.getKategori());
                obatDto.setTgl(data.getTgl());
                obatdto.add(obatDto);
            }
        }
        return obatdto;
    }

    @Override
    public void saveObat(ObatDto data) {
        ObatModel obat = new ObatModel();
        obat.setKode(data.getKode());
        obat.setNama(data.getNama());
        obat.setHarga(data.getHarga());
        obat.setStok(data.getStok());
        obat.setKategori(data.getKategori());
        obat.setTgl(data.getTgl());
        obatdao.saveObat(obat);

    }

    @Override
    public void deleteObat(Integer id) {
        obatdao.deleteObatModel(id);
    }

    @Override
    public ObatModel getObatById(Integer id) {
        ObatModel obat = new ObatModel();
        obat = obatdao.getObatById(id);
        return obat;
    }

}
