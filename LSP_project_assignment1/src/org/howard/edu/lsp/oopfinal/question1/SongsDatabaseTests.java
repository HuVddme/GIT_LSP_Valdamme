package org.howard.edu.lsp.oopfinal.question1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class SongsDatabaseTests {
	private SongsDatabase db;

    @BeforeEach
    public void setUp() {
        db = new SongsDatabase();
        db.addSong("Rap", "Savage");
        db.addSong("Country", "Sweet Alabama");
        db.addSong("Jazz", "Always There");
    }

    @Test
    public void testAddSong() {
        db.addSong("Rap", "Gin and Juice");
        assertTrue(db.getSongs("Rap").contains("Gin and Juice"));
    }

    @Test
    public void testGetGenreOfSong() {
        assertEquals("Rap", db.getGenreOfSong("Savage"));
        assertEquals("Jazz", db.getGenreOfSong("Always There"));
        assertNull(db.getGenreOfSong("Unknown Song")); // Testing for a song that does not exist
    }

    @Test
    public void testGetSongs() {
        Set<String> rapSongs = db.getSongs("Rap");
        assertTrue(rapSongs.contains("Savage"));
        assertEquals(1, rapSongs.size()); // Assuming "Gin and Juice" wasn't added in setup
    }

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}

}
