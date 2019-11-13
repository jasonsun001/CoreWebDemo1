package com.json;

import javax.json.Json;
import javax.json.JsonReader;
import javax.json.JsonStructure;
import java.io.FileReader;
import java.io.IOException;

public class test1 {
    public static void main(String[] args) throws IOException {
        JsonReader reader = Json.createReader(new FileReader("C:\\Users\\14792\\Desktop\\商城列表明细\\json"));
        JsonStructure jsonst = reader.read();
        System.out.println(jsonst);
    }
}
