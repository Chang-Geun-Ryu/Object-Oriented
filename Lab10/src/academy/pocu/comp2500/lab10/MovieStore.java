package academy.pocu.comp2500.lab10;


import academy.pocu.comp2500.lab10.pocuflix.Movie;
import academy.pocu.comp2500.lab10.pocuflix.NotFoundResult;
import academy.pocu.comp2500.lab10.pocuflix.OkResult;
import academy.pocu.comp2500.lab10.pocuflix.ResultBase;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class MovieStore implements IRequestHandler {
    private ArrayList<Movie> store = new ArrayList<>();
//    private HashMap<Integer, Movie> store = new HashMap<>();

    public void add(Movie movie) {
        if (movie == null) {
            return;
        }

        int index = getIndex(movie.getTitle());
        if (index >= 0) {
            store.set(index, movie);
        } else {
            store.add(movie);
        }
    }
    
    public boolean remove(int index) {
        if (store.size() > index) {
            store.remove(index);
            return true;
        }
        return false;
    }

    @Override
    public ResultBase handle(Request request) {
        if (request == null || request.getTitle() == null) {
            return new NotFoundResult();
        }

        Movie movie = getMovie(request.getTitle());

        if (movie != null) {
            return new OkResult(movie);
        } else {
            return new NotFoundResult();
        }
    }

    private Movie getMovie(String title) {
        for (Movie movie : this.store) {
            if (movie.getTitle() == title) {
                return movie;
            }
        }
        return null;
    }

    private int getIndex(String title) {
        for (Movie movie : this.store) {
            if (movie.getTitle() == title) {
                return store.indexOf(movie);
            }
        }

        return -1;
    }
}
