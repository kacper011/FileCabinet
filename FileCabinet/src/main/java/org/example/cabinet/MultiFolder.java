package org.example.cabinet;

import java.util.List;

public interface MultiFolder extends Folder{

    List<Folder> getFolders();
}
