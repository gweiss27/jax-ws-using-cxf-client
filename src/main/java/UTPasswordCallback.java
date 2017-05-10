import org.apache.wss4j.common.ext.WSPasswordCallback;

import javax.security.auth.callback.Callback;
import javax.security.auth.callback.CallbackHandler;
import javax.security.auth.callback.UnsupportedCallbackException;
import java.io.IOException;

public class UTPasswordCallback implements CallbackHandler {
    public void handle(Callback[] callbacks) throws IOException, UnsupportedCallbackException {
        for (Callback callback : callbacks) {
            WSPasswordCallback wpc = (WSPasswordCallback) callback;
            if (wpc.getIdentifier().equals("cxf")) {
                wpc.setPassword("cxf");
                return;
            }
        }
    }
}
