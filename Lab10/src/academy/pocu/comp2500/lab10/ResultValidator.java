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
        return isInstance(code);
    }

    private boolean isInstance(ResultCode code) {

        if (base.getCode() == code && base instanceof OkResult) {
            return true;
        } else if (base.getCode() == code && base instanceof NotFoundResult) {
            return true;
        } else if (base.getCode() == code  && base instanceof ServiceUnavailableResult) {
            return true;
        } else if (base.getCode() == code  && base instanceof UnauthorizedResult) {
            return true;
        } else if (base.getCode() == code  && base instanceof CachedResult) {
            return true;
        } else {
            return false;
        }
    }
}
