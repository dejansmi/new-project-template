package com.dejans.${name};

import java.util.logging.Logger;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ${name}Controller {

    protected Logger logger = Logger.getLogger(${name}Controller.class.getName());

	@RequestMapping("/${name?lower_case}/")
	public String root(HttpServletRequest req) {
		logger.info("${nameProject} root() invoked");
		return "${name} tekst " + req.getPathInfo();
	}

	@RequestMapping("/${name?lower_case}/**")
	public String others(HttpServletRequest req) {
		logger.info("${nameProject} OTHERS() invoked");
		return "Wrong CALL in ${name}. Ask administrator ";
	}


}