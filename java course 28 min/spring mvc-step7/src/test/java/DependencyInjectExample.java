import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

class DependencyInjectExample {
 
	
	@Autowired
	GoodMorningService service;
	
//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	@Test
	public void check() {
		System.out.println(service.hai());
	}

}
@Component
class GoodMorningService {
	
	public String hai() {
		return "hello";
	}
}