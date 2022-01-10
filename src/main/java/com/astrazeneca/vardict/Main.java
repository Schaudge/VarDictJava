package com.astrazeneca.vardict;

import com.astrazeneca.vardict.data.ReferenceResource;
import org.apache.commons.cli.*;

import java.io.FileNotFoundException;

public class Main {
    /**
     * Method to build options from command line
     * @param args array of arguments from command line
     * @throws ParseException if command line options can't be parsed
     */
    public static void main(String[] args) throws ParseException, FileNotFoundException {
        Configuration config = new CmdParser().parseParams(args);
        ReferenceResource referenceResource = new ReferenceResource();
        config.createHotspotTable(); // add by Schaudge King
        new VarDictLauncher(referenceResource).start(config);
    }
}
