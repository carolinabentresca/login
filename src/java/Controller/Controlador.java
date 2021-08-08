/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Config.Conexion;
import Entity.log;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author EXO
 */
@Controller
public class Controlador {

    Conexion conexion = new Conexion();
    JdbcTemplate jdbcTemplate = new JdbcTemplate(conexion.Conectar());
    ModelAndView mv = new ModelAndView();

    @RequestMapping(value = "index.htm", method = RequestMethod.GET)
    public ModelAndView getLogin() {
        mv.setViewName("index");
        return mv;
    }

    @RequestMapping(value = "registro.htm", method = RequestMethod.GET)
    public ModelAndView Registrar() {
        mv.addObject(new log());
        mv.setViewName("registro");
        return mv;
    }

    @RequestMapping(value = "ok.htm", method = RequestMethod.GET)
    public ModelAndView getOk() {
        mv.setViewName("ok");
        return mv;
    }

    @RequestMapping(value = "datos.htm", method = RequestMethod.GET)
    public ModelAndView getDatos() {
        mv.setViewName("datos");
        return mv;
    }

    @RequestMapping(value = "mod.htm", method = RequestMethod.GET)
    public ModelAndView getMod() {
        mv.setViewName("mod");
        return mv;
    }

    @RequestMapping(value = "okUpdate.htm", method = RequestMethod.GET)
    public ModelAndView getOkUpdate() {
        mv.setViewName("okUpdate");
        return mv;
    }

    @RequestMapping(value = "bien.htm", method = RequestMethod.GET)
    public ModelAndView getBien() {
        mv.setViewName("bien");
        return mv;
    }

    @RequestMapping(value = "registro.htm", method = RequestMethod.POST)
    public ModelAndView Registrar(log l) {
        String sql = "insert into log(usuario,mail,password)values(?,?,?)";
        try {
            this.jdbcTemplate.update(sql, l.getUsuario(), l.getMail(), l.getPassword());
            return new ModelAndView("redirect:/ok.htm");
        } catch (DataAccessException e) {
            e.getMessage();
        }
        return mv;
    }

    @RequestMapping(value = "index.htm", method = RequestMethod.POST)
    public ModelAndView Login(log l) {
        String sql = "select usuario from log where usuario = ? and password = ?";
        try {
            String usuario = this.jdbcTemplate.queryForObject(sql, new Object[]{l.getUsuario(), l.getPassword()}, String.class);
            if (usuario.equals("")) {
                mv.setViewName("index");
            } else {
                mv.setViewName("datos");
            }

        } catch (DataAccessException e) {
            e.getMessage();
        }
        return mv;
    }

    @RequestMapping(value = "mod.htm", method = RequestMethod.POST)
    public ModelAndView Modificar(log l) {
        String sql = "update log set mail = ? , password = ?  where usuario = ? ";
        this.jdbcTemplate.update(sql, l.getMail(), l.getPassword(), l.getUsuario());
        return new ModelAndView("redirect:/okUpdate.htm");
    }

    @RequestMapping(value = "bien.htm", method = RequestMethod.POST)
    public ModelAndView getBien(@RequestParam("usuario") String usuario) {
        mv.addObject("usuario", "Bienvenid@    "  + usuario +  "   a la Plataforma < CodeNet >  ");
        mv.setViewName("bien");
        return mv;
    }
}
