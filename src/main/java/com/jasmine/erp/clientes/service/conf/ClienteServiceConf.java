package com.jasmine.erp.clientes.service.conf;



import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.jasmine.erp.clientes.conf.ClientesBDConfig;

@Configuration
@Import(ClientesBDConfig.class)
@ComponentScan("com.jasmine.erp.clientes.service")
public class ClienteServiceConf {

}
