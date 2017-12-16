package org.jbossoutreach.certifier;

import io.vertx.core.AbstractVerticle;
import io.vertx.ext.web.Router;
import org.jbossoutreach.certifier.route.Route;

import java.awt.*;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

public class AppVerticle extends AbstractVerticle {

    private final List<Route> routes;

    public AppVerticle(List<Route> routes) {
        this.routes = routes;
    }

    @Override
    public void start() throws Exception {
        final Router router = Router.router(vertx);
        routes.forEach(route -> route.setup(router));

        vertx.createHttpServer()
                .requestHandler(router::accept)
                .listen(4000 ,
                        result -> {
                            System.out.println("Open link for app http://localhost:" + 4000);
                        }
                );
    }
}
