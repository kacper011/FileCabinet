package org.example.cabinet;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class FileCabinetTest {

    @Test
    void testFindFolderByName() {
        Folder f1 = new SimpleFolder("A", "SMALL");
        Folder f2 = new SimpleFolder("B", "MEDIUM");
        MultiFolder mf = new CompositeFolder("D", "LARGE", Arrays.asList(f2));

        FileCabinet cabinet = new FileCabinet(Arrays.asList(f1, mf));

        Optional<Folder> found = cabinet.findFolderByName("B");
        assertTrue(found.isPresent());
        assertEquals("B", found.get().getName());

        Optional<Folder> notFound = cabinet.findFolderByName("X");
        assertTrue(notFound.isEmpty());
    }

    @Test
    void testFindFoldersBySize() {

        Folder f1 = new SimpleFolder("A", "SMALL");
        MultiFolder mf = new CompositeFolder("D", "SMALL", Arrays.asList(
                new SimpleFolder("B", "MEDIUM"),
                new SimpleFolder("C", "SMALL")
        ));

        FileCabinet cabinet = new FileCabinet(Arrays.asList(f1, mf));

        assertEquals(3, cabinet.findFoldersBySize("SMALL").size());
    }
}