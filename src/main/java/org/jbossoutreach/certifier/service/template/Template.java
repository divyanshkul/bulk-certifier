package org.jbossoutreach.certifier.service.template;

import org.jbossoutreach.certifier.model.Certificate;
import org.jbossoutreach.certifier.model.Student;

import java.io.InputStream;

public interface Template {
    public InputStream buildTemplate(Certificate certificate);
}
