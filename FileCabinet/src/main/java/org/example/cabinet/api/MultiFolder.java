package org.example.cabinet.api;

import org.example.cabinet.api.Folder;

import java.util.List;

public interface MultiFolder extends Folder {

    List<Folder> getFolders();
}
