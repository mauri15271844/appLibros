package com.libros.appLibros.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControladorRest {
    @GetMapping("/")
    public String saludar(){

        return "hola mama Yo soy millonario";
    }


        @GetMapping("/info")
        public String SoyMillonario(){

            return "hola mama Yo soy millonario, yo soy archimillonario    :)";
        }



    }
