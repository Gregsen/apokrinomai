package io.github.gregsen.apokrinomai.reader;

import org.springframework.beans.factory.annotation.Value;

import java.util.List;

public class FsReader implements Reader {


    @Override
    public List<String> getFilePaths() {
        return null;
    }

    @Override
    public String getContent(String filePath) {
        return null;
    }
}
