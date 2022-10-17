package com.stacksimplify.restservices.Hello;

import java.util.Locale;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

//Controller

public class HelloWorldController {


    private ResourceBundleMessageSource messageSource;

    //Simple Method
    //URI - /helloworld










        //GET


        public String helloWorld() {
            return "Hello World1";
        }


        public UserDetails helloWorldBean() {
            return new UserDetails("Kalyan", "Reddy", "Hyderabad");
        }


        public String getMessagesInI18NFormat(@RequestHeader(name = "Accept-Language", required=false)
                String locale) {
            return messageSource.getMessage("label.hello", null, new Locale(locale));

        }



        public String getMessagesInI18NFormat2() {
            return messageSource.getMessage("label.hello", null, LocaleContextHolder.getLocale());

        }

    }