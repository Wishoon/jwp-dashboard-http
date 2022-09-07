package nextstep.jwp.presentation;

import nextstep.jwp.http.common.HttpStatus;
import nextstep.jwp.http.request.HttpRequest;
import nextstep.jwp.http.response.HttpResponse;

public class DefaultController extends AbstractController {

    public static final String DEFAULT_PATH = "/";

    public static DefaultController instance = new DefaultController();

    private DefaultController() {
    }

    public static DefaultController getInstance() {
        return instance;
    }

    @Override
    protected void doGet(final HttpRequest httpRequest, final HttpResponse httpResponse) {
        httpResponse.addHttpStatus(HttpStatus.OK);
        httpResponse.addResponseBody("Hello world!");
    }
}
