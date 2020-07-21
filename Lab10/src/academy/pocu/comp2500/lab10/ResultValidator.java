package academy.pocu.comp2500.lab10;

import academy.pocu.comp2500.lab10.pocuflix.NotFoundResult;
import academy.pocu.comp2500.lab10.pocuflix.OkResult;
import academy.pocu.comp2500.lab10.pocuflix.ResultBase;
import academy.pocu.comp2500.lab10.pocuflix.ResultCode;

public class ResultValidator {
    private ResultBase base;

    public ResultValidator(ResultBase base) {
        this.base = base;
    }

    public boolean isValid(ResultCode code) {
        return base.getCode() == code;
    }

    private boolean isInstance(ResultCode code) {
        if (this.base instanceof OkResult && code == ResultCode.OK) {
            return true;
        } else if (this.base instanceof NotFoundResult && code == ResultCode.NOT_FOUND) {
            return true;
        } else if (this.base instanceof ServiceUnavailableResult && code == ResultCode.SERVICE_UNAVAILABLE) {
            return true;
        } else if (this.base instanceof UnauthorizedResult && code == ResultCode.UNAUTHORIZED) {
            return true;
        } else if (this.base instanceof CachedResult && code == ResultCode.NOT_MODIFIED) {
            return true;
        } else {
            return false;
        }
    }
}
