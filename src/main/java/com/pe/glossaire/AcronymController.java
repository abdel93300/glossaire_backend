package com.pe.glossaire;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


@RestController
public class AcronymController {

    @CrossOrigin(origins = "*")
    @GetMapping("/acronym")
    public List<Acronym> acronym(@RequestParam(value="name",defaultValue="all") String name) {
        System.out.println("==== dans la function acronym ====");

        name="ARE";
        Date date = new Date();

        String summary="summary de ARE";
        String definition= "définition longue de ARE";
        Description description= new Description(summary,definition);
        String author="Abdel";
        boolean obsolete=false;
        List<Acronym> acronyms=new ArrayList<Acronym>();
        Acronym acronym = new Acronym(name, date, description, author, obsolete);
        acronyms.add(acronym);
        return acronyms;

    }

}

