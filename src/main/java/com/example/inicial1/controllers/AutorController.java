package com.example.inicial1.controllers;

import com.example.inicial1.entities.Autor;
import com.example.inicial1.entities.Localidad;
import com.example.inicial1.services.AutorServiceImpl;
import com.example.inicial1.services.LocalidadServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/autor")
public class AutorController extends BaseControllerImpl<Autor, AutorServiceImpl>{

}
