package ru.vasiliev.socks.controller;


import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.vasiliev.socks.Error.SocksError;
import ru.vasiliev.socks.repository.Socks;
import ru.vasiliev.socks.services.SocksServices;

import javax.validation.Valid;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Slf4j
@RequiredArgsConstructor
@RestController
public class SocksController {

    private final SocksServices socksServices;

    @GetMapping(value = "/socks", produces = APPLICATION_JSON_VALUE)
    public Socks start(@RequestParam("color") String color,
                       @RequestParam("cottonPath") Integer cottonPath,
                       @RequestParam("operation") String operation){
        return socksServices.getSocks(color,cottonPath,operation);
    }

    @PostMapping(value = "/socks/income", produces = APPLICATION_JSON_VALUE)
    public Socks income(@Valid @RequestBody Socks socks){
        return socksServices.income(socks);
    }



    @PostMapping(value = "/socks/outcome", produces = APPLICATION_JSON_VALUE)
    public void outcome(@Valid @RequestBody Socks socks) {
        socksServices.outcome(socks);
    }



}
