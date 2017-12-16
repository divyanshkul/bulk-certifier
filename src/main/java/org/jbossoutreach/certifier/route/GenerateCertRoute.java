package org.jbossoutreach.certifier.route;

import io.vertx.ext.web.Router;
import io.vertx.ext.web.RoutingContext;
import io.vertx.ext.web.handler.BodyHandler;
import org.jbossoutreach.certifier.model.Certificate;
import org.jbossoutreach.certifier.model.Student;
import org.jbossoutreach.certifier.service.CertManager;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class GenerateCertRoute implements Route {
    private final CertManager certManager;

    public GenerateCertRoute(CertManager certManager) {
        this.certManager = certManager;
    }

    @Override
    public void setup(Router router) {

        router.route().handler(BodyHandler.create());
        router.route("/generateCert*").handler(BodyHandler.create());
        router.post("/generateCert").handler(this::generateCert);
    }

    private void generateCert(RoutingContext routingContext) {

        final Student student = new Student(
                routingContext.request().getFormAttribute("name"),
                routingContext.request().getFormAttribute("email"),
                routingContext.request().getFormAttribute("score")
        );

        final Certificate certificate = new Certificate(
                "Some Random Organisation",
                "Certificate of Participation",
                "Basic Git Bootcamp",
                student
        );

        final String outPath = certManager.generateCert(certificate);
        routingContext.response().sendFile(outPath);
    }

}
