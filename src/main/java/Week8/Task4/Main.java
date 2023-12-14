<<<<<<< HEAD
package Week8.Task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Song> playlist = new ArrayList<>();

        playlist.add(new Song("Song 1", "Artist 1", "Genre 1"));
        playlist.add(new Song("Song 2", "Artist 2", "Genre 2"));
        playlist.add(new Song("Song 3", "Artist 3", "Genre 3"));
        playlist.add(new Song("Song 4", "Artist 4", "Genre 4"));
        playlist.add(new Song("Song 5", "Artist 5", "Genre 5"));
        playlist.add(new Song("Song 6", "Artist 6", "Genre 6"));
        playlist.add(new Song("Song 7", "Artist 7", "Genre 7"));
        playlist.add(new Song("Song 8", "Artist 8", "Genre 8"));
        playlist.add(new Song("Song 9", "Artist 9", "Genre 9"));
        playlist.add(new Song("Song 10", "Artist 10", "Genre 1"));

        GenreFilterIterator genre = new GenreFilterIterator("Genre 1", playlist);

        while (genre.hasNext()) {
            System.out.println(genre.next());
        }
    }
=======
package Week8.Task4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Song> playlist = new ArrayList<>();

        playlist.add(new Song("Song 1", "Artist 1", "Genre 1"));
        playlist.add(new Song("Song 2", "Artist 2", "Genre 2"));
        playlist.add(new Song("Song 3", "Artist 3", "Genre 3"));
        playlist.add(new Song("Song 4", "Artist 4", "Genre 4"));
        playlist.add(new Song("Song 5", "Artist 5", "Genre 5"));
        playlist.add(new Song("Song 6", "Artist 6", "Genre 6"));
        playlist.add(new Song("Song 7", "Artist 7", "Genre 7"));
        playlist.add(new Song("Song 8", "Artist 8", "Genre 8"));
        playlist.add(new Song("Song 9", "Artist 9", "Genre 9"));
        playlist.add(new Song("Song 10", "Artist 10", "Genre 1"));

        GenreFilterIterator genre = new GenreFilterIterator("Genre 1", playlist);

        while (genre.hasNext()) {
            System.out.println(genre.next());
        }
    }
>>>>>>> ee7a3e2066b705edeaeb71e7cd683b7fb621652d
}