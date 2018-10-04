package com.test.kube.logs.demo.controller;

import java.util.Date;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping( "/generatelogs" )
public class LogGenerator
{

    private Logger log = Logger.getLogger( LogGenerator.class );


    @RequestMapping( method = RequestMethod.GET )
    public @ResponseBody String sayHello()
    {
        for( int i = 0; i < 10; i++ )
        {
            log.info( "Generating logs for time : " + i );
            log.info( "time in millis : " + System.currentTimeMillis() );
            log.info( "date : " + new Date() );
        }
        return "Log generated : " + new Date();
    }

}
