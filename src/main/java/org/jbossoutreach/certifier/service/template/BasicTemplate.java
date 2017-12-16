package org.jbossoutreach.certifier.service.template;

import org.jbossoutreach.certifier.model.Certificate;
import org.jbossoutreach.certifier.model.Student;
import org.jbossoutreach.certifier.service.generator.TemplateGenerator;

import java.io.*;

public class BasicTemplate implements Template {

    @Override
    public InputStream buildTemplate(Certificate certificate)  {
        final File html = TemplateGenerator.generate(certificate, "basic.ftl");
        try {
            return new FileInputStream(html);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return null;
    }
}
