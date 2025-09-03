package org.example.cabinet.impl;

import org.example.cabinet.api.Folder;
import org.example.cabinet.api.MultiFolder;

import java.util.List;

public class CompositeFolder implements MultiFolder {
    private final String name;
    private final String size;
    private final List<Folder> folders;

    public CompositeFolder(String name, String size, List<Folder> folders) {
        this.name = name;
        this.size = size;
        this.folders = folders;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getSize() {
        return size;
    }

    @Override
    public List<Folder> getFolders() {
        return folders;
    }

    @Override
    public String toString() {
        return "CompositeFolder{" +
                "name='" + name + '\'' +
                ", size='" + size + '\'' +
                ", folders=" + folders +
                '}';
    }
}
