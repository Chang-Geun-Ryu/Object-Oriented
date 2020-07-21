package academy.pocu.comp2500.lab10;

import academy.pocu.comp2500.lab10.pocuflix.OkResult;
import academy.pocu.comp2500.lab10.pocuflix.ResultBase;
import academy.pocu.comp2500.lab10.pocuflix.ResultCode;

import java.time.OffsetDateTime;
import java.time.ZoneOffset;

public class MaintenanceMiddleware implements IRequestHandler {
    private MovieStore store;
    private OffsetDateTime time;
    private ServiceUnavailableResult serviceUnavailableResult;

    public MaintenanceMiddleware(MovieStore store, OffsetDateTime time) {
        this.store = store;
        this.time = time;
        OffsetDateTime end = time.plusHours(1);
        this.serviceUnavailableResult = new ServiceUnavailableResult(time, end);
    }

    public ResultBase handle(Request request) {
        if (isMaintenance() == false) {
            return store.handle(request);
        } else {
            return serviceUnavailableResult;
        }
    }

    private boolean isMaintenance() {
        OffsetDateTime now = OffsetDateTime.now(ZoneOffset.UTC);
        return serviceUnavailableResult.getStartDateTime().isBefore(now) &&
                serviceUnavailableResult.getEndDateTime().isAfter(now);
    }
}
