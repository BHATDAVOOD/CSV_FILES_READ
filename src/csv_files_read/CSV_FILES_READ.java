/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package csv_files_read;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author bhatd
 */
public class CSV_FILES_READ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String csvFile = "C:\\Users\\bhatd\\OneDrive\\Desktop\\rolldata.csv";  // ENTER THE PATH OF YOUR CSV FILE HERE 
        String line = "";
        String cvsSplitBy = ",";

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

            while ((line = br.readLine()) != null) {

                // use comma as separator
                String[] data = line.split(cvsSplitBy);

                System.out.println("[ "+ data[0]+"]["+data[1]+"]["+data[2]+"]["+data[3]+"]["+data[4]+"]");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }   
}
