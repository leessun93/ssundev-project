package com.example.demo.cardController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CardController {

	@GetMapping("/card")
	public String cardMain() {
			System.out.println("흐미카드메인진입");
		return "card/card";
	}
}
