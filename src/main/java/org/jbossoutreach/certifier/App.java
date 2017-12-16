package org.jbossoutreach.certifier;

import io.vertx.core.Vertx;
import org.jbossoutreach.certifier.route.AssetRoute;
import org.jbossoutreach.certifier.route.GenerateCertRoute;
import org.jbossoutreach.certifier.route.Route;
import org.jbossoutreach.certifier.service.CertManager;
import org.jbossoutreach.certifier.service.generator.CertGenerator;
import org.jbossoutreach.certifier.service.generator.PdfCertGenerator;
import org.jbossoutreach.certifier.service.template.BasicTemplate;
import org.jbossoutreach.certifier.service.template.Template;

import java.util.ArrayList;
import java.util.List;

public class App {
    private static final String OUTPUT_PATH = "./output/certificate.pdf";

    public static void main(String[] args) {
        final AppVerticle verticle = new AppVerticle(provideRoutes());
        final Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(verticle);
    }

    private static List<Route> provideRoutes() {
        final List<Route> routes = new ArrayList<>();
        routes.add(provideAssetRoute());
        routes.add(provideGenerateCertRoute());
        return routes;
    }

    private static Route provideGenerateCertRoute() {
        final Template template = new BasicTemplate();
        final CertGenerator certGenerator = new PdfCertGenerator(OUTPUT_PATH, template);
        final CertManager certManager = new CertManager(certGenerator);
        return new GenerateCertRoute(certManager);
    }

    private static Route provideAssetRoute() {
        return new AssetRoute();
    }
}
