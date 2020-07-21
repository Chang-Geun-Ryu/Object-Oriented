package academy.pocu.comp2500.lab10;

import academy.pocu.comp2500.lab10.pocuflix.OkResult;
import academy.pocu.comp2500.lab10.pocuflix.ResultBase;
import academy.pocu.comp2500.lab10.pocuflix.User;
import java.util.HashSet;

public class AuthorizationMiddleware implements IRequestHandler {
    private MovieStore store;
    private HashSet<User> users;

    public AuthorizationMiddleware(MovieStore store, HashSet<User> users) {
        this.store = store;
        this.users = users;
    }

    @Override
    public ResultBase handle(Request request) {
        if (isAuthorization(request.getUser())) {
            return store.handle(request);
        } else {
            return new UnauthorizedResult();
        }
    }

    private boolean isAuthorization(User user) {

        return user != null && this.users.contains(user);
    }
}
