package hu.ak_akademia.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) throws IOException {

		Set<String> words = Files.lines(Paths.get("resources/szavak.txt")).collect(Collectors.toSet());
		
	}

}
