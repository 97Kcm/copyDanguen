package com.dangeun.converter;


import com.dangeun.dto.FileDTO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;
import java.util.UUID;

public class FilesConverter implements Converter<List<MultipartFile>, List<FileDTO>> {
    @Override
    public List<FileDTO> convert(List<MultipartFile> source) {
        return source.parallelStream().map(file -> {
            FileDTO fileDTO = new FileDTO();
            fileDTO.setFile(file);
            return fileDTO;
        }).toList();
    }
}

