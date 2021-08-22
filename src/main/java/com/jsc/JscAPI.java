package com.jsc;

import com.jsc.config.JscPreference;
import com.jsc.model.RsDKIJakarta;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/rest/rs")
public class JscAPI {

    @GetMapping("/rujukan")
    public List<RsDKIJakarta> findRsRujukanDkiJakarta() {
        return JscPreference.IOrsRujukanDKIJakartaList;
    }
}
