package com.khanhnn.service;

import java.util.HashMap;
import java.util.Map;

public class DictionaryServiceImpl implements DictionaryService {

    private static Map<String, String> dic;

    static {
        dic = new HashMap<String, String>();

        dic.put("cat", "meo");
        dic.put("car", "oto");
        dic.put("book", "sach");
        dic.put("love", "yeu");
        dic.put("hello", "xin chao");
        dic.put("dictionary", "tu dien");
    }

    @Override
    public String find(String word) {
        String result = dic.get(word);

        if (result == null){
            return "Not found";
        }else {
            return result;
        }
    }
}
