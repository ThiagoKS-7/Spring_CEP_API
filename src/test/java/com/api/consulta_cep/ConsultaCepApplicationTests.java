package com.api.consulta_cep;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import com.api.consulta_cep.models.Consulta;
import com.fasterxml.jackson.databind.ObjectMapper;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.aspectj.lang.annotation.Before;
import org.springframework.web.context.WebApplicationContext;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;


@SpringBootTest(classes = {ServletWebServerFactoryAutoConfiguration.class},
        webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT,
        properties = {"spring.cloud.config.enabled=false"})
@ExtendWith(MockitoExtension.class)
class ConsultaCepApplicationTests {

	@Autowired
    private MockMvc mockMvc;
	private WebApplicationContext webApplicationContext;
    private ObjectMapper objectMapper;

	@Test
	void contextLoads()  {

	}
	@Before(value = "")
	public void setUp() {
	  mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}


	@Test
	@DisplayName("Testando response da consulta de CEP")
	@AutoConfigureMockMvc
	void getCepInfo() throws Exception {

		Consulta consulta = new Consulta("01001000");

		mockMvc.perform(post("/v1/consulta-endereco")
        .contentType("application/json")
        .content(objectMapper.writeValueAsString(consulta)))
        .andExpect(status().isOk());
	}

}
