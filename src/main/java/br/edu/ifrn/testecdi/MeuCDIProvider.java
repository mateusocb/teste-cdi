package br.edu.ifrn.testecdi;

import javax.enterprise.inject.spi.CDI;
import javax.enterprise.inject.spi.CDIProvider;


public class MeuCDIProvider implements CDIProvider {

    @Override
    public CDI<Object> getCDI() {
        return (CDI<Object>) new Object();
    }
}