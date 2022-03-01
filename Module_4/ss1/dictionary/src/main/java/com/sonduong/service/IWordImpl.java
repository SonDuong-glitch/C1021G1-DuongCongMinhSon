package com.sonduong.service;


import java.util.HashMap;
import java.util.Map;

public class IWordImpl implements IWord{
    @Override
    public Map<String, String> listWord() {
        Map<String,String> list = new HashMap<>();
        list.put("ô tô", "car");
        list.put("xin chào", "hello");
        list.put("tạm biệt","goodbye");
        list.put("khóc","cry");
        list.put("cười","smile");
        list.put("tiền","money");
        list.put("xe đạp","bicycle");
        return list;
    }
}
