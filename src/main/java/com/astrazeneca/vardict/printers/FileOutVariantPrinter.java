package com.astrazeneca.vardict.printers;

import java.io.FileNotFoundException;
import java.io.PrintStream;
/**
 * Standard output for variant printer (will print to STDOUT).
 */
public class FileOutVariantPrinter extends VariantPrinter {
    public FileOutVariantPrinter(String outputFileName) throws FileNotFoundException {
        out = new PrintStream(outputFileName);
    }
}
