package com.aexp.reports.beans.mapper;

import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.context.annotation.Bean;

import java.util.List;

public class Mapper {
    protected final ModelMapper mapper = new ModelMapper();

    public <T> List<T> mapToList(Object o) {
        var type = new TypeToken<List<T>>(){}.getType();

        return mapper.map(o, type);
    }

    public <T>T map(Object o){
        var type = new TypeToken<T>(){}.getType();
        return mapper.map(o, type);
    }
}
