package com.jsc.config;

import com.jsc.model.RsDKIJakarta;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class JscPreference {

    public static List<RsDKIJakarta> IOrsRujukanDKIJakartaList;

    @Value("${url.rs.rujukan}")
    public String URL_RS_RUJUKAN;

    @Value("${url.rs.dki.jakarta}")
    public String URL_RS_DKI_JAKARTA;
}
