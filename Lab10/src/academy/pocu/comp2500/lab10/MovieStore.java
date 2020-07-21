package academy.pocu.comp2500.lab10;


import academy.pocu.comp2500.lab10.pocuflix.Movie;
import academy.pocu.comp2500.lab10.pocuflix.NotFoundResult;
import academy.pocu.comp2500.lab10.pocuflix.OkResult;
import academy.pocu.comp2500.lab10.pocuflix.ResultBase;

import java.util.ArrayList;

public class MovieStore implements IRequestHandler {
    private ArrayList<Movie> store = new ArrayList<>();

    public void add(Movie movie) {
        store.add(movie);
    }
    
    public boolean remove(int index) {
        if (store.size() > index) {
            return store.remove(index) != null;
        }
        return false;
    }

    @Override
    public ResultBase handle(Request request) {
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
}
