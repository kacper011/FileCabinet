package org.example;

import org.example.cabinet.FileCabinet;
import org.example.cabinet.Folder;
import org.example.cabinet.MultiFolder;
import org.example.cabinet.SimpleFolder;
import org.example.cabinet.CompositeFolder;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Folder f1 = new SimpleFolder("A", "SMALL");
        Folder f2 = new SimpleFolder("B", "MEDIUM");
        Folder f3 = new SimpleFolder("C", "LARGE");

        MultiFolder mf = new CompositeFolder("D", "SMALL", Arrays.asList(f2, f3));

        FileCabinet cabinet = new FileCabinet(Arrays.asList((Folder) f1, (Folder) mf));

        System.out.println("Find folder by name 'B': " + cabinet.findFolderByName("B"));
        System.out.println("Find folders by size 'SMALL': " + cabinet.findFoldersBySize("SMALL"));
        System.out.println("Total folder count: " + cabinet.count());
    }
}