package org.jbossoutreach.certifier.route;

import io.vertx.ext.web.Router;
import io.vertx.ext.web.handler.StaticHandler;

public class AssetRoute implements Route {
    @Override
    public void setup(Router router) {
        router.route("/*").handler(StaticHandler.create("static"));
    }
}
