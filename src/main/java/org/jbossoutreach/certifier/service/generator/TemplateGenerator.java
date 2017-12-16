package org.jbossoutreach.certifier.service.generator;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.TemplateException;
import org.jbossoutreach.certifier.model.Certificate;
import org.jbossoutreach.certifier.model.Student;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.HashMap;
import java.util.Map;

public class TemplateGenerator {

    public static File generate(Certificate certificate, String templatePath) {

        //Freemarker configuration object
        Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(TemplateGenerator.class, "/templates");
        try {
            //Load template from source folder
            Template template = configuration.getTemplate(templatePath);

            // Build the data-model
            Map<String, Object> data = new HashMap<String, Object>();
            data.put("certificate", certificate);

            // File output
            File html = File.createTempFile("certi-", ".html");
            Writer file = new FileWriter(html);
            template.process(data, file);
            file.flush();
            file.close();

            return html;

        } catch (IOException e) {
            e.printStackTrace();
        } catch (TemplateException e) {
            e.printStackTrace();
        }

        return null;
    }
}