package com.sazzad.maven.services.impl;

import com.sazzad.maven.services.BluePrinter;
import com.sazzad.maven.services.ColorPrinter;
import com.sazzad.maven.services.GreenPrinter;
import com.sazzad.maven.services.RedPrinter;
import org.springframework.stereotype.Component;

@Component
public class ColorPrinterImpl implements ColorPrinter {
    private RedPrinter redPrinter;
    private BluePrinter bluePrinter;
    private GreenPrinter greenPrinter;

    public ColorPrinterImpl(RedPrinter redPrinter, BluePrinter bluePrinter, GreenPrinter greenPrinter){
        this.redPrinter = redPrinter;
        this.bluePrinter = bluePrinter;
        this.greenPrinter = greenPrinter;
    }
    @Override
    public String print() {
        return String.join(", ",redPrinter.print(),bluePrinter.print(), greenPrinter.print());
    }
}
