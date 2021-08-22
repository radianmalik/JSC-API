package com.jsc;

import com.jsc.config.JscPreference;
import com.jsc.model.DaftarRsRujukan;
import com.jsc.model.RsDKIJakarta;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.web.client.RestTemplate;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com.jsc"})
public class JscServiceStarter
{
    private final Logger log = LoggerFactory.getLogger(JscServiceStarter.class);

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    JscPreference jscPreference;

    public static void main(String[] args){
        SpringApplication.run(JscServiceStarter.class);
    }

    @PostConstruct
    public void getAllDataRs() throws Exception {

        try {
            List<DaftarRsRujukan> daftarRsRujukanList = this.exchangeAsList(jscPreference.URL_RS_RUJUKAN,
                    new ParameterizedTypeReference<List<DaftarRsRujukan>>() {});
            List<RsDKIJakarta> rsDKIJakartaList = this.exchangeAsList(jscPreference.URL_RS_DKI_JAKARTA,
                    new ParameterizedTypeReference<List<RsDKIJakarta>>() {});

            Set<String> rsRujukan =
                    daftarRsRujukanList.stream()
                            .map(DaftarRsRujukan::getKecamatan)
                            .collect(Collectors.toSet());

            JscPreference.IOrsRujukanDKIJakartaList =
                    rsDKIJakartaList.stream()
                            .filter(e -> rsRujukan.contains(e.getKecamatan().toUpperCase()))
                            .collect(Collectors.toList());

            log.debug("List of Rs Rujukan DKI Jakarta: {}", JscPreference.IOrsRujukanDKIJakartaList);

        } catch (Exception e) {
            log.error("Error payload ", e);
        }
    }

    private <T> List<T> exchangeAsList(String uri, ParameterizedTypeReference<List<T>> responseType) {
        return restTemplate.exchange(uri, HttpMethod.GET, null, responseType).getBody();
    }
}