import com.lxinet.jeesns.web.front.MemberController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:/spring-mvc.xml", "classpath:/spring-mybatis.xml"})
@Controller
public class MemberControllerTest {
    @Autowired
    MemberController memberController;

    @Autowired
    WebApplicationContext context;


    MockMvc mockMvc;


    @Before
    public void setup() {
        mockMvc = MockMvcBuilders.standaloneSetup(memberController).build();
    }

    @Test
    public void save() {
        try {
//            ResultActions resultActions = mockMvc.perform(MockMvcRequestBuilders.get("/group/list"));
//            MvcResult mvcResult = resultActions.andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
//            String result = mvcResult.getResponse().getContentAsString();
//            System.out.println("=========结果为：=============\n" + result + "\n");
            ResultActions resultActions=mockMvc.perform(MockMvcRequestBuilders.post("/member/save").param("loginMember","2").param("classification","3,4"));
            MvcResult mvcResult = resultActions.andDo(MockMvcResultHandlers.print()).andExpect(MockMvcResultMatchers.status().isOk()).andReturn();
            String result = mvcResult.getResponse().getContentAsString();
            System.out.println("=========结果为：=============\n" + result + "\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
