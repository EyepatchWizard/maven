package com.sazzad.maven.services.impl;

import com.sazzad.maven.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class EnglishRedPrinter implements RedPrinter
{
    @Override
    public String print() {
        return "red";
    }
}
