package com.sonarsource.support;

import java.nio.file.Files;
import java.nio.file.Paths;

public class CompliantSolutionExample {

	public boolean authenticate(javax.servlet.http.HttpServletRequest request) {
		String user = request.getParameter("user");

		// Restrict the username to letters and digits only
		if (!user.matches("[a-zA-Z0-9]++")) {
			return false;
		}

		return Files.exists(Paths.get("/home/", user));
	}

}
