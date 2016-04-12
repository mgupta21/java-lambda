package org.java8.streams.demo3;

import org.java8.datamodel.movie.Movie;
import org.java8.util.MovieUtil;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Mayank on 4/11/2016.
 */
public class CreatingStreams {

    // From Collections
    private static void testCollectionStreams() {
        List<Movie> movies = MovieUtil.createMovies();
        movies.stream().forEach(System.out::println);
    }

    // Empty Stream
    private static void testEmptyStreams() {
        Stream<Movie> emptyStream = Stream.empty();
        System.out.println("Empty stream count : " + emptyStream.count());
    }

    // From values/arrays
    private static void testStreamsFromValues() {
        Stream<String> movieNames = Stream.of("Bridge of Spies", "Saving Private Ryan", "Artificial Intelligence");
        System.out.println("Number of movies : " + movieNames.count());

        String[] movieNames2 = {"Bridge of Spies", "Saving Private Ryan", "Artificial Intelligence"};
        System.out.println("Number of movies : " + Stream.of(movieNames2).count());
    }

    // From file
    private static void testFileStream() throws IOException, URISyntaxException {
        Stream<String> fileLines = Files.lines(Paths.get(CreatingStreams.class.getResource("sample.txt").toURI())); // TODO : Fixme
        fileLines.forEach(System.out::println);
    }

    private static void testGenerateIterateStreams() {
        Stream<Double> randomStream = Stream.generate(Math::random);
        randomStream.forEach(System.out::println);

        // iterate
        Stream<Integer> wholeNumbers = Stream.iterate(1, i -> i + 1);
        wholeNumbers.forEach(System.out::println);
    }

    public static void main(String[] args) throws IOException, URISyntaxException {
        testCollectionStreams();
        testEmptyStreams();
        testStreamsFromValues();
        // testFileStream();
        // testGenerateIterateStreams();
    }

}
