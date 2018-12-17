package hu.ak_akademia.webshop.exception;

public class WebShopRuntimeException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    public WebShopRuntimeException() {
        super();
    }

    public WebShopRuntimeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }

    public WebShopRuntimeException(String message, Throwable cause) {
        super(message, cause);
    }

    public WebShopRuntimeException(String message) {
        super(message);
    }

    public WebShopRuntimeException(Throwable cause) {
        super(cause);
    }

}