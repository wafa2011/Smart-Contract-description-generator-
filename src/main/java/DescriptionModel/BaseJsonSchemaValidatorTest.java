/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DescriptionModel;

import java.io.IOException;
import java.io.InputStream;
import javax.xml.validation.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;



/**
 *
 * @author ASUS
 */
public class BaseJsonSchemaValidatorTest {
    
public void validate() throws IOException{
    try (InputStream inputStream = getClass().getResourceAsStream("target/description.json")) {
     InputStream  schema2 = getClass().getResourceAsStream("target/JsonSchema.txt");
        JSONObject rawSchema = new JSONObject(new JSONTokener(inputStream));
    org.everit.json.schema.Schema schema = SchemaLoader.load(rawSchema);
     schema.validate(schema2); // throws a ValidationException if this object is invalid

}
}
    public static void main(String[] args) throws IOException {
        BaseJsonSchemaValidatorTest bs = new BaseJsonSchemaValidatorTest();
        bs.validate();
    }
}