/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DescriptionModel;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.jsonschema.JsonSchema;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import javax.xml.validation.Schema;
import org.everit.json.schema.loader.SchemaLoader;
import org.json.JSONObject;
import org.json.JSONTokener;

/**
 *
 * @author ASUS
 */
public class JsonSchemaGenerator {

    private JsonSchemaGenerator() {
    }

    ;

    public static void main(String[] args) throws IOException {
        System.out.println(JsonSchemaGenerator.getJsonSchema(DescriptionManager.class));
        File shemaFile = new File("target/JsonSchema.txt");

        PrintWriter writer = new PrintWriter(shemaFile);
        writer.write(JsonSchemaGenerator.getJsonSchema(DescriptionManager.class));

        writer.close();
    }

    public static String getJsonSchema(Class clazz) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRITE_ENUMS_USING_TO_STRING, true);
        JsonSchema schema = mapper.generateJsonSchema(clazz);
        return mapper.writerWithDefaultPrettyPrinter().writeValueAsString(schema);
    }

 
}
