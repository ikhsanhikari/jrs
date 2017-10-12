/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phrmc.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import phrmc.dto.ObatDto;
import phrmc.service.ObatService;

/**
 *
 * @author premium
 */
@Controller
public class ObatController {

    @Autowired
    ObatService obatservice;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String view(ModelMap map, ObatDto data) {
        List<ObatDto> list = obatservice.getlistObat();
        map.addAttribute("obatdto", data);
        map.addAttribute("list", list);
        return "index";
    }
    
    @RequestMapping(value = "/addData", method = RequestMethod.GET)
    public String doTambahObat(ModelMap model,ObatDto dto) {
        model.addAttribute("ObatDto", dto);
        return "tambahobat";
    }
    

    @RequestMapping(value = "/saveObat", method = RequestMethod.POST)
    public String saveObat(ModelMap map, ObatDto data) {
        List<ObatDto> list = obatservice.getlistObat();
        map.addAttribute("obatDto", data);
        map.addAttribute("listObat", list);
        obatservice.saveObat(data);
        return "index";
    }
    @RequestMapping(value = "/deleteObat", method = RequestMethod.GET)
    public String deleteObat(ModelMap map, ObatDto data,String id){
        List<ObatDto> list = obatservice.getlistObat();
        map.addAttribute("obatdto", data);
        map.addAttribute("listObat", list);
        obatservice.deleteObat(id);
        return "redirect:index.htm";
        }

}
