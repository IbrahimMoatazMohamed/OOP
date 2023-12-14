<<<<<<< HEAD
package Week8.Task4;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class GenreFilterIterator implements Iterator<Song> {
    private String genre;
    private List<Song> playlist;
    private int currentIndex;
    public GenreFilterIterator(String genre, List<Song> playlist) {
        this.genre = genre;
        this.playlist = playlist;
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        while (currentIndex < playlist.size() && !playlist.get(currentIndex).getGenre().equals(genre)) {
            currentIndex++;
        }
        return currentIndex < playlist.size();
    }
    @Override
    public Song next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return playlist.get(currentIndex++);
    }
}
=======
package Week8.Task4;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class GenreFilterIterator implements Iterator<Song> {
    private String genre;
    private List<Song> playlist;
    private int currentIndex;
    public GenreFilterIterator(String genre, List<Song> playlist) {
        this.genre = genre;
        this.playlist = playlist;
        currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        while (currentIndex < playlist.size() && !playlist.get(currentIndex).getGenre().equals(genre)) {
            currentIndex++;
        }
        return currentIndex < playlist.size();
    }
    @Override
    public Song next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        return playlist.get(currentIndex++);
    }
}
>>>>>>> ee7a3e2066b705edeaeb71e7cd683b7fb621652d
