package com.example.myproductservice.utility;

import com.example.myproductservice.dto.ItemDTO;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.configurationprocessor.json.JSONException;
import org.springframework.boot.configurationprocessor.json.JSONObject;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class DataUtility {

    private static ObjectMapper mapper = new ObjectMapper();

    public static List<ItemDTO>   getDataAsList(String fileName) throws IOException, JSONException {
      //  Resource resource = new ClassPathResource("classpath:data/"+fileName);
        File input = new File("D:\\my-work\\spring-boot\\workspace\\my-product-service\\src\\main\\resources\\data\\sample-product.json");
      byte[]  data= Files.readAllBytes(Paths.get("D:\\my-work\\spring-boot\\workspace\\my-product-service\\src\\main\\resources\\data\\sample-product.json"));
        String s = new String(data);
        JSONObject jsonObject = new JSONObject(s);
        String itemsString = jsonObject.getJSONObject("products").getJSONObject("data").getJSONArray("items").toString();
        return mapper.readValue(itemsString, new TypeReference<List<ItemDTO>>() {
        });
    }

    public static void convertToElastic(String fileName) throws IOException, JSONException {
        File output = new File("converted-items.json");
        List<ItemDTO> itemDTOList = getDataAsList(fileName);
        StringBuilder builder = new StringBuilder();
        for (ItemDTO item:itemDTOList){

            builder.append("{ \"create\":{\"index\":\"itemindex\",\"_id\":"+item.getId()+"}}");
            builder.append("\n");
            builder.append(mapper.writer().writeValueAsString(item));
        }
     //   Files.write("output.json",builder.toString().getBytes(StandardCharsets.UTF_8),Op)
     //  mapper.writerWithDefaultPrettyPrinter().(output,builder.toString());

    }

}
