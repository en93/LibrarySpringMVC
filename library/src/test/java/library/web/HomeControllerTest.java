package library.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;;

public class HomeControllerTest {
	
	private static final String jspView = "home";
	
	@Test
	public void testHomePage() throws Exception {
		HomeController controller = new HomeController();
		MockMvc mockMvc = standaloneSetup(controller)
				.setSingleView(new InternalResourceView("WEB-INF/views/home.jsp")).build();
		
		mockMvc.perform(get("/")).
			andExpect(view().name(jspView));
		mockMvc.perform(get("/home")).
			andExpect(view().name(jspView));
		mockMvc.perform(get("/index")).
			andExpect(view().name(jspView));
	}
}