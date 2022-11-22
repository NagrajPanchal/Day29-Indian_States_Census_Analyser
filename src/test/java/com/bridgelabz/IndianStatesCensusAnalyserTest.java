package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IndianStatesCensusAnalyserTest
{
    private static final String Indian_Census_Csv_File_Path = "C:\\Users\\user\\Desktop\\bridgelabz\\Day29-Indian_States_Census_Analyser\\src\\test\\resources\\IndiaStateCensusData.csv";
    @Test
    public void givenFileReturnNumberOfRecords() throws CensusAnalyserException {

        CensusAnalyser censusAnalyser = new CensusAnalyser();
        int numberOfRecords = censusAnalyser.loadCensusData(Indian_Census_Csv_File_Path);
        Assertions.assertEquals(30, numberOfRecords);
    }
}
