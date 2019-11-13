package com.json;

import javax.json.Json;
import javax.json.JsonReader;
import javax.json.JsonStructure;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;


public class Test1 {

    public static void main(String[] args) throws IOException {
        Test1 t1 = new Test1();
        t1.readJsonFile("src/main/resources/json/data.json", false);
    }

    /**
     * 从文件读取json
     * @param path 文件路径
     * @param ifshow 是否输出到标准输出
     */
    public void readJsonFile(String path, boolean ifshow){
        JsonReader reader=null;
        try{
            reader = Json.createReader(new FileReader(path));
            JsonStructure jsonst = reader.read();
            if(ifshow){
                System.out.println(jsonst);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            reader.close();
        }
    }

    /**
     * 从文件读取json
     * @param path 待读文件路径
     */
    public void readJsonFile(String path){
        JsonReader reader=null;
        try{
            reader = Json.createReader(new FileReader(path));
            JsonStructure jsonst = reader.read();
            System.out.println(jsonst);
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }finally {
            reader.close();
        }
    }

}
