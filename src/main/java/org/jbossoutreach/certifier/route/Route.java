package org.jbossoutreach.certifier.route;

import io.vertx.ext.web.Router;

public interface Route {
    public void setup(Router router);
}
