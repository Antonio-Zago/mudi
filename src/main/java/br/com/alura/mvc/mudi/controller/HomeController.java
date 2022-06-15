package br.com.alura.mvc.mudi.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.alura.mvc.mudi.model.Pedido;

@Controller
public class HomeController {
	
	@GetMapping("/home")
	public String home(Model model) {
		
		Pedido pedido = new Pedido();
		pedido.setNomeProduto("PC");
		pedido.setUrlImg("https://s2.glbimg.com/eQF6zOgS3xiHCEIVDQOGj9ldXSE=/0x0:6720x4480/924x0/smart/filters:strip_icc()/i.s3.glbimg.com/v1/AUTH_08fbf48bc0524877943fe86e43087e7a/internal_photos/bs/2021/a/H/yjEAjIRHukWhYgOVHAQg/nave11.jpg");
		pedido.setUrlProduto("https://www.techtudo.com.br/noticias/2021/10/nave-lanca-pc-gamer-com-chips-intel-de-12a-geracao.ghtml");
		
		List<Pedido> listaPedidos = Arrays.asList(pedido,pedido,pedido);
		model.addAttribute("pedidos", listaPedidos);
		
		
		return "home";
	}
}
