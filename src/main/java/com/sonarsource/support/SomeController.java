package com.sonarsource.suppprt;

import java.io.IOException;
import java.net.URL;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class SomeController {

	@GetMapping("/path/{theValue}")
    public String getCachedI18nPhrases(@PathVariable String theValue) throws IOException {
    	if ( ! theValue.matches("[a-zA-Z0-9]+") ) {
    		return "errorView";
    	}
    	
    	new URL("http://www.example.com/test?value=" + theValue).openConnection();
		
    	return "viewName";
    }

}