
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Stream map(Function mapper) returns a stream consisting of the results of applying the given function to the elements of this stream.
//
//Stream map(Function mapper) is an intermediate operation. These operations are always lazy. Intermediate operations are invoked on a Stream instance and after they finish their processing, they give a Stream instance as output.

public class StreamMap {
	public void Example() {
		List<Movie> movies = List.of(
				new Movie("a", 10), 
				new Movie("b", 15), 
				new Movie("c", 20));
		
		movies.stream()
			.map(movie -> movie.getTitle())
			.forEach(m -> System.out.println(m));
		
		List<Integer> list = Arrays.asList(1,2,3,4);
		list.stream()
			.map(number -> number*3)
			.forEach(number -> System.out.println(number));
		
		//lowercase -> uppercase
		List<String> lowercase = Arrays.asList("geeks", "gfg", "g", "e", "e", "k", "s");
		List<String> uppercase = lowercase.stream()
			.map(s -> s.toUpperCase())
			.collect(Collectors.toList());
		System.out.println(uppercase);
	}
}
