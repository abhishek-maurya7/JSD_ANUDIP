package com.anudip.sb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class secondController {
	@GetMapping("/image")
	public String display() {
		return "<img src='https://64.media.tumblr.com/ef93a5a9dcb8e2bfb956a8956849f249/744f03518bfb2575-04/s400x600/713b184de017a603fe5513a4a23dbc0b5c4299ce.gif'>";
	}
}
