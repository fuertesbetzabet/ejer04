/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.ejerciciosem4.controller;

import com.example.ejerciciosem4.model.alumno;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 *
 * @author BETZABET
 */

@Controller
public class AlumnoController {
    @GetMapping("/")
    public String mostrarFormulario(Model model) {
        model.addAttribute("alumno", new alumno());
        return "registro";
    }

    @PostMapping("/registrar")
    public String registrarAlumno(@ModelAttribute alumno alumno, Model model) {
        model.addAttribute("alumno", alumno);
        return "exito";
    }
}
