package org.example.cabinet;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileCabinet implements Cabinet{

    private final List<Folder> folders;


    public FileCabinet(List<Folder> folders) {
        this.folders = folders != null ? folders : new ArrayList<>();
    }

    @Override
    public Optional<Folder> findFolderByName(String name) {
        return traverse(folders)
                .filter(f -> f.getName().equals(name))
                .findFirst();
    }

    @Override
    public List<Folder> findFoldersBySize(String size) {
        return traverse(folders)
                .filter(f -> f.getSize().equals(size))
                .collect(Collectors.toList());
    }

    @Override
    public int count() {
        return (int) traverse(folders).count();
    }


    /*
    The recursive method returns a stream of all folders, including nested ones.
    */

    private Stream<Folder> traverse(List<Folder> roots) {
        List<Folder> all = new ArrayList<>();
        for (Folder folder : roots) {
            all.add(folder);
            if (folder instanceof MultiFolder mf) {
                all.addAll(traverse(mf.getFolders()).toList());
            }
        }
        return all.stream();
    }
}