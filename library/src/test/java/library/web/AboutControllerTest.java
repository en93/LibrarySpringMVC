package library.web;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.view.InternalResourceView;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup;;

public class AboutControllerTest {
	
	private static final String jspView = "about";
	private static final String urlPath = "/about";
	
	@Test
	public void testAboutPage() throws Exception {
		AboutController controller = new AboutController();
		MockMvc mockMvc = standaloneSetup(controller)
				.setSingleView(new InternalResourceView("WEB-INF/views/about.jsp"))
				.build();
		
		mockMvc.perform(get(urlPath)).
			andExpect(view().name(jspView));
	}
}