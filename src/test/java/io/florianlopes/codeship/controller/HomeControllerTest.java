package io.florianlopes.codeship.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

/**
 * Created by lopes_f on 1/23/2016.
 * <florian.lopes@outlook.com>
 */
@RunWith(MockitoJUnitRunner.class)
public class HomeControllerTest {

    private static final String HOME_URL = "/";
    private static final String HOME_VIEW = "home";

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        this.mockMvc = MockMvcBuilders
                .standaloneSetup(new HomeController())
                .build();
    }

    @Test
    public void testHome() throws Exception {
        this.mockMvc.perform(get(HOME_URL))
                .andExpect(view().name(HOME_VIEW));
    }
}