package com.example.inicial1.controllers;

import com.example.inicial1.entities.Localidad;
import com.example.inicial1.entities.Persona;
import com.example.inicial1.services.LocalidadServiceImpl;
import com.example.inicial1.services.PersonaServiceImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/localidad")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl>{

}