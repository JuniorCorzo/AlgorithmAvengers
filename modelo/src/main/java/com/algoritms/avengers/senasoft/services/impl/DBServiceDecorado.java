package com.algoritms.avengers.senasoft.services.impl;

import com.algoritms.avengers.senasoft.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("crud")
public class DBServiceDecorado implements DBService {
    @Autowired
    private DBServiceEncontrarImpl encontrarInfo;
    @Autowired
    private DBServiceManejoDatosImpl manejoDatos;
}
