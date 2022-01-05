/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DescriptionModel;

import ViewProvider.MainDescription;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class DescriptionMapper {

    public DescriptionMapper() {
    }
    
    public void mapper(DescriptionManager smart_contract_description){
        String file = smart_contract_description.getName() + ".json";
        File descriptionFile = new File("target/description.json");
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            objectMapper.writeValue(descriptionFile,  smart_contract_description);
        } catch (IOException ex) {
            Logger.getLogger(MainDescription.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
